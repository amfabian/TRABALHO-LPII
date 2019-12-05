package View;

//imports
import Controller.AlunoControl;
import Controller.AvaliacaoControl;
import Controller.BancaControl;
import Controller.ProfessorControl;
import Controller.PropostaTCControl;
import TableModel.AlunoTM;
import TableModel.AvaliacaoTM;
import TableModel.BancaTM;
import TableModel.ProfessorTM;
import TableModel.PropostaTCTM;
import javax.swing.JOptionPane;
//imports

public class Crud extends javax.swing.JFrame {
    
    boolean editar_aluno = false;
    boolean editar_avaliacao = false;
    boolean editar_banca = false;
    boolean editar_professor = false;
    boolean editar_proposta = false;

    
    AvaliacaoTM ModeloAvaliacao;
    AlunoTM ModeloAluno;
    BancaTM ModeloBanca;
    ProfessorTM ModeloProfessor;
    PropostaTCTM ModeloPropostaTC;
    
    public void LoadTable(){
        //ALUNO
        ModeloAluno = new AlunoTM(AlunoControl.getAlunos());
        tbl_aluno.setModel(ModeloAluno);
        tbl_aluno.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbl_aluno.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_aluno.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbl_aluno.getColumnModel().getColumn(3).setPreferredWidth(150);
        //ALUNO
        
        //AVALIAÇÃO
        ModeloAvaliacao = new AvaliacaoTM(AvaliacaoControl.getAvaliacoes());
        tbl_avaliacao.setModel(ModeloAvaliacao);
        tbl_avaliacao.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbl_avaliacao.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_avaliacao.getColumnModel().getColumn(2).setPreferredWidth(150);
        //AVALIAÇÃO
        
        //BANCA
        ModeloBanca = new BancaTM(BancaControl.getBancas());
        tbl_banca.setModel(ModeloBanca);
        tbl_banca.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbl_banca.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_banca.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbl_banca.getColumnModel().getColumn(3).setPreferredWidth(150);
        //BANCA
        
        //PROFESSOR
        ModeloProfessor = new ProfessorTM(ProfessorControl.getProfessores());
        tbl_professor.setModel(ModeloProfessor);
        tbl_professor.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbl_professor.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_professor.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbl_professor.getColumnModel().getColumn(3).setPreferredWidth(150);
        //PROFESSOR
        
        //PROPOSTA TC
        ModeloPropostaTC = new PropostaTCTM(PropostaTCControl.getPropostas());
        tbl_propostatc.setModel(ModeloPropostaTC);
        tbl_propostatc.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbl_propostatc.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_propostatc.getColumnModel().getColumn(2).setPreferredWidth(150);
        //PROPOSTA TC
        
    }
    
    //Botões
    public void BotoesAluno(boolean N, boolean E, boolean R, boolean S, boolean C){
        btn_novo_aluno.setEnabled(N);
        btn_editar_aluno.setEnabled(E);
        btn_excluir_aluno.setEnabled(R);
        btn_salvar_aluno.setEnabled(S);
        btn_cancelar_aluno.setEnabled(C);        
    }
    
    public void BotoesAvaliacao(boolean N, boolean E, boolean R, boolean S, boolean C){
        btn_novo_avaliacao.setEnabled(N);
        btn_editar_avaliacao.setEnabled(E);
        btn_excluir_avaliacao.setEnabled(R);
        btn_salvar_avaliacao.setEnabled(S);
        btn_cancelar_avaliacao.setEnabled(C);
    }
    
    public void BotoesBanca(boolean N, boolean E, boolean R, boolean S, boolean C){
        btn_novo_banca.setEnabled(N);
        btn_editar_banca.setEnabled(E);
        btn_excluir_banca.setEnabled(R);
        btn_salvar_banca.setEnabled(S);
        btn_cancelar_banca.setEnabled(C);
    }
    
    public void BotoesProfessor(boolean N, boolean E, boolean R, boolean S, boolean C){
        btn_novo_professor.setEnabled(N);
        btn_editar_professor.setEnabled(E);
        btn_excluir_professor.setEnabled(R);
        btn_salvar_professor.setEnabled(S);
        btn_cancelar_professor.setEnabled(C);
    }
    
    public void BotoesPropostaTC(boolean N, boolean E, boolean R, boolean S, boolean C){
        btn_novo_propostatc.setEnabled(N);
        btn_editar_propostatc.setEnabled(E);
        btn_excluir_propostatc.setEnabled(R);
        btn_salvar_propostatc.setEnabled(S);
        btn_cancelar_propostatc.setEnabled(C);
    }
    //Botões
    //Campos
    public void CamposAluno(){
        c_nome_aluno.setText("");
        c_matricula_aluno.setText("");
        c_email_aluno.setText("");
        c_tel_aluno.setText("");
    }
    
    public void CamposAvaliacao(){
        c_idbanca_avaliacao.setText("");
        c_matricula_avaliacao.setText("");
        c_nota_avaliacao.setText("");
    }
    
    public void CamposBanca(){
        c_avaliadorI_banca.setText("");
        c_avaliadorII_banca.setText("");
        c_orientador_banca.setText("");
        c_idbanca_banca.setText("");
    }
    
    public void CamposProfessor(){
        c_nome_professor.setText("");
        c_email_professor.setText("");
        c_area_professor.setText("");
        c_sujestao_professor.setText("");
    }
    
    public void CamposPropostaTC(){
        c_titulo_propostatc.setText("");
        c_autor_propostatc.setText("");
        c_orientador_propostatc.setText("");
    }
    //Campos
    
    public Crud() {
        initComponents();
        setLocationRelativeTo(null);
        LoadTable();
        BotoesAluno(true,true,true,false,false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_aluno = new javax.swing.JTable();
        btn_novo_aluno = new javax.swing.JButton();
        btn_editar_aluno = new javax.swing.JButton();
        btn_excluir_aluno = new javax.swing.JButton();
        pnl_aluno = new javax.swing.JPanel();
        lbl_nome_aluno = new javax.swing.JLabel();
        c_nome_aluno = new javax.swing.JTextField();
        lbl_matricula_aluno = new javax.swing.JLabel();
        c_matricula_aluno = new javax.swing.JTextField();
        lbl_email_aluno = new javax.swing.JLabel();
        c_email_aluno = new javax.swing.JTextField();
        lbl_tel_aluno = new javax.swing.JLabel();
        c_tel_aluno = new javax.swing.JTextField();
        btn_salvar_aluno = new javax.swing.JButton();
        btn_cancelar_aluno = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_avaliacao = new javax.swing.JTable();
        btn_novo_avaliacao = new javax.swing.JButton();
        btn_editar_avaliacao = new javax.swing.JButton();
        btn_excluir_avaliacao = new javax.swing.JButton();
        pnl_avaliacao = new javax.swing.JPanel();
        lbl_idbanca_avaliacao = new javax.swing.JLabel();
        c_idbanca_avaliacao = new javax.swing.JTextField();
        lbl_matricula_avaliacao = new javax.swing.JLabel();
        c_matricula_avaliacao = new javax.swing.JTextField();
        lbl_nota_avaliacao = new javax.swing.JLabel();
        c_nota_avaliacao = new javax.swing.JTextField();
        btn_salvar_avaliacao = new javax.swing.JButton();
        btn_cancelar_avaliacao = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_banca = new javax.swing.JTable();
        btn_novo_banca = new javax.swing.JButton();
        btn_editar_banca = new javax.swing.JButton();
        btn_excluir_banca = new javax.swing.JButton();
        pnl_banca = new javax.swing.JPanel();
        lbl_avaliadorI_banca = new javax.swing.JLabel();
        c_avaliadorI_banca = new javax.swing.JTextField();
        lbl_avaliadorII_banca = new javax.swing.JLabel();
        c_avaliadorII_banca = new javax.swing.JTextField();
        lbl_orientador_banca = new javax.swing.JLabel();
        c_orientador_banca = new javax.swing.JTextField();
        lbl_idbanca_banca = new javax.swing.JLabel();
        c_idbanca_banca = new javax.swing.JTextField();
        btn_salvar_banca = new javax.swing.JButton();
        btn_cancelar_banca = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_professor = new javax.swing.JTable();
        btn_novo_professor = new javax.swing.JButton();
        btn_editar_professor = new javax.swing.JButton();
        btn_excluir_professor = new javax.swing.JButton();
        pnl_professor = new javax.swing.JPanel();
        lbl_nome_professor = new javax.swing.JLabel();
        c_nome_professor = new javax.swing.JTextField();
        lbl_email_professor = new javax.swing.JLabel();
        c_email_professor = new javax.swing.JTextField();
        lbl_area_professor = new javax.swing.JLabel();
        c_area_professor = new javax.swing.JTextField();
        lbl_sujestao_professor = new javax.swing.JLabel();
        c_sujestao_professor = new javax.swing.JTextField();
        btn_salvar_professor = new javax.swing.JButton();
        btn_cancelar_professor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_propostatc = new javax.swing.JTable();
        btn_novo_propostatc = new javax.swing.JButton();
        btn_editar_propostatc = new javax.swing.JButton();
        btn_excluir_propostatc = new javax.swing.JButton();
        pnl_propostatc = new javax.swing.JPanel();
        lbl_titulo_propostatc = new javax.swing.JLabel();
        c_titulo_propostatc = new javax.swing.JTextField();
        lbl_autor_propostatc = new javax.swing.JLabel();
        c_autor_propostatc = new javax.swing.JTextField();
        lbl_orientador_propostatc = new javax.swing.JLabel();
        c_orientador_propostatc = new javax.swing.JTextField();
        btn_salvar_propostatc = new javax.swing.JButton();
        btn_cancelar_propostatc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_aluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "E-mail", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_aluno);

        btn_novo_aluno.setText("Novo");
        btn_novo_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novo_alunoActionPerformed(evt);
            }
        });

        btn_editar_aluno.setText("Editar");
        btn_editar_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_alunoActionPerformed(evt);
            }
        });

        btn_excluir_aluno.setText("Excluir");
        btn_excluir_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_alunoActionPerformed(evt);
            }
        });

        pnl_aluno.setBorder(javax.swing.BorderFactory.createTitledBorder("Aluno"));

        lbl_nome_aluno.setText("Nome:");

        lbl_matricula_aluno.setText("Matrícula:");

        lbl_email_aluno.setText("E-mail:");

        lbl_tel_aluno.setText("Tel:");

        btn_salvar_aluno.setText("Salvar");
        btn_salvar_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_alunoActionPerformed(evt);
            }
        });

        btn_cancelar_aluno.setText("Cancelar");
        btn_cancelar_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_alunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_alunoLayout = new javax.swing.GroupLayout(pnl_aluno);
        pnl_aluno.setLayout(pnl_alunoLayout);
        pnl_alunoLayout.setHorizontalGroup(
            pnl_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alunoLayout.createSequentialGroup()
                .addGroup(pnl_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alunoLayout.createSequentialGroup()
                        .addComponent(lbl_nome_aluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_nome_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_alunoLayout.createSequentialGroup()
                        .addComponent(lbl_matricula_aluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_matricula_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alunoLayout.createSequentialGroup()
                        .addComponent(lbl_email_aluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_email_aluno))
                    .addGroup(pnl_alunoLayout.createSequentialGroup()
                        .addComponent(lbl_tel_aluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_tel_aluno))))
            .addGroup(pnl_alunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salvar_aluno)
                .addGap(64, 64, 64)
                .addComponent(btn_cancelar_aluno)
                .addGap(106, 106, 106))
        );
        pnl_alunoLayout.setVerticalGroup(
            pnl_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome_aluno)
                    .addComponent(c_nome_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email_aluno)
                    .addComponent(c_email_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_matricula_aluno)
                    .addComponent(c_matricula_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tel_aluno)
                    .addComponent(c_tel_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(pnl_alunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar_aluno)
                    .addComponent(btn_cancelar_aluno))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_novo_aluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar_aluno)
                .addGap(74, 74, 74)
                .addComponent(btn_excluir_aluno)
                .addGap(42, 42, 42))
            .addComponent(pnl_aluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo_aluno)
                    .addComponent(btn_editar_aluno)
                    .addComponent(btn_excluir_aluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(pnl_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Alunos", jPanel1);

        tbl_avaliacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Banca", "Matrícula", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_avaliacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_avaliacaoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_avaliacao);

        btn_novo_avaliacao.setText("Novo");
        btn_novo_avaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novo_avaliacaoActionPerformed(evt);
            }
        });

        btn_editar_avaliacao.setText("Editar");
        btn_editar_avaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_avaliacaoActionPerformed(evt);
            }
        });

        btn_excluir_avaliacao.setText("Excluir");
        btn_excluir_avaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_avaliacaoActionPerformed(evt);
            }
        });

        pnl_avaliacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Avaliação"));

        lbl_idbanca_avaliacao.setText("ID Banca:");

        lbl_matricula_avaliacao.setText("Matrícula:");

        lbl_nota_avaliacao.setText("Nota:");

        btn_salvar_avaliacao.setText("Salvar");
        btn_salvar_avaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_avaliacaoActionPerformed(evt);
            }
        });

        btn_cancelar_avaliacao.setText("Cancelar");
        btn_cancelar_avaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_avaliacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_avaliacaoLayout = new javax.swing.GroupLayout(pnl_avaliacao);
        pnl_avaliacao.setLayout(pnl_avaliacaoLayout);
        pnl_avaliacaoLayout.setHorizontalGroup(
            pnl_avaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_avaliacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_avaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_avaliacaoLayout.createSequentialGroup()
                        .addComponent(lbl_idbanca_avaliacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_idbanca_avaliacao))
                    .addGroup(pnl_avaliacaoLayout.createSequentialGroup()
                        .addGroup(pnl_avaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_matricula_avaliacao)
                            .addComponent(lbl_nota_avaliacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_avaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_matricula_avaliacao)
                            .addComponent(c_nota_avaliacao))))
                .addContainerGap())
            .addGroup(pnl_avaliacaoLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btn_salvar_avaliacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancelar_avaliacao)
                .addGap(69, 69, 69))
        );
        pnl_avaliacaoLayout.setVerticalGroup(
            pnl_avaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_avaliacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_avaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_idbanca_avaliacao)
                    .addComponent(c_idbanca_avaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_avaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_matricula_avaliacao)
                    .addComponent(c_matricula_avaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_avaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nota_avaliacao)
                    .addComponent(c_nota_avaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnl_avaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar_avaliacao)
                    .addComponent(btn_cancelar_avaliacao))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btn_novo_avaliacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar_avaliacao)
                .addGap(72, 72, 72)
                .addComponent(btn_excluir_avaliacao)
                .addGap(48, 48, 48))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_avaliacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo_avaliacao)
                    .addComponent(btn_editar_avaliacao)
                    .addComponent(btn_excluir_avaliacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(pnl_avaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Avaliações", jPanel3);

        tbl_banca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Avaliador I", "Avaliador II", "Orientador", "ID Banca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_banca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bancaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_banca);

        btn_novo_banca.setText("Novo");
        btn_novo_banca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novo_bancaActionPerformed(evt);
            }
        });

        btn_editar_banca.setText("Editar");
        btn_editar_banca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_bancaActionPerformed(evt);
            }
        });

        btn_excluir_banca.setText("Excluir");
        btn_excluir_banca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_bancaActionPerformed(evt);
            }
        });

        pnl_banca.setBorder(javax.swing.BorderFactory.createTitledBorder("Banca"));

        lbl_avaliadorI_banca.setText("Avaliador I:");

        lbl_avaliadorII_banca.setText("Avaliador II:");

        lbl_orientador_banca.setText("Orientador:");

        lbl_idbanca_banca.setText("ID Banca:");

        btn_salvar_banca.setText("Salvar");
        btn_salvar_banca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_bancaActionPerformed(evt);
            }
        });

        btn_cancelar_banca.setText("Cancelar");
        btn_cancelar_banca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_bancaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_bancaLayout = new javax.swing.GroupLayout(pnl_banca);
        pnl_banca.setLayout(pnl_bancaLayout);
        pnl_bancaLayout.setHorizontalGroup(
            pnl_bancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bancaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_bancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_bancaLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btn_salvar_banca)
                        .addGap(74, 74, 74)
                        .addComponent(btn_cancelar_banca)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_bancaLayout.createSequentialGroup()
                        .addGroup(pnl_bancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_avaliadorI_banca)
                            .addComponent(lbl_avaliadorII_banca)
                            .addComponent(lbl_orientador_banca)
                            .addComponent(lbl_idbanca_banca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_bancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_idbanca_banca)
                            .addComponent(c_orientador_banca)
                            .addComponent(c_avaliadorI_banca)
                            .addComponent(c_avaliadorII_banca))
                        .addContainerGap())))
        );
        pnl_bancaLayout.setVerticalGroup(
            pnl_bancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bancaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_bancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_avaliadorI_banca)
                    .addComponent(c_avaliadorI_banca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_bancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_avaliadorII_banca)
                    .addComponent(c_avaliadorII_banca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_bancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_orientador_banca)
                    .addComponent(c_orientador_banca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_bancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_idbanca_banca)
                    .addComponent(c_idbanca_banca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pnl_bancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar_banca)
                    .addComponent(btn_cancelar_banca))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btn_novo_banca)
                .addGap(80, 80, 80)
                .addComponent(btn_editar_banca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_excluir_banca)
                .addGap(39, 39, 39))
            .addComponent(pnl_banca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo_banca)
                    .addComponent(btn_editar_banca)
                    .addComponent(btn_excluir_banca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_banca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bancas", jPanel4);

        tbl_professor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "E-mail", "Área", "Sujestão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_professor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_professorMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_professor);

        btn_novo_professor.setText("Novo");
        btn_novo_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novo_professorActionPerformed(evt);
            }
        });

        btn_editar_professor.setText("Editar");
        btn_editar_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_professorActionPerformed(evt);
            }
        });

        btn_excluir_professor.setText("Excluir");
        btn_excluir_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_professorActionPerformed(evt);
            }
        });

        pnl_professor.setBorder(javax.swing.BorderFactory.createTitledBorder("Professor"));

        lbl_nome_professor.setText("Nome:");

        lbl_email_professor.setText("E-mail:");

        lbl_area_professor.setText("Área:");

        lbl_sujestao_professor.setText("Sujestão:");

        btn_salvar_professor.setText("Salvar");
        btn_salvar_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_professorActionPerformed(evt);
            }
        });

        btn_cancelar_professor.setText("Cancelar");
        btn_cancelar_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_professorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_professorLayout = new javax.swing.GroupLayout(pnl_professor);
        pnl_professor.setLayout(pnl_professorLayout);
        pnl_professorLayout.setHorizontalGroup(
            pnl_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_professorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_professorLayout.createSequentialGroup()
                        .addComponent(lbl_sujestao_professor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_sujestao_professor))
                    .addGroup(pnl_professorLayout.createSequentialGroup()
                        .addComponent(lbl_area_professor)
                        .addGap(23, 23, 23)
                        .addComponent(c_area_professor))
                    .addGroup(pnl_professorLayout.createSequentialGroup()
                        .addComponent(lbl_email_professor)
                        .addGap(18, 18, 18)
                        .addComponent(c_email_professor))
                    .addGroup(pnl_professorLayout.createSequentialGroup()
                        .addComponent(lbl_nome_professor)
                        .addGap(18, 18, 18)
                        .addComponent(c_nome_professor)
                        .addGap(1, 1, 1))
                    .addGroup(pnl_professorLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_salvar_professor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar_professor)
                        .addGap(62, 62, 62)))
                .addContainerGap())
        );
        pnl_professorLayout.setVerticalGroup(
            pnl_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_professorLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnl_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome_professor)
                    .addComponent(c_nome_professor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email_professor)
                    .addComponent(c_email_professor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_area_professor)
                    .addComponent(c_area_professor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sujestao_professor)
                    .addComponent(c_sujestao_professor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnl_professorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar_professor)
                    .addComponent(btn_cancelar_professor))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btn_novo_professor)
                .addGap(76, 76, 76)
                .addComponent(btn_editar_professor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_excluir_professor)
                .addGap(42, 42, 42))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_professor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo_professor)
                    .addComponent(btn_editar_professor)
                    .addComponent(btn_excluir_professor))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(pnl_professor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Professores", jPanel5);

        tbl_propostatc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Título", "Autor", "Orientador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_propostatc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_propostatcMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_propostatc);

        btn_novo_propostatc.setText("Novo");
        btn_novo_propostatc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novo_propostatcActionPerformed(evt);
            }
        });

        btn_editar_propostatc.setText("Editar");
        btn_editar_propostatc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_propostatcActionPerformed(evt);
            }
        });

        btn_excluir_propostatc.setText("Excluir");
        btn_excluir_propostatc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_propostatcActionPerformed(evt);
            }
        });

        pnl_propostatc.setBorder(javax.swing.BorderFactory.createTitledBorder("Proposta "));

        lbl_titulo_propostatc.setText("Título:");

        lbl_autor_propostatc.setText("Autor:");

        lbl_orientador_propostatc.setText("Orientador:");

        btn_salvar_propostatc.setText("Salvar");
        btn_salvar_propostatc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_propostatcActionPerformed(evt);
            }
        });

        btn_cancelar_propostatc.setText("Cancelar");

        javax.swing.GroupLayout pnl_propostatcLayout = new javax.swing.GroupLayout(pnl_propostatc);
        pnl_propostatc.setLayout(pnl_propostatcLayout);
        pnl_propostatcLayout.setHorizontalGroup(
            pnl_propostatcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_propostatcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_propostatcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_propostatcLayout.createSequentialGroup()
                        .addComponent(lbl_titulo_propostatc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_titulo_propostatc))
                    .addGroup(pnl_propostatcLayout.createSequentialGroup()
                        .addComponent(lbl_autor_propostatc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_autor_propostatc))
                    .addGroup(pnl_propostatcLayout.createSequentialGroup()
                        .addComponent(lbl_orientador_propostatc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_propostatcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_orientador_propostatc)
                            .addGroup(pnl_propostatcLayout.createSequentialGroup()
                                .addComponent(btn_salvar_propostatc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cancelar_propostatc)
                                .addGap(52, 52, 52)))))
                .addContainerGap())
        );
        pnl_propostatcLayout.setVerticalGroup(
            pnl_propostatcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_propostatcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_propostatcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_titulo_propostatc)
                    .addComponent(c_titulo_propostatc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnl_propostatcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_autor_propostatc)
                    .addComponent(c_autor_propostatc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnl_propostatcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_orientador_propostatc)
                    .addComponent(c_orientador_propostatc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(pnl_propostatcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar_propostatc)
                    .addComponent(btn_cancelar_propostatc))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btn_novo_propostatc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar_propostatc)
                .addGap(78, 78, 78)
                .addComponent(btn_excluir_propostatc)
                .addGap(42, 42, 42))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_propostatc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo_propostatc)
                    .addComponent(btn_editar_propostatc)
                    .addComponent(btn_excluir_propostatc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pnl_propostatc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Propostas", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ALUNO
    private void tbl_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alunoMouseClicked
        BotoesAluno(false,true,true,false,true);
        int index = tbl_aluno.getSelectedRow();
        if(index>=0 && index<ModeloAluno.getRowCount()){
            String temp[] = ModeloAluno.getAluno(index);
            c_matricula_aluno.setText(temp[0]);
            c_nome_aluno.setText(temp[1]);
            c_email_aluno.setText(temp[2]);
            c_tel_aluno.setText(temp[3]);
        }
    }//GEN-LAST:event_tbl_alunoMouseClicked

    private void btn_novo_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novo_alunoActionPerformed
        BotoesAluno(false,false,false,true,true);
        editar_aluno = false;
        CamposAluno();
    }//GEN-LAST:event_btn_novo_alunoActionPerformed

    private void btn_editar_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_alunoActionPerformed
        BotoesAluno(false,false,false,true,true);
        editar_aluno = true;
    }//GEN-LAST:event_btn_editar_alunoActionPerformed

    private void btn_excluir_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_alunoActionPerformed
        BotoesAluno(true,false,false,false,false);
        if( AlunoControl.ExcluirAluno(c_matricula_aluno.getText(),c_nome_aluno.getText(), c_email_aluno.getText(), c_tel_aluno.getText())){
             this.LoadTable();
            JOptionPane.showMessageDialog(this, "Aluno removido com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Erro ao remover o aluno!");
        
    }//GEN-LAST:event_btn_excluir_alunoActionPerformed

    private void btn_salvar_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_alunoActionPerformed
        if( AlunoControl.SalvarAluno(c_matricula_aluno.getText(),c_nome_aluno.getText(), c_email_aluno.getText(), c_tel_aluno.getText(), editar_aluno) ){
            this.LoadTable();
            JOptionPane.showMessageDialog(this, "Aluno salvo com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Erro ao salvar o aluno!");
        
        BotoesAluno(true,true,true,false,false);
    }//GEN-LAST:event_btn_salvar_alunoActionPerformed

    private void btn_cancelar_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_alunoActionPerformed
        BotoesAluno(true,true,true,false,false);
        CamposAluno();
    }//GEN-LAST:event_btn_cancelar_alunoActionPerformed
    //ALUNO
    
    //AVALIAÇÃO
    private void tbl_avaliacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_avaliacaoMouseClicked
        BotoesAvaliacao(false,true,true,false,true);
        int index = tbl_avaliacao.getSelectedRow();
        if(index>=0 && index<ModeloAvaliacao.getRowCount()){
            String temp[] = ModeloAvaliacao.getAvaliacao(index);
            c_idbanca_avaliacao.setText(temp[0]);
            c_matricula_avaliacao.setText(temp[1]);
            c_nota_avaliacao.setText(temp[2]);
        }
    }//GEN-LAST:event_tbl_avaliacaoMouseClicked

    private void btn_novo_avaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novo_avaliacaoActionPerformed
        BotoesAvaliacao(false,false,false,true,true);
        CamposAvaliacao();
        editar_avaliacao = false;
    }//GEN-LAST:event_btn_novo_avaliacaoActionPerformed

    private void btn_editar_avaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_avaliacaoActionPerformed
        BotoesAvaliacao(false, false, false, true, true);
        editar_avaliacao = true;

    }//GEN-LAST:event_btn_editar_avaliacaoActionPerformed

    private void btn_excluir_avaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_avaliacaoActionPerformed
        BotoesAvaliacao(false, false, false, true, true);
        if( AvaliacaoControl.ExcluirAvaliacao(c_idbanca_avaliacao.getText(), c_matricula_avaliacao.getText(), c_nota_avaliacao.getText())){
             this.LoadTable();
            JOptionPane.showMessageDialog(this, "Avaliação removida com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Erro ao remover a avaliação!");
        
    }//GEN-LAST:event_btn_excluir_avaliacaoActionPerformed

    private void btn_salvar_avaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_avaliacaoActionPerformed
        if( AvaliacaoControl.SalvarAvaliacao(c_idbanca_avaliacao.getText(), c_matricula_avaliacao.getText(), c_nota_avaliacao.getText(), editar_avaliacao) ){
            this.LoadTable();
            JOptionPane.showMessageDialog(this, "Avaliação salva com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Erro ao salvar a Avaliação!");
        
        BotoesAvaliacao(true,true,true,false,false);
    }//GEN-LAST:event_btn_salvar_avaliacaoActionPerformed

    private void btn_cancelar_avaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_avaliacaoActionPerformed
        CamposAvaliacao();
        BotoesAvaliacao(true, true, true, false, false);
    }//GEN-LAST:event_btn_cancelar_avaliacaoActionPerformed
    //AVALIAÇÃO
    
    //BANCA
    private void tbl_bancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bancaMouseClicked
        BotoesBanca(false,true,true,false,true);
        int index = tbl_banca.getSelectedRow();
        if(index>=0 && index<ModeloBanca.getRowCount()){
            String temp[] = ModeloBanca.getBanca(index);
            c_avaliadorI_banca.setText(temp[0]);
            c_avaliadorII_banca.setText(temp[1]);
            c_orientador_banca.setText(temp[2]);
            c_idbanca_banca.setText(temp[3]);
        }
    }//GEN-LAST:event_tbl_bancaMouseClicked

    private void btn_novo_bancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novo_bancaActionPerformed
        BotoesBanca(false,false,false,true,true);
        editar_banca = false;
        CamposBanca();
    }//GEN-LAST:event_btn_novo_bancaActionPerformed

    private void btn_editar_bancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_bancaActionPerformed
        BotoesBanca(false, false, false, true, true);
        editar_banca = true;
    }//GEN-LAST:event_btn_editar_bancaActionPerformed

    private void btn_excluir_bancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_bancaActionPerformed
        BotoesBanca(false, false, false, true, true);
          if(BancaControl.ExcluirBanca(c_avaliadorI_banca.getText(), c_avaliadorII_banca.getText(), c_orientador_banca.getText(), c_idbanca_banca.getText()) ){
            this.LoadTable();
            JOptionPane.showMessageDialog(this, "Banca excluida com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Erro ao excluir a Banca!");
    }//GEN-LAST:event_btn_excluir_bancaActionPerformed

    private void btn_salvar_bancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_bancaActionPerformed
        if(BancaControl.SalvarBanca(c_avaliadorI_banca.getText(), c_avaliadorII_banca.getText(), c_orientador_banca.getText(), c_idbanca_banca.getText(), editar_banca) ){
            this.LoadTable();
            JOptionPane.showMessageDialog(this, "Banca salva com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Erro ao salvar a Banca!");
        
        BotoesBanca(true,true,true,false,false);
    }//GEN-LAST:event_btn_salvar_bancaActionPerformed

    private void btn_cancelar_bancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_bancaActionPerformed
        CamposBanca();
        BotoesBanca(true,true,true,false,false);
    }//GEN-LAST:event_btn_cancelar_bancaActionPerformed
    //BANCA
    
    //PROFESSOR
    private void tbl_professorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_professorMouseClicked
        BotoesProfessor(false,true,true,false,true);
        int index = tbl_professor.getSelectedRow();
        if(index>=0 && index<ModeloProfessor.getRowCount()){
            String temp[] = ModeloProfessor.getProfessor(index);
            c_nome_professor.setText(temp[0]);
            c_email_professor.setText(temp[1]);
            c_area_professor.setText(temp[2]);
            c_sujestao_professor.setText(temp[3]);
        }
    }//GEN-LAST:event_tbl_professorMouseClicked

    private void btn_novo_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novo_professorActionPerformed
        BotoesProfessor(false,false,false,true,true);
        editar_professor = false;
        CamposProfessor();
    }//GEN-LAST:event_btn_novo_professorActionPerformed

    private void btn_editar_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_professorActionPerformed
        BotoesProfessor(false, false, false, true, true);
        editar_professor = true;
    }//GEN-LAST:event_btn_editar_professorActionPerformed

    private void btn_excluir_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_professorActionPerformed
         if(ProfessorControl.ExcluirProfessor(c_nome_professor.getText(), c_email_professor.getText(), c_area_professor.getText(), c_sujestao_professor.getText()) ){
            this.LoadTable();
            JOptionPane.showMessageDialog(this, "Professor excluido com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Erro ao excluir o Professor!");
       
        
        BotoesProfessor(false, false, false, true, true);
    }//GEN-LAST:event_btn_excluir_professorActionPerformed

    private void btn_salvar_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_professorActionPerformed
        if(ProfessorControl.SalvarProfessor(c_nome_professor.getText(), c_email_professor.getText(), c_area_professor.getText(), c_sujestao_professor.getText(), editar_professor ) ){
            this.LoadTable();
            JOptionPane.showMessageDialog(this, "Professor salvo com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Erro ao salvar o Professor!");
        
        BotoesProfessor(true,true,true,false,false);
    }//GEN-LAST:event_btn_salvar_professorActionPerformed

    private void btn_cancelar_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_professorActionPerformed
        CamposProfessor();
        BotoesProfessor(true,true,true,false,false);
    }//GEN-LAST:event_btn_cancelar_professorActionPerformed
    //PROFESSOR
    
    //PROPOSTA TC
    private void tbl_propostatcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_propostatcMouseClicked
        BotoesPropostaTC(false,true,true,false,true);
        int index = tbl_propostatc.getSelectedRow();
        if(index>=0 && index<ModeloPropostaTC.getRowCount()){
            String temp[] = ModeloPropostaTC.getPropostaTC(index);
            c_titulo_propostatc.setText(temp[0]);
            c_autor_propostatc.setText(temp[1]);
            c_orientador_propostatc.setText(temp[2]);
        }
    }//GEN-LAST:event_tbl_propostatcMouseClicked

    private void btn_novo_propostatcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novo_propostatcActionPerformed
        BotoesPropostaTC(false,false,false,true,true);
        editar_proposta = false;
        CamposPropostaTC();
    }//GEN-LAST:event_btn_novo_propostatcActionPerformed

    private void btn_editar_propostatcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_propostatcActionPerformed
        BotoesPropostaTC(false, false, false, true, true);
        editar_proposta = true;
    }//GEN-LAST:event_btn_editar_propostatcActionPerformed

    private void btn_excluir_propostatcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_propostatcActionPerformed
        
        BotoesPropostaTC(false, false, false, true, true);
        if( PropostaTCControl.ExcluirPropostaTC(c_titulo_propostatc.getText(), c_autor_propostatc.getText(), c_orientador_propostatc.getText()) ){
            this.LoadTable();
            JOptionPane.showMessageDialog(this, "Proposta excluida com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Erro ao excluir a Proposta!");
       
    }//GEN-LAST:event_btn_excluir_propostatcActionPerformed

    private void btn_salvar_propostatcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_propostatcActionPerformed
        if( PropostaTCControl.SalvarPropostaTC(c_titulo_propostatc.getText(), c_autor_propostatc.getText(), c_orientador_propostatc.getText(), editar_proposta) ){
            this.LoadTable();
            JOptionPane.showMessageDialog(this, "Proposta salva com sucesso!");
        }else
            JOptionPane.showMessageDialog(this, "Erro ao salvar a Proposta!");
        
        BotoesPropostaTC(true,true,true,false,false);
    }//GEN-LAST:event_btn_salvar_propostatcActionPerformed

    
    
    
    
    
    
    

    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar_aluno;
    private javax.swing.JButton btn_cancelar_avaliacao;
    private javax.swing.JButton btn_cancelar_banca;
    private javax.swing.JButton btn_cancelar_professor;
    private javax.swing.JButton btn_cancelar_propostatc;
    private javax.swing.JButton btn_editar_aluno;
    private javax.swing.JButton btn_editar_avaliacao;
    private javax.swing.JButton btn_editar_banca;
    private javax.swing.JButton btn_editar_professor;
    private javax.swing.JButton btn_editar_propostatc;
    private javax.swing.JButton btn_excluir_aluno;
    private javax.swing.JButton btn_excluir_avaliacao;
    private javax.swing.JButton btn_excluir_banca;
    private javax.swing.JButton btn_excluir_professor;
    private javax.swing.JButton btn_excluir_propostatc;
    private javax.swing.JButton btn_novo_aluno;
    private javax.swing.JButton btn_novo_avaliacao;
    private javax.swing.JButton btn_novo_banca;
    private javax.swing.JButton btn_novo_professor;
    private javax.swing.JButton btn_novo_propostatc;
    private javax.swing.JButton btn_salvar_aluno;
    private javax.swing.JButton btn_salvar_avaliacao;
    private javax.swing.JButton btn_salvar_banca;
    private javax.swing.JButton btn_salvar_professor;
    private javax.swing.JButton btn_salvar_propostatc;
    private javax.swing.JTextField c_area_professor;
    private javax.swing.JTextField c_autor_propostatc;
    private javax.swing.JTextField c_avaliadorII_banca;
    private javax.swing.JTextField c_avaliadorI_banca;
    private javax.swing.JTextField c_email_aluno;
    private javax.swing.JTextField c_email_professor;
    private javax.swing.JTextField c_idbanca_avaliacao;
    private javax.swing.JTextField c_idbanca_banca;
    private javax.swing.JTextField c_matricula_aluno;
    private javax.swing.JTextField c_matricula_avaliacao;
    private javax.swing.JTextField c_nome_aluno;
    private javax.swing.JTextField c_nome_professor;
    private javax.swing.JTextField c_nota_avaliacao;
    private javax.swing.JTextField c_orientador_banca;
    private javax.swing.JTextField c_orientador_propostatc;
    private javax.swing.JTextField c_sujestao_professor;
    private javax.swing.JTextField c_tel_aluno;
    private javax.swing.JTextField c_titulo_propostatc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_area_professor;
    private javax.swing.JLabel lbl_autor_propostatc;
    private javax.swing.JLabel lbl_avaliadorII_banca;
    private javax.swing.JLabel lbl_avaliadorI_banca;
    private javax.swing.JLabel lbl_email_aluno;
    private javax.swing.JLabel lbl_email_professor;
    private javax.swing.JLabel lbl_idbanca_avaliacao;
    private javax.swing.JLabel lbl_idbanca_banca;
    private javax.swing.JLabel lbl_matricula_aluno;
    private javax.swing.JLabel lbl_matricula_avaliacao;
    private javax.swing.JLabel lbl_nome_aluno;
    private javax.swing.JLabel lbl_nome_professor;
    private javax.swing.JLabel lbl_nota_avaliacao;
    private javax.swing.JLabel lbl_orientador_banca;
    private javax.swing.JLabel lbl_orientador_propostatc;
    private javax.swing.JLabel lbl_sujestao_professor;
    private javax.swing.JLabel lbl_tel_aluno;
    private javax.swing.JLabel lbl_titulo_propostatc;
    private javax.swing.JPanel pnl_aluno;
    private javax.swing.JPanel pnl_avaliacao;
    private javax.swing.JPanel pnl_banca;
    private javax.swing.JPanel pnl_professor;
    private javax.swing.JPanel pnl_propostatc;
    private javax.swing.JTable tbl_aluno;
    private javax.swing.JTable tbl_avaliacao;
    private javax.swing.JTable tbl_banca;
    private javax.swing.JTable tbl_professor;
    private javax.swing.JTable tbl_propostatc;
    // End of variables declaration//GEN-END:variables
}
