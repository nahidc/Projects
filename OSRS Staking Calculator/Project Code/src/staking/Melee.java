package staking;
import java.text.DecimalFormat;

public class Melee extends javax.swing.JFrame {
    MainGUI mGUI;
    
    public Melee(MainGUI mGUI) {
        this.mGUI = mGUI;
        this.setTitle("Melee Calculator");
        
        initComponents();
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        HPlevel = new javax.swing.JTextField();
        ATKlevel = new javax.swing.JTextField();
        STRlevel = new javax.swing.JTextField();
        DEFlevel = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        OHPlevel = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        OATKlevel = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        OSTRlevel = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        ODEFlevel = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        simNum = new javax.swing.JTextField();
        aStyle = new javax.swing.JComboBox<>();
        OAStyle = new javax.swing.JComboBox<>();
        weapon = new javax.swing.JComboBox<>();
        OWeapon = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        special = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        multiplier = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        winrate = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        results = new javax.swing.JLabel();
        maxhit = new javax.swing.JLabel();
        omaxhit = new javax.swing.JLabel();

        jLabel19.setText("jLabel19");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel15.setText("HP");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel16.setText("ATK");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel17.setText("STR");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel18.setText("DEF");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        HPlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(HPlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 30, -1));

        ATKlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(ATKlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 30, -1));

        STRlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(STRlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 30, -1));

        DEFlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(DEFlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 30, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel20.setText("YOU");
        jLabel20.setAlignmentY(0.0F);
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel21.setText("HP");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        OHPlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(OHPlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 30, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel22.setText("ATK");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 20, -1));

        OATKlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(OATKlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 30, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel23.setText("STR");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        OSTRlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(OSTRlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 30, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel24.setText("DEF");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        ODEFlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(ODEFlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 30, -1));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel25.setText("OPPONENT");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Attack Style:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Weapon:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Weapon:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, 20));

        calculate.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 90, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Type of Stake:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 20));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 318, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 389, -1, -1));

        simNum.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        simNum.setText("1000000");
        getContentPane().add(simNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 60, 20));

        aStyle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        aStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aggressive", "Accurate", "Controlled", "Defensive" }));
        getContentPane().add(aStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, -1));

        OAStyle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        OAStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aggressive", "Accurate", "Controlled", "Defensive" }));
        getContentPane().add(OAStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 110, -1));

        weapon.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        weapon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boxing", "Brine Sabre", "Granite Hammer", "Dragon Scimitar", "Abyssal Whip", "Abyssal Tentacle"}));
        getContentPane().add(weapon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, -1));

        OWeapon.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        OWeapon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boxing", "Brine Sabre", "Granite Hammer", "Dragon Scimitar", "Abyssal Whip", "Abyssal Tentacle"}));
        getContentPane().add(OWeapon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Winrate :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Attack style:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 20));

        special.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        special.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "DDS" }));
        getContentPane().add(special, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 330, 10));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Simulation No. :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        multiplier.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        multiplier.setText("N/A");
        getContentPane().add(multiplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, 20));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Multiplier :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, 20));

        winrate.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        winrate.setText("N/A");
        getContentPane().add(winrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Wins | Losses :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        results.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        results.setText("N/A");
        getContentPane().add(results, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        maxhit.setText("MYMAXHIT");
        getContentPane().add(maxhit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        omaxhit.setText("OMAXHIT");
        getContentPane().add(omaxhit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
         try{
            String type = (String) special.getSelectedItem();
            int wins = 0;
            int loss = 0;
            int number = Integer.parseInt(simNum.getText());
    
            int HPLVL = Integer.parseInt(HPlevel.getText());
            int ATKLVL = Integer.parseInt(ATKlevel.getText());
            int STRLVL = Integer.parseInt(STRlevel.getText());
            int DEFLVL = Integer.parseInt(DEFlevel.getText());
            String WEAPON = (String) weapon.getSelectedItem();
            String ASTYLE = (String) aStyle.getSelectedItem();
            
            PlayerMelee myPlayer = new PlayerMelee(HPLVL, ATKLVL, STRLVL, DEFLVL, WEAPON, ASTYLE);
           
        
            int OHPLVL = Integer.parseInt(OHPlevel.getText());
            int OATKLVL = Integer.parseInt(OATKlevel.getText());
            int OSTRLVL = Integer.parseInt(OSTRlevel.getText());
            int ODEFLVL = Integer.parseInt(ODEFlevel.getText());
            String OWEAPON = (String) OWeapon.getSelectedItem();
            String OASTYLE = (String) OAStyle.getSelectedItem();
            
            PlayerMelee OPlayer = new PlayerMelee(OHPLVL, OATKLVL, OSTRLVL, ODEFLVL, OWEAPON, OASTYLE);
            
            //myPlayer.printEverything();
            //OPlayer.printEverything();
            
            int w = 0;
            
            switch(type) {
                case "DDS":
                    DDSStake dds = new DDSStake(myPlayer, OPlayer);
                    
                    for(int i=0; i<number; i++) {
                        w = dds.fight();
                        wins = wins + w;
                    }
                    break;
                default:    
                    MeleeStake regular = new MeleeStake(myPlayer, OPlayer);
                    
                    for (int i=0; i<number; i++) {
                        w = regular.fight();
                        wins = wins + w;
                    }
                    break;
            }
              
            maxhit.setText("Max: " +myPlayer.getMAXHit());
            omaxhit.setText("Max: " +OPlayer.getMAXHit());
            
            loss = number - wins;
            
            displayResults(wins,loss,number);
        }   
         
        catch (NumberFormatException e){     
        }     
    }//GEN-LAST:event_calculateActionPerformed

    public void displayResults(int wins, int loss, int number){
        DecimalFormat percent = new DecimalFormat("#.##");
        double p = Double.parseDouble(percent.format((double)wins/number*100));
       
        double x = Double.parseDouble(percent.format((p/(100-p))/1.2222222)); 
                
        results.setText(wins + " | " + loss);
        winrate.setText(p + " %");
        multiplier.setText("x" + x);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ATKlevel;
    private javax.swing.JTextField DEFlevel;
    private javax.swing.JTextField HPlevel;
    private javax.swing.JComboBox<String> OAStyle;
    private javax.swing.JTextField OATKlevel;
    private javax.swing.JTextField ODEFlevel;
    private javax.swing.JTextField OHPlevel;
    private javax.swing.JTextField OSTRlevel;
    private javax.swing.JComboBox<String> OWeapon;
    private javax.swing.JTextField STRlevel;
    private javax.swing.JComboBox<String> aStyle;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel maxhit;
    private javax.swing.JLabel multiplier;
    private javax.swing.JLabel omaxhit;
    private javax.swing.JLabel results;
    private javax.swing.JTextField simNum;
    private javax.swing.JComboBox<String> special;
    private javax.swing.JComboBox<String> weapon;
    private javax.swing.JLabel winrate;
    // End of variables declaration//GEN-END:variables
}
