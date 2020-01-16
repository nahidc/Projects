package staking;
import java.util.Random;

public class DDSStake {
    private final PlayerMelee myPlayer;
    private final PlayerMelee OPlayer;
    private final int myMAXHit;
    private final int myATKRoll;
    private final int OMAXHit;
    private final int OATKRoll;
    
    public DDSStake(PlayerMelee myPlayer, PlayerMelee OPlayer) {
        this.myPlayer = myPlayer;
        this.OPlayer = OPlayer;
        this.myMAXHit = (int) Math.floor((int) Math.floor(0.5 + ((double) myPlayer.getESL()*104/640))*1.15);
        this.myATKRoll = (int)(myPlayer.getEAL()*104*1.25);
        this.OMAXHit = (int) Math.floor((int) Math.floor(0.5 + ((double) OPlayer.getESL()*104/640))*1.15);
        this.OATKRoll = (int)(OPlayer.getEAL()*104*1.25);
    }
    
    public int fight() {  
        Random rand = new Random();
        int myHP = myPlayer.getHPLevel();
        int OHP = OPlayer.getHPLevel();
        int atkRoll;
        int defRoll;
        
        //System.out.println("Me: \nHP: " +myHP+ "\nDDS Max: " +myMAXHit+ "\nDDS ATK Roll: " +myATKRoll+ "\nMax: " +myPlayer.getMAXHit()+ "\nATK Roll: " +myPlayer.getATKRoll()+ "\nDEF Roll: " +myPlayer.getDEFRoll());
        //System.out.println("\nOpponent: \nHP: " +OHP+ "\nDDS Max: " +OMAXHit+ "\nDDS ATK Roll: " +OATKRoll+ "\nMax: " +OPlayer.getMAXHit()+ "\nATK Roll: " +OPlayer.getATKRoll()+ "\nDEF Roll: " +OPlayer.getDEFRoll());
        
        
        
        int start = rand.nextInt(2);
        
        if(start == 0) { //I start  
            while(myHP > 0 && OHP > 0) {
                for(int i=0; i<4; i++) {
                    for(int j=0;j<2;j++) {
                        atkRoll = rand.nextInt(myATKRoll);
                        defRoll = rand.nextInt(OPlayer.getDEFRoll());

                        if(atkRoll>defRoll  && (myHP > 0 && OHP > 0)) {
                            OHP = OHP - rand.nextInt(myMAXHit+1);
                            //System.out.println("(DDS) Enemy HP: " +OHP);
                        }
                    }

                    for(int j=0;j<2;j++) {
                        atkRoll = rand.nextInt(OATKRoll);
                        defRoll = rand.nextInt(myPlayer.getDEFRoll());

                        if(atkRoll > defRoll  && (myHP > 0 && OHP > 0)) {
                            myHP = myHP - rand.nextInt(OMAXHit+1);
                            //System.out.println("(DDS) My HP: " +myHP);
                        }
                    }
                }
            
                while(myHP > 0 && OHP > 0) {       
                    atkRoll = rand.nextInt(myPlayer.getATKRoll());
                    defRoll = rand.nextInt(OPlayer.getDEFRoll());
                
                    if(atkRoll>defRoll  && (myHP > 0 && OHP > 0)) {
                        OHP = OHP - rand.nextInt((myPlayer.getMAXHit()+1));
                        //System.out.println("(REG) Enemy HP: " +OHP);
                    }
               
                    atkRoll = rand.nextInt(OPlayer.getATKRoll());
                    defRoll = rand.nextInt(myPlayer.getDEFRoll());
                
                    if(atkRoll > defRoll  && (myHP > 0 && OHP > 0)) {
                        myHP = myHP - rand.nextInt(OPlayer.getMAXHit()+1);
                        //System.out.println("(REG) My HP: " +myHP);
                    }
                }
            }
            
            if(myHP > 0) {
                //System.out.println("I win");
                return 1;
            }
            
            else if (OHP > 0) {
                //System.out.println("I lose");
                return 0;
            }
        }
        
        else if(start == 1) { //Opponent starts  
            while(myHP > 0 && OHP > 0) {
                for(int i=0; i<4; i++) {            
                    for(int j=0;j<2;j++) {
                        atkRoll = rand.nextInt(OATKRoll);
                        defRoll = rand.nextInt(myPlayer.getDEFRoll());

                        if(atkRoll > defRoll  && (myHP > 0 && OHP > 0)) {
                            myHP = myHP - rand.nextInt(OMAXHit+1);
                            //System.out.println("(DDS) My HP: " +myHP);
                        }
                    }
                    
                    for(int j=0;j<2;j++) {
                        atkRoll = rand.nextInt(myATKRoll);
                        defRoll = rand.nextInt(OPlayer.getDEFRoll());

                        if(atkRoll>defRoll  && (myHP > 0 && OHP > 0)) {
                            OHP = OHP - rand.nextInt(myMAXHit+1);
                            //System.out.println("(DDS) Enemy HP: " +OHP);
                        }
                    }
                    
                }
            
                while(myHP > 0 && OHP > 0) {   
                    atkRoll = rand.nextInt(OPlayer.getATKRoll());
                    defRoll = rand.nextInt(myPlayer.getDEFRoll());
                
                    if(atkRoll > defRoll  && (myHP > 0 && OHP > 0)) {
                        myHP = myHP - rand.nextInt(OPlayer.getMAXHit()+1);
                        //System.out.println("(REG) My HP: " +myHP);
                    }
                    
                    atkRoll = rand.nextInt(myPlayer.getATKRoll());
                    defRoll = rand.nextInt(OPlayer.getDEFRoll());
                
                    if(atkRoll>defRoll  && (myHP > 0 && OHP > 0)) {
                        OHP = OHP - rand.nextInt((myPlayer.getMAXHit()+1));
                        //System.out.println("(REG) Enemy HP: " +OHP);
                    }  
                }
            }
            
            if(myHP > 0) {
                //System.out.println("I win");
                return 1;
            }
            
            else if (OHP > 0) {
                //System.out.println("I lose");
                return 0;
            }
        }
        return 0;
    }
}