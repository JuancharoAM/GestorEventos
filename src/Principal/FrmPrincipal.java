package Principal;

import Datos.TipoEvento;
import GestorEventos.JFrameEventos;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.UIManager;

/**
 *
 * @author JafetDG
 */
public class FrmPrincipal extends javax.swing.JFrame {

    ArrayList<TipoEvento> tiposEventos = new ArrayList<>();

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        validaPanel();
        cargarTiposEvento();
        lbl_OtrosEv.setVisible(false);
        setIconImage(getIconImage());
        activaListenerEv();
        
        
    }

    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icon1.png"));

        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelPrincipal = new javax.swing.JPanel();
        panel_MainEventos = new javax.swing.JPanel();
        BtnMusicales = new javax.swing.JButton();
        BtnTeatrales = new javax.swing.JButton();
        BtnDeportivos = new javax.swing.JButton();
        BtnComedias = new javax.swing.JButton();
        BtnSalir2 = new javax.swing.JButton();
        BtnOtros = new javax.swing.JButton();
        BtnVendidos = new javax.swing.JButton();
        panel_OtrosEventos = new javax.swing.JPanel();
        btnSalirOtrosEv = new javax.swing.JButton();
        ScrollPaneOtrosEv = new javax.swing.JScrollPane();
        PaneOtrosEv = new javax.swing.JPanel();
        lbl_OtrosEv = new javax.swing.JLabel();
        lbl_NomEv1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        JPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_MainEventos.setBackground(new java.awt.Color(255, 255, 255));

        BtnMusicales.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        BtnMusicales.setForeground(new java.awt.Color(0, 0, 0));
        BtnMusicales.setText("Musicales");
        BtnMusicales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnTeatrales.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        BtnTeatrales.setForeground(new java.awt.Color(0, 0, 0));
        BtnTeatrales.setText("Teatrales");
        BtnTeatrales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnDeportivos.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        BtnDeportivos.setForeground(new java.awt.Color(0, 0, 0));
        BtnDeportivos.setText("Deportivos");
        BtnDeportivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnComedias.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        BtnComedias.setForeground(new java.awt.Color(0, 0, 0));
        BtnComedias.setText("Comedias");
        BtnComedias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnSalir2.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        BtnSalir2.setForeground(new java.awt.Color(0, 0, 0));
        BtnSalir2.setText("Salir");
        BtnSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalir2ActionPerformed(evt);
            }
        });

        BtnOtros.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        BtnOtros.setForeground(new java.awt.Color(0, 0, 0));
        BtnOtros.setText("Otros");
        BtnOtros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOtrosActionPerformed(evt);
            }
        });

        BtnVendidos.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        BtnVendidos.setForeground(new java.awt.Color(0, 0, 0));
        BtnVendidos.setText("Vendidos");
        BtnVendidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVendidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_MainEventosLayout = new javax.swing.GroupLayout(panel_MainEventos);
        panel_MainEventos.setLayout(panel_MainEventosLayout);
        panel_MainEventosLayout.setHorizontalGroup(
            panel_MainEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MainEventosLayout.createSequentialGroup()
                .addComponent(BtnMusicales, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(BtnDeportivos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_MainEventosLayout.createSequentialGroup()
                .addGroup(panel_MainEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnTeatrales, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_MainEventosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_MainEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnComedias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_MainEventosLayout.createSequentialGroup()
                        .addComponent(BtnVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addComponent(BtnOtros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_MainEventosLayout.setVerticalGroup(
            panel_MainEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_MainEventosLayout.createSequentialGroup()
                .addGroup(panel_MainEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDeportivos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMusicales, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_MainEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTeatrales, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnComedias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panel_MainEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnVendidos)
                    .addComponent(BtnSalir2))
                .addGap(34, 34, 34))
        );

        JPanelPrincipal.add(panel_MainEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 350, 300));

        panel_OtrosEventos.setBackground(new java.awt.Color(255, 255, 255));

        btnSalirOtrosEv.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        btnSalirOtrosEv.setForeground(new java.awt.Color(0, 0, 0));
        btnSalirOtrosEv.setText("Volver");
        btnSalirOtrosEv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirOtrosEvActionPerformed(evt);
            }
        });

        PaneOtrosEv.setLayout(new java.awt.GridLayout(0, 1, 0, 5));
        ScrollPaneOtrosEv.setViewportView(PaneOtrosEv);

        javax.swing.GroupLayout panel_OtrosEventosLayout = new javax.swing.GroupLayout(panel_OtrosEventos);
        panel_OtrosEventos.setLayout(panel_OtrosEventosLayout);
        panel_OtrosEventosLayout.setHorizontalGroup(
            panel_OtrosEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_OtrosEventosLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnSalirOtrosEv, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(panel_OtrosEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneOtrosEv)
                .addContainerGap())
        );
        panel_OtrosEventosLayout.setVerticalGroup(
            panel_OtrosEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_OtrosEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneOtrosEv, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnSalirOtrosEv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        JPanelPrincipal.add(panel_OtrosEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 350, 300));

        lbl_OtrosEv.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        lbl_OtrosEv.setForeground(new java.awt.Color(0, 0, 0));
        lbl_OtrosEv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_OtrosEv.setText("Otros Eventos");
        JPanelPrincipal.add(lbl_OtrosEv, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        lbl_NomEv1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lbl_NomEv1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_NomEv1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NomEv1.setText("Gestor de Eventos");
        JPanelPrincipal.add(lbl_NomEv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));
        JPanelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(ClassLoader.getSystemResource("img/Fondo Blanco.png")));
        JPanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 430, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo Rosa.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        JPanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -1, 710, -1));

        getContentPane().add(JPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 690, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOtrosActionPerformed
        lbl_OtrosEv.setVisible(true);
        selecPanel();
        generaBotonesEventos();
        activaListenerOtrosEv();


    }//GEN-LAST:event_BtnOtrosActionPerformed

    private void BtnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalir2ActionPerformed
        FrmLogin fl = new FrmLogin();
        fl.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnSalir2ActionPerformed

    private void btnSalirOtrosEvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirOtrosEvActionPerformed
        lbl_OtrosEv.setVisible(false);
        this.panel_OtrosEventos.setVisible(false);
        this.panel_MainEventos.setVisible(true);
        PaneOtrosEv.removeAll();
    }//GEN-LAST:event_btnSalirOtrosEvActionPerformed

    private void BtnVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVendidosActionPerformed
        JFrameVendidos jv = new JFrameVendidos();
        jv.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnVendidosActionPerformed

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
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    public void cargarTiposEvento() {
        tiposEventos = TXT.TipoEventoTXT.LeerData();

    }

    public void generaBotonesEventos() {
        for (TipoEvento tiposEvento : tiposEventos) {
            JButton boton = new JButton(tiposEvento.getTipoEvento().toString());
            boton.setFont(new java.awt.Font("Segoe UI Black", 2, 18));
            boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            PaneOtrosEv.add(boton);
        }
        PaneOtrosEv.updateUI();
    }

    public void validaPanel() {
        if (this.panel_MainEventos.isVisible()) {
            this.panel_OtrosEventos.setVisible(false);
        }

    }

    public void selecPanel() {
        panel_MainEventos.setVisible(false);
        panel_OtrosEventos.setVisible(true);
        JPanelPrincipal.validate();
        JPanelPrincipal.updateUI();

    }

    public void activaListenerOtrosEv() {
        for (int i = 0; i < PaneOtrosEv.getComponentCount(); i++) {
            if (PaneOtrosEv.getComponent(i) instanceof JButton) {
                JButton button = (JButton) PaneOtrosEv.getComponent(i);
                button.addActionListener(listenerTipoEvt);
            }
        }

    }

    public void activaListenerEv() {
        BtnComedias.addActionListener(listenerTipoEvt);
        BtnDeportivos.addActionListener(listenerTipoEvt);
        BtnMusicales.addActionListener(listenerTipoEvt);
        BtnTeatrales.addActionListener(listenerTipoEvt);
    }

    ActionListener listenerTipoEvt = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String evento = source.getText();
            JFrameEventos frmEventos = new JFrameEventos(evento);
            frmEventos.setVisible(true);
            dispose();

        }

    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnComedias;
    private javax.swing.JButton BtnDeportivos;
    private javax.swing.JButton BtnMusicales;
    private javax.swing.JButton BtnOtros;
    private javax.swing.JButton BtnSalir2;
    private javax.swing.JButton BtnTeatrales;
    private javax.swing.JButton BtnVendidos;
    private javax.swing.JPanel JPanelPrincipal;
    private javax.swing.JPanel PaneOtrosEv;
    private javax.swing.JScrollPane ScrollPaneOtrosEv;
    private javax.swing.JButton btnSalirOtrosEv;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_NomEv1;
    private javax.swing.JLabel lbl_OtrosEv;
    private javax.swing.JPanel panel_MainEventos;
    private javax.swing.JPanel panel_OtrosEventos;
    // End of variables declaration//GEN-END:variables
}
