/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginGUI;

/**
 *
 * @author Emily Rojas
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        logInPanel = new javax.swing.JPanel();
        signInLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        signUpPanel = new javax.swing.JPanel();
        signUpLabel = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        emailField1 = new javax.swing.JTextField();
        passwordField1 = new javax.swing.JPasswordField();
        completeButton = new javax.swing.JButton();
        confPassLabel = new javax.swing.JLabel();
        confPassField = new javax.swing.JPasswordField();
        typeBox = new javax.swing.JComboBox<>();

        logInPanel.setBackground(new java.awt.Color(255, 255, 255));

        signInLabel.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        signInLabel.setText("Sign in");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        emailLabel.setText("Email");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        passwordLabel.setText("Password");

        emailField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailField.setForeground(new java.awt.Color(105, 105, 105));
        emailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailField.setText("Email");
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        passwordField.setForeground(new java.awt.Color(105, 105, 105));
        passwordField.setText("Password");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logInPanelLayout = new javax.swing.GroupLayout(logInPanel);
        logInPanel.setLayout(logInPanelLayout);
        logInPanelLayout.setHorizontalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInPanelLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInPanelLayout.createSequentialGroup()
                        .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(passwordLabel))
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInPanelLayout.createSequentialGroup()
                        .addComponent(signInLabel)
                        .addGap(255, 255, 255))))
        );
        logInPanelLayout.setVerticalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInPanelLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(signInLabel)
                .addGap(44, 44, 44)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(670, 600));

        signUpPanel.setBackground(new java.awt.Color(255, 255, 255));

        signUpLabel.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        signUpLabel.setText("Sign up");

        emailLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        emailLabel1.setText("Email");

        passwordLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        passwordLabel1.setText("Password");

        emailField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailField1.setForeground(new java.awt.Color(105, 105, 105));
        emailField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailField1.setText("Email");
        emailField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailField1ActionPerformed(evt);
            }
        });

        passwordField1.setForeground(new java.awt.Color(105, 105, 105));
        passwordField1.setText("Password");

        completeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        completeButton.setText("Complete");
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });

        confPassLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        confPassLabel.setText("Confirm Password");

        confPassField.setForeground(new java.awt.Color(105, 105, 105));
        confPassField.setText("Password");

        typeBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Seller" }));

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpPanelLayout.createSequentialGroup()
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel1)
                            .addComponent(passwordLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addComponent(completeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addGap(200, 200, 200))
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confPassLabel)
                            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(signUpLabel))
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        signUpPanelLayout.setVerticalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(signUpLabel)
                .addGap(36, 36, 36)
                .addComponent(emailLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confPassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void emailField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton completeButton;
    private javax.swing.JPasswordField confPassField;
    private javax.swing.JLabel confPassLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField emailField1;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel logInPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JComboBox<String> typeBox;
    // End of variables declaration                   
}
