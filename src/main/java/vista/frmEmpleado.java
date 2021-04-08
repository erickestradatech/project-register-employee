package vista;

import clases.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmEmpleado extends javax.swing.JFrame {

    Arreglo_Empleado obj = new Arreglo_Empleado();
    int tipo; // 0=Programador 1=Analista
    Empleado emp;

    public frmEmpleado() {
        initComponents();
        setLocationRelativeTo(this);
        panel2.setVisible(false);
        muestra1();
    }

    // Metodo para todos
    public void muestra1() {

        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        dt.setColumnCount(0);
        dt.addColumn("CODIGO");
        dt.addColumn("NOMBRE");
        dt.addColumn("EDAD");

        for (Empleado x : obj.listado()) {

            Object v[] = {x.getCodigo(), x.getNombre(), x.getEdad()};
            dt.addRow(v);
        }

    }

    // Metodo para Programador
    public void muestra2() {

        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        dt.setColumnCount(0);
        dt.addColumn("CÓDIGO");
        dt.addColumn("NOMBRE");
        dt.addColumn("EDAD");
        dt.addColumn("HORAS");

        for (Empleado x : obj.listado()) {

            if (x instanceof Programador) {
                Object v[] = {x.getCodigo(), x.getNombre(), x.getEdad(), ((Programador) x).getHoras()};
                dt.addRow(v);
            }
        }
    }

    // Método para Analista
    public void muestra3() {

        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        dt.setColumnCount(0);
        dt.addColumn("CODIGO");
        dt.addColumn("NOMBRE");
        dt.addColumn("EDAD");
        dt.addColumn("DIAS");

        for (Empleado x : obj.listado()) {

            if (x instanceof Analista) {
                Object v[] = {x.getCodigo(), x.getNombre(), x.getEdad(), ((Analista) x).getDias()};
                dt.addRow(v);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        panel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        panel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        btnGraba = new javax.swing.JButton();
        btnLimpia = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        rbTodos = new javax.swing.JRadioButton();
        rbProgramador = new javax.swing.JRadioButton();
        rbAnalista = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtIngreseCodigo = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();
        btnBorra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE:");

        jLabel2.setText("EDAD:");

        jLabel3.setText("SELECCIONE TIPO:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROGRAMADOR", "ANALISTA" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Programador"));

        jLabel4.setText("NÚMERO DE HORAS:");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Analista"));

        jLabel5.setText("NÚMERO DE DÍAS:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnGraba.setText("GRABAR");
        btnGraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabaActionPerformed(evt);
            }
        });

        btnLimpia.setText("LIMPIAR");
        btnLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaActionPerformed(evt);
            }
        });

        jLabel7.setText("CÓDIGO: ");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("PROYECTO REGISTRO EMPLEADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(28, 28, 28)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnGraba)
                                .addGap(50, 50, 50)
                                .addComponent(btnLimpia)))))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel8)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGraba)
                    .addComponent(btnLimpia))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INGRESAR", jPanel1);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione tipo"));

        buttonGroup1.add(rbTodos);
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbProgramador);
        rbProgramador.setText("Programador");
        rbProgramador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProgramadorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAnalista);
        rbAnalista.setText("Analista");
        rbAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAnalistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rbTodos)
                .addGap(30, 30, 30)
                .addComponent(rbProgramador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(rbAnalista)
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTodos)
                    .addComponent(rbProgramador)
                    .addComponent(rbAnalista))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "EDAD"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LISTADO", jPanel2);

        jLabel6.setText("INGRESE CÓDIGO:");

        btnBusca.setText("BUSCAR");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        txtRes.setColumns(20);
        txtRes.setRows(5);
        jScrollPane2.setViewportView(txtRes);

        btnBorra.setText("BORRAR");
        btnBorra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(txtIngreseCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnBusca))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnBorra)))
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIngreseCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnBorra)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONSULTAR", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed

        muestra1();
        tipo = 1;
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbProgramadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProgramadorActionPerformed

        muestra2();
        tipo = 2;
    }//GEN-LAST:event_rbProgramadorActionPerformed

    private void rbAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAnalistaActionPerformed

        muestra3();
    }//GEN-LAST:event_rbAnalistaActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed

        tipo = cbTipo.getSelectedIndex();
        panel1.setVisible(tipo == 0);
        panel2.setVisible(tipo == 1);
    }//GEN-LAST:event_cbTipoActionPerformed

    private void btnGrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabaActionPerformed

        int cd = Integer.parseInt(txtCodigo.getText());
        String nom = txtNombre.getText();
        int ed = Integer.parseInt(txtEdad.getText());

        if (tipo == 0) {

            Programador pr = new Programador(cd, nom, ed, Double.parseDouble(txtHoras.getText()));
            obj.adi_Programador(pr);
        } else {

            Analista an = new Analista(cd, nom, ed, Integer.parseInt(txtDias.getText()));
            obj.adi_Analista(an);

        }

        muestra1();
    }//GEN-LAST:event_btnGrabaActionPerformed

    private void btnLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaActionPerformed

        txtDias.setText("");
        txtEdad.setText("");
        txtHoras.setText("");
        txtNombre.setText("");
    }//GEN-LAST:event_btnLimpiaActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed

        int nro = Integer.parseInt(txtIngreseCodigo.getText());
        emp = obj.busca(nro);

        if (emp == null) {

            JOptionPane.showMessageDialog(this, "No existe código");
            return;
        }

        String cad;

        if (emp instanceof Programador) {

            cad = "Programador";

        } else {

            cad = "Programador";
        }

        txtRes.setText("Tipo: " + cad);
        txtRes.append("\nNombre: " + emp.getNombre());
        txtRes.append("\nEdad: " + emp.getEdad());
        txtRes.append("\nCalificacion: " + emp.calificacion());

        if (emp instanceof Programador) {

            txtRes.append("\nHoras: " + ((Programador) emp).getHoras());
            txtRes.append("\nPago inicial: " + ((Programador) emp).pagoInicial());
            txtRes.append("\nBonificacion: " + ((Programador) emp).bonificacion());
            txtRes.append("\nPago final: " + ((Programador) emp).pagoFinal());
        } else {

            txtRes.append("\nDias: " + ((Analista) emp).getDias());
            txtRes.append("\nPago: " + ((Analista) emp).pagoAnalista());

        }

        btnBorra.setEnabled(true);
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnBorraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorraActionPerformed

        obj.borra(emp);
        JOptionPane.showMessageDialog(this, "Registro anulado");
        txtRes.setText("");
        muestra1();
    }//GEN-LAST:event_btnBorraActionPerformed

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
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorra;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnGraba;
    private javax.swing.JButton btnLimpia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JRadioButton rbAnalista;
    private javax.swing.JRadioButton rbProgramador;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtIngreseCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtRes;
    // End of variables declaration//GEN-END:variables
}
