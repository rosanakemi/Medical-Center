/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.telas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import services.CalculoIdade;
import model.Paciente;
import services.ValidacaoCpf;
import services.PacienteServico;

/**
 *
 * @author zanna
 */
public class DadosPaciente extends javax.swing.JFrame {

    private Paciente paciente;

    /**
     * Creates new form CadastroPaciente
     *
     * @param paciente
     */
    public DadosPaciente(Paciente paciente) {
        initComponents();
        this.paciente = paciente;

        if (paciente != null) {
            carregarDadoNaTela();
        }
    }

    public void carregarDadoNaTela() {
        botao_cadastrar.setText("Atualizar");

        campo_nome.setText(this.paciente.getNome());
        campo_cpf.setText(this.paciente.getCpf());
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        campo_datanascimento.setText(dateFormat.format(this.paciente.getData_de_nascimento()));
        campo_cartaosus.setText(this.paciente.getNumeroSUS());
        campo_email.setText(this.paciente.getEmail());
        campo_telefone.setText(this.paciente.getTelefone());
        combo_situacao.setSelectedItem(this.paciente.getStatus());
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
        jPanelBody = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botao_cadastrar = new javax.swing.JButton();
        botao_cancelar = new javax.swing.JButton();
        campo_nome = new javax.swing.JTextField();
        combo_situacao = new javax.swing.JComboBox<>();
        campo_cpf = new javax.swing.JFormattedTextField();
        campo_datanascimento = new javax.swing.JFormattedTextField();
        campo_email = new javax.swing.JFormattedTextField();
        campo_telefone = new javax.swing.JFormattedTextField();
        idateTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campo_cartaosus = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBody.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBody.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nome Completo:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("CPF:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Data de Nascimento:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Número cartão do SUS:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("E-mail:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Telefone:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Situação:");

        botao_cadastrar.setBackground(new java.awt.Color(0, 0, 204));
        botao_cadastrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botao_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        botao_cadastrar.setText("Cadastrar");
        botao_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cadastrarActionPerformed(evt);
            }
        });

        botao_cancelar.setBackground(new java.awt.Color(51, 0, 204));
        botao_cancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botao_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        botao_cancelar.setText("Cancelar");
        botao_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cancelarActionPerformed(evt);
            }
        });

        campo_nome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        campo_nome.setForeground(new java.awt.Color(51, 51, 51));

        combo_situacao.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        combo_situacao.setForeground(new java.awt.Color(51, 51, 51));
        combo_situacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo", " " }));

        try {
            campo_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campo_datanascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campo_datanascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campo_datanascimentoFocusLost(evt);
            }
        });
        campo_datanascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_datanascimentoActionPerformed(evt);
            }
        });

        campo_email.setText("seu@email.com.br");
        campo_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_emailActionPerformed(evt);
            }
        });

        try {
            campo_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campo_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_telefoneActionPerformed(evt);
            }
        });

        idateTxt.setEditable(false);
        idateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idateTxtActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Idade");

        campo_cartaosus.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campo_cartaosus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campo_cartaosusFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_nome)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(campo_datanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(campo_cpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campo_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                            .addComponent(campo_telefone, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combo_situacao, javax.swing.GroupLayout.Alignment.LEADING, 0, 106, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(51, 51, 51))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(campo_cartaosus, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botao_cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_datanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campo_cartaosus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campo_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_cadastrar)
                    .addComponent(botao_cancelar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cancelarActionPerformed
        this.dispose();
        // Instancia e exibe a tela principal
        ListaPaciente view = new ListaPaciente();
        view.setVisible(true);
    }//GEN-LAST:event_botao_cancelarActionPerformed

    private void botao_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cadastrarActionPerformed
        {
            // Verifica se o campo de login está vazio
            if (campo_nome.getText().isEmpty()) {
                // Exibe uma mensagem de alerta informando que o campo de login está vazio
                JOptionPane.showMessageDialog(null, "Campo nome vazio");
                // Define o foco no campo de nome para o usuário preencher
                campo_nome.requestFocus();
                return; // Sai do método, pois a validação falhou
            }
            if (campo_cpf.getText().isEmpty()) {
                // Exibe uma mensagem de alerta informando que o campo de login está vazio
                JOptionPane.showMessageDialog(null, "Campo CPF vazio");
                // Define o foco no campo de CPF para o usuário preencher
                campo_cpf.requestFocus();
                return; // Sai do método, pois a validação falhou
            }
            
            if (campo_cpf.getText().length()!=14) {
                // Exibe uma mensagem de alerta informando que o campo de login está vazio
                JOptionPane.showMessageDialog(null, "formato invalido");
                // Define o foco no campo de CPF para o usuário preencher
                campo_cpf.requestFocus();
                return; // Sai do método, pois a validação falhou
            }
            
            String cpf = campo_cpf.getText();
            if (!ValidacaoCpf.validaCPF(cpf)) {
                System.out.println(campo_cpf.getText());
                // Exibe uma mensagem de alerta informando que o campo
                JOptionPane.showMessageDialog(null, "CPF inválido");
                // Define o foco no campo de CPF para o usuário preencher
                campo_cpf.requestFocus();
                return; // Sai do método, pois a validação falhou
            }
            if (!campo_datanascimento.getText().matches("(.*\\d.*){8,}")) {
                // Exibe uma mensagem de alerta informando que o campo  está vazio
                JOptionPane.showMessageDialog(null, "Campo data de Nascimento Invalido");
                // Define o foco no campo de dataNascimento para o usuário preencher
                campo_datanascimento.requestFocus();
                return; // Sai do método, pois a validação falhou
            }

            if (campo_cartaosus.getText().isEmpty()) {
                // Exibe uma mensagem de alerta informando que o campo está vazio
                JOptionPane.showMessageDialog(null, "Campo cartaoSus vazio");
                // Define o foco no campo de cartaoSus para o usuário preencher
                campo_cartaosus.requestFocus();
                return; // Sai do método, pois a validação falhou
            }

            if (campo_email.getText().isEmpty()) {
                // Exibe uma mensagem de alerta informando que o campo está vazio
                JOptionPane.showMessageDialog(null, "Campo email vazio");
                // Define o foco no campo de email para o usuário preencher
                campo_email.requestFocus();
                return; // Sai do método, pois a validação falhou
            }

            if (campo_telefone.getText().isEmpty()) {
                // Exibe uma mensagem de alerta informando que o campo está vazio
                JOptionPane.showMessageDialog(null, "Campo telefone vazio");
                // Define o foco no campo de telefone para o usuário preencher
                campo_telefone.requestFocus();
                return; // Sai do método, pois a validação falhou
            }
           

            // Chama o método de autenticação passando os valores dos campos de login e senha
            if ((!campo_nome.getText().isEmpty()) && (!campo_cpf.getText().isEmpty()) && (!campo_datanascimento.getText().isEmpty()) && (!campo_cartaosus.getText().isEmpty()) && (!campo_email.getText().isEmpty()) && (!campo_telefone.getText().isEmpty())) {
                // Se a autenticação for bem-sucedida, exibe uma mensagem informando que o usuário está logado
                PacienteServico servico = new PacienteServico();

                try {

                    if (this.paciente == null) {
                        if (servico.cadastrar(campo_nome.getText(), campo_cpf.getText(), campo_datanascimento.getText(), campo_cartaosus.getText(), campo_email.getText(), campo_telefone.getText(), combo_situacao.getSelectedItem().toString())) {
                            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso");
                            this.dispose();
                            ListaPaciente view = new ListaPaciente();
                            view.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Paciente com idade acima de 120 anos.");
                        }
                    } else {
                        if (servico.atualizar(this.paciente.getId(),campo_nome.getText(), campo_cpf.getText(), campo_datanascimento.getText(), campo_cartaosus.getText(), campo_email.getText(), campo_telefone.getText(), combo_situacao.getSelectedItem().toString())) {
                            JOptionPane.showMessageDialog(null, "Paciente atualizado com sucesso");
                            this.dispose();
                            ListaPaciente view = new ListaPaciente();
                            view.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Paciente com idade acima de 120 anos.");
                        }
                    }

                } catch (ParseException ex) {
                    Logger.getLogger(DadosPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_botao_cadastrarActionPerformed

    private void campo_datanascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_datanascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_datanascimentoActionPerformed

    private void campo_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_emailActionPerformed

    private void campo_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_telefoneActionPerformed

    private void campo_datanascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campo_datanascimentoFocusLost
        System.out.println(CalculoIdade.calculateIdade(campo_datanascimento.getText()));
        //chama a funçao pra calcular a idade
        int idadeInt = CalculoIdade.calculateIdade(campo_datanascimento.getText());
        //condicional para idade acima de 120
        if (idadeInt>120) {
                // Exibe uma mensagem de alerta informando idade Invalida
                JOptionPane.showMessageDialog(null, "idade Invalida");
                // Define o foco no campo de dataNascimento para o usuário preencher
                campo_datanascimento.requestFocus();
                return; // Sai do método, pois a validação falhou
            }
        String idade= String.valueOf(idadeInt);
        idateTxt.setText(idade);
        
    }//GEN-LAST:event_campo_datanascimentoFocusLost

    private void idateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idateTxtActionPerformed

    private void campo_cartaosusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campo_cartaosusFocusLost
        String numberString = campo_cartaosus.getText();
        int number = Integer.parseInt(numberString);
        if (number<0) {
                // Exibe uma mensagem de alerta informando que o campo está vazio
                JOptionPane.showMessageDialog(null, "Campo cartaoSus negativo ");
                // Define o foco no campo de cartaoSus para o usuário preencher
                campo_cartaosus.requestFocus();
                return; // Sai do método, pois a validação falhou
            }
        
        
    }//GEN-LAST:event_campo_cartaosusFocusLost

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
            java.util.logging.Logger.getLogger(DadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DadosPaciente(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cadastrar;
    private javax.swing.JButton botao_cancelar;
    private javax.swing.JFormattedTextField campo_cartaosus;
    private javax.swing.JFormattedTextField campo_cpf;
    private javax.swing.JFormattedTextField campo_datanascimento;
    private javax.swing.JFormattedTextField campo_email;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JFormattedTextField campo_telefone;
    private javax.swing.JComboBox<String> combo_situacao;
    private javax.swing.JTextField idateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBody;
    // End of variables declaration//GEN-END:variables
}
