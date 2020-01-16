package staking;

public class PlayerMelee {
    private final int HPLevel;
    private final int ATKLevel;
    private final int STRLevel;
    private final int DEFLevel;
    private int stanceATK;
    private int stanceSTR;
    private int stanceDEF;
    private int ATKBonus;
    private int STRBonus;
    private int ESL;
    private int MAXHit;
    private int EAL;
    private int ATKRoll;
    private int EDL;
    private int DEFRoll;
    
    private final String weapon;
    private final String attackStyle;
    
    public PlayerMelee(int HPLevel, int ATKLevel, int STRLevel, int DEFLevel, String weapon, String attackStyle) {
        this.HPLevel = HPLevel;
        this.ATKLevel = ATKLevel;
        this.STRLevel = STRLevel;
        this.DEFLevel = DEFLevel;
        this.weapon = weapon;
        this.attackStyle = attackStyle;
    
        setWeaponBonus();
        setStance();
        setESL();
        setMAXHit();
        setEAL();
        setATKRoll();
        setEDL();
        setDEFRoll(); 
    }
    
    public final void setESL() {
        this.ESL = STRLevel + stanceSTR + 8;
    }

    public final void setMAXHit() {
        MAXHit = (int) Math.floor(0.5 + ((double) ESL*(STRBonus+64))/640) ;
    }

    public final void setEAL() {
        this.EAL = ATKLevel + stanceATK + 8;
    }

    public final void setATKRoll() {
        this.ATKRoll = EAL*(ATKBonus + 64);
    }

    public final void setEDL() {
        this.EDL = DEFLevel + stanceDEF + 8;
    }

    public final void setDEFRoll() {
        this.DEFRoll = EDL*(0+64);
    }
    
    private void setWeaponBonus(){
        switch (weapon) {
            case "Brine Sabre":
                STRBonus = 46;
                ATKBonus = 47;
                break;
            case "Granite Hammer":
                STRBonus = 57;
                ATKBonus = 56;
                break;
            case "Dragon Scimitar":
                STRBonus = 66;
                ATKBonus = 67;
                break;
            case "Abyssal Whip":
                STRBonus = 82;
                ATKBonus = 82;
                break;
            case "Abyssal Tentacle":
                STRBonus = 86;
                ATKBonus = 90;
                break;
            default:
                STRBonus = 0;
                ATKBonus = 0;
                break;
        }
    }
    
    private void setStance(){
        switch (attackStyle) {
            case "Accurate":
                stanceSTR = 0;
                stanceATK = 3;
                stanceDEF = 0;
                break;
            case "Aggressive":
                stanceSTR = 3;
                stanceATK = 0;
                stanceDEF = 0;
                break;
            case "Controlled":
                stanceSTR = 1;
                stanceATK = 1;
                stanceDEF = 1;
            default:
                stanceSTR = 0;
                stanceATK = 0;
                stanceDEF = 3;
                break;
        }
    }
    
    public int getHPLevel() {
        return HPLevel;
    }

    public int getATKLevel() {
        return ATKLevel;
    }

    public int getSTRLevel() {
        return STRLevel;
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

    public int getESL() {
        return ESL;
    }

    public int getMAXHit() {
        return MAXHit;
    }

    public int getEAL() {
        return EAL;
    }

    public int getATKRoll() {
        return ATKRoll;
    }

    public int getEDL() {
        return EDL;
    }

    public int getDEFRoll() {
        return DEFRoll;
    }

    public String getWeapon() {
        return weapon;
    }
    
    public String getAttackStyle() {
        return attackStyle;
    }
    
    public void printEverything(){
        System.out.println("HP: " + HPLevel + "\nATK: " + ATKLevel + "\nSTR: " + STRLevel + "\nDEF: " + DEFLevel + "\nStanceSTR: " + stanceSTR +
                "\nStanceATK: " + stanceATK + "\nstanceDEF: " + stanceDEF + "\nSTRBonus: " + STRBonus+ "\nATKBonus: " + ATKBonus
                + "\nESL: " + ESL + "\nMAXHit: " + MAXHit + "\nEAL: " + EAL + "\nATKRoll: " + ATKRoll + "\nEDL: " + EDL + "\nDEFRoll: " + DEFRoll);
    }            
}
