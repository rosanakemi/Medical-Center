/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.telas;

/**
 *
 * @author zanna
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
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
        btnAgenda = new javax.swing.JButton();
        btnPaciente = new javax.swing.JToggleButton();
        btnMedico = new javax.swing.JToggleButton();
        btnConsulta = new javax.swing.JToggleButton();
        btnAvaliacao = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TextPesquisar = new javax.swing.JTextField();
        lupa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgenda = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("jLabel4");

        btnAgenda.setBackground(new java.awt.Color(255, 255, 255));
        btnAgenda.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAgenda.setForeground(new java.awt.Color(51, 51, 51));
        btnAgenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\zanna\\Downloads\\icones\\cronograma.png")); // NOI18N
        btnAgenda.setText(" Agenda");
        btnAgenda.setBorder(null);
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });

        btnPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnPaciente.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnPaciente.setForeground(new java.awt.Color(51, 51, 51));
        btnPaciente.setIcon(new javax.swing.ImageIcon("C:\\Users\\zanna\\Downloads\\icones\\homem-de-negocios.png")); // NOI18N
        btnPaciente.setText(" Paciente");
        btnPaciente.setBorder(null);

        btnMedico.setBackground(new java.awt.Color(255, 255, 255));
        btnMedico.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnMedico.setForeground(new java.awt.Color(51, 51, 51));
        btnMedico.setIcon(new javax.swing.ImageIcon("C:\\Users\\zanna\\Downloads\\icones\\estetoscopio.png")); // NOI18N
        btnMedico.setText(" Médico");
        btnMedico.setBorder(null);

        btnConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btnConsulta.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnConsulta.setForeground(new java.awt.Color(51, 51, 51));
        btnConsulta.setIcon(new javax.swing.ImageIcon("C:\\Users\\zanna\\Downloads\\icones\\recepcao.png")); // NOI18N
        btnConsulta.setText(" Consulta");
        btnConsulta.setBorder(null);

        btnAvaliacao.setBackground(new java.awt.Color(255, 255, 255));
        btnAvaliacao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAvaliacao.setForeground(new java.awt.Color(51, 51, 51));
        btnAvaliacao.setIcon(new javax.swing.ImageIcon("C:\\Users\\zanna\\Downloads\\icones\\avaliacao.png")); // NOI18N
        btnAvaliacao.setText(" Avaliação");
        btnAvaliacao.setBorder(null);

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(51, 51, 51));
        btnSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\zanna\\Downloads\\icones\\sair.png")); // NOI18N
        btnSair.setText("    Sair");
        btnSair.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAvaliacao, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\zanna\\Downloads\\icones\\pagina-inicial.png")); // NOI18N
        jLabel1.setText("Agenda");

        btnNovo.setBackground(new java.awt.Color(51, 0, 255));
        btnNovo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");

        btnEditar.setBackground(new java.awt.Color(51, 0, 255));
        btnEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Pesquisar:");

        TextPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        TextPesquisar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TextPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPesquisarActionPerformed(evt);
            }
        });

        lupa.setBackground(new java.awt.Color(51, 0, 255));
        lupa.setText("jButton3");
        lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Data:");

        tabelaAgenda.setBackground(new java.awt.Color(255, 255, 255));
        tabelaAgenda.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tabelaAgenda.setForeground(new java.awt.Color(51, 51, 51));
        tabelaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:00", null, null, null, null},
                {"08:30", " Angelica p.", null, null, null},
                {"09:00", null, null, null, null},
                {"09:30", " Josefina duarte", null, null, null},
                {"10:00", null, null, null, null},
                {"10:30", null, null, null, null},
                {"11:00", null, null, null, null},
                {"11:30", null, null, null, null},
                {"12:00", null, null, null, null},
                {"12:30", null, null, null, null},
                {"13:00", null, null, null, null},
                {"13:30", null, null, null, null},
                {"14:00", null, null, null, null},
                {"14:30", null, null, null, null},
                {"15:00", null, null, null, null},
                {"15:30", null, null, null, null},
                {"16:00", null, null, null, null},
                {"16:30", null, null, null, null},
                {"17:00", null, null, null, null}
            },
            new String [] {
                "Horário", "Paciente", "Paciente", "Paciente", "Paciente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaAgenda.setShowGrid(true);
        tabelaAgenda.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tabelaAgenda);
        if (tabelaAgenda.getColumnModel().getColumnCount() > 0) {
            tabelaAgenda.getColumnModel().getColumn(0).setMinWidth(40);
            tabelaAgenda.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("16/06/2024");

        jButton1.setBackground(new java.awt.Color(51, 0, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("excluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(4, 4, 4)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(TextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(jLabel2)
                    .addComponent(TextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lupa)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
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

    private void TextPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPesquisarActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lupaActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextPesquisar;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JToggleButton btnAvaliacao;
    private javax.swing.JToggleButton btnConsulta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JToggleButton btnMedico;
    private javax.swing.JButton btnNovo;
    private javax.swing.JToggleButton btnPaciente;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lupa;
    private javax.swing.JTable tabelaAgenda;
    // End of variables declaration//GEN-END:variables
}