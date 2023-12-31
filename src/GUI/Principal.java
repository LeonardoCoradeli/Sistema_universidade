/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Hmmm1
 */

import Controlador.Controlador;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    protected static int cont=0;
    protected DefaultTableModel model;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        painel_exibir.setVisible(false);
        Tabela_scroll.setVisible(false);
        painel_buscar.setVisible(false);
        l_selecionado_busca.setVisible(false);
        String colunas[]={"Código","Nome","Tipo","Nivel","Departamento"};
        model = new DefaultTableModel(colunas,0);
        Tabela.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabela_scroll = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        painel_exibir = new javax.swing.JPanel();
        btn_exibir_geral = new javax.swing.JButton();
        btn_exibir_docentes = new javax.swing.JButton();
        btn_exibir_tecnicos = new javax.swing.JButton();
        btn_exibir_efetivos = new javax.swing.JButton();
        btn_exibir_substitutos = new javax.swing.JButton();
        btn_exibir_departamentos = new javax.swing.JButton();
        painel_buscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscar_nome = new javax.swing.JTextField();
        buscar_cod = new javax.swing.JTextField();
        bnt_buscar = new javax.swing.JButton();
        r_buscar_nome = new javax.swing.JRadioButton();
        r_buscar_cod = new javax.swing.JRadioButton();
        l_selecionado_busca = new javax.swing.JLabel();
        r_buscar_salario = new javax.swing.JRadioButton();
        c_salario = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        btn_cadastrar = new javax.swing.JMenu();
        cad_departamento = new javax.swing.JMenuItem();
        cad_tecnico = new javax.swing.JMenuItem();
        cad_docente = new javax.swing.JMenuItem();
        menu_relatorios = new javax.swing.JMenu();
        submenu_relatorios = new javax.swing.JMenuItem();
        menu_buscar = new javax.swing.JMenu();
        btn_ababuscar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("Sistema Univesidade"); // NOI18N
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Tipo", "Nivel", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabela_scroll.setViewportView(Tabela);

        btn_exibir_geral.setText("Geral");
        btn_exibir_geral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exibir_geralActionPerformed(evt);
            }
        });

        btn_exibir_docentes.setText("Docentes");
        btn_exibir_docentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exibir_docentesActionPerformed(evt);
            }
        });

        btn_exibir_tecnicos.setText("Técnicos");
        btn_exibir_tecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exibir_tecnicosActionPerformed(evt);
            }
        });

        btn_exibir_efetivos.setText("Efetivos");
        btn_exibir_efetivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exibir_efetivosActionPerformed(evt);
            }
        });

        btn_exibir_substitutos.setText("Substitutos");
        btn_exibir_substitutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exibir_substitutosActionPerformed(evt);
            }
        });

        btn_exibir_departamentos.setText("Departamentos");
        btn_exibir_departamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exibir_departamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_exibirLayout = new javax.swing.GroupLayout(painel_exibir);
        painel_exibir.setLayout(painel_exibirLayout);
        painel_exibirLayout.setHorizontalGroup(
            painel_exibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_exibirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exibir_geral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exibir_docentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exibir_tecnicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exibir_efetivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exibir_substitutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exibir_departamentos)
                .addGap(91, 91, 91))
        );
        painel_exibirLayout.setVerticalGroup(
            painel_exibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_exibirLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(painel_exibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_exibir_docentes)
                    .addComponent(btn_exibir_geral)
                    .addComponent(btn_exibir_tecnicos)
                    .addComponent(btn_exibir_efetivos)
                    .addComponent(btn_exibir_substitutos)
                    .addComponent(btn_exibir_departamentos)))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Buscar: ");

        bnt_buscar.setText("Buscar");
        bnt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_buscarActionPerformed(evt);
            }
        });

        r_buscar_nome.setText("Nome");
        r_buscar_nome.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                r_buscar_nomeStateChanged(evt);
            }
        });
        r_buscar_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_buscar_nomeActionPerformed(evt);
            }
        });

        r_buscar_cod.setText("Código");
        r_buscar_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_buscar_codActionPerformed(evt);
            }
        });

        l_selecionado_busca.setForeground(new java.awt.Color(255, 0, 0));
        l_selecionado_busca.setText("Selecione um");

        r_buscar_salario.setText("Salario");
        r_buscar_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_buscar_salarioActionPerformed(evt);
            }
        });

        c_salario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 a 1000", "1001 a 3000", "3001+" }));

        javax.swing.GroupLayout painel_buscarLayout = new javax.swing.GroupLayout(painel_buscar);
        painel_buscar.setLayout(painel_buscarLayout);
        painel_buscarLayout.setHorizontalGroup(
            painel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_buscarLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(painel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_selecionado_busca)
                    .addGroup(painel_buscarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r_buscar_nome)
                            .addComponent(r_buscar_cod)
                            .addComponent(r_buscar_salario))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_buscarLayout.createSequentialGroup()
                        .addGroup(painel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(c_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151))
        );
        painel_buscarLayout.setVerticalGroup(
            painel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_buscarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscar_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_buscar_nome)
                    .addComponent(bnt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_buscar_cod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_buscar_salario)
                    .addComponent(c_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(l_selecionado_busca)
                .addContainerGap())
        );

        btn_cadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cadastrar.setMargin(new java.awt.Insets(5, 10, 5, 10));

        cad_departamento.setText("Departamento");
        cad_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_departamentoActionPerformed(evt);
            }
        });
        btn_cadastrar.add(cad_departamento);

        cad_tecnico.setText("Técnico");
        cad_tecnico.setToolTipText("");
        cad_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_tecnicoActionPerformed(evt);
            }
        });
        btn_cadastrar.add(cad_tecnico);

        cad_docente.setText("Docente");
        cad_docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_docenteActionPerformed(evt);
            }
        });
        btn_cadastrar.add(cad_docente);

        jMenuBar1.add(btn_cadastrar);

        menu_relatorios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_relatorios.setText("Relatórios");
        menu_relatorios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_relatorios.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                menu_relatoriosStateChanged(evt);
            }
        });
        menu_relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_relatoriosActionPerformed(evt);
            }
        });

        submenu_relatorios.setText("Exibir");
        submenu_relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_relatoriosActionPerformed(evt);
            }
        });
        menu_relatorios.add(submenu_relatorios);

        jMenuBar1.add(menu_relatorios);

        menu_buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_buscar.setText("Buscar");
        menu_buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btn_ababuscar.setText("Aba de busca");
        btn_ababuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ababuscarActionPerformed(evt);
            }
        });
        menu_buscar.add(btn_ababuscar);

        jMenuBar1.add(menu_buscar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabela_scroll)
            .addComponent(painel_exibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_exibir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tabela_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
    }//GEN-LAST:event_formComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Inicio iniciar = new Inicio(this,true);
        iniciar.setLocationRelativeTo(this);
        iniciar.setVisible(true);   
    }//GEN-LAST:event_formWindowOpened

    private void cad_departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_departamentoActionPerformed
        Cadastrar_departamento cad_dep=new Cadastrar_departamento(this,true);
        cad_dep.setLocationRelativeTo(this);
        cad_dep.setVisible(true);
        
    }//GEN-LAST:event_cad_departamentoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void cad_docenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_docenteActionPerformed
        Cadastrar_docente cadastro_docente = new Cadastrar_docente(this,true);
        cadastro_docente.setLocationRelativeTo(this);
        cadastro_docente.setVisible(true);
        
    }//GEN-LAST:event_cad_docenteActionPerformed

    private void cad_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_tecnicoActionPerformed
        Cadastrar_tecnico cadastro_tecnico = new Cadastrar_tecnico(this,true);
        cadastro_tecnico.setLocationRelativeTo(this);
        cadastro_tecnico.setVisible(true); 
    }//GEN-LAST:event_cad_tecnicoActionPerformed

    private void btn_exibir_docentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exibir_docentesActionPerformed
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for(String funcionario[]:Controlador.exibir_docentes(Controlador.universidade)){
            model.addRow(funcionario);
        }
        Tabela.setModel(model);
    }//GEN-LAST:event_btn_exibir_docentesActionPerformed

    private void btn_exibir_tecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exibir_tecnicosActionPerformed
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for(String funcionario[]:Controlador.exibir_tecnicos(Controlador.universidade)){
            model.addRow(funcionario);
        }
        Tabela.setModel(model);
    }//GEN-LAST:event_btn_exibir_tecnicosActionPerformed

    private void btn_exibir_geralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exibir_geralActionPerformed
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for(String funcionario[]:Controlador.exibir_funcionarios(Controlador.universidade)){
            model.addRow(funcionario);
        }
        Tabela.setModel(model);
    }//GEN-LAST:event_btn_exibir_geralActionPerformed

    private void btn_exibir_efetivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exibir_efetivosActionPerformed
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for(String funcionario[]:Controlador.exibir_docentes_efetivos(Controlador.universidade)){
            model.addRow(funcionario);
        }
        Tabela.setModel(model);
    }//GEN-LAST:event_btn_exibir_efetivosActionPerformed

    private void btn_exibir_substitutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exibir_substitutosActionPerformed
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for(String funcionario[]:Controlador.exibir_docentes_substitutos(Controlador.universidade)){
            model.addRow(funcionario);
        }
        Tabela.setModel(model);
    }//GEN-LAST:event_btn_exibir_substitutosActionPerformed

    private void menu_relatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_relatoriosActionPerformed
        
    }//GEN-LAST:event_menu_relatoriosActionPerformed

    private void menu_relatoriosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_menu_relatoriosStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_relatoriosStateChanged

    private void submenu_relatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_relatoriosActionPerformed
        painel_exibir.setVisible(true);
        Tabela_scroll.setVisible(true);
    }//GEN-LAST:event_submenu_relatoriosActionPerformed

    private void r_buscar_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_buscar_nomeActionPerformed
        r_buscar_cod.setSelected(false);
        r_buscar_salario.setSelected(false);
        
    }//GEN-LAST:event_r_buscar_nomeActionPerformed

    private void r_buscar_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_buscar_codActionPerformed
       r_buscar_nome.setSelected(false);
       r_buscar_salario.setSelected(false);
       
    }//GEN-LAST:event_r_buscar_codActionPerformed

    private void r_buscar_nomeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_r_buscar_nomeStateChanged
       
    }//GEN-LAST:event_r_buscar_nomeStateChanged

    private void btn_ababuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ababuscarActionPerformed
        if(!(painel_exibir.isVisible())){
            Tabela_scroll.setVisible(true);
            painel_exibir.setVisible(true);
        }
        if(Principal.cont==0){
           painel_buscar.setVisible(true);
           Principal.cont++;
        }
        else{
           painel_buscar.setVisible(false);
           Principal.cont--;
        }
        
    }//GEN-LAST:event_btn_ababuscarActionPerformed

    private void bnt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_buscarActionPerformed
        double max=0.0,min=0.0;
        if(r_buscar_nome.isSelected()){
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
                
            String funcionarios[][]=Controlador.buscar_funcionario_nome(buscar_nome.getText());
            if(funcionarios!=null){
                for(String funcionario[]:funcionarios){
                    if(funcionario!=null){
                      model.addRow(funcionario);  
                    }  
                }
            }
            
            Tabela.setModel(model);
            l_selecionado_busca.setVisible(false);
        }
        else if(r_buscar_cod.isSelected()){
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
                
            String funcionarios[][]=Controlador.buscar_funcionario_codigo(buscar_cod.getText());
            if(funcionarios!=null){
                for(String funcionario[]:funcionarios){
                    if(funcionario!=null){
                      model.addRow(funcionario);  
                    }  
                }
            }
            Tabela.setModel(model);
            l_selecionado_busca.setVisible(false);
        }
        else if(r_buscar_salario.isSelected()){
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            switch (c_salario.getSelectedIndex()) {
                case 0:
                    min=0.0;
                    max=1000.0;
                    break;
                case 1:
                    min=1001.0;
                    max=3000.0;
                    break;
                default:
                    min=3001.0;
                    max=100000000.0;
                    break;
            }
            String funcionarios[][]=Controlador.buscar_funcionario_salario(min,max);
            if(funcionarios!=null){
                for(String funcionario[]:funcionarios){
                    if(funcionario!=null){
                      model.addRow(funcionario);  
                    }  
                }
            }
            Tabela.setModel(model);
            l_selecionado_busca.setVisible(false);
        }
        else{
            l_selecionado_busca.setVisible(true);
        }
    }//GEN-LAST:event_bnt_buscarActionPerformed

    private void btn_exibir_departamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exibir_departamentosActionPerformed
        Buscar_departamentos dep=new Buscar_departamentos(this,true);
        dep.setLocationRelativeTo(this);
        dep.setVisible(true);
    }//GEN-LAST:event_btn_exibir_departamentosActionPerformed

    private void r_buscar_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_buscar_salarioActionPerformed
        r_buscar_nome.setSelected(false);
        r_buscar_cod.setSelected(false);
    }//GEN-LAST:event_r_buscar_salarioActionPerformed
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane Tabela_scroll;
    private javax.swing.JButton bnt_buscar;
    private javax.swing.JMenuItem btn_ababuscar;
    private javax.swing.JMenu btn_cadastrar;
    private javax.swing.JButton btn_exibir_departamentos;
    private javax.swing.JButton btn_exibir_docentes;
    private javax.swing.JButton btn_exibir_efetivos;
    private javax.swing.JButton btn_exibir_geral;
    private javax.swing.JButton btn_exibir_substitutos;
    private javax.swing.JButton btn_exibir_tecnicos;
    private javax.swing.JTextField buscar_cod;
    private javax.swing.JTextField buscar_nome;
    private javax.swing.JComboBox<String> c_salario;
    private javax.swing.JMenuItem cad_departamento;
    private javax.swing.JMenuItem cad_docente;
    private javax.swing.JMenuItem cad_tecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel l_selecionado_busca;
    private javax.swing.JMenu menu_buscar;
    private javax.swing.JMenu menu_relatorios;
    private javax.swing.JPanel painel_buscar;
    private javax.swing.JPanel painel_exibir;
    private javax.swing.JRadioButton r_buscar_cod;
    private javax.swing.JRadioButton r_buscar_nome;
    private javax.swing.JRadioButton r_buscar_salario;
    private javax.swing.JMenuItem submenu_relatorios;
    // End of variables declaration//GEN-END:variables
    
    
}

