package staking;

public class PlayerRange {
    private final int HPLevel;
    private final int RNGLevel;
    private final int DEFLevel;
    private int stanceSTR;
    private int stanceATK;
    private int stanceDEF;
    private int STRBonus;
    private int ATKBonus;
    private int ERSL;
    private int MAXHit;
    private int ERAL;
    private int ATKRoll;
    private int ERDL;
    private int DEFRoll;
    
    private final String attackStyle;
    private final String weapon;

    public PlayerRange(int HPLevel, int RNGLevel, int DEFLevel, String attackStyle, String weapon) {
        this.HPLevel = HPLevel;
        this.RNGLevel = RNGLevel;
        this.DEFLevel = DEFLevel;
        this.attackStyle = attackStyle;
        this.weapon = weapon;
        
        setStance();
        setWeaponBonus();
        setERSL();
        setMAXHit();
        setERAL();
        setATKRoll();
        setERDL();
        setDEFRoll();            
    }

    public final void setERSL() {
        this.ERSL = RNGLevel + stanceSTR + 8;
    }

    public final void setMAXHit() {
        MAXHit = (int) Math.floor(0.5 + ((double) ERSL*(STRBonus+64))/640) ;
    }

    public final void setERAL() {
        this.ERAL = RNGLevel + stanceATK + 8;
    }

    public final void setATKRoll() {
        this.ATKRoll = ERAL*(ATKBonus + 64);
    }

    public final void setERDL() {
        this.ERDL = DEFLevel + stanceDEF + 8;
    }

    public final void setDEFRoll() {
        this.DEFRoll = ERDL*(0+64);
    }

    
    private void setStance(){
        switch (attackStyle) {
            case "Accurate":
                stanceSTR = 3;
                stanceATK = 3;
                stanceDEF = 0;
                break;
            case "Rapid":
                stanceSTR = 0;
                stanceATK = 0;
                stanceDEF = 0;
                break;
            default:
                stanceSTR = 0;
                stanceATK = 0;
                stanceDEF = 3;
                break;
        }
    }
    
    private void setWeaponBonus(){
        switch (weapon) {
            case "Rune Knife":
                STRBonus = 24;
                ATKBonus = 25;
                break;
            case "Toktz-xil-ul":
                STRBonus = 49;
                ATKBonus = 69;
                break;
            default:
                STRBonus = 117;
                ATKBonus = 100;
                break;
        }
    }

    public int getHPLevel() {
        return HPLevel;
    }

    public int getRNGLevel() {
        return RNGLevel;
    }

    public int getDEFLevel() {
        return DEFLevel;
    }

    public int getStanceSTR() {
        return stanceSTR;
    }

    public int getStanceATK() {
        return stanceATK;
    }

    public int getStanceDEF() {
        return stanceDEF;
    }

    public int getSTRBonus() {
        return STRBonus;
    }

    public int getATKBonus() {
        return ATKBonus;
    }

    public int getERSL() {
        return ERSL;
    }

    public int getMAXHit() {
        return MAXHit;
    }

    public int getERAL() {
        return ERAL;
    }

    public int getATKRoll() {
        return ATKRoll;
    }

    public int getERDL() {
        return ERDL;
    }

    public int getDEFRoll() {
        return DEFRoll;
    }

    public String getAttackStyle() {
        return attackStyle;
    }

    public String getWeapon() {
        return weapon;
    }
    
  
    
    public void printEverything(){
        System.out.println("HP: " + HPLevel + "\nRNG: " + RNGLevel + "\nDEF: " + DEFLevel + "\nStanceSTR: " + stanceSTR +
                "\nStanceATK: " + stanceATK + "\nstanceDEF: " + stanceDEF + "\nSTRBonus: " + STRBonus+ "\nATKBonus: " + ATKBonus
                + "\nERSL: " + ERSL + "\nMAXHit: " + MAXHit + "\nERAL: " + ERAL + "\nATKRoll: " + ATKRoll + "\nERDL: " + ERDL + "\nDEFRoll: " + DEFRoll);
    }        
          
}
