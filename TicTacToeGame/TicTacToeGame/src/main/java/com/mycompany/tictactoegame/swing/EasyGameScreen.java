/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tictactoegame.swing;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author HIEU
 */
public class EasyGameScreen extends javax.swing.JFrame {
    //1 - X
    //0 - O
    private int flag = 1;
    private boolean checkDrawFlag = true;
    private boolean checkNextTurn = true;
    private int xScore = 0;
    private int oScore = 0;
    
    private String[][] arr = {{" ", " ", " "},
                              {" ", " ", " "},
                              {" ", " ", " "}};

    
    /**
     * Creates new form EasyGameScreen
     */
    public EasyGameScreen() {
        initComponents();      
        configureController();
    }
    
    public final void configureController(){
        jButton1.setText(arr[0][0]);
        jButton2.setText(arr[0][1]);
        jButton3.setText(arr[0][2]);
        jButton4.setText(arr[1][0]);
        jButton5.setText(arr[1][1]);
        jButton6.setText(arr[1][2]);
        jButton7.setText(arr[2][0]);
        jButton8.setText(arr[2][1]);
        jButton9.setText(arr[2][2]);
        
        jButton1.setBackground(Color.WHITE);
        jButton1.setBackground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton3.setBackground(Color.WHITE);
        jButton4.setBackground(Color.WHITE);
        jButton5.setBackground(Color.WHITE);
        jButton6.setBackground(Color.WHITE);
        jButton7.setBackground(Color.WHITE);
        jButton8.setBackground(Color.WHITE);
        jButton9.setBackground(Color.WHITE);       
    }
    
    public void checkWin(int flag){
        //Test Case 1
        if(!arr[1][0].equals(" ") && !arr[2][0].equals(" ") &&
            arr[0][0].equals(arr[1][0]) && arr[1][0].equals(arr[2][0])){
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            
            if(flag == 1){
                jLabelWhoIsWin.setText("x Win");
//                System.out.println("\nX Win\n");
                this.xScore++;
            }  
            else if(flag == 0){
                jLabelWhoIsWin.setText("o Win");
                this.oScore++;
//                System.out.println("\nO Win\n");
            }

            //If X/O Win, checkDrawFlag and checkNextTurn will be changed false(Finish)
            //Unless X/O Win, this case will not be run and The game will being continue
            this.checkDrawFlag = false;
            this.checkNextTurn = false;
        }
        //Test Case 2
        if(!arr[1][1].equals(" ") && !arr[2][1].equals(" ") &&
                arr[0][1].equals(arr[1][1]) && arr[1][1].equals(arr[2][1])){
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            
            if(flag == 1){
                jLabelWhoIsWin.setText("x Win");
//                System.out.println("\nX Win\n");
                this.xScore++;
            }  
            else if(flag == 0){
                jLabelWhoIsWin.setText("o Win");
                this.oScore++;
//                System.out.println("\nO Win\n");
            }
            
            this.checkDrawFlag = false;
            this.checkNextTurn = false;
        }
        //Test Case 3
        else if(!arr[1][2].equals(" ") && !arr[2][2].equals(" ") &&
                arr[0][2].equals(arr[1][2]) && arr[1][2].equals(arr[2][2])){
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            
            if(flag == 1){
                jLabelWhoIsWin.setText("x Win");
//                System.out.println("\nX Win\n");
                this.xScore++;
            }  
            else if(flag == 0){
                jLabelWhoIsWin.setText("o Win");
                this.oScore++;
//                System.out.println("\nO Win\n");
            }
            
            this.checkDrawFlag = false;
            this.checkNextTurn = false;
        }
        //Test Case 4
        else if(!arr[0][1].equals(" ") && !arr[0][2].equals(" ") &&
                arr[0][0].equals(arr[0][1]) && arr[0][1].equals(arr[0][2])){
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            
            if(flag == 1){
                jLabelWhoIsWin.setText("x Win");
//                System.out.println("\nX Win\n");
                this.xScore++;
            }  
            else if(flag == 0){
                jLabelWhoIsWin.setText("o Win");
                this.oScore++;
//                System.out.println("\nO Win\n");
            }
            
            this.checkDrawFlag = false;
            this.checkNextTurn = false;
        }
        //Test Case 5
        else if(!arr[1][1].equals(" ") && !arr[1][2].equals(" ") &&
                arr[1][0].equals(arr[1][1]) && arr[1][1].equals(arr[1][2])){
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            
            if(flag == 1){
                jLabelWhoIsWin.setText("x Win");
//                System.out.println("\nX Win\n");
                this.xScore++;
            }  
            else if(flag == 0){
                jLabelWhoIsWin.setText("o Win");
                this.oScore++;
//                System.out.println("\nO Win\n");
            }
            
            this.checkDrawFlag = false;
            this.checkNextTurn = false;
        }
        //Test Case 6
        else if(!arr[2][1].equals(" ") && !arr[2][2].equals(" ") &&
                arr[2][0].equals(arr[2][1]) && arr[2][1].equals(arr[2][2])){
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            
            if(flag == 1){
                jLabelWhoIsWin.setText("x Win");
//                System.out.println("\nX Win\n");
                this.xScore++;
            }  
            else if(flag == 0){
                jLabelWhoIsWin.setText("o Win");
                this.oScore++;
//                System.out.println("\nO Win\n");
            }
            
            this.checkDrawFlag = false;
            this.checkNextTurn = false;
        }
        //Test Case 7
        else if(!arr[1][1].equals(" ") && !arr[2][2].equals(" ") &&
                arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2])){
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            
            if(flag == 1){
                jLabelWhoIsWin.setText("x Win");
//                System.out.println("\nX Win\n");
                this.xScore++;
            }  
            else if(flag == 0){
                jLabelWhoIsWin.setText("o Win");
                this.oScore++;
//                System.out.println("\nO Win\n");
            }
            
            this.checkDrawFlag = false;
            this.checkNextTurn = false;
        }
        //Test Case 8
        else if(!arr[1][1].equals(" ") && !arr[2][0].equals(" ") &&
                arr[0][2].equals(arr[1][1]) && arr[1][1].equals(arr[2][0])){
            jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            
            if(flag == 1){
                jLabelWhoIsWin.setText("x Win");
//                System.out.println("\nX Win\n");
                this.xScore++;
            }  
            else if(flag == 0){
                jLabelWhoIsWin.setText("o Win");
                this.oScore++;
//                System.out.println("\nO Win\n");
            }
            
            this.checkDrawFlag = false;
            this.checkNextTurn = false;
        }
        //Test Draw
        //1 - Block is filled full
        //2 - Exept case: Player 1 Win or Player 2 Win
        else if(!arr[0][0].equals(" ") && !arr[0][1].equals(" ") && !arr[0][2].equals(" ") &&
                !arr[1][0].equals(" ") && !arr[1][1].equals(" ") && !arr[1][2].equals(" ") &&
                !arr[2][0].equals(" ") && !arr[2][1].equals(" ") && !arr[2][2].equals(" ") &&
                //Exept all above case                
                checkDrawFlag == true){
           jLabelWhoIsWin.setText("Draw");
//           System.out.println("\nDraw");
           
           this.checkNextTurn = false;
        }
        
        showWhoIsNextTurn(flag, checkNextTurn);
        
        //If X/O Win, checkDrawFlag will be changed true(from false). 
        //Unless X/O Win, checkDrawFlag will be still true.
        this.checkDrawFlag = true;
    }
    
    public void showWhoIsNextTurn(int nextTurnFlag, boolean checkNextTurn){
        if (checkNextTurn == true) {
            if (nextTurnFlag == 1) {
                jLabelNextTurn.setText("o");
//                System.out.println("Next turn: O\n");
            } else if (nextTurnFlag == 0) {
                jLabelNextTurn.setText("x");
//                System.out.println("Next turn: X\n");
            }
        }
        else if(checkNextTurn == false){
            jLabelNextTurn.setText("Finish");
//            System.out.println("Finish\n");
        } 
        
        this.checkNextTurn = true;
    }
    
//    public void showArr(){
//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                System.out.printf("%s ", arr[i][j]);
//            }
//            System.out.println();
//        }
//        if(this.checkDrawFlag == true)
//            System.out.println("true\n");
//        else if (this.checkDrawFlag == false)
//            System.out.println("false\n");
//        System.out.println("======================");
//        System.out.printf("X Score: %d\n", this.xScore);
//        System.out.printf("O Score: %d\n", this.oScore);
//        System.out.println();
//    }
    
    public void showScore(){
        jTextFieldXScore.setText(Integer.toString(this.xScore));
        jTextFieldOScore.setText(Integer.toString(this.oScore));
    }
    
    public void setDisableAllBlockButton(){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }
    
    public void setEnabledAllBlockButton(){
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }
    
    public void resetResult(){
        arr[0][0] = " ";
        arr[0][1] = " ";
        arr[0][2] = " ";
        arr[1][0] = " ";
        arr[1][1] = " ";
        arr[1][2] = " ";
        arr[2][0] = " ";
        arr[2][1] = " ";
        arr[2][2] = " ";
        
        jButton1.setText(arr[0][0]);
        jButton2.setText(arr[0][1]);
        jButton3.setText(arr[0][2]);
        jButton4.setText(arr[1][0]);
        jButton5.setText(arr[1][1]);
        jButton6.setText(arr[1][2]);
        jButton7.setText(arr[2][0]);
        jButton8.setText(arr[2][1]);
        jButton9.setText(arr[2][2]);
        
        jButton1.setBackground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton3.setBackground(Color.WHITE);
        jButton4.setBackground(Color.WHITE);
        jButton5.setBackground(Color.WHITE);
        jButton6.setBackground(Color.WHITE);
        jButton7.setBackground(Color.WHITE);
        jButton8.setBackground(Color.WHITE);
        jButton9.setBackground(Color.WHITE);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelBackground = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldXScore = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldOScore = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonFinish = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonBackToMenu = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabelNextTurn = new javax.swing.JLabel();
        jLabelWhoIsWin = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Easy Mode");

        jPanelBackground.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBackground.setPreferredSize(new java.awt.Dimension(90, 525));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Player 1");

        jLabel5.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Player 2");

        jLabel6.setFont(new java.awt.Font("Roboto Mono", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("x");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Roboto Mono", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("o");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Score");

        jLabel9.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("x");

        jTextFieldXScore.setEditable(false);
        jTextFieldXScore.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        jTextFieldXScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("o");

        jTextFieldOScore.setEditable(false);
        jTextFieldOScore.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        jTextFieldOScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldXScore))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldOScore)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldXScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldOScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jButtonFinish.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFinish.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        jButtonFinish.setText("Finish");
        jButtonFinish.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButtonFinish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFinish.setPreferredSize(new java.awt.Dimension(67, 40));
        jButtonFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinishActionPerformed(evt);
            }
        });

        jButtonReset.setBackground(new java.awt.Color(255, 255, 255));
        jButtonReset.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        jButtonReset.setText("Play again");
        jButtonReset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButtonReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReset.setPreferredSize(new java.awt.Dimension(95, 40));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tic-Tac-Toe");

        jLabel3.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("hieund");

        jButtonBackToMenu.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBackToMenu.setFont(new java.awt.Font("Roboto Mono", 1, 12)); // NOI18N
        jButtonBackToMenu.setText("Back To Menu");
        jButtonBackToMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButtonBackToMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackToMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBackToMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Roboto Mono", 1, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("2 Player Mode");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Roboto Mono", 1, 14)); // NOI18N
        jLabel12.setText("Next turn:");

        jLabelNextTurn.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N

        jLabelWhoIsWin.setFont(new java.awt.Font("Roboto Mono", 1, 14)); // NOI18N
        jLabelWhoIsWin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNextTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelWhoIsWin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNextTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelWhoIsWin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(flag == 1){
            arr[0][0] = "X";
            jButton1.setText("X");
            checkWin(flag);
            flag = 0;
//            showArr();
            showScore();
            return;
        }
        if(flag == 0){
            arr[0][0] = "O";
            jButton1.setText("O");
            checkWin(flag);
            flag = 1;
//            showArr();
            showScore();
        }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(flag == 1){
            arr[0][1] = "X";
            jButton2.setText("X");
            checkWin(flag);
            flag = 0;
//            showArr();
            showScore();
            return;
        }
        if(flag == 0){
            arr[0][1] = "O";
            jButton2.setText("O");
            checkWin(flag);
            flag = 1;
//            showArr();
            showScore();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(flag == 1){
            arr[0][2] = "X";
            jButton3.setText("X");
            checkWin(flag);
            flag = 0;
//            showArr();
            showScore();
            return;
        }
        if(flag == 0){
            arr[0][2] = "O";
            jButton3.setText("O");
            checkWin(flag);
            flag = 1; 
//            showArr();
            showScore();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(flag == 1){
            arr[1][0] = "X";
            jButton4.setText("X");
            checkWin(flag);
            flag = 0;
//            showArr();
            showScore();
            return;
        }
        if(flag == 0){
            arr[1][0] = "O";
            jButton4.setText("O");
            checkWin(flag);
            flag = 1;
//            showArr();
            showScore();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(flag == 1){
            arr[1][1] = "X";
            jButton5.setText("X");
            checkWin(flag);
            flag = 0;
//            showArr();
            showScore();
            return;
        }
        if(flag == 0){
            arr[1][1] = "O";
            jButton5.setText("O");
            checkWin(flag);
            flag = 1;
//            showArr();
            showScore();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(flag == 1){
            arr[1][2] = "X";
            jButton6.setText("X");
            checkWin(flag);
            flag = 0;
//            showArr();
            showScore();
            return;
        }
        if(flag == 0){
            arr[1][2] = "O";
            jButton6.setText("O");
            checkWin(flag);
            flag = 1;
//            showArr();
            showScore();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(flag == 1){
            arr[2][0] = "X";
            jButton7.setText("X");
            checkWin(flag);
            flag = 0;
//            showArr();
            showScore();
            return;
        }
        if(flag == 0){
            arr[2][0] = "O";
            jButton7.setText("O");
            checkWin(flag);
            flag = 1;
//            showArr();
            showScore();
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(flag == 1){
            arr[2][1] = "X";
            jButton8.setText("X");
            checkWin(flag);
            flag = 0;
//            showArr();
            showScore();
            return;
        }
        if(flag == 0){
            arr[2][1] = "O";
            jButton8.setText("O");
            checkWin(flag);
            flag = 1;
//            showArr();
            showScore();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(flag == 1){
            arr[2][2] = "X";
            jButton9.setText("X");
            checkWin(flag);
            flag = 0;
//            showArr();
            showScore();
            return;
        }
        if(flag == 0){
            arr[2][2] = "O";
            jButton9.setText("O");
            checkWin(flag);
            flag = 1;
//            showArr();
            showScore();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jLabelNextTurn.setText(" ");
        jLabelWhoIsWin.setText(" ");
        resetResult();     
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinishActionPerformed
        int confirm;
        Object[] option = {"Yes", "No, playing continue"};
        confirm = JOptionPane.showOptionDialog(this, "Would you like to finish this game?", 
                "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, EXIT_ON_CLOSE);
        
        //Yes: 0
        //No, playing continue: 1
        System.out.println(confirm);
        if(confirm == 0){
            this.xScore = 0;
            this.oScore = 0;
            resetResult();
        }
        jLabelNextTurn.setText(" ");
        jLabelWhoIsWin.setText(" ");
    }//GEN-LAST:event_jButtonFinishActionPerformed

    private void jButtonBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackToMenuActionPerformed
        new MainScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBackToMenuActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EasyGameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EasyGameScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonBackToMenu;
    private javax.swing.JButton jButtonFinish;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNextTurn;
    private javax.swing.JLabel jLabelWhoIsWin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldOScore;
    private javax.swing.JTextField jTextFieldXScore;
    // End of variables declaration//GEN-END:variables
}
