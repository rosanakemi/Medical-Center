/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.telas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Medico;
import services.MedicoServico;

/**
 *
 * @author zanna
 */
public class ListaMedico extends javax.swing.JFrame {

    /**
     * Creates new form ListaMedico
     */
    public ListaMedico() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) jTMedico.getModel();
        jTMedico.setRowSorter(new TableRowSorter(modelo));

        MedicoServico servico = new MedicoServico();
        carregarMedicosNaTabela(servico.consultarTodos());
    }

    private void carregarMedicosNaTabela(ArrayList<Medico> list) {
        // Limpar dados da Tabela
        DefaultTableModel modelo = (DefaultTableModel) jTMedico.getModel();
        modelo.setNumRows(0);

        if (list != null) {
            for (Medico p : list) {

                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getCpf(),
                    p.getData_de_nascimento(),
                    p.getEspecialidades(),
                    p.getCRM(),
                    p.getStatus()
                });
            }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campo_pesquisa = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMedico = new javax.swing.JTable();
        btn_excluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(908, 501));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/logoofc1.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Lista de Medicos");

        btn_novo.setBackground(new java.awt.Color(51, 0, 255));
        btn_novo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(255, 255, 255));
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(51, 0, 255));
        btn_editar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Pesquisar:");

        campo_pesquisa.setBackground(new java.awt.Color(255, 255, 255));
        campo_pesquisa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        btnConsulta.setBackground(new java.awt.Color(51, 0, 255));
        btnConsulta.setText("jButton3");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        jTMedico.setBackground(new java.awt.Color(255, 255, 255));
        jTMedico.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTMedico.setForeground(new java.awt.Color(51, 51, 51));
        jTMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Data de Nascimento", "Especialidade", "CRM", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTMedico.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTMedico.setShowGrid(true);
        jTMedico.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTMedico);

        btn_excluir.setBackground(new java.awt.Color(51, 0, 255));
        btn_excluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(51, 0, 255));
        btnLimpar.setText("jButton3");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_novo)
                                .addGap(4, 4, 4)
                                .addComponent(btn_editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(campo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_novo)
                            .addComponent(btn_editar)
                            .addComponent(jLabel2)
                            .addComponent(campo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsulta)
                            .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        this.dispose();
        DadosMedico view = new DadosMedico(null);
        view.setVisible(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        if (jTMedico.getSelectedRow() != -1) {
            int id = (int) jTMedico.getValueAt(jTMedico.getSelectedRow(), 0);
            MedicoServico servico = new MedicoServico();
            Medico medico = servico.consultarPorId(id);
            this.dispose();
            DadosMedico view = new DadosMedico(medico);
            view.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um registro para editar.");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        if (campo_pesquisa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de pesquisa vazio");
            // Define o foco no campo de nome para o usuário preencher
            campo_pesquisa.requestFocus();
            return;
        }

        MedicoServico servico = new MedicoServico();
        ArrayList<Medico> pacientes = servico.filtrar(campo_pesquisa.getText());
        carregarMedicosNaTabela(pacientes);
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        if (jTMedico.getSelectedRow() != -1) {
            int id = (int) jTMedico.getValueAt(jTMedico.getSelectedRow(), 0);

            int confirmacao = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja deletar este registro?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmacao == JOptionPane.YES_OPTION) {
                MedicoServico servico = new MedicoServico();
                servico.deletar(id);
                JOptionPane.showMessageDialog(null, "Medico removido com sucesso.");
                carregarMedicosNaTabela(servico.consultarTodos());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um registro para deletar.");
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        campo_pesquisa.setText("");
        MedicoServico servico = new MedicoServico();
        carregarMedicosNaTabela(servico.consultarTodos());
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(ListaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JTextField campo_pesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMedico;
    // End of variables declaration//GEN-END:variables
}
