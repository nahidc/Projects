package staking;
import java.util.Random;

public class MeleeStake {
    private final PlayerMelee myPlayer;
    private final PlayerMelee OPlayer;

    public MeleeStake(PlayerMelee myPlayer, PlayerMelee OPlayer) {
        this.myPlayer = myPlayer;
        this.OPlayer = OPlayer;
    }
    
    public int fight() { 
        Random rand = new Random();
        int myHP = myPlayer.getHPLevel();
        int OHP = OPlayer.getHPLevel();
        int atkRoll;
        int defRoll;
        
        int start = rand.nextInt(2);
        
        if(start == 0) { //I start
            while(myHP > 0 && OHP > 0) {       
                atkRoll = rand.nextInt(myPlayer.getATKRoll());
                defRoll = rand.nextInt(OPlayer.getDEFRoll());
                
                if(atkRoll>defRoll  && (myHP > 0 && OHP > 0)) {
                    OHP = OHP - rand.nextInt((myPlayer.getMAXHit()+1));
                }
               
                atkRoll = rand.nextInt(OPlayer.getATKRoll());
                defRoll = rand.nextInt(myPlayer.getDEFRoll());
                
                if(atkRoll > defRoll  && (myHP > 0 && OHP > 0)) {
                    myHP = myHP - rand.nextInt(OPlayer.getMAXHit()+1);
                }
            }
            
            if(myHP > 0) {    
                return 1;
            }
                   
            else if (OHP > 0) {     
                return 0;
            }
        }
        
        else if(start == 1) { //opponent starts
            while(myHP > 0 && OHP > 0) {
                atkRoll = rand.nextInt(OPlayer.getATKRoll());
                defRoll = rand.nextInt(myPlayer.getDEFRoll());
                
                if(atkRoll > defRoll  && (myHP > 0 && OHP > 0)) {
                    myHP = myHP - rand.nextInt(OPlayer.getMAXHit()+1);
                }         
                
                atkRoll = rand.nextInt(myPlayer.getATKRoll());
                defRoll = rand.nextInt(OPlayer.getDEFRoll());
                
                if(atkRoll>defRoll  && (myHP > 0 && OHP > 0)) {
                    OHP = OHP - rand.nextInt((myPlayer.getMAXHit()+1));
                }  
            }
            
            if(myHP > 0) {
                return 1;
            }
            
            else if (OHP > 0) {
                return 0;
            }      
        }   
        return 0;
    }   
}
