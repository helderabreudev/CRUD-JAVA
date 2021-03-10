/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Clientes;
import model.bean.Produto;
import model.dao.ClientesDAO;
import model.dao.ProdutoDAO;
/**
 *
 * @author josue romero
 */
public class Cad_Cliente extends javax.swing.JFrame {

    public Cad_Cliente() {
        initComponents();
        setSize(900, 590);
        this.setLocationRelativeTo(null);
        DefaultTableModel modelo = (DefaultTableModel) jtClientes.getModel();
        jtClientes.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }
    
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtClientes.getModel();
        modelo.setNumRows(0);
        ClientesDAO cdao = new ClientesDAO();
        
        for (Clientes c : cdao.read()) {
           
            modelo.addRow(new Object[]{
                c.getCodigo(),
                c.getNome(),
                c.getCpf(),
                c.getUf(),
                c.getCidade(),
                c.getCep(),
                c.getEndereco()
            });
        }        
    }
   
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_CNPJ5 = new javax.swing.JTextField();
        txt_CNPJ8 = new javax.swing.JTextField();
        txt_CNPJ14 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbl_Nome = new javax.swing.JLabel();
        txtCC = new javax.swing.JTextField();
        lbl_Nome2 = new javax.swing.JLabel();
        lbl_Nome3 = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lbl_Nome5 = new javax.swing.JLabel();
        lbl_Nome8 = new javax.swing.JLabel();
        lbl_Nome9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtUF = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lbl_IMG_Cliente = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_Nome.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_Nome.setText("Nome:");

        lbl_Nome2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_Nome2.setText("Endereço:");

        lbl_Nome3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_Nome3.setText("UF: ");

        lblCPF.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblCPF.setText("CPF");

        lbl_Nome5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_Nome5.setText("CEP:");

        lbl_Nome8.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_Nome8.setText("Código do Cliente:");

        lbl_Nome9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbl_Nome9.setText("Cidade:");

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lbl_IMG_Cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_IMG_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/img/user-3.png"))); // NOI18N

        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_Nome8)
                                        .addGap(32, 32, 32)
                                        .addComponent(lbl_Nome))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_Nome3))
                                        .addGap(111, 111, 111)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_Nome9)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_Nome5)
                                    .addComponent(lblCPF)))
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Nome2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_IMG_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_IMG_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Nome8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Nome9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_Nome3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_Nome5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnDeletar)
                    .addComponent(btnLimpar))
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 810, 340);

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "UF", "Cidade", "CEP", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtClientes);
        if (jtClientes.getColumnModel().getColumnCount() > 0) {
            jtClientes.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 350, 810, 240);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
            txtCC.setText("");
            txtNome.setText("");
            txtCPF.setText("");
            txtUF.setText("");
            txtCidade.setText("");
            txtCEP.setText("");
            txtEndereco.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
         if (jtClientes.getSelectedRow() != -1) {

            Clientes c = new Clientes();
            ClientesDAO dao = new ClientesDAO();

            c.setCodigo((int) jtClientes.getValueAt(jtClientes.getSelectedRow(), 0));
            
            dao.delete(c);

            txtCC.setText("");
            txtNome.setText("");
            txtCPF.setText("");
            txtUF.setText("");
            txtCidade.setText("");
            txtCEP.setText("");
            txtEndereco.setText("");

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        new Menu().setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharActionPerformed


    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Clientes c = new Clientes();
        ClientesDAO dao = new ClientesDAO();
        
        c.setCodigo(Integer.parseInt(txtCC.getText()));
        c.setNome(txtNome.getText());
        c.setCpf(txtCPF.getText());
        c.setUf(txtUF.getText());
        c.setCidade(txtCidade.getText());
        c.setCep(Integer.parseInt(txtCEP.getText()));
        c.setEndereco(txtEndereco.getText());
        
        dao.create(c); 
        
        readJTable();     
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (jtClientes.getSelectedRow() != -1) {

            Clientes c = new Clientes();
            ClientesDAO dao = new ClientesDAO();

            c.setCodigo(Integer.parseInt(txtCC.getText()));
            c.setNome(txtNome.getText());
            c.setCpf(txtCPF.getText());
            c.setUf(txtUF.getText());
            c.setCidade(txtCidade.getText());
            c.setCep(Integer.parseInt(txtCEP.getText()));
            c.setEndereco(txtEndereco.getText());        
            dao.update(c);

            txtCC.setText("");
            txtNome.setText("");
            txtCPF.setText("");
            txtUF.setText("");
            txtCidade.setText("");
            txtCEP.setText("");
            txtEndereco.setText("");

            readJTable();
    }//GEN-LAST:event_btnAlterarActionPerformed
 }
    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
         if (jtClientes.getSelectedRow() != -1) {
             
             txtCC.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 0).toString());   
             txtNome.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 1).toString());
             txtCPF.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 2).toString());
             txtUF.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 3).toString());
             txtCidade.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 4).toString());
             txtCEP.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 5).toString());
             txtEndereco.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 6).toString());
                    
    }//GEN-LAST:event_jtClientesMouseClicked

 }
    public static void main(String args[]) {
          
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtClientes;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lbl_IMG_Cliente;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_Nome2;
    private javax.swing.JLabel lbl_Nome3;
    private javax.swing.JLabel lbl_Nome5;
    private javax.swing.JLabel lbl_Nome8;
    private javax.swing.JLabel lbl_Nome9;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUF;
    private javax.swing.JTextField txt_CNPJ14;
    private javax.swing.JTextField txt_CNPJ5;
    private javax.swing.JTextField txt_CNPJ8;
    // End of variables declaration//GEN-END:variables
}
