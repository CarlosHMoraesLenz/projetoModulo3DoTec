package layout;

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 * @author Carlos Lenz
 * @author Lucas de Almeida
 */
public class GUIDesktopUser extends javax.swing.JFrame implements InternalFrameListener{
    public GUIDesktopUser() {
        initComponents();
    }
    
    private boolean flaggcp = false;
    private boolean flagpp = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpUser = new javax.swing.JDesktopPane();
        jpADM = new javax.swing.JPanel();
        jlpCadastros = new javax.swing.JLayeredPane();
        jlCadastros = new javax.swing.JLabel();
        jlPets = new javax.swing.JLabel();
        jbtnCadPets = new javax.swing.JButton();
        jlpPesquisa = new javax.swing.JLayeredPane();
        jlPesquisar = new javax.swing.JLabel();
        jbtnPesquisar = new javax.swing.JButton();
        jlPets1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpADM.setPreferredSize(new java.awt.Dimension(900, 539));

        jlpCadastros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlCadastros.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlCadastros.setText("Cadastros");

        jlPets.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPets.setText("Pets");

        jbtnCadPets.setText("Go");
        jbtnCadPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadPetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jlpCadastrosLayout = new javax.swing.GroupLayout(jlpCadastros);
        jlpCadastros.setLayout(jlpCadastrosLayout);
        jlpCadastrosLayout.setHorizontalGroup(
            jlpCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpCadastrosLayout.createSequentialGroup()
                .addGroup(jlpCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpCadastrosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jlCadastros))
                    .addGroup(jlpCadastrosLayout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jlPets)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnCadPets, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpCadastrosLayout.setVerticalGroup(
            jlpCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpCadastrosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlCadastros)
                .addGap(29, 29, 29)
                .addGroup(jlpCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPets)
                    .addComponent(jbtnCadPets))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jlpCadastros.setLayer(jlCadastros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadastros.setLayer(jlPets, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadastros.setLayer(jbtnCadPets, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jlpPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlPesquisar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlPesquisar.setText("Pesquisar");

        jbtnPesquisar.setText("Go");
        jbtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPesquisarActionPerformed(evt);
            }
        });

        jlPets1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPets1.setText("Pets");

        javax.swing.GroupLayout jlpPesquisaLayout = new javax.swing.GroupLayout(jlpPesquisa);
        jlpPesquisa.setLayout(jlpPesquisaLayout);
        jlpPesquisaLayout.setHorizontalGroup(
            jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpPesquisaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpPesquisaLayout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(jlPets1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
        );
        jlpPesquisaLayout.setVerticalGroup(
            jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpPesquisaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlPesquisar)
                .addGap(26, 26, 26)
                .addGroup(jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPesquisar)
                    .addComponent(jlPets1))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jlpPesquisa.setLayer(jlPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpPesquisa.setLayer(jbtnPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpPesquisa.setLayer(jlPets1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jpADMLayout = new javax.swing.GroupLayout(jpADM);
        jpADM.setLayout(jpADMLayout);
        jpADMLayout.setHorizontalGroup(
            jpADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpADMLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jpADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlpCadastros)
                    .addComponent(jlpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jpADMLayout.setVerticalGroup(
            jpADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpADMLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jlpCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout jdpUserLayout = new javax.swing.GroupLayout(jdpUser);
        jdpUser.setLayout(jdpUserLayout);
        jdpUserLayout.setHorizontalGroup(
            jdpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpADM, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                .addContainerGap())
        );
        jdpUserLayout.setVerticalGroup(
            jdpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpADM, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jdpUser.setLayer(jpADM, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpUser)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpUser)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCadPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadPetsActionPerformed
        if(!flaggcp){
            GUICadPet gcp=new GUICadPet();
            jdpUser.add(gcp);
            gcp.setVisible(true);
            flaggcp = true;
            gcp.addInternalFrameListener(this);
        }
    }//GEN-LAST:event_jbtnCadPetsActionPerformed

    private void jbtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPesquisarActionPerformed
        if(!flagpp){
            GUIPesquisaPet pp=new GUIPesquisaPet();
            jdpUser.add(pp);
            pp.setVisible(true);
            flagpp = true;
            pp.addInternalFrameListener(this);
        }
    }//GEN-LAST:event_jbtnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIDesktopUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDesktopUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDesktopUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDesktopUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDesktopUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnCadPets;
    private javax.swing.JButton jbtnPesquisar;
    private javax.swing.JDesktopPane jdpUser;
    private javax.swing.JLabel jlCadastros;
    private javax.swing.JLabel jlPesquisar;
    private javax.swing.JLabel jlPets;
    private javax.swing.JLabel jlPets1;
    private javax.swing.JLayeredPane jlpCadastros;
    private javax.swing.JLayeredPane jlpPesquisa;
    private javax.swing.JPanel jpADM;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        if(e.getInternalFrame() instanceof GUICadPet){
            flaggcp = false;
        }else if(e.getInternalFrame() instanceof GUIPesquisaPet){
            flagpp = false;
        }
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
       
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        
    }
}
