package GestorEventos;

import Datos.Evento;
import Datos.TicketComprado;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author JafetDG
 */
public class FrmCompraTickets extends javax.swing.JFrame {

    Stack<TicketComprado> comprados = new Stack<TicketComprado>();
    Stack<TicketComprado> seleccionados = new Stack<TicketComprado>();
    ArrayList<Evento> eventos = new ArrayList<>();
    String bloque;
    String ticket;
    Color disabledColor = new java.awt.Color(204, 11, 0);
    Color enabledColor = new java.awt.Color(76, 179, 110);
    Color selecColor = new java.awt.Color(218, 218, 105);
    String tipoEvento;
    String nombreEvento;

    /**
     * Creates new form FrmCompraTicketsT
     */
    public FrmCompraTickets(String tipoEvt) {
        initComponents();
        setLocationRelativeTo(null);
        validaPanel();

        generaBotonesBloque();
        leerTXTComprados();
        activaListenerBloque();
        setIconImage(getIconImage());
        tipoEvento = tipoEvt;
        label_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource(cambioLabel())));
        
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
        btn_Comprar = new javax.swing.JButton();
        BtnVolver1 = new javax.swing.JButton();
        ScrollPanelBloques = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        ScrollPanelTickets = new javax.swing.JScrollPane();
        panelTickets = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LblNombreEvento = new javax.swing.JLabel();
        LblFechaEvento = new javax.swing.JLabel();
        LblHora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        JPanelPrincipal.setToolTipText("");
        JPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Comprar.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        btn_Comprar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Comprar.setText("Comprar");
        btn_Comprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComprarActionPerformed(evt);
            }
        });
        JPanelPrincipal.add(btn_Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 110, 40));

        BtnVolver1.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        BtnVolver1.setForeground(new java.awt.Color(0, 0, 0));
        BtnVolver1.setText("Volver");
        BtnVolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolver1ActionPerformed(evt);
            }
        });
        JPanelPrincipal.add(BtnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 100, 40));

        ScrollPanelBloques.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 400));
        jPanel1.setLayout(new java.awt.GridLayout(0, 2, 10, 50));
        ScrollPanelBloques.setViewportView(jPanel1);

        JPanelPrincipal.add(ScrollPanelBloques, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 390, 280));

        ScrollPanelTickets.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelTickets.setBackground(new java.awt.Color(255, 255, 255));
        panelTickets.setLayout(new java.awt.GridLayout(0, 3, 0, 5));
        ScrollPanelTickets.setViewportView(panelTickets);

        JPanelPrincipal.add(ScrollPanelTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 390, 220));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Compra de Tickets");
        JPanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        LblNombreEvento.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LblNombreEvento.setForeground(new java.awt.Color(0, 0, 0));
        LblNombreEvento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblNombreEvento.setText("Nombre del evento");
        JPanelPrincipal.add(LblNombreEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 370, 40));

        LblFechaEvento.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LblFechaEvento.setForeground(new java.awt.Color(0, 0, 0));
        LblFechaEvento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblFechaEvento.setText("Fecha evento");
        JPanelPrincipal.add(LblFechaEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 140, -1));

        LblHora.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LblHora.setForeground(new java.awt.Color(0, 0, 0));
        LblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblHora.setText("Hora");
        JPanelPrincipal.add(LblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 60, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(ClassLoader.getSystemResource("img/Fondo Blanco.png")));
        JPanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        label_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo Naranja.png"))); // NOI18N
        label_fondo.setText("jLabel2");
        JPanelPrincipal.add(label_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        getContentPane().add(JPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolver1ActionPerformed
        JPanelPrincipal.validate();
        if (panelTickets.isVisible()) {
            if (seleccionados.isEmpty()) {
                volverBloques();
            } else {
                int seleccion = JOptionPane.showConfirmDialog(null, "Perderá los tickets seleccionados" + "\n" + "¿Desea volver?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                if (seleccion == JOptionPane.YES_OPTION) {
                    seleccionados.clear();
                    volverBloques();
                }
            }

        } else {
            JFrameEventos gt = new JFrameEventos(tipoEvento);
            gt.setVisible(true);
            dispose();

        }


    }//GEN-LAST:event_BtnVolver1ActionPerformed

    private void btn_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComprarActionPerformed
        comprarTickets();
    }//GEN-LAST:event_btn_ComprarActionPerformed

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
                new FrmCompraTickets("").setVisible(true);
            }
        });
    }

    public void comprarTickets() {

        if (!seleccionados.isEmpty()) {
            int seleccion = JOptionPane.showConfirmDialog(null, "Desea comprar los tickets seleccionados en el bloque " + bloque, "Confirmacion", JOptionPane.YES_NO_OPTION);

            if (seleccion == JOptionPane.YES_OPTION) {
                for (TicketComprado selecPila : seleccionados) {
                    comprados.push(selecPila);
                }
                actualizaDisponible();
                seleccionados.clear();
                actualizarTXTComprados();
                marcarComprados();

                JOptionPane.showMessageDialog(rootPane, "Ticket comprado con éxito");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un ticket");
        }
    }

    public void volverBloques() {
        ScrollPanelBloques.setVisible(true);
        panelTickets.setVisible(false);
        panelTickets.removeAll();
        btn_Comprar.setVisible(false);
        JPanelPrincipal.revalidate();
    }

    public void actualizarTXTComprados() {
        TXT.EventoTXT.AnnadirComprados(comprados);
    }

    public void leerTXTComprados() {
        comprados = TXT.EventoTXT.LeerComprados();
    }

    public void actualizarTXTDisponible() {
        TXT.EventoTXT.AnnadirData(eventos);
    }

    public void leerTXTDisponible() {
        eventos = TXT.EventoTXT.LeerData();
    }

    public void validaPanel() {
        if (this.jPanel1.isVisible()) {
            this.panelTickets.setVisible(false);
            this.btn_Comprar.setVisible(false);
        }

    }

    public void selecBloque() {
        ScrollPanelBloques.setVisible(false);
        panelTickets.setVisible(true);
        btn_Comprar.setVisible(true);
        JPanelPrincipal.validate();
        JPanelPrincipal.updateUI();
    }

    public void activaListenerTicket() {
        for (int i = 0; i < panelTickets.getComponentCount(); i++) {
            if (panelTickets.getComponent(i) instanceof JButton) {
                JButton button = (JButton) panelTickets.getComponent(i);
                if (button.isFocusable()) {
                    button.addActionListener(listenerTicket);
                }
            }
        }

    }

    ActionListener listenerTicket = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            ticket = source.getText();
            if (source.isFocusable()) {
                TicketComprado compraTicket = new TicketComprado(nombreEvento, LblFechaEvento.getText(), LblHora.getText(), bloque, ticket);
                if (source.getBackground() == enabledColor) {
                    seleccionados.push(compraTicket);
                    source.setBackground(selecColor);
                } else if (source.getBackground() == selecColor) {
                    seleccionados.removeIf(item -> item.getNumero().equals(compraTicket.getNumero()));
                    source.setBackground(enabledColor);

                }

                /*int seleccion = JOptionPane.showConfirmDialog(null, "Desea comprar el ticket: " + ticket + " en el bloque: " + bloque, "Confirmacion", JOptionPane.YES_NO_OPTION);

                if (seleccion == JOptionPane.YES_OPTION) {
                    TicketComprado compraTicket = new TicketComprado(LblNombreEvento.getText(), LblNombreEvento.getText(), LblFechaEvento.getText(), LblHora.getText(), bloque, ticket);
                    comprados.push(compraTicket);
                    actualizarTXTComprados();
                    actualizaDisponible();
                    source.setFocusable(false);
                    source.setBackground(disabledColor);
                    JOptionPane.showMessageDialog(rootPane, "Ticket comprado con éxito");

                }*/
            }

        }

    };

    ActionListener listenerBloques = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            bloque = source.getText();
            selecBloque();
            generaBotones();
            marcarComprados();
            activaListenerTicket();

        }

    };

    public void activaListenerBloque() {
        for (int i = 0; i < jPanel1.getComponentCount(); i++) {
            if (jPanel1.getComponent(i) instanceof JButton) {
                JButton button = (JButton) jPanel1.getComponent(i);
                if (button.isFocusable()) {
                    button.addActionListener(listenerBloques);
                }
            }
        }

    }

    public void actualizaDisponible() {
        leerTXTDisponible();
        for (int i = 0; i < eventos.size(); i++) {

            if (eventos.get(i).getNombre().equals(nombreEvento)) {
                int disp = eventos.get(i).getEntradasDisponibles() - seleccionados.size();
                eventos.get(i).setEntradasDisponibles(disp);

            }

        }
        actualizarTXTDisponible();

    }

    public void generaBotones() {
        leerTXTDisponible();
        int indice = 1;
        int totalEntradas = 0;
        int numBloques = jPanel1.getComponentCount();

        for (int i = 0; i < eventos.size(); i++) {

            if (eventos.get(i).getNombre().equals(nombreEvento)) {
                totalEntradas = eventos.get(i).getTotalEntradas();
                totalEntradas = Math.round(totalEntradas / numBloques);

                while (indice <= totalEntradas) {
                    JButton boton = new JButton("Asiento " + indice);
                    boton.setBackground(enabledColor);
                    boton.setFont(new java.awt.Font("Segoe UI", 1, 14));
                    boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                    panelTickets.add(boton);
                    indice++;
                    panelTickets.updateUI();
                }
            }
        }

    }

    public void generaBotonesBloque() {
        Queue<String> colaBloques = null;
        leerTXTDisponible();

        for (int i = 0; i < eventos.size(); i++) {

            if (eventos.get(i).getNombre().equals(nombreEvento)) {
                colaBloques = eventos.get(i).getColaBloques();
                for (String bloques : colaBloques) {
                    JButton boton = new JButton(bloques);
                    boton.setFont(new java.awt.Font("Segoe UI Black", 2, 18));
                    boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                    jPanel1.add(boton);

                }
                jPanel1.updateUI();

            }
        }

    }

    public void marcarComprados() {
        for (Component component : panelTickets.getComponents()) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                String numTicket = button.getText();
                for (int j = 0; j < comprados.size(); j++) {
                    if (comprados.get(j).getNombre().equals(LblNombreEvento.getText()) && comprados.get(j).getBloque().equals(bloque) && comprados.get(j).getNumero().equals(numTicket)) {
                        button.setFocusable(false);
                        button.setBackground(disabledColor);
                    }
                }
            }
        }

        panelTickets.updateUI();

    }

    public String cambioLabel() {
        String labelDefault = "/img/Fondo Azul.png";

        HashMap<String, String> hashLabel = new HashMap<>();

        hashLabel.put("Teatrales", "/img/Fondo Naranja.png");
        hashLabel.put("Comedias", "/img/Fondo Rojo.png");
        hashLabel.put("Musicales", "/img/Fondo Morado.png");
        hashLabel.put("Deportivos", "/img/Fondo Verde.png");

        return hashLabel.getOrDefault(tipoEvento, labelDefault);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVolver1;
    private javax.swing.JPanel JPanelPrincipal;
    public javax.swing.JLabel LblFechaEvento;
    public javax.swing.JLabel LblHora;
    public javax.swing.JLabel LblNombreEvento;
    private javax.swing.JScrollPane ScrollPanelBloques;
    private javax.swing.JScrollPane ScrollPanelTickets;
    private javax.swing.JButton btn_Comprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JPanel panelTickets;
    // End of variables declaration//GEN-END:variables
}
