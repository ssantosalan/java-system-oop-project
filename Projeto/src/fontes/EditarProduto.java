/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontes;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Alan
 */
public class EditarProduto extends javax.swing.JFrame {

    /**
     * Creates new form EditarProduto
     */
    
    public Connection con;
    public Statement st;
    public ResultSet resultado = null;
    
    public EditarProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetointegrador_terceiro", "root", "");
            st = (Statement) con.createStatement();
            
        } catch (Exception e) {        
        }
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
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        textoEditarCodigoProduto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        textoEditarAdicionarProduto = new javax.swing.JTextField();
        textoEditarEstoqueProduto = new javax.swing.JTextField();
        textoEditarPrecoProduto = new javax.swing.JTextField();
        textoEditarDescricaoProduto = new javax.swing.JTextField();
        botaoCancelarEditarProduto = new javax.swing.JButton();
        botaoConfirmarEditarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel11.setBackground(new java.awt.Color(0, 127, 255));
        jPanel11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.setPreferredSize(new java.awt.Dimension(639, 34));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("EDITAR PRODUTO");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(188, 188, 188))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(171, 169, 169));
        jLabel1.setText("Produto");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 127, 255));
        jLabel2.setText("Alterar");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 127, 255));
        jLabel3.setText("Pesquisar");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(171, 169, 169));
        jLabel4.setText("Produto");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Código");

        jLabel22.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 127, 255));
        jLabel22.setText("*");

        textoEditarCodigoProduto.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        textoEditarCodigoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textoEditarCodigoProdutoFocusLost(evt);
            }
        });
        textoEditarCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEditarCodigoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoEditarCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel22)
                    .addComponent(textoEditarCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Descrição");

        jLabel23.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 127, 255));
        jLabel23.setText("*");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Preço");

        jLabel24.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 127, 255));
        jLabel24.setText("*");

        jLabel49.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Estoque Atual");

        jLabel25.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 127, 255));
        jLabel25.setText("*");

        jLabel50.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Adicionar Estoque");

        textoEditarEstoqueProduto.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        textoEditarPrecoProduto.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        textoEditarDescricaoProduto.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        botaoCancelarEditarProduto.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        botaoCancelarEditarProduto.setText("Cancelar");
        botaoCancelarEditarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoCancelarEditarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoCancelarEditarProdutoMouseExited(evt);
            }
        });
        botaoCancelarEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarEditarProdutoActionPerformed(evt);
            }
        });

        botaoConfirmarEditarProduto.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        botaoConfirmarEditarProduto.setText("Confirmar");
        botaoConfirmarEditarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoConfirmarEditarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoConfirmarEditarProdutoMouseExited(evt);
            }
        });
        botaoConfirmarEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarEditarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addComponent(jLabel50))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botaoCancelarEditarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConfirmarEditarProduto))
                    .addComponent(textoEditarAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoEditarPrecoProduto)
                    .addComponent(textoEditarDescricaoProduto)
                    .addComponent(textoEditarEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEditarDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEditarPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEditarEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(textoEditarAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmarEditarProduto)
                    .addComponent(botaoCancelarEditarProduto))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarEditarProdutoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botaoCancelarEditarProdutoActionPerformed

    private void botaoCancelarEditarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCancelarEditarProdutoMouseEntered
        // TODO add your handling code here:
         botaoCancelarEditarProduto.setBackground(Color.yellow);
    }//GEN-LAST:event_botaoCancelarEditarProdutoMouseEntered

    private void botaoCancelarEditarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCancelarEditarProdutoMouseExited
        // TODO add your handling code here:
        botaoCancelarEditarProduto.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botaoCancelarEditarProdutoMouseExited

    private void botaoConfirmarEditarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarEditarProdutoMouseEntered
        botaoConfirmarEditarProduto.setBackground(Color.yellow);
    }//GEN-LAST:event_botaoConfirmarEditarProdutoMouseEntered

    private void botaoConfirmarEditarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarEditarProdutoMouseExited
        botaoConfirmarEditarProduto.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botaoConfirmarEditarProdutoMouseExited

    private void botaoConfirmarEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarEditarProdutoActionPerformed
        String codigo, nome; 
        int estoqueAtual, adicionarQuantidade;
        double preco;
        codigo = textoEditarCodigoProduto.getText();
        nome = textoEditarDescricaoProduto.getText();
       
 
        try {
                       
             if (!textoEditarCodigoProduto.getText().equals("") && !textoEditarDescricaoProduto.getText().equals("") && !textoEditarPrecoProduto.getText().equals("") && !textoEditarEstoqueProduto.getText().equals("") && !textoEditarAdicionarProduto.getText().equals("")) {
                      
                        estoqueAtual = Integer.parseInt(textoEditarEstoqueProduto.getText());
                        preco = Double.parseDouble(textoEditarPrecoProduto.getText());
                        adicionarQuantidade = Integer.parseInt(textoEditarAdicionarProduto.getText());
                        
                        String minhasql = "update estoque "
                        + "set nome_produto = '" + nome + "' , quantidade = "+ estoqueAtual + " + " + adicionarQuantidade + ", valor_unit = " + preco 
                        + "where id_produto = " + codigo + ";";
                        st.executeUpdate(minhasql);
                        JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
                 
            } else if (!textoEditarCodigoProduto.getText().equals("") && !textoEditarDescricaoProduto.getText().equals("") && !textoEditarPrecoProduto.getText().equals("") && !textoEditarEstoqueProduto.getText().equals("") && textoEditarAdicionarProduto.getText().equals("")) {
                
                        estoqueAtual = Integer.parseInt(textoEditarEstoqueProduto.getText());
                        preco = Double.parseDouble(textoEditarPrecoProduto.getText());
                
                        String minhasql = "update estoque "
                        + "set nome_produto = '" + nome + "' , quantidade = "+ estoqueAtual + ", valor_unit = " + preco 
                        + "where id_produto = " + codigo + ";";
                        st.executeUpdate(minhasql);
                        JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
             
            } else {
                 JOptionPane.showMessageDialog(null, "Espaço obrigatório em branco!");
             }
    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Alterado!");
        }
        
    }//GEN-LAST:event_botaoConfirmarEditarProdutoActionPerformed

    private void textoEditarCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEditarCodigoProdutoActionPerformed

        String minhasql = "select * from estoque where id_produto=" + textoEditarCodigoProduto.getText();

        try {
            resultado = st.executeQuery(minhasql);
            if(resultado.next()){
                JOptionPane.showMessageDialog(null,"Registro encontrado");

                textoEditarDescricaoProduto.setText(resultado.getString("nome_produto"));
                textoEditarPrecoProduto.setText(resultado.getString("valor_unit"));
                textoEditarEstoqueProduto.setText(resultado.getString("quantidade"));

            } else {
                JOptionPane.showMessageDialog(null,"Registro não encontrado");
                textoEditarDescricaoProduto.setText("");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_textoEditarCodigoProdutoActionPerformed

    private void textoEditarCodigoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoEditarCodigoProdutoFocusLost
        
        try {   
          String minhasql = "select * from estoque where id_produto = "
                  +textoEditarCodigoProduto.getText();
          resultado = st.executeQuery(minhasql);
          if(resultado.next()){
              textoEditarDescricaoProduto.setText(resultado.getString("nome_produto"));
              textoEditarPrecoProduto.setText(resultado.getString("valor_unit"));
              textoEditarEstoqueProduto.setText(resultado.getString("quantidade"));
             }
          else {
           JOptionPane.showMessageDialog(null,"Registro não encontrado");
          }        
        }
        catch (Exception e) {
 
        }  
        
    }//GEN-LAST:event_textoEditarCodigoProdutoFocusLost

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
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarEditarProduto;
    private javax.swing.JButton botaoConfirmarEditarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textoEditarAdicionarProduto;
    private javax.swing.JTextField textoEditarCodigoProduto;
    private javax.swing.JTextField textoEditarDescricaoProduto;
    private javax.swing.JTextField textoEditarEstoqueProduto;
    private javax.swing.JTextField textoEditarPrecoProduto;
    // End of variables declaration//GEN-END:variables
}
