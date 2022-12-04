
import java.awt.Color;
import static java.awt.Color.gray;
import static java.awt.Color.magenta;
import static java.awt.Color.orange;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AMAN
 */
public class TIC_TAC_TOE_c extends javax.swing.JFrame {

    /**
     * Creates new form TIC_TAC_TOE_c
     */
    
  
   
   private String turn = "O";
   private int xcount = 0;
   private int ocount = 0;
   private int totalCount=0;
   
   
    public TIC_TAC_TOE_c() {
        initComponents();
    }

private void ChoosePlayer(){
    if(turn.equalsIgnoreCase("X")){
        turn = "O";
        
    }else{
        turn = "X";
    }
}

private void SetScore(){
    xscore.setText(String.valueOf(xcount));
    oscore.setText(String.valueOf(ocount));
}

private void ResetGame(){
    txtbtn1.setText("");
    txtbtn2.setText("");
    txtbtn3.setText("");
    txtbtn4.setText("");
    txtbtn5.setText("");
    txtbtn6.setText("");
    txtbtn7.setText("");
    txtbtn8.setText("");
    txtbtn9.setText("");
    
//    txtbtn1.setBackground(gray);
//    txtbtn2.setBackground(gray);
//    txtbtn3.setBackground(gray);
//    txtbtn4.setBackground(gray);
//    txtbtn5.setBackground(gray);
//    txtbtn6.setBackground(gray);
//    txtbtn7.setBackground(gray);
//    txtbtn8.setBackground(gray);
//    txtbtn9.setBackground(gray);
    
//    totalCount=0;
}

private void winingGame(){
    totalCount++;
    String btn1 = txtbtn1.getText();
    String btn2 = txtbtn2.getText();
    String btn3 = txtbtn3.getText();
    String btn4 = txtbtn4.getText();
    String btn5 = txtbtn5.getText();
    String btn6 = txtbtn6.getText();
    String btn7 = txtbtn7.getText();
    String btn8 = txtbtn8.getText();
    String btn9 = txtbtn9.getText();
    
    
    
    if((btn1 == btn2) && (btn2 == btn3) && (btn1 != "")){
        
        String msg;
        if(turn.equalsIgnoreCase("o")){
            msg = "Player O wins";
            ocount++;
        }else{
            msg = "Player X wins";
            xcount++;
        }
        JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        txtbtn1.setBackground(orange);
        txtbtn2.setBackground(orange);
        txtbtn3.setBackground(orange);
        
    }else if((btn4 == btn5) && (btn5 == btn6) && (btn4 !="")){
                String msg;
        if(turn.equalsIgnoreCase("o")){
            msg = "Player O wins";
            ocount++;
        }else{
            msg = "Player X wins";
            xcount++;
        }
        JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        txtbtn4.setBackground(orange);
        txtbtn5.setBackground(orange);
        txtbtn6.setBackground(orange);
        
}else if((btn7 == btn8) && (btn8 == btn9) && (btn7 !="")){
                String msg;
        if(turn.equalsIgnoreCase("o")){
            msg = "Player O wins";
            ocount++;
        }else{
            msg = "Player X wins";
            xcount++;
        }
        JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        txtbtn7.setBackground(orange);
        txtbtn8.setBackground(orange);
        txtbtn9.setBackground(orange);
        
       }else if((btn1 == btn4) && (btn4 == btn7) && (btn4 !="")){
                String msg;
        if(turn.equalsIgnoreCase("o")){
            msg = "Player O wins";
            ocount++;
        }else{
            msg = "Player X wins";
            xcount++;
        }
        JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        txtbtn1.setBackground(orange);
        txtbtn4.setBackground(orange);
        txtbtn7.setBackground(orange);
        
       }else if((btn5 == btn2) && (btn2 == btn8) && (btn2 !="")){
                String msg;
        if(turn.equalsIgnoreCase("o")){
            msg = "Player O wins";
            ocount++;
        }else{
            msg = "Player X wins";
            xcount++;
        }
        JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        txtbtn5.setBackground(orange);
        txtbtn2.setBackground(orange);
        txtbtn8.setBackground(orange);
        
       }else if((btn3 == btn6) && (btn6 == btn9) && (btn3 !="")){
                String msg;
        if(turn.equalsIgnoreCase("o")){
            msg = "Player O wins";
            ocount++;
        }else{
            msg = "Player X wins";
            xcount++;
        }
        JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        txtbtn6.setBackground(orange);
        txtbtn9.setBackground(orange);
        txtbtn3.setBackground(orange);
        
       }else if((btn1 == btn5) && (btn1 == btn9) && (btn1 !="")){
                String msg;
        if(turn.equalsIgnoreCase("o")){
            msg = "Player O wins";
            ocount++;
        }else{
            msg = "Player X wins";
            xcount++;
        }
        JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        txtbtn1.setBackground(orange);
        txtbtn5.setBackground(orange);
        txtbtn9.setBackground(orange);
    
       }else if((btn3 == btn5) && (btn7 == btn3) && (btn3 !="")){
                String msg;
        if(turn.equalsIgnoreCase("o")){
            msg = "Player O wins";
            ocount++;
        }else{
            msg = "Player X wins";
            xcount++;
        }
        JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        txtbtn5.setBackground(orange);
        txtbtn7.setBackground(orange);
        txtbtn3.setBackground(orange);
       
        
       }else if(totalCount == 9){
           JOptionPane.showMessageDialog(this,"DRAW!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           ResetGame();
       }
    SetScore();
}
    
        
    
        
    



         
                      
                      
        

        
     
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 51, 51));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(0, 153, 255));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PLAYER O:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("PLAYER X:");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SCORECARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        oscore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        oscore.setText("0");

        xscore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xscore.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oscore)
                    .addComponent(xscore))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(xscore))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(oscore))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(txtbtn7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        
        JFrame frame = new JFrame ("Exit");
        
        if(JOptionPane.showConfirmDialog (frame, "Confirm If You Want To Exit?","Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);
    }
          
    }//GEN-LAST:event_exitbtnActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
    
        if(txtbtn1.getText()!=""){
            return;
        }
        txtbtn1.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtbtn1.setForeground(Color.red);
        }else{
            txtbtn1.setForeground(magenta);
        }
       winingGame();
        ChoosePlayer();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
       
        if(txtbtn2.getText()!=""){
            return;
        }
        txtbtn2.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtbtn2.setForeground(Color.red);
        }else{
            txtbtn2.setForeground(magenta);
        }
       winingGame();
        ChoosePlayer();
        
      
        
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
    
        if(txtbtn3.getText()!=""){
            return;
        }
        txtbtn3.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtbtn3.setForeground(Color.red);
        }else{
            txtbtn3.setForeground(magenta);
        }
       winingGame();
        ChoosePlayer();
        
      
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        
        if(txtbtn4.getText()!=""){
            return;
        }
        txtbtn4.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtbtn4.setForeground(Color.red);
        }else{
            txtbtn4.setForeground(magenta);
        }
       winingGame();
        ChoosePlayer();
     
       
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
       if(txtbtn5.getText()!=""){
            return;
        }
        txtbtn5.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtbtn5.setForeground(Color.red);
        }else{
            txtbtn5.setForeground(magenta);
        }
       winingGame();
        ChoosePlayer();
        
   
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        if(txtbtn6.getText()!=""){
            return;
        }
        txtbtn6.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtbtn6.setForeground(Color.red);
        }else{
            txtbtn6.setForeground(magenta);
        }
       winingGame();
        ChoosePlayer();
        
        
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
       if(txtbtn7.getText()!=""){
            return;
        }
        txtbtn7.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtbtn7.setForeground(Color.red);
        }else{
            txtbtn7.setForeground(magenta);
        }
       winingGame();
        ChoosePlayer();
       
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
       if(txtbtn8.getText()!=""){
            return;
        }
        txtbtn8.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtbtn8.setForeground(Color.red);
        }else{
            txtbtn8.setForeground(magenta);
        }
       winingGame();
        ChoosePlayer();
        
       
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        
      if(txtbtn9.getText()!=""){
            return;
        }
        txtbtn9.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtbtn9.setForeground(Color.red);
        }else{
            txtbtn9.setForeground(magenta);
        }
       winingGame();
        ChoosePlayer();
        

    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        
        ResetGame();
    }//GEN-LAST:event_resetbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_c().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel oscore;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables
}
