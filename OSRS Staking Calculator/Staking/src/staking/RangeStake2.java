package staking;
import java.util.Random;

public class RangeStake2 {
    private final RangePlayer myPlayer;
    private final RangePlayer oppPlayer;

    public RangeStake2(RangePlayer myPlayer, RangePlayer OPlayer) {
        this.myPlayer = myPlayer;
        this.oppPlayer = OPlayer;
    }
    
    public int fight(){ 
        Random dice = new Random();
        int myHP = myPlayer.getHPLevel();
        int oppHP = oppPlayer.getHPLevel();
        double myTick = 0;
        double oppTick = 0;
        int atkRoll;
        int defRoll;
        
        int pid = dice.nextInt(2);
        if(pid == 0) {
            oppTick = 0.95;
        }
        else {
            myTick = 0.95;
        }
        
        /*if(myTick == 0){ //I start
            while(myHP > 0 && oppHP > 0) { //checks if the health is more than 0 for both players
                atkRoll = dice.nextInt(myPlayer.getATKRoll()); //gets the RNGed attack of my player
                defRoll = dice.nextInt(oppPlayer.getDEFRoll()); //get the RNGed defence of the opponent
                
                if(atkRoll>defRoll  && (myHP > 0 && oppHP > 0)){ //checks if the RNG attack roll is higher than the defence and also if both healths are over 0
                    oppHP = oppHP - dice.nextInt((myPlayer.getMAXHit()+1));
                }
                
                atkRoll = dice.nextInt(oppPlayer.getATKRoll());
                defRoll = dice.nextInt(myPlayer.getDEFRoll()); 
                
                if(atkRoll > defRoll  && (myHP > 0 && oppHP > 0)){
                    myHP = myHP - dice.nextInt(oppPlayer.getMAXHit()+1);
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
            while(myHP > 0 && oppHP > 0){
                atkRoll = dice.nextInt(oppPlayer.getATKRoll());
                defRoll = dice.nextInt(myPlayer.getDEFRoll());
               
                if(atkRoll > defRoll && (myHP > 0 && oppHP > 0)){
                    myHP = myHP - dice.nextInt(oppPlayer.getMAXHit()+1);
                }
                
                atkRoll = dice.nextInt(myPlayer.getATKRoll());
                defRoll = dice.nextInt(oppPlayer.getDEFRoll());
                
                if(atkRoll>defRoll && (myHP > 0 && oppHP > 0)){
                    oppHP = oppHP - dice.nextInt((myPlayer.getMAXHit()+1));
                }     
            }  
            if(myHP > 0){
                return 1;
            }   
            else {
                return 0;
            } 
        }   */
        while(myHP > 0 && oppHP > 0) { 
            if(myTick < oppTick) {                                                                 
                atkRoll = dice.nextInt(myPlayer.getATKRoll());                                      
                defRoll = dice.nextInt(oppPlayer.getDEFRoll());
                
                if(atkRoll>defRoll  && (myHP > 0 && oppHP > 0)){
                    oppHP -= dice.nextInt((myPlayer.getMAXHit()+1));
                    myTick += myPlayer.getTick();
                }
            }
            
            else {
                atkRoll = dice.nextInt(oppPlayer.getATKRoll());
                defRoll = dice.nextInt(myPlayer.getDEFRoll());
               
                if(atkRoll > defRoll && (myHP > 0 && oppHP > 0)){
                    myHP -= dice.nextInt(oppPlayer.getMAXHit()+1);
                    oppTick += oppPlayer.getTick();
                }
            }
        }   
        
        if(myHP > 0) {
            return 1;
        }       
        else {
            return 0;
        }      
    }
}
       