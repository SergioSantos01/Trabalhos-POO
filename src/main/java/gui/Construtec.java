package gui;

import Controler.Gestor;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import model.Equipamentos;
import model.Locacao;
import service.Relatorio;
import Controler.Controlador;
import java.time.format.DateTimeFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import model.Cliente;



public class Construtec extends javax.swing.JFrame {

    
    public Construtec() {
        initComponents();
        inicializarDropdownEquipamentos();
    }
    
    private Gestor gestor = new Gestor();
    private Controlador controlador = new Controlador();
    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelCadastro = new javax.swing.JPanel();
        Lnome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        Ldescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        Ldiaria = new javax.swing.JLabel();
        txtDiaria = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelarC = new javax.swing.JButton();
        Lquantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRegistro = new javax.swing.JPanel();
        Lequipamentos = new javax.swing.JLabel();
        cboxEquip = new javax.swing.JComboBox<>();
        Ldadoscliente = new javax.swing.JLabel();
        LnomeCliente = new javax.swing.JLabel();
        Lcpf = new javax.swing.JLabel();
        Ltelefone = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        Ldatas = new javax.swing.JLabel();
        LdataInicio = new javax.swing.JLabel();
        LdataTermino = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JTextField();
        txtDataTermino = new javax.swing.JTextField();
        btnCancelarR = new javax.swing.JButton();
        Lvalormulta = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        Laviso1 = new javax.swing.JLabel();
        Laviso2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        panelDevolucao = new javax.swing.JPanel();
        Lbuscar = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAinformacoesDevolucoes = new javax.swing.JTextArea();
        btnConfirmarDevolucao = new javax.swing.JButton();
        btnCancelarD = new javax.swing.JButton();
        panelRelatorios = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txARelatorios = new javax.swing.JTextArea();
        btnRelatorioEquipamentos = new javax.swing.JButton();
        btnRelatorioMultaClientes = new javax.swing.JButton();
        Lrelatorios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lnome.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        Ldescricao.setText("Descrição:");

        Ldiaria.setText("Diária:");

        txtDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiariaActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelarC.setText("Cancelar");
        btnCancelarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCActionPerformed(evt);
            }
        });

        Lquantidade.setText("Quantidade:");

        jLabel1.setText("Insira nos campos abaixo as informações do equipamento que");

        jLabel2.setText("dejesa cadastrar:");

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(btnSalvar)
                                .addGap(118, 118, 118)
                                .addComponent(btnCancelarC))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addComponent(Ldiaria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addComponent(Lquantidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
                                        .addComponent(Ldescricao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addComponent(Lnome)
                                        .addGap(82, 82, 82)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(134, 134, 134))))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel2)))
                .addGap(0, 94, Short.MAX_VALUE))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lnome))
                .addGap(38, 38, 38)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ldescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lquantidade))
                .addGap(31, 31, 31)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ldiaria)
                    .addComponent(txtDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelarC))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro de Equipamentos", panelCadastro);

        Lequipamentos.setText("Equipamentos:");

        cboxEquip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxEquipActionPerformed(evt);
            }
        });

        Ldadoscliente.setText("Dados do Cliente:");

        LnomeCliente.setText("Nome:");

        Lcpf.setText("CPF:");

        Ltelefone.setText("Telefone:");

        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        Ldatas.setText("Datas:");

        LdataInicio.setText("Data Início:");

        LdataTermino.setText("Data Término:");

        txtDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataInicioActionPerformed(evt);
            }
        });

        txtDataTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataTerminoActionPerformed(evt);
            }
        });

        btnCancelarR.setText("Cancelar");
        btnCancelarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRActionPerformed(evt);
            }
        });

        Lvalormulta.setText("Valor da Multa:");

        Laviso1.setText("(Se nenhum valor for informado, o sistema deve considerar");

        Laviso2.setText("a multa base de 10% sobre o valor da diária do equipamento.)");

        btnRegistrar.setText("Registrar Locação");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lequipamentos)
                                    .addComponent(Lvalormulta))
                                .addGap(119, 119, 119)
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboxEquip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMulta))
                                .addGap(18, 18, 18)
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Laviso2)
                                    .addComponent(Laviso1)))
                            .addComponent(LdataInicio)
                            .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                                    .addComponent(LnomeCliente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                                    .addComponent(Lcpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroLayout.createSequentialGroup()
                                    .addComponent(Ltelefone)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addGap(176, 176, 176)
                                .addComponent(btnCancelarR)
                                .addGap(98, 98, 98))))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LdataTermino)
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Ldadoscliente))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(Ldatas)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lequipamentos)
                    .addComponent(cboxEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(Laviso1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Laviso2))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lvalormulta))))
                .addGap(18, 18, 18)
                .addComponent(Ldadoscliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LnomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lcpf))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ltelefone))
                .addGap(24, 24, 24)
                .addComponent(Ldatas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LdataInicio)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LdataTermino)
                            .addComponent(txtDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarR)
                            .addComponent(btnRegistrar))
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Registro de Locações", panelRegistro);

        Lbuscar.setText("Buscar por CPF ou Código de Locação:  ");

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        txAinformacoesDevolucoes.setColumns(20);
        txAinformacoesDevolucoes.setRows(5);
        jScrollPane1.setViewportView(txAinformacoesDevolucoes);

        btnConfirmarDevolucao.setText("Confirmar Devolução");
        btnConfirmarDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarDevolucaoActionPerformed(evt);
            }
        });

        btnCancelarD.setText("Cancelar");
        btnCancelarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDevolucaoLayout = new javax.swing.GroupLayout(panelDevolucao);
        panelDevolucao.setLayout(panelDevolucaoLayout);
        panelDevolucaoLayout.setHorizontalGroup(
            panelDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDevolucaoLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(panelDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDevolucaoLayout.createSequentialGroup()
                        .addComponent(btnConfirmarDevolucao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarD))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDevolucaoLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(panelDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDevolucaoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Lbuscar))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        panelDevolucaoLayout.setVerticalGroup(
            panelDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDevolucaoLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(Lbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarDevolucao)
                    .addComponent(btnCancelarD))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Devolução de Equipamentos", panelDevolucao);

        txARelatorios.setColumns(20);
        txARelatorios.setRows(5);
        jScrollPane2.setViewportView(txARelatorios);

        btnRelatorioEquipamentos.setText("Gerar Relatório Ranking de Equipamentos");
        btnRelatorioEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioEquipamentosActionPerformed(evt);
            }
        });

        btnRelatorioMultaClientes.setText("Gerar Relatório Ranking de Multas de Clientes");
        btnRelatorioMultaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioMultaClientesActionPerformed(evt);
            }
        });

        Lrelatorios.setText("Relatórios:");

        javax.swing.GroupLayout panelRelatoriosLayout = new javax.swing.GroupLayout(panelRelatorios);
        panelRelatorios.setLayout(panelRelatoriosLayout);
        panelRelatoriosLayout.setHorizontalGroup(
            panelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRelatorioEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnRelatorioMultaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelRelatoriosLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(Lrelatorios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRelatoriosLayout.setVerticalGroup(
            panelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRelatoriosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRelatorioMultaClientes)
                    .addComponent(btnRelatorioEquipamentos))
                .addGap(24, 24, 24)
                .addComponent(Lrelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Relatórios", panelRelatorios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Cadastro de Equipamentos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
     try {
        String nome = txtNome.getText();
        String descricao = txtDescricao.getText();
        double valorDiario = Double.parseDouble(txtDiaria.getText());
        int quantidade = Integer.parseInt(txtQuantidade.getText());

        gestor.cadastrarEquipamento(nome, descricao, valorDiario, quantidade);

        JOptionPane.showMessageDialog(this, "Equipamento cadastrado com sucesso!");
        inicializarDropdownEquipamentos();
        limparCamposCadastro();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Preencha os campos corretamente!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

    private void limparCamposCadastro() {
        txtNome.setText("");
        txtDescricao.setText("");
        txtDiaria.setText("");
        txtQuantidade.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCActionPerformed
        limparCamposCadastro();
    }//GEN-LAST:event_btnCancelarCActionPerformed

    private void txtDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiariaActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataInicioActionPerformed

    private void txtDataTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataTerminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataTerminoActionPerformed

    private void btnCancelarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRActionPerformed

        txtMulta.setText("");
        txtNomeCliente.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtDataInicio.setText("");
        txtDataTermino.setText("");

    }//GEN-LAST:event_btnCancelarRActionPerformed

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void btnRelatorioEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioEquipamentosActionPerformed
         List<Locacao> locacoes = gestor.getLocacoes(); // Obtenha todas as locações

    Map<String, Long> equipamentosMaisAlugados = Relatorio.gerarRelatorioEquipamentos(locacoes);

    StringBuilder relatorio = new StringBuilder();
    relatorio.append("Relatório: Equipamentos Mais Alugados\n");
    relatorio.append("=====================================\n");
    relatorio.append(String.format("%-20s %-10s\n", "Equipamento", "Aluguéis"));

    equipamentosMaisAlugados.forEach((nome, alugueis) -> {
        relatorio.append(String.format("%-20s %-10d\n", nome, alugueis));
    });

    txARelatorios.setText(relatorio.toString());
    }//GEN-LAST:event_btnRelatorioEquipamentosActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnCancelarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDActionPerformed
        txtBusca.setText("");
    }//GEN-LAST:event_btnCancelarDActionPerformed

    private void cboxEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxEquipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxEquipActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            String nomeCliente = txtNomeCliente.getText().trim();
            String cpf = txtCpf.getText().trim();
            String telefone = txtTelefone.getText().trim();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataInicio = LocalDate.parse(txtDataInicio.getText().trim(), formatter);
            LocalDate dataFim = LocalDate.parse(txtDataTermino.getText().trim(), formatter);
            double multaPercentual = txtMulta.getText().isEmpty() ? 10.0 : Double.parseDouble(txtMulta.getText());

            if (nomeCliente.isEmpty() ||  cpf.isEmpty() || telefone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Obtenha o equipamento selecionado no dropdown
            int selectedIndex = cboxEquip.getSelectedIndex();
            if (selectedIndex <= 0) {
                JOptionPane.showMessageDialog(this, "Selecione um equipamento para a locação.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Equipamentos equipamentoSelecionado = gestor.getEquipamentosDisponiveis().get(selectedIndex - 1);

            gestor.registrarLocacao(nomeCliente, cpf, telefone, List.of(equipamentoSelecionado), dataInicio, dataFim, multaPercentual);

            JOptionPane.showMessageDialog(this, "Locação registrada com sucesso!");

            txtMulta.setText("");
            txtNomeCliente.setText("");
            txtCpf.setText("");
            txtTelefone.setText("");
            txtDataInicio.setText("");
            txtDataTermino.setText("");
            ;
            inicializarDropdownEquipamentos(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao registrar locação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Para depuração
        }
    
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnConfirmarDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarDevolucaoActionPerformed
        String cpfOuCodigo = txtBusca.getText().trim();

        if (cpfOuCodigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um CPF ou Código de Locação válido.", 
                                          "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        List<Locacao> locacoes = gestor.buscarLocacaoPorCpf(cpfOuCodigo);

        if (locacoes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma locação encontrada para o CPF fornecido.", 
                                          "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Locacao locacaoSelecionada = locacoes.get(0); 

        LocalDate dataDevolucao = LocalDate.now();
        gestor.registrarDevolucao(locacaoSelecionada, dataDevolucao);

        StringBuilder detalhesDevolucao = new StringBuilder();
        detalhesDevolucao.append("Equipamento(s) Devolvido(s):\n");

        for (Equipamentos equipamento : locacaoSelecionada.getEquipamentos()) {
            detalhesDevolucao.append(String.format("- %s (Código: %s)\n", equipamento.getNome(), equipamento.getCodigo()));
        }

        detalhesDevolucao.append("\nResumo da Devolução:\n");
        detalhesDevolucao.append(String.format("Data de Término: %s\n", locacaoSelecionada.getDatatermino()));
        detalhesDevolucao.append(String.format("Data de Devolução: %s\n", dataDevolucao));
        detalhesDevolucao.append(String.format("Multa Aplicada: R$ %.2f\n", locacaoSelecionada.calcularMulta(dataDevolucao)));
        detalhesDevolucao.append(String.format("Valor do Aluguel: R$ %.2f\n", locacaoSelecionada.getValorTotal()));
        detalhesDevolucao.append(String.format("Valor Total (Aluguel + Multa): R$ %.2f\n", 
                                               locacaoSelecionada.getValorTotal() + locacaoSelecionada.calcularMulta(dataDevolucao)));

        txAinformacoesDevolucoes.setText(detalhesDevolucao.toString());
        
        inicializarDropdownEquipamentos();

        JOptionPane.showMessageDialog(this, "Devolução confirmada com sucesso!", 
                                      "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnConfirmarDevolucaoActionPerformed

    private void btnRelatorioMultaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioMultaClientesActionPerformed
        List<Cliente> clientes = gestor.getClientes(); 

    List<Cliente> clientesComMultas = Relatorio.gerarRelatorioMultaClientes(clientes);

    StringBuilder relatorio = new StringBuilder();
    relatorio.append("Relatório: Clientes com Multas Acumuladas\n");
    relatorio.append("=========================================\n");
    relatorio.append(String.format("%-20s %-15s %-10s\n", "Cliente", "CPF", "Multas"));

    clientesComMultas.forEach(cliente -> {
        double totalMultas = cliente.getLocacoes().stream()
                .mapToDouble(locacao -> locacao.calcularMulta(LocalDate.now()))
                .sum();
        relatorio.append(String.format("%-20s %-15s R$ %-10.2f\n", cliente.getNome(), cliente.getCPF(), totalMultas));
    });

    txARelatorios.setText(relatorio.toString());
    }//GEN-LAST:event_btnRelatorioMultaClientesActionPerformed
    
    
    private void exibirRelatorio(String titulo, List<Object[]> dados) {
        StringBuilder builder = new StringBuilder();

        builder.append(titulo).append("\n");
        builder.append("====================================\n");

        builder.append(String.format("%-20s %-10s %-10s %-15s\n", 
            "Nome", "Código", "Aluguéis", "Receita Total"));
        builder.append("------------------------------------\n");

        for (Object[] linha : dados) {
            builder.append(String.format("%-20s %-10s %-10s %-15s\n", 
                linha[0], linha[1], linha[2], linha[3]));
        }

        txARelatorios.setText(builder.toString());
    }

    private void inicializarDropdownEquipamentos() {
        cboxEquip.removeAllItems();

        cboxEquip.addItem("Selecione uma opção");

        List<Equipamentos> equipamentosDisponiveis = gestor.getEquipamentosDisponiveis();
        for (Equipamentos equipamento : equipamentosDisponiveis) {
            cboxEquip.addItem(equipamento.getNome());
        }

        cboxEquip.setSelectedIndex(0);
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Construtec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Laviso1;
    private javax.swing.JLabel Laviso2;
    private javax.swing.JLabel Lbuscar;
    private javax.swing.JLabel Lcpf;
    private javax.swing.JLabel Ldadoscliente;
    private javax.swing.JLabel LdataInicio;
    private javax.swing.JLabel LdataTermino;
    private javax.swing.JLabel Ldatas;
    private javax.swing.JLabel Ldescricao;
    private javax.swing.JLabel Ldiaria;
    private javax.swing.JLabel Lequipamentos;
    private javax.swing.JLabel Lnome;
    private javax.swing.JLabel LnomeCliente;
    private javax.swing.JLabel Lquantidade;
    private javax.swing.JLabel Lrelatorios;
    private javax.swing.JLabel Ltelefone;
    private javax.swing.JLabel Lvalormulta;
    private javax.swing.JButton btnCancelarC;
    private javax.swing.JButton btnCancelarD;
    private javax.swing.JButton btnCancelarR;
    private javax.swing.JButton btnConfirmarDevolucao;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRelatorioEquipamentos;
    private javax.swing.JButton btnRelatorioMultaClientes;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboxEquip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelDevolucao;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPanel panelRelatorios;
    private javax.swing.JTextArea txARelatorios;
    private javax.swing.JTextArea txAinformacoesDevolucoes;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataInicio;
    private javax.swing.JTextField txtDataTermino;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDiaria;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}