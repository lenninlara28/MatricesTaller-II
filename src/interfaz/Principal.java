/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroDeFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroDeColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdOperaciones = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Operaciones Con Matrices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("N° Filas :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel2.add(txtNumeroDeFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 30, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("N°Columnas :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));
        jPanel2.add(txtNumeroDeColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 30, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 330, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setBackground(new java.awt.Color(0, 0, 0));
        cmdCrear.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(255, 255, 255));
        cmdCrear.setText("Crear");
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cmdManual.setBackground(new java.awt.Color(0, 0, 0));
        cmdManual.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmdManual.setForeground(new java.awt.Color(255, 255, 255));
        cmdManual.setText("Manual");
        jPanel3.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        cmdAutomatico.setBackground(new java.awt.Color(0, 0, 0));
        cmdAutomatico.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmdAutomatico.setForeground(new java.awt.Color(255, 255, 255));
        cmdAutomatico.setText("Automatico");
        jPanel3.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        cmdOperaciones.setBackground(new java.awt.Color(0, 0, 0));
        cmdOperaciones.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmdOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        cmdOperaciones.setText("Operacion");
        jPanel3.add(cmdOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        cmdLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        cmdLimpiar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdLimpiar.setText("Limpiar");
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 470, 70));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 340, 260));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 340, 260));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Letra B", "Letra K", "Letra M", "Letra W", "Letra Q", "Letra J", "Letra G", "Letra R", "Figura 1", "Figura 2", "Figura Cruz", "Figura Rombo" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(915, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperaciones;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumeroDeColumnas;
    private javax.swing.JTextField txtNumeroDeFilas;
    // End of variables declaration//GEN-END:variables
}