package staking;
import java.text.DecimalFormat;

public class Range extends javax.swing.JFrame {
    MainGUI mGUI;
    
    public Range(MainGUI mGUI) {
        this.mGUI = mGUI;
        this.setTitle("Range Calculator");
        
        initComponents();
        
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OAStyle = new javax.swing.JComboBox<>();
        HPlevel = new javax.swing.JTextField();
        OHPlevel = new javax.swing.JTextField();
        weapon = new javax.swing.JComboBox<>();
        RNGlevel = new javax.swing.JTextField();
        ORNGlevel = new javax.swing.JTextField();
        OWeapon = new javax.swing.JComboBox<>();
        DEFlevel = new javax.swing.JTextField();
        ODEFlevel = new javax.swing.JTextField();
        simNum = new javax.swing.JTextField();
        aStyle = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        multiplier = new javax.swing.JLabel();
        results = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        winrate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OAStyle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        OAStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rapid", "Accurate", "Long Range" }));
        getContentPane().add(OAStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 110, -1));

        HPlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(HPlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 30, -1));

        OHPlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(OHPlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 30, -1));

        weapon.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        weapon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rune Knife", "Toktz-xil-ul", "ACB+Dbolt(e)" }));
        getContentPane().add(weapon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, -1));

        RNGlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(RNGlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 30, -1));

        ORNGlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(ORNGlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 30, -1));

        OWeapon.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        OWeapon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rune Knife", "Toktz-xil-ul", "ACB+Dbolt(e)" }));
        getContentPane().add(OWeapon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 110, -1));

        DEFlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(DEFlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 30, -1));

        ODEFlevel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        getContentPane().add(ODEFlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 30, -1));

        simNum.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        simNum.setText("1000000");
        getContentPane().add(simNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 72, -1));

        aStyle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        aStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rapid", "Accurate", "Long Range" }));
        getContentPane().add(aStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel20.setText("YOU");
        jLabel20.setAlignmentY(0.0F);
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel25.setText("OPPONENT");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel15.setText("HP");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel22.setText("RNG");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel23.setText("DEF");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel16.setText("HP");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel17.setText("RNG");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel18.setText("DEF");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Weapon:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Weapon:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Attack Style:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Attack style:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, 20));

        calculate.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 90, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 330, 10));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Wins | Losses :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Multiplier :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Winrate :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        multiplier.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        multiplier.setText("N/A");
        getContentPane().add(multiplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        results.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        results.setText("N/A");
        getContentPane().add(results, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Simulation No. :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        winrate.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        winrate.setText("N/A");
        getContentPane().add(winrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        try{
            int wins = 0;
            int loss = 0;
            int number = Integer.parseInt(simNum.getText());

            int HPLVL = Integer.parseInt(HPlevel.getText());
            int RNGLVL = Integer.parseInt(RNGlevel.getText());
            int DEFLVL = Integer.parseInt(DEFlevel.getText());

            RangePlayer myPlayer = new RangePlayer(HPLVL,RNGLVL,DEFLVL,(String) aStyle.getSelectedItem(), (String) weapon.getSelectedItem());

            int OHPLVL = Integer.parseInt(OHPlevel.getText());
            int ORNGLVL = Integer.parseInt(ORNGlevel.getText());
            int ODEFLVL = Integer.parseInt(ODEFlevel.getText());

            RangePlayer oppPlayer = new RangePlayer(OHPLVL, ORNGLVL,ODEFLVL,(String) OAStyle.getSelectedItem(), (String) OWeapon.getSelectedItem()); 

            /*PlayerRange myPlayer = new PlayerRange(HPLVL,RNGLVL,DEFLVL,(String) aStyle.getSelectedItem(), (String) weapon.getSelectedItem());

            int OHPLVL = Integer.parseInt(OHPlevel.getText());
            int ORNGLVL = Integer.parseInt(ORNGlevel.getText());
            int ODEFLVL = Integer.parseInt(ODEFlevel.getText());

            PlayerRange oppPlayer = new PlayerRange(OHPLVL, ORNGLVL,ODEFLVL,(String) OAStyle.getSelectedItem(), (String) OWeapon.getSelectedItem());*/
            
            //myPlayer.printEverything();
            //oppPlayer.printEverything();

            RangeStake2 stake = new RangeStake2(myPlayer, oppPlayer);

            int w;
            for(int i = 0; i<number;i++){

                w = stake.fight();
                wins += w;

            }

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
    private javax.swing.JTextField DEFlevel;
    private javax.swing.JTextField HPlevel;
    private javax.swing.JComboBox<String> OAStyle;
    private javax.swing.JTextField ODEFlevel;
    private javax.swing.JTextField OHPlevel;
    private javax.swing.JTextField ORNGlevel;
    private javax.swing.JComboBox<String> OWeapon;
    private javax.swing.JTextField RNGlevel;
    private javax.swing.JComboBox<String> aStyle;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel multiplier;
    private javax.swing.JLabel results;
    private javax.swing.JTextField simNum;
    private javax.swing.JComboBox<String> weapon;
    private javax.swing.JLabel winrate;
    // End of variables declaration//GEN-END:variables
}
