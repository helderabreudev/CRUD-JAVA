/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;
import javax.swing.JOptionPane;
/**
 *

 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setSize(868, 542);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Opcoes = new javax.swing.JMenu();
        Menu_Cadastrar = new javax.swing.JMenu();
        Cad_Item_Vendedor = new javax.swing.JMenuItem();
        Cad_Item_Cliente = new javax.swing.JMenuItem();
        Cad_Item_Pedido = new javax.swing.JMenuItem();
        Cad_Item_Produto = new javax.swing.JMenuItem();
        item_Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MERCADO");
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/img/hj.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 852, 480);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(55, 30));

        Menu_Opcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Menu_Opcoes.setText("Opções");
        Menu_Opcoes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Menu_Opcoes.setPreferredSize(new java.awt.Dimension(70, 19));

        Menu_Cadastrar.setText("Cadastrar");
        Menu_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_CadastrarActionPerformed(evt);
            }
        });

        Cad_Item_Vendedor.setText("Vendedor");
        Cad_Item_Vendedor.setName(""); // NOI18N
        Cad_Item_Vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_Item_VendedorActionPerformed(evt);
            }
        });
        Menu_Cadastrar.add(Cad_Item_Vendedor);

        Cad_Item_Cliente.setText("Cliente");
        Cad_Item_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_Item_ClienteActionPerformed(evt);
            }
        });
        Menu_Cadastrar.add(Cad_Item_Cliente);

        Cad_Item_Pedido.setText("Pedido");
        Cad_Item_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_Item_PedidoActionPerformed(evt);
            }
        });
        Menu_Cadastrar.add(Cad_Item_Pedido);

        Cad_Item_Produto.setText("Produto");
        Cad_Item_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_Item_ProdutoActionPerformed(evt);
            }
        });
        Menu_Cadastrar.add(Cad_Item_Produto);

        Menu_Opcoes.add(Menu_Cadastrar);

        item_Sair.setText("Sair");
        item_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_SairActionPerformed(evt);
            }
        });
        Menu_Opcoes.add(item_Sair);

        jMenuBar1.add(Menu_Opcoes);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cad_Item_VendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_Item_VendedorActionPerformed
        new Cad_Vendedor().setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_Cad_Item_VendedorActionPerformed

    private void Cad_Item_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_Item_ClienteActionPerformed
        new Cad_Cliente().setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_Cad_Item_ClienteActionPerformed

    private void Menu_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_CadastrarActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_Menu_CadastrarActionPerformed

    private void Cad_Item_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_Item_ProdutoActionPerformed
        new Cad_Produto().setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_Cad_Item_ProdutoActionPerformed

    private void item_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_SairActionPerformed
       new Logar().setVisible(true);
       dispose();
// TODO add your handling code here: System.exit(0);
    }//GEN-LAST:event_item_SairActionPerformed

    private void Cad_Item_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_Item_PedidoActionPerformed
        new Cad_Pedido().setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_Cad_Item_PedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cad_Item_Cliente;
    private javax.swing.JMenuItem Cad_Item_Pedido;
    private javax.swing.JMenuItem Cad_Item_Produto;
    private javax.swing.JMenuItem Cad_Item_Vendedor;
    private javax.swing.JMenu Menu_Cadastrar;
    private javax.swing.JMenu Menu_Opcoes;
    private javax.swing.JMenuItem item_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
