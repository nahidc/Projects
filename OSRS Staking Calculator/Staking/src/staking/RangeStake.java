package staking;
import java.util.Random;

public class RangeStake {
    private final PlayerRange myPlayer;
    private final PlayerRange OPlayer;

    public RangeStake(PlayerRange myPlayer, PlayerRange OPlayer) {
        this.myPlayer = myPlayer;
        this.OPlayer = OPlayer;
    }
    
    public int fight(){ 
        Random rand = new Random();
        int myHP = myPlayer.getHPLevel();
        int OHP = OPlayer.getHPLevel();
        int atkRoll;
        int defRoll;
        
        int start = rand.nextInt(2); //gives a value either 0 or 1
        
        if(start == 0){ //I start
            while(myHP > 0 && OHP > 0) { //checks if the health is more than 0 for both players
                atkRoll = rand.nextInt(myPlayer.getATKRoll()); //gets the RNGed attack of my player
                defRoll = rand.nextInt(OPlayer.getDEFRoll()); //get the RNGed defence of the opponent
                
                if(atkRoll>defRoll  && (myHP > 0 && OHP > 0)){ //checks if the RNG attack roll is higher than the defence and also if both healths are over 0
                    OHP = OHP - rand.nextInt((myPlayer.getMAXHit()+1));
                }
                
                atkRoll = rand.nextInt(OPlayer.getATKRoll());
                defRoll = rand.nextInt(myPlayer.getDEFRoll());
                
                if(atkRoll > defRoll  && (myHP > 0 && OHP > 0)){
                    myHP = myHP - rand.nextInt(OPlayer.getMAXHit()+1);
                }
            }
            if(myHP > 0){
                return 1;
            }
            
            else {
                return 0;
            }
            
        }
        
        else { //opponent starts
            while(myHP > 0 && OHP > 0){
                atkRoll = rand.nextInt(OPlayer.getATKRoll());
                defRoll = rand.nextInt(myPlayer.getDEFRoll());
               
                if(atkRoll > defRoll && (myHP > 0 && OHP > 0)){
                    myHP = myHP - rand.nextInt(OPlayer.getMAXHit()+1);
                }
                
                atkRoll = rand.nextInt(myPlayer.getATKRoll());
                defRoll = rand.nextInt(OPlayer.getDEFRoll());
                
                if(atkRoll>defRoll && (myHP > 0 && OHP > 0)){
                    OHP = OHP - rand.nextInt((myPlayer.getMAXHit()+1));
                }     
            }  
            if(myHP > 0){
                return 1;
            }
            
            else {
                return 0;
            }      
        }  
    }   
}
