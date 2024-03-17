
package Package1;

import Database.Dba;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jflg
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        
        Date fa = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String fecha_home=sdf.format(fa);
        jl_FechaActual_home.setText(fecha_home);
        
        jtable_agentes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtable_agentes.getTableHeader().setOpaque(false);
        jtable_agentes.getTableHeader().setBackground(new Color(62,120,202));
        jtable_agentes.getTableHeader().setForeground(new Color(255,255,255));
        
        jtable_comprador.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtable_comprador.getTableHeader().setOpaque(false);
        jtable_comprador.getTableHeader().setBackground(new Color(62,120,202));
        jtable_comprador.getTableHeader().setForeground(new Color(255,255,255));
        
        jtable_vendedor.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtable_vendedor.getTableHeader().setOpaque(false);
        jtable_vendedor.getTableHeader().setBackground(new Color(62,120,202));
        jtable_vendedor.getTableHeader().setForeground(new Color(255,255,255));
        
        jtable_prop_mercado.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtable_prop_mercado.getTableHeader().setOpaque(false);
        jtable_prop_mercado.getTableHeader().setBackground(new Color(62,120,202));
        jtable_prop_mercado.getTableHeader().setForeground(new Color(255,255,255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_login = new javax.swing.JFrame();
        jp_header_login = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jp_exit_login = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tf_correo_login = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        pf_password_login = new javax.swing.JPasswordField();
        rp_entrar_login = new test.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jf_home = new javax.swing.JFrame();
        jp_header_home = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jp_exit_home = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        rp_userHolder = new test.PanelRound();
        jl_abrevNombre_home = new javax.swing.JLabel();
        jl_username = new javax.swing.JLabel();
        jl_FechaActual_home = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jp_container_menus = new javax.swing.JPanel();
        jp_vendedor = new javax.swing.JPanel();
        jp_opciones_vendedor = new javax.swing.JPanel();
        jp_sb_prop_ven_vendedor = new javax.swing.JPanel();
        jp_mini_detalle_prop_ven_vendedor = new javax.swing.JPanel();
        jl_prop_ven_vendedor = new javax.swing.JLabel();
        jp_sb_prop_merc_vendedor = new javax.swing.JPanel();
        jp_mini_detalle_prop_merc_vendedor = new javax.swing.JPanel();
        jl_prop_merc_vendedor = new javax.swing.JLabel();
        jp_agente = new javax.swing.JPanel();
        jp_opciones_agente = new javax.swing.JPanel();
        jp_sb_prop_ven_agente = new javax.swing.JPanel();
        jp_mini_detalle_prop_ven_agente = new javax.swing.JPanel();
        jl_prop_ven_agente = new javax.swing.JLabel();
        jp_sb_prop_asig_agente = new javax.swing.JPanel();
        jp_mini_detalle_prop_asig_agente = new javax.swing.JPanel();
        jl_prop_asig_agente = new javax.swing.JLabel();
        jp_comprador = new javax.swing.JPanel();
        jp_opciones_comprador = new javax.swing.JPanel();
        jp_sb_prop_comp_comprador = new javax.swing.JPanel();
        jp_mini_detalle_prop_comp_comprador = new javax.swing.JPanel();
        jl_prop_comp_comprador = new javax.swing.JLabel();
        jp_sb_prop_merc_comprador = new javax.swing.JPanel();
        jp_mini_detalle_prop_merc_comprador = new javax.swing.JPanel();
        jl_prop_merc_comprador = new javax.swing.JLabel();
        jp_adm = new javax.swing.JPanel();
        jp_opciones_admin = new javax.swing.JPanel();
        jp_sb_mantenimiento = new javax.swing.JPanel();
        jp_mini_detalle_mantenimiento = new javax.swing.JPanel();
        jl_mantenimiento = new javax.swing.JLabel();
        jp_sb_reportes = new javax.swing.JPanel();
        jp_mini_detalle_reportes = new javax.swing.JPanel();
        jl_reportes = new javax.swing.JLabel();
        jp_sb_bitacora = new javax.swing.JPanel();
        jp_mini_detalle_bitacora = new javax.swing.JPanel();
        jl_bitacora = new javax.swing.JLabel();
        jp_container_panels = new javax.swing.JPanel();
        jp_propiedades_vendidas_agente = new javax.swing.JPanel();
        jp_propiedades_asignadas_agente = new javax.swing.JPanel();
        jp_propiedades_vendidas_vendedor = new javax.swing.JPanel();
        jp_propiedades_en_mercado = new javax.swing.JPanel();
        jp_propiedades_compradas_comprador = new javax.swing.JPanel();
        jp_mantemiento_admin = new javax.swing.JPanel();
        jtp_mantenimiento = new javax.swing.JTabbedPane();
        jp_crud_agentes = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        tf_identidad_crear_agente = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf_nombre_crear_agente = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_direccion_crear_agente = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        tf_celular_crear_agente = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_telefonoOficina_crear_agente = new javax.swing.JTextField();
        bt_crear_agente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_agentes = new javax.swing.JTable();
        bt_modificar_agente = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        tf_identidad_crear_comprador = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tf_nombre_crear_comprador = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf_celular_crear_comprador = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_direccion_crear_comprador = new javax.swing.JTextArea();
        bt_crear_comprador = new javax.swing.JButton();
        bt_modificar_comprador = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtable_comprador = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        tf_identidad_crear_vendedor = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tf_nombre_crear_vendedor = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tf_celular_crear_vendedor = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_direccion_crear_vendedor = new javax.swing.JTextArea();
        bt_crear_vendedor = new javax.swing.JButton();
        bt_modificar_vendedor = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtable_vendedor = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        tf_nombre_prop_mercado = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf_ciudad_prop_mercado = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tf_direccion_prop_mercado = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        tf_cant_dormitorios_prop_mercado = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tf_caracteristicas_prop_mercado = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tf_precio_prop_mercado = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tf_identidad_agente_prop_mercado = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        tf_identidad_vendedor_prop_mercado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtable_prop_mercado = new javax.swing.JTable();
        jdc_fecha_pub_prop_merc = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jp_bitacora_admin = new javax.swing.JPanel();
        jp_reportes_admin = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPopUp_agentes = new javax.swing.JPopupMenu();
        jmi_modificar_agente = new javax.swing.JMenuItem();
        jmi_eliminar_agente = new javax.swing.JMenuItem();
        jPopUp_compradores = new javax.swing.JPopupMenu();
        jmi_modificar_comprador = new javax.swing.JMenuItem();
        jmi_eliminar_comprador = new javax.swing.JMenuItem();
        jPopUp_vendedores = new javax.swing.JPopupMenu();
        jmi_modificar_vendedor = new javax.swing.JMenuItem();
        jmi_eliminar_vendedor = new javax.swing.JMenuItem();
        jPopUp_prop_merc = new javax.swing.JPopupMenu();
        jmi_modificar_prop_merc = new javax.swing.JMenuItem();
        jmi_eliminar_prop_merc = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jp_exit_inicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jp_admin = new test.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        jp_user = new test.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jp_Header_Inicio = new javax.swing.JPanel();

        jf_login.setUndecorated(true);
        jf_login.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_header_login.setBackground(new java.awt.Color(255, 255, 255));
        jp_header_login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jp_header_loginMouseDragged(evt);
            }
        });
        jp_header_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jp_header_loginMousePressed(evt);
            }
        });
        jp_header_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(54, 72, 96));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_exit_login.setBackground(new java.awt.Color(54, 72, 96));
        jp_exit_login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_exit_loginMouseMoved(evt);
            }
        });
        jp_exit_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_exit_loginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_exit_loginMouseExited(evt);
            }
        });
        jp_exit_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(54, 72, 96));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("    X");
        jp_exit_login.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel6.add(jp_exit_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 30));

        jp_header_login.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, 30));

        jf_login.getContentPane().add(jp_header_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(54, 72, 96));
        jLabel8.setText("Ingresar a Real State Manager");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(235, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 40));

        tf_correo_login.setBackground(new java.awt.Color(235, 255, 255));
        tf_correo_login.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_correo_login.setForeground(new java.awt.Color(204, 204, 204));
        tf_correo_login.setText("Ingrese su correo");
        tf_correo_login.setBorder(null);
        tf_correo_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf_correo_loginMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_correo_login, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_correo_login, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 45));

        jPanel7.setBackground(new java.awt.Color(235, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(350, 40));

        pf_password_login.setBackground(new java.awt.Color(235, 255, 255));
        pf_password_login.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pf_password_login.setForeground(new java.awt.Color(204, 204, 204));
        pf_password_login.setText("********");
        pf_password_login.setBorder(null);
        pf_password_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pf_password_loginMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pf_password_login, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pf_password_login, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, 45));

        rp_entrar_login.setBackground(new java.awt.Color(54, 72, 96));
        rp_entrar_login.setForeground(new java.awt.Color(255, 102, 0));
        rp_entrar_login.setRoundBottomLeft(40);
        rp_entrar_login.setRoundBottomRight(40);
        rp_entrar_login.setRoundTopLeft(40);
        rp_entrar_login.setRoundTopRight(40);
        rp_entrar_login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                rp_entrar_loginMouseMoved(evt);
            }
        });
        rp_entrar_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rp_entrar_loginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rp_entrar_loginMouseExited(evt);
            }
        });
        rp_entrar_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Entrar");
        rp_entrar_login.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel4.add(rp_entrar_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 160, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/email 24px.png"))); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padlock24px.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jf_login.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 580, 570));

        jPanel5.setBackground(new java.awt.Color(54, 72, 96));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hola!");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mantente conectado he inicio sesión");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("con tus datos personales.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(75, 75, 75))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        jf_login.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 320, 570));

        jf_home.setUndecorated(true);
        jf_home.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_header_home.setBackground(new java.awt.Color(62, 120, 202));
        jp_header_home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jp_header_homeMouseDragged(evt);
            }
        });
        jp_header_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jp_header_homeMousePressed(evt);
            }
        });
        jp_header_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jp_header_home.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        jp_exit_home.setBackground(new java.awt.Color(62, 120, 202));
        jp_exit_home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_exit_homeMouseMoved(evt);
            }
        });
        jp_exit_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_exit_homeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_exit_homeMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setText("    X");

        javax.swing.GroupLayout jp_exit_homeLayout = new javax.swing.GroupLayout(jp_exit_home);
        jp_exit_home.setLayout(jp_exit_homeLayout);
        jp_exit_homeLayout.setHorizontalGroup(
            jp_exit_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_exit_homeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_exit_homeLayout.setVerticalGroup(
            jp_exit_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_exit_homeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jp_header_home.add(jp_exit_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 30));

        jf_home.getContentPane().add(jp_header_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        jPanel10.setBackground(new java.awt.Color(62, 120, 202));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rp_userHolder.setBackground(new java.awt.Color(255, 255, 255));
        rp_userHolder.setForeground(new java.awt.Color(255, 102, 0));
        rp_userHolder.setRoundBottomLeft(120);
        rp_userHolder.setRoundBottomRight(120);
        rp_userHolder.setRoundTopLeft(120);
        rp_userHolder.setRoundTopRight(120);
        rp_userHolder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_abrevNombre_home.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_abrevNombre_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_abrevNombre_home.setText("AD");
        rp_userHolder.add(jl_abrevNombre_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 25, 70, -1));

        jPanel10.add(rp_userHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 75, 75));

        jl_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_username.setText("Admin");
        jPanel10.add(jl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jl_FechaActual_home.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_FechaActual_home.setText("New Date");
        jPanel10.add(jl_FechaActual_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 0, -1, 70));

        jf_home.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 850, 100));

        jPanel8.setBackground(new java.awt.Color(23, 35, 54));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(" Real State Manager");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        jf_home.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 150, 100));

        jp_container_menus.setBackground(new java.awt.Color(102, 102, 255));
        jp_container_menus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_vendedor.setBackground(new java.awt.Color(102, 102, 255));

        jp_opciones_vendedor.setBackground(new java.awt.Color(23, 35, 54));
        jp_opciones_vendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_sb_prop_ven_vendedor.setBackground(new java.awt.Color(41, 57, 80));
        jp_sb_prop_ven_vendedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sb_prop_ven_vendedorMouseMoved(evt);
            }
        });
        jp_sb_prop_ven_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sb_prop_ven_vendedorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sb_prop_ven_vendedorMouseExited(evt);
            }
        });
        jp_sb_prop_ven_vendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jp_mini_detalle_prop_ven_vendedorLayout = new javax.swing.GroupLayout(jp_mini_detalle_prop_ven_vendedor);
        jp_mini_detalle_prop_ven_vendedor.setLayout(jp_mini_detalle_prop_ven_vendedorLayout);
        jp_mini_detalle_prop_ven_vendedorLayout.setHorizontalGroup(
            jp_mini_detalle_prop_ven_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_prop_ven_vendedorLayout.setVerticalGroup(
            jp_mini_detalle_prop_ven_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sb_prop_ven_vendedor.add(jp_mini_detalle_prop_ven_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_prop_ven_vendedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_prop_ven_vendedor.setForeground(new java.awt.Color(240, 240, 240));
        jl_prop_ven_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_prop_ven_vendedor.setText("Prop. Vendidas");
        jp_sb_prop_ven_vendedor.add(jl_prop_ven_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jp_opciones_vendedor.add(jp_sb_prop_ven_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 35));

        jp_sb_prop_merc_vendedor.setBackground(new java.awt.Color(23, 35, 54));
        jp_sb_prop_merc_vendedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sb_prop_merc_vendedorMouseMoved(evt);
            }
        });
        jp_sb_prop_merc_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sb_prop_merc_vendedorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sb_prop_merc_vendedorMouseExited(evt);
            }
        });
        jp_sb_prop_merc_vendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_mini_detalle_prop_merc_vendedor.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jp_mini_detalle_prop_merc_vendedorLayout = new javax.swing.GroupLayout(jp_mini_detalle_prop_merc_vendedor);
        jp_mini_detalle_prop_merc_vendedor.setLayout(jp_mini_detalle_prop_merc_vendedorLayout);
        jp_mini_detalle_prop_merc_vendedorLayout.setHorizontalGroup(
            jp_mini_detalle_prop_merc_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_prop_merc_vendedorLayout.setVerticalGroup(
            jp_mini_detalle_prop_merc_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sb_prop_merc_vendedor.add(jp_mini_detalle_prop_merc_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_prop_merc_vendedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_prop_merc_vendedor.setForeground(new java.awt.Color(204, 204, 204));
        jl_prop_merc_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_prop_merc_vendedor.setText("Prop. Mercado");
        jp_sb_prop_merc_vendedor.add(jl_prop_merc_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jp_opciones_vendedor.add(jp_sb_prop_merc_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 35));

        javax.swing.GroupLayout jp_vendedorLayout = new javax.swing.GroupLayout(jp_vendedor);
        jp_vendedor.setLayout(jp_vendedorLayout);
        jp_vendedorLayout.setHorizontalGroup(
            jp_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_opciones_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jp_vendedorLayout.setVerticalGroup(
            jp_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_opciones_vendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        jp_container_menus.add(jp_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 570));

        jp_agente.setBackground(new java.awt.Color(204, 204, 255));

        jp_opciones_agente.setBackground(new java.awt.Color(23, 35, 54));
        jp_opciones_agente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_sb_prop_ven_agente.setBackground(new java.awt.Color(41, 57, 80));
        jp_sb_prop_ven_agente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sb_prop_ven_agenteMouseMoved(evt);
            }
        });
        jp_sb_prop_ven_agente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sb_prop_ven_agenteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sb_prop_ven_agenteMouseExited(evt);
            }
        });
        jp_sb_prop_ven_agente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jp_mini_detalle_prop_ven_agenteLayout = new javax.swing.GroupLayout(jp_mini_detalle_prop_ven_agente);
        jp_mini_detalle_prop_ven_agente.setLayout(jp_mini_detalle_prop_ven_agenteLayout);
        jp_mini_detalle_prop_ven_agenteLayout.setHorizontalGroup(
            jp_mini_detalle_prop_ven_agenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_prop_ven_agenteLayout.setVerticalGroup(
            jp_mini_detalle_prop_ven_agenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sb_prop_ven_agente.add(jp_mini_detalle_prop_ven_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_prop_ven_agente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_prop_ven_agente.setForeground(new java.awt.Color(240, 240, 240));
        jl_prop_ven_agente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_prop_ven_agente.setText("Prop. Vendidas");
        jp_sb_prop_ven_agente.add(jl_prop_ven_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 10, 90, -1));

        jp_opciones_agente.add(jp_sb_prop_ven_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 35));

        jp_sb_prop_asig_agente.setBackground(new java.awt.Color(23, 35, 54));
        jp_sb_prop_asig_agente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sb_prop_asig_agenteMouseMoved(evt);
            }
        });
        jp_sb_prop_asig_agente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sb_prop_asig_agenteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sb_prop_asig_agenteMouseExited(evt);
            }
        });
        jp_sb_prop_asig_agente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_mini_detalle_prop_asig_agente.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jp_mini_detalle_prop_asig_agenteLayout = new javax.swing.GroupLayout(jp_mini_detalle_prop_asig_agente);
        jp_mini_detalle_prop_asig_agente.setLayout(jp_mini_detalle_prop_asig_agenteLayout);
        jp_mini_detalle_prop_asig_agenteLayout.setHorizontalGroup(
            jp_mini_detalle_prop_asig_agenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_prop_asig_agenteLayout.setVerticalGroup(
            jp_mini_detalle_prop_asig_agenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sb_prop_asig_agente.add(jp_mini_detalle_prop_asig_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_prop_asig_agente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_prop_asig_agente.setForeground(new java.awt.Color(204, 204, 204));
        jl_prop_asig_agente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_prop_asig_agente.setText("Prop. Asignadas");
        jp_sb_prop_asig_agente.add(jl_prop_asig_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jp_opciones_agente.add(jp_sb_prop_asig_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 35));

        javax.swing.GroupLayout jp_agenteLayout = new javax.swing.GroupLayout(jp_agente);
        jp_agente.setLayout(jp_agenteLayout);
        jp_agenteLayout.setHorizontalGroup(
            jp_agenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_opciones_agente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jp_agenteLayout.setVerticalGroup(
            jp_agenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_opciones_agente, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        jp_container_menus.add(jp_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 570));

        jp_comprador.setBackground(new java.awt.Color(153, 255, 0));

        jp_opciones_comprador.setBackground(new java.awt.Color(23, 35, 54));
        jp_opciones_comprador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_sb_prop_comp_comprador.setBackground(new java.awt.Color(41, 57, 80));
        jp_sb_prop_comp_comprador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sb_prop_comp_compradorMouseMoved(evt);
            }
        });
        jp_sb_prop_comp_comprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sb_prop_comp_compradorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sb_prop_comp_compradorMouseExited(evt);
            }
        });
        jp_sb_prop_comp_comprador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jp_mini_detalle_prop_comp_compradorLayout = new javax.swing.GroupLayout(jp_mini_detalle_prop_comp_comprador);
        jp_mini_detalle_prop_comp_comprador.setLayout(jp_mini_detalle_prop_comp_compradorLayout);
        jp_mini_detalle_prop_comp_compradorLayout.setHorizontalGroup(
            jp_mini_detalle_prop_comp_compradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_prop_comp_compradorLayout.setVerticalGroup(
            jp_mini_detalle_prop_comp_compradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sb_prop_comp_comprador.add(jp_mini_detalle_prop_comp_comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_prop_comp_comprador.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_prop_comp_comprador.setForeground(new java.awt.Color(240, 240, 240));
        jl_prop_comp_comprador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_prop_comp_comprador.setText("Prop. Compradas");
        jp_sb_prop_comp_comprador.add(jl_prop_comp_comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jp_opciones_comprador.add(jp_sb_prop_comp_comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 35));

        jp_sb_prop_merc_comprador.setBackground(new java.awt.Color(23, 35, 54));
        jp_sb_prop_merc_comprador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sb_prop_merc_compradorMouseMoved(evt);
            }
        });
        jp_sb_prop_merc_comprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sb_prop_merc_compradorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sb_prop_merc_compradorMouseExited(evt);
            }
        });
        jp_sb_prop_merc_comprador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_mini_detalle_prop_merc_comprador.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jp_mini_detalle_prop_merc_compradorLayout = new javax.swing.GroupLayout(jp_mini_detalle_prop_merc_comprador);
        jp_mini_detalle_prop_merc_comprador.setLayout(jp_mini_detalle_prop_merc_compradorLayout);
        jp_mini_detalle_prop_merc_compradorLayout.setHorizontalGroup(
            jp_mini_detalle_prop_merc_compradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_prop_merc_compradorLayout.setVerticalGroup(
            jp_mini_detalle_prop_merc_compradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sb_prop_merc_comprador.add(jp_mini_detalle_prop_merc_comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_prop_merc_comprador.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_prop_merc_comprador.setForeground(new java.awt.Color(204, 204, 204));
        jl_prop_merc_comprador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_prop_merc_comprador.setText("Prop. Mercado");
        jp_sb_prop_merc_comprador.add(jl_prop_merc_comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jp_opciones_comprador.add(jp_sb_prop_merc_comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 35));

        javax.swing.GroupLayout jp_compradorLayout = new javax.swing.GroupLayout(jp_comprador);
        jp_comprador.setLayout(jp_compradorLayout);
        jp_compradorLayout.setHorizontalGroup(
            jp_compradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_opciones_comprador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jp_compradorLayout.setVerticalGroup(
            jp_compradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_opciones_comprador, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        jp_container_menus.add(jp_comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 570));

        jp_adm.setBackground(new java.awt.Color(153, 0, 153));

        jp_opciones_admin.setBackground(new java.awt.Color(23, 35, 54));
        jp_opciones_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_sb_mantenimiento.setBackground(new java.awt.Color(41, 57, 80));
        jp_sb_mantenimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sb_mantenimientoMouseMoved(evt);
            }
        });
        jp_sb_mantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sb_mantenimientoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sb_mantenimientoMouseExited(evt);
            }
        });
        jp_sb_mantenimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jp_mini_detalle_mantenimientoLayout = new javax.swing.GroupLayout(jp_mini_detalle_mantenimiento);
        jp_mini_detalle_mantenimiento.setLayout(jp_mini_detalle_mantenimientoLayout);
        jp_mini_detalle_mantenimientoLayout.setHorizontalGroup(
            jp_mini_detalle_mantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_mantenimientoLayout.setVerticalGroup(
            jp_mini_detalle_mantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sb_mantenimiento.add(jp_mini_detalle_mantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_mantenimiento.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_mantenimiento.setForeground(new java.awt.Color(240, 240, 240));
        jl_mantenimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_mantenimiento.setText("Mantenimiento");
        jp_sb_mantenimiento.add(jl_mantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jp_opciones_admin.add(jp_sb_mantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 35));

        jp_sb_reportes.setBackground(new java.awt.Color(23, 35, 54));
        jp_sb_reportes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sb_reportesMouseMoved(evt);
            }
        });
        jp_sb_reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sb_reportesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sb_reportesMouseExited(evt);
            }
        });
        jp_sb_reportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_mini_detalle_reportes.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jp_mini_detalle_reportesLayout = new javax.swing.GroupLayout(jp_mini_detalle_reportes);
        jp_mini_detalle_reportes.setLayout(jp_mini_detalle_reportesLayout);
        jp_mini_detalle_reportesLayout.setHorizontalGroup(
            jp_mini_detalle_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_reportesLayout.setVerticalGroup(
            jp_mini_detalle_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sb_reportes.add(jp_mini_detalle_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_reportes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_reportes.setForeground(new java.awt.Color(204, 204, 204));
        jl_reportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_reportes.setText("Reportes");
        jp_sb_reportes.add(jl_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jp_opciones_admin.add(jp_sb_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, 35));

        jp_sb_bitacora.setBackground(new java.awt.Color(23, 35, 54));
        jp_sb_bitacora.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_sb_bitacoraMouseMoved(evt);
            }
        });
        jp_sb_bitacora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_sb_bitacoraMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_sb_bitacoraMouseExited(evt);
            }
        });
        jp_sb_bitacora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_mini_detalle_bitacora.setBackground(new java.awt.Color(23, 35, 54));

        javax.swing.GroupLayout jp_mini_detalle_bitacoraLayout = new javax.swing.GroupLayout(jp_mini_detalle_bitacora);
        jp_mini_detalle_bitacora.setLayout(jp_mini_detalle_bitacoraLayout);
        jp_mini_detalle_bitacoraLayout.setHorizontalGroup(
            jp_mini_detalle_bitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jp_mini_detalle_bitacoraLayout.setVerticalGroup(
            jp_mini_detalle_bitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jp_sb_bitacora.add(jp_mini_detalle_bitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jl_bitacora.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_bitacora.setForeground(new java.awt.Color(204, 204, 204));
        jl_bitacora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_bitacora.setText("Bitácora");
        jp_sb_bitacora.add(jl_bitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jp_opciones_admin.add(jp_sb_bitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 35));

        javax.swing.GroupLayout jp_admLayout = new javax.swing.GroupLayout(jp_adm);
        jp_adm.setLayout(jp_admLayout);
        jp_admLayout.setHorizontalGroup(
            jp_admLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_opciones_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jp_admLayout.setVerticalGroup(
            jp_admLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_opciones_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jp_container_menus.add(jp_adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 570));

        jf_home.getContentPane().add(jp_container_menus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 570));

        jp_container_panels.setBackground(new java.awt.Color(255, 255, 255));
        jp_container_panels.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_propiedades_vendidas_agente.setBackground(new java.awt.Color(0, 255, 51));

        javax.swing.GroupLayout jp_propiedades_vendidas_agenteLayout = new javax.swing.GroupLayout(jp_propiedades_vendidas_agente);
        jp_propiedades_vendidas_agente.setLayout(jp_propiedades_vendidas_agenteLayout);
        jp_propiedades_vendidas_agenteLayout.setHorizontalGroup(
            jp_propiedades_vendidas_agenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jp_propiedades_vendidas_agenteLayout.setVerticalGroup(
            jp_propiedades_vendidas_agenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jp_container_panels.add(jp_propiedades_vendidas_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        jp_propiedades_asignadas_agente.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jp_propiedades_asignadas_agenteLayout = new javax.swing.GroupLayout(jp_propiedades_asignadas_agente);
        jp_propiedades_asignadas_agente.setLayout(jp_propiedades_asignadas_agenteLayout);
        jp_propiedades_asignadas_agenteLayout.setHorizontalGroup(
            jp_propiedades_asignadas_agenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jp_propiedades_asignadas_agenteLayout.setVerticalGroup(
            jp_propiedades_asignadas_agenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jp_container_panels.add(jp_propiedades_asignadas_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        jp_propiedades_vendidas_vendedor.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jp_propiedades_vendidas_vendedorLayout = new javax.swing.GroupLayout(jp_propiedades_vendidas_vendedor);
        jp_propiedades_vendidas_vendedor.setLayout(jp_propiedades_vendidas_vendedorLayout);
        jp_propiedades_vendidas_vendedorLayout.setHorizontalGroup(
            jp_propiedades_vendidas_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jp_propiedades_vendidas_vendedorLayout.setVerticalGroup(
            jp_propiedades_vendidas_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jp_container_panels.add(jp_propiedades_vendidas_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        jp_propiedades_en_mercado.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jp_propiedades_en_mercadoLayout = new javax.swing.GroupLayout(jp_propiedades_en_mercado);
        jp_propiedades_en_mercado.setLayout(jp_propiedades_en_mercadoLayout);
        jp_propiedades_en_mercadoLayout.setHorizontalGroup(
            jp_propiedades_en_mercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jp_propiedades_en_mercadoLayout.setVerticalGroup(
            jp_propiedades_en_mercadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jp_container_panels.add(jp_propiedades_en_mercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        jp_propiedades_compradas_comprador.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jp_propiedades_compradas_compradorLayout = new javax.swing.GroupLayout(jp_propiedades_compradas_comprador);
        jp_propiedades_compradas_comprador.setLayout(jp_propiedades_compradas_compradorLayout);
        jp_propiedades_compradas_compradorLayout.setHorizontalGroup(
            jp_propiedades_compradas_compradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jp_propiedades_compradas_compradorLayout.setVerticalGroup(
            jp_propiedades_compradas_compradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jp_container_panels.add(jp_propiedades_compradas_comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        jtp_mantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        jtp_mantenimiento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtp_mantenimientoStateChanged(evt);
            }
        });

        jp_crud_agentes.setBackground(new java.awt.Color(255, 255, 255));
        jp_crud_agentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Identidad: ");
        jp_crud_agentes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        jp_crud_agentes.add(tf_identidad_crear_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, -1));

        jLabel19.setText("Nombre:");
        jp_crud_agentes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jp_crud_agentes.add(tf_nombre_crear_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 230, -1));

        jLabel20.setText("Direccion:");
        jp_crud_agentes.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        tf_direccion_crear_agente.setColumns(20);
        tf_direccion_crear_agente.setRows(5);
        jScrollPane1.setViewportView(tf_direccion_crear_agente);

        jp_crud_agentes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 230, -1));

        jLabel22.setText("Celular:");
        jp_crud_agentes.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jp_crud_agentes.add(tf_celular_crear_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 230, -1));

        jLabel23.setText("Telefono Oficina: ");
        jp_crud_agentes.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jp_crud_agentes.add(tf_telefonoOficina_crear_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 230, -1));

        bt_crear_agente.setText("CREAR AGENTE");
        bt_crear_agente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crear_agenteMouseClicked(evt);
            }
        });
        jp_crud_agentes.add(bt_crear_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, 46));

        jtable_agentes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtable_agentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identidad", "Nombre", "Direccion", "Celular", "Tel. Oficina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_agentes.setRowHeight(25);
        jtable_agentes.setRowMargin(0);
        jtable_agentes.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtable_agentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtable_agentes.getTableHeader().setReorderingAllowed(false);
        jtable_agentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_agentesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable_agentes);
        if (jtable_agentes.getColumnModel().getColumnCount() > 0) {
            jtable_agentes.getColumnModel().getColumn(0).setResizable(false);
            jtable_agentes.getColumnModel().getColumn(1).setResizable(false);
            jtable_agentes.getColumnModel().getColumn(2).setResizable(false);
            jtable_agentes.getColumnModel().getColumn(3).setResizable(false);
            jtable_agentes.getColumnModel().getColumn(4).setResizable(false);
            jtable_agentes.getColumnModel().getColumn(4).setHeaderValue("Tel. Oficina");
        }

        jp_crud_agentes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 25, 510, 490));

        bt_modificar_agente.setText("MODIFICAR AGENTE");
        bt_modificar_agente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificar_agenteMouseClicked(evt);
            }
        });
        jp_crud_agentes.add(bt_modificar_agente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, 46));

        jtp_mantenimiento.addTab("AGENTES", jp_crud_agentes);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setText("Identidad: ");

        jLabel25.setText("Nombre:");

        jLabel26.setText("Celular:");

        tf_direccion_crear_comprador.setColumns(20);
        tf_direccion_crear_comprador.setRows(5);
        jScrollPane3.setViewportView(tf_direccion_crear_comprador);

        bt_crear_comprador.setText("CREAR COMPRADOR");
        bt_crear_comprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crear_compradorMouseClicked(evt);
            }
        });

        bt_modificar_comprador.setText("MODIFICAR COMPRADOR");
        bt_modificar_comprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificar_compradorMouseClicked(evt);
            }
        });

        jtable_comprador.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtable_comprador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identidad", "Nombre", "Direccion", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_comprador.setRowHeight(25);
        jtable_comprador.setRowMargin(0);
        jtable_comprador.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtable_comprador.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtable_comprador.getTableHeader().setReorderingAllowed(false);
        jtable_comprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_compradorMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtable_comprador);
        if (jtable_comprador.getColumnModel().getColumnCount() > 0) {
            jtable_comprador.getColumnModel().getColumn(0).setResizable(false);
            jtable_comprador.getColumnModel().getColumn(1).setResizable(false);
            jtable_comprador.getColumnModel().getColumn(2).setResizable(false);
            jtable_comprador.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel29.setText("Direccion:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(tf_identidad_crear_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(tf_nombre_crear_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(tf_celular_crear_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(bt_crear_comprador))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(bt_modificar_comprador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_identidad_crear_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombre_crear_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_celular_crear_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(bt_crear_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(bt_modificar_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jtp_mantenimiento.addTab("COMPRADORES", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setText("Identidad: ");

        jLabel28.setText("Nombre:");

        jLabel30.setText("Celular:");

        jLabel31.setText("Direccion:");

        tf_direccion_crear_vendedor.setColumns(20);
        tf_direccion_crear_vendedor.setRows(5);
        jScrollPane5.setViewportView(tf_direccion_crear_vendedor);

        bt_crear_vendedor.setText("CREAR VENDEDOR");
        bt_crear_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crear_vendedorMouseClicked(evt);
            }
        });

        bt_modificar_vendedor.setText("MODIFICAR VENDEDOR");
        bt_modificar_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificar_vendedorMouseClicked(evt);
            }
        });

        jtable_vendedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtable_vendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identidad", "Nombre", "Direccion", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_vendedor.setRowHeight(25);
        jtable_vendedor.setRowMargin(0);
        jtable_vendedor.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtable_vendedor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtable_vendedor.getTableHeader().setReorderingAllowed(false);
        jtable_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_vendedorMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtable_vendedor);
        if (jtable_vendedor.getColumnModel().getColumnCount() > 0) {
            jtable_vendedor.getColumnModel().getColumn(0).setResizable(false);
            jtable_vendedor.getColumnModel().getColumn(1).setResizable(false);
            jtable_vendedor.getColumnModel().getColumn(2).setResizable(false);
            jtable_vendedor.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(tf_identidad_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(tf_nombre_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(tf_celular_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(bt_crear_vendedor))
                            .addComponent(bt_modificar_vendedor))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(6, 6, 6)
                        .addComponent(tf_identidad_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel28)
                        .addGap(6, 6, 6)
                        .addComponent(tf_nombre_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_celular_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(bt_modificar_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );

        jtp_mantenimiento.addTab("VENDEDORES", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setText("Nombre:");
        jPanel14.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        jPanel14.add(tf_nombre_prop_mercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 175, -1));

        jLabel33.setText("Ciudad:");
        jPanel14.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 50, -1));
        jPanel14.add(tf_ciudad_prop_mercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 31, 175, -1));

        jLabel34.setText("Direccion:");
        jPanel14.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 11, -1, -1));
        jPanel14.add(tf_direccion_prop_mercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 31, 175, -1));

        jLabel35.setText("Cantidad de dormitorios:");
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 11, -1, -1));
        jPanel14.add(tf_cant_dormitorios_prop_mercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 31, 175, -1));

        jLabel36.setText("Caracteristicas:");
        jPanel14.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, -1, -1));
        jPanel14.add(tf_caracteristicas_prop_mercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, 175, -1));

        jLabel37.setText("Precio:");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 62, -1, -1));
        jPanel14.add(tf_precio_prop_mercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 82, 175, -1));
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 462, -1, -1));

        jLabel39.setText("Identidad Agente:");
        jPanel14.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 62, -1, -1));
        jPanel14.add(tf_identidad_agente_prop_mercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 82, 175, -1));

        jLabel40.setText("Identidad Vendedor");
        jPanel14.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 62, -1, -1));
        jPanel14.add(tf_identidad_vendedor_prop_mercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 82, 175, -1));

        jButton1.setText("Crear Propiedad En Mercado");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 175, 29));

        jButton2.setText("Modificar Propiedad En Mercado");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel14.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, 31));

        jtable_prop_mercado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtable_prop_mercado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Ciudad", "Direccion", "Dormitorios", "Caracteristicas", "Precio", "Fecha Publicacion", "Id Agente", "Id Vendedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_prop_mercado.setRowHeight(25);
        jtable_prop_mercado.setRowMargin(0);
        jtable_prop_mercado.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jtable_prop_mercado.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtable_prop_mercado.getTableHeader().setReorderingAllowed(false);
        jtable_prop_mercado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_prop_mercadoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jtable_prop_mercado);
        if (jtable_prop_mercado.getColumnModel().getColumnCount() > 0) {
            jtable_prop_mercado.getColumnModel().getColumn(0).setResizable(false);
            jtable_prop_mercado.getColumnModel().getColumn(1).setResizable(false);
            jtable_prop_mercado.getColumnModel().getColumn(2).setResizable(false);
            jtable_prop_mercado.getColumnModel().getColumn(3).setResizable(false);
            jtable_prop_mercado.getColumnModel().getColumn(4).setResizable(false);
            jtable_prop_mercado.getColumnModel().getColumn(5).setResizable(false);
            jtable_prop_mercado.getColumnModel().getColumn(6).setResizable(false);
            jtable_prop_mercado.getColumnModel().getColumn(7).setResizable(false);
            jtable_prop_mercado.getColumnModel().getColumn(8).setResizable(false);
            jtable_prop_mercado.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel14.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 830, 368));
        jPanel14.add(jdc_fecha_pub_prop_merc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 180, -1));

        jLabel41.setText("Fecha de publicacion:");
        jPanel14.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        jtp_mantenimiento.addTab("PROPIEDADES EN MERCADO", jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jtp_mantenimiento.addTab("PROPIEDADES VENDIDAS", jPanel15);

        javax.swing.GroupLayout jp_mantemiento_adminLayout = new javax.swing.GroupLayout(jp_mantemiento_admin);
        jp_mantemiento_admin.setLayout(jp_mantemiento_adminLayout);
        jp_mantemiento_adminLayout.setHorizontalGroup(
            jp_mantemiento_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_mantenimiento)
        );
        jp_mantemiento_adminLayout.setVerticalGroup(
            jp_mantemiento_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_mantenimiento)
        );

        jp_container_panels.add(jp_mantemiento_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        jp_bitacora_admin.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jp_bitacora_adminLayout = new javax.swing.GroupLayout(jp_bitacora_admin);
        jp_bitacora_admin.setLayout(jp_bitacora_adminLayout);
        jp_bitacora_adminLayout.setHorizontalGroup(
            jp_bitacora_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jp_bitacora_adminLayout.setVerticalGroup(
            jp_bitacora_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jp_container_panels.add(jp_bitacora_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        jp_reportes_admin.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jp_reportes_adminLayout = new javax.swing.GroupLayout(jp_reportes_admin);
        jp_reportes_admin.setLayout(jp_reportes_adminLayout);
        jp_reportes_adminLayout.setHorizontalGroup(
            jp_reportes_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jp_reportes_adminLayout.setVerticalGroup(
            jp_reportes_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jp_container_panels.add(jp_reportes_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        jf_home.getContentPane().add(jp_container_panels, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 850, 570));

        jLabel21.setText("jLabel21");

        jmi_modificar_agente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Modify16px.png"))); // NOI18N
        jmi_modificar_agente.setText("Modificar");
        jmi_modificar_agente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificar_agenteActionPerformed(evt);
            }
        });
        jPopUp_agentes.add(jmi_modificar_agente);

        jmi_eliminar_agente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar16px.png"))); // NOI18N
        jmi_eliminar_agente.setText("Eliminar");
        jmi_eliminar_agente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminar_agenteActionPerformed(evt);
            }
        });
        jPopUp_agentes.add(jmi_eliminar_agente);

        jmi_modificar_comprador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Modify16px.png"))); // NOI18N
        jmi_modificar_comprador.setText("Modificar");
        jmi_modificar_comprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificar_compradorActionPerformed(evt);
            }
        });
        jPopUp_compradores.add(jmi_modificar_comprador);

        jmi_eliminar_comprador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar16px.png"))); // NOI18N
        jmi_eliminar_comprador.setText("Eliminar");
        jmi_eliminar_comprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminar_compradorActionPerformed(evt);
            }
        });
        jPopUp_compradores.add(jmi_eliminar_comprador);

        jmi_modificar_vendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Modify16px.png"))); // NOI18N
        jmi_modificar_vendedor.setText("Modificar");
        jmi_modificar_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificar_vendedorActionPerformed(evt);
            }
        });
        jPopUp_vendedores.add(jmi_modificar_vendedor);

        jmi_eliminar_vendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar16px.png"))); // NOI18N
        jmi_eliminar_vendedor.setText("Eliminar");
        jmi_eliminar_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminar_vendedorActionPerformed(evt);
            }
        });
        jPopUp_vendedores.add(jmi_eliminar_vendedor);

        jmi_modificar_prop_merc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Modify16px.png"))); // NOI18N
        jmi_modificar_prop_merc.setText("Modificar");
        jmi_modificar_prop_merc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificar_prop_mercActionPerformed(evt);
            }
        });
        jPopUp_prop_merc.add(jmi_modificar_prop_merc);

        jmi_eliminar_prop_merc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar16px.png"))); // NOI18N
        jmi_eliminar_prop_merc.setText("Eliminar");
        jmi_eliminar_prop_merc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminar_prop_mercActionPerformed(evt);
            }
        });
        jPopUp_prop_merc.add(jmi_eliminar_prop_merc);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(78, 37, 62));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casa-64px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido!");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Para ingresar porvafor ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("seleccione su tipo de cuenta.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(14, 14, 14)))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(jLabel11))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 350));

        jPanel2.setBackground(new java.awt.Color(196, 90, 84));

        jp_exit_inicio.setBackground(new java.awt.Color(196, 90, 84));
        jp_exit_inicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_exit_inicioMouseMoved(evt);
            }
        });
        jp_exit_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_exit_inicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_exit_inicioMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("    X");

        javax.swing.GroupLayout jp_exit_inicioLayout = new javax.swing.GroupLayout(jp_exit_inicio);
        jp_exit_inicio.setLayout(jp_exit_inicioLayout);
        jp_exit_inicioLayout.setHorizontalGroup(
            jp_exit_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jp_exit_inicioLayout.setVerticalGroup(
            jp_exit_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_exit_inicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jp_admin.setBackground(new java.awt.Color(255, 255, 255));
        jp_admin.setForeground(new java.awt.Color(255, 102, 0));
        jp_admin.setRoundBottomLeft(40);
        jp_admin.setRoundBottomRight(40);
        jp_admin.setRoundTopLeft(40);
        jp_admin.setRoundTopRight(40);
        jp_admin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_adminMouseMoved(evt);
            }
        });
        jp_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_adminMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_adminMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setText("Administrador");

        javax.swing.GroupLayout jp_adminLayout = new javax.swing.GroupLayout(jp_admin);
        jp_admin.setLayout(jp_adminLayout);
        jp_adminLayout.setHorizontalGroup(
            jp_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_adminLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(39, 39, 39))
        );
        jp_adminLayout.setVerticalGroup(
            jp_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_adminLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(19, 19, 19))
        );

        jp_user.setBackground(new java.awt.Color(255, 255, 255));
        jp_user.setForeground(new java.awt.Color(255, 102, 0));
        jp_user.setRoundBottomLeft(40);
        jp_user.setRoundBottomRight(40);
        jp_user.setRoundTopLeft(40);
        jp_user.setRoundTopRight(40);
        jp_user.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jp_userMouseMoved(evt);
            }
        });
        jp_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_userMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_userMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setText("Usuario");

        javax.swing.GroupLayout jp_userLayout = new javax.swing.GroupLayout(jp_user);
        jp_user.setLayout(jp_userLayout);
        jp_userLayout.setHorizontalGroup(
            jp_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_userLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_userLayout.setVerticalGroup(
            jp_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_userLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jp_exit_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jp_exit_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jp_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jp_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 350));

        jp_Header_Inicio.setBackground(new java.awt.Color(51, 255, 51));
        jp_Header_Inicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jp_Header_InicioMouseDragged(evt);
            }
        });
        jp_Header_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jp_Header_InicioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jp_Header_InicioLayout = new javax.swing.GroupLayout(jp_Header_Inicio);
        jp_Header_Inicio.setLayout(jp_Header_InicioLayout);
        jp_Header_InicioLayout.setHorizontalGroup(
            jp_Header_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jp_Header_InicioLayout.setVerticalGroup(
            jp_Header_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jp_Header_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jp_Header_InicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_Header_InicioMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jp_Header_InicioMousePressed

    private void jp_Header_InicioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_Header_InicioMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jp_Header_InicioMouseDragged

    private void jp_exit_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_inicioMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jp_exit_inicioMouseClicked

    private void jp_exit_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_inicioMouseExited
        jp_exit_inicio.setBackground(new Color(196,90,84));
    }//GEN-LAST:event_jp_exit_inicioMouseExited

    private void jp_exit_inicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_inicioMouseMoved
        jp_exit_inicio.setBackground(new Color(204,51,0));
    }//GEN-LAST:event_jp_exit_inicioMouseMoved

    private void jp_adminMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_adminMouseMoved
        jp_admin.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jp_adminMouseMoved

    private void jp_adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_adminMouseExited
        jp_admin.setBackground(Color.WHITE);
    }//GEN-LAST:event_jp_adminMouseExited

    private void jp_userMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_userMouseMoved
        jp_user.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jp_userMouseMoved

    private void jp_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_userMouseExited
        jp_user.setBackground(Color.WHITE);
    }//GEN-LAST:event_jp_userMouseExited

    private void jp_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_adminMouseClicked
        show_login();
//        Dba db = new Dba("Test_1");
//        db.conectar();
    }//GEN-LAST:event_jp_adminMouseClicked

    private void jp_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_userMouseClicked
        show_login();
    }//GEN-LAST:event_jp_userMouseClicked

    private void jp_header_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_header_loginMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jp_header_loginMousePressed

    private void jp_header_loginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_header_loginMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        jf_login.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jp_header_loginMouseDragged

    private void jp_exit_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_loginMouseClicked
        jf_login.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jp_exit_loginMouseClicked

    private void jp_exit_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_loginMouseExited
        jp_exit_login.setBackground(new Color(54,72,96));
    }//GEN-LAST:event_jp_exit_loginMouseExited

    private void jp_exit_loginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_loginMouseMoved
        jp_exit_login.setBackground(new Color(34, 52, 76));
    }//GEN-LAST:event_jp_exit_loginMouseMoved

    private void rp_entrar_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rp_entrar_loginMouseExited
        rp_entrar_login.setBackground(new Color(54,72,96));
    }//GEN-LAST:event_rp_entrar_loginMouseExited

    private void rp_entrar_loginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rp_entrar_loginMouseMoved
        rp_entrar_login.setBackground(new Color(34, 52, 76));
    }//GEN-LAST:event_rp_entrar_loginMouseMoved

    private void tf_correo_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_correo_loginMousePressed
        if(tf_correo_login.getText().equals("Ingrese su correo")){
            tf_correo_login.setText("");
            tf_correo_login.setForeground(Color.BLACK);
        }
        if(String.valueOf(pf_password_login.getPassword()).isEmpty()){
            pf_password_login.setText("********");
            pf_password_login.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_tf_correo_loginMousePressed

    private void pf_password_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_password_loginMousePressed
        if(String.valueOf(pf_password_login.getPassword()).equals("********")){
            pf_password_login.setText("");
            pf_password_login.setForeground(Color.BLACK);
        }
        if(tf_correo_login.getText().isEmpty()){
            tf_correo_login.setText("Ingrese su correo");
            tf_correo_login.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_pf_password_loginMousePressed

    private void rp_entrar_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rp_entrar_loginMouseClicked
        update_lista_users();
        
        // Validar correo y contraseña
        String correo, password;
        correo = tf_correo_login.getText();
        password = pf_password_login.getText();
        boolean flag = false;
        for (Usuario u : lista_users) {
            if(u.getCorreo().equals(correo) && u.getPassword().equals(password)){
                flag = true;
                actual_user = u;
            }
        }
        
        if(flag){
            show_home();
            jl_username.setText(actual_user.getUser_type());
            jl_abrevNombre_home.setText("" + actual_user.getCorreo().charAt(0) + actual_user.getCorreo().charAt(1));
            
            // Menus de roles
            String tipo = actual_user.getUser_type();
            if(tipo.equals("Admin")){
                jp_agente.setVisible(false);
                jp_comprador.setVisible(false);
                jp_vendedor.setVisible(false);
                jp_adm.setVisible(true);
                
                log_admin();
                listarAgentes();
            } else if(tipo.equals("Agente")){
                jp_comprador.setVisible(false);
                jp_vendedor.setVisible(false);
                jp_adm.setVisible(false);
                jp_agente.setVisible(true);
                
                log_agente();
            } else if(tipo.equals("Comprador")){
                jp_agente.setVisible(false);
                jp_vendedor.setVisible(false);
                jp_adm.setVisible(false);
                jp_comprador.setVisible(true);
                
                log_comprador();
            } else {
                jp_agente.setVisible(false);
                jp_comprador.setVisible(false);
                jp_adm.setVisible(false);
                jp_vendedor.setVisible(true);
                
                log_vendedor();
            }
            
        } else {
            JOptionPane.showMessageDialog(jf_login, "Correo o contraseña incorrecta.");
            // Limpiar datos
            tf_correo_login.setText("Ingrese su correo");
            tf_correo_login.setForeground(new Color(204, 204, 204));
            pf_password_login.setText("********");
            pf_password_login.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_rp_entrar_loginMouseClicked

    private void jp_header_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_header_homeMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jp_header_homeMousePressed

    private void jp_header_homeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_header_homeMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        jf_home.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jp_header_homeMouseDragged

    private void jp_exit_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_homeMouseClicked
        jf_home.setVisible(false);
        jf_login.setVisible(true);
        tf_correo_login.setText("Ingrese su correo");
        tf_correo_login.setForeground(new Color(204, 204, 204));
        pf_password_login.setText("********");
        pf_password_login.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_jp_exit_homeMouseClicked

    private void jp_exit_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_homeMouseExited
         jp_exit_home.setBackground(new Color(62,120,202));
    }//GEN-LAST:event_jp_exit_homeMouseExited

    private void jp_exit_homeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_exit_homeMouseMoved
        jp_exit_home.setBackground(new Color(204,51,0));
    }//GEN-LAST:event_jp_exit_homeMouseMoved

    private void jp_sb_prop_ven_agenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_ven_agenteMouseClicked
        flag_prop_ven_agente = true;
        flag_prop_asig_agente = false;
        
        jp_sb_prop_ven_agente.setBackground(new Color(41,57,80));
        jl_prop_ven_agente.setForeground(Color.WHITE);
        jp_mini_detalle_prop_ven_agente.setBackground(new Color(240,240,240));
        
        jp_sb_prop_asig_agente.setBackground(new Color(23,35,54));
        jl_prop_asig_agente.setForeground(new Color(204,204,204));
        jp_mini_detalle_prop_asig_agente.setBackground(new Color(23,35,54));
        
        
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
        
        jp_propiedades_vendidas_agente.setVisible(true);
    }//GEN-LAST:event_jp_sb_prop_ven_agenteMouseClicked

    private void jp_sb_prop_asig_agenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_asig_agenteMouseClicked
        flag_prop_asig_agente = true;
        flag_prop_ven_agente = false;
        
        jp_sb_prop_asig_agente.setBackground(new Color(41,57,80));
        jl_prop_asig_agente.setForeground(Color.WHITE);
        jp_mini_detalle_prop_asig_agente.setBackground(new Color(240,240,240));
        
        jp_sb_prop_ven_agente.setBackground(new Color(23,35,54));
        jl_prop_ven_agente.setForeground(new Color(204,204,204));
        jp_mini_detalle_prop_ven_agente.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
        
        jp_propiedades_asignadas_agente.setVisible(true);
    }//GEN-LAST:event_jp_sb_prop_asig_agenteMouseClicked

    private void jp_sb_prop_ven_agenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_ven_agenteMouseExited
        if(!flag_prop_ven_agente){
            jp_sb_prop_ven_agente.setBackground(new Color(23, 35, 54));
        }
    }//GEN-LAST:event_jp_sb_prop_ven_agenteMouseExited

    private void jp_sb_prop_ven_agenteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_ven_agenteMouseMoved
        if(!flag_prop_ven_agente){
            jp_sb_prop_ven_agente.setBackground(new Color(41, 57, 80));
        }
    }//GEN-LAST:event_jp_sb_prop_ven_agenteMouseMoved

    private void jp_sb_prop_asig_agenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_asig_agenteMouseExited
        if(!flag_prop_asig_agente){
            jp_sb_prop_asig_agente.setBackground(new Color(23, 35, 54));
        }
    }//GEN-LAST:event_jp_sb_prop_asig_agenteMouseExited

    private void jp_sb_prop_asig_agenteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_asig_agenteMouseMoved
        if(!flag_prop_asig_agente){
            jp_sb_prop_asig_agente.setBackground(new Color(41, 57, 80));
        }
    }//GEN-LAST:event_jp_sb_prop_asig_agenteMouseMoved

    private void jp_sb_prop_ven_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_ven_vendedorMouseClicked
        flag_prop_ven_vendedor = true;
        flag_prop_merc_vendedor = false;
        
        jp_sb_prop_ven_vendedor.setBackground(new Color(41,57,80));
        jl_prop_ven_vendedor.setForeground(Color.WHITE);
        jp_mini_detalle_prop_ven_vendedor.setBackground(new Color(240,240,240));
        
        jp_sb_prop_merc_vendedor.setBackground(new Color(23,35,54));
        jl_prop_merc_vendedor.setForeground(new Color(204,204,204));
        jp_mini_detalle_prop_merc_vendedor.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(true);
    }//GEN-LAST:event_jp_sb_prop_ven_vendedorMouseClicked

    private void jp_sb_prop_merc_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_merc_vendedorMouseClicked
        flag_prop_merc_vendedor = true;
        flag_prop_ven_vendedor = false;
        
        jp_sb_prop_merc_vendedor.setBackground(new Color(41,57,80));
        jl_prop_merc_vendedor.setForeground(Color.WHITE);
        jp_mini_detalle_prop_merc_vendedor.setBackground(new Color(240,240,240));
        
        jp_sb_prop_ven_vendedor.setBackground(new Color(23,35,54));
        jl_prop_ven_vendedor.setForeground(new Color(204,204,204));
        jp_mini_detalle_prop_ven_vendedor.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
        
        jp_propiedades_en_mercado.setVisible(true);
    }//GEN-LAST:event_jp_sb_prop_merc_vendedorMouseClicked

    private void jp_sb_prop_ven_vendedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_ven_vendedorMouseExited
        if(!flag_prop_ven_vendedor){
            jp_sb_prop_ven_vendedor.setBackground(new Color(23, 35, 54));
        }
    }//GEN-LAST:event_jp_sb_prop_ven_vendedorMouseExited

    private void jp_sb_prop_ven_vendedorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_ven_vendedorMouseMoved
        if(!flag_prop_ven_vendedor){
            jp_sb_prop_ven_vendedor.setBackground(new Color(41, 57, 80));
        }
    }//GEN-LAST:event_jp_sb_prop_ven_vendedorMouseMoved

    private void jp_sb_prop_merc_vendedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_merc_vendedorMouseExited
        if(!flag_prop_merc_vendedor){
            jp_sb_prop_merc_vendedor.setBackground(new Color(23, 35, 54));
        }
    }//GEN-LAST:event_jp_sb_prop_merc_vendedorMouseExited

    private void jp_sb_prop_merc_vendedorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_merc_vendedorMouseMoved
        if(!flag_prop_merc_vendedor){
            jp_sb_prop_merc_vendedor.setBackground(new Color(41, 57, 80));
        }
    }//GEN-LAST:event_jp_sb_prop_merc_vendedorMouseMoved

    private void jp_sb_prop_comp_compradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_comp_compradorMouseClicked
        flag_prop_comp_comprador = true;
        flag_prop_merc_comprador = false;
        
        jp_sb_prop_comp_comprador.setBackground(new Color(41,57,80));
        jl_prop_comp_comprador.setForeground(Color.WHITE);
        jp_mini_detalle_prop_comp_comprador.setBackground(new Color(240,240,240));
        
        jp_sb_prop_merc_comprador.setBackground(new Color(23,35,54));
        jl_prop_merc_comprador.setForeground(new Color(204,204,204));
        jp_mini_detalle_prop_merc_comprador.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(true);
    }//GEN-LAST:event_jp_sb_prop_comp_compradorMouseClicked

    private void jp_sb_prop_merc_compradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_merc_compradorMouseClicked
        flag_prop_merc_comprador = true;
        flag_prop_comp_comprador = false;
        
        jp_sb_prop_merc_comprador.setBackground(new Color(41,57,80));
        jl_prop_merc_comprador.setForeground(Color.WHITE);
        jp_mini_detalle_prop_merc_comprador.setBackground(new Color(240,240,240));
        
        jp_sb_prop_comp_comprador.setBackground(new Color(23,35,54));
        jl_prop_comp_comprador.setForeground(new Color(204,204,204));
        jp_mini_detalle_prop_comp_comprador.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        
        
        jp_propiedades_compradas_comprador.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
        
        jp_propiedades_en_mercado.setVisible(true);
    }//GEN-LAST:event_jp_sb_prop_merc_compradorMouseClicked

    private void jp_sb_prop_comp_compradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_comp_compradorMouseExited
        if(!flag_prop_comp_comprador){
            jp_sb_prop_comp_comprador.setBackground(new Color(23, 35, 54));
        }
    }//GEN-LAST:event_jp_sb_prop_comp_compradorMouseExited

    private void jp_sb_prop_comp_compradorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_comp_compradorMouseMoved
        if(!flag_prop_comp_comprador){
            jp_sb_prop_comp_comprador.setBackground(new Color(41, 57, 80));
        }
    }//GEN-LAST:event_jp_sb_prop_comp_compradorMouseMoved

    private void jp_sb_prop_merc_compradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_merc_compradorMouseExited
        if(!flag_prop_merc_comprador){
            jp_sb_prop_merc_comprador.setBackground(new Color(23, 35, 54));
        }
    }//GEN-LAST:event_jp_sb_prop_merc_compradorMouseExited

    private void jp_sb_prop_merc_compradorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_prop_merc_compradorMouseMoved
        if(!flag_prop_merc_comprador){
            jp_sb_prop_merc_comprador.setBackground(new Color(41, 57, 80));
        }
    }//GEN-LAST:event_jp_sb_prop_merc_compradorMouseMoved

    private void jp_sb_mantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_mantenimientoMouseClicked
        flag_mantenimiento = true;
        flag_bitacora = false;
        flag_reportes = false;
        
        jp_sb_mantenimiento.setBackground(new Color(41,57,80));
        jl_mantenimiento.setForeground(Color.WHITE);
        jp_mini_detalle_mantenimiento.setBackground(new Color(240,240,240));
        
        jp_sb_bitacora.setBackground(new Color(23,35,54));
        jl_bitacora.setForeground(new Color(204,204,204));
        jp_mini_detalle_bitacora.setBackground(new Color(23,35,54));
        
        jp_sb_reportes.setBackground(new Color(23,35,54));
        jl_reportes.setForeground(new Color(204,204,204));
        jp_mini_detalle_reportes.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(false);
        
        
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
        
        jp_mantemiento_admin.setVisible(true);
        
        listarAgentes();
        listarCompradores();
        listarVendedores();
        listarPropiedasEnMercado();
    }//GEN-LAST:event_jp_sb_mantenimientoMouseClicked

    private void jp_sb_bitacoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_bitacoraMouseClicked
        flag_mantenimiento = false;
        flag_bitacora = true;
        flag_reportes = false;
        
        jp_sb_bitacora.setBackground(new Color(41,57,80));
        jl_bitacora.setForeground(Color.WHITE);
        jp_mini_detalle_bitacora.setBackground(new Color(240,240,240));
        
        jp_sb_mantenimiento.setBackground(new Color(23,35,54));
        jl_mantenimiento.setForeground(new Color(204,204,204));
        jp_mini_detalle_mantenimiento.setBackground(new Color(23,35,54));
        
        jp_sb_reportes.setBackground(new Color(23,35,54));
        jl_reportes.setForeground(new Color(204,204,204));
        jp_mini_detalle_reportes.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        
        jp_reportes_admin.setVisible(false);
        
        jp_bitacora_admin.setVisible(true);
    }//GEN-LAST:event_jp_sb_bitacoraMouseClicked

    private void jp_sb_reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_reportesMouseClicked
        flag_mantenimiento = false;
        flag_bitacora = false;
        flag_reportes = true;
        
        jp_sb_reportes.setBackground(new Color(41,57,80));
        jl_reportes.setForeground(Color.WHITE);
        jp_mini_detalle_reportes.setBackground(new Color(240,240,240));
        
        jp_sb_bitacora.setBackground(new Color(23,35,54));
        jl_bitacora.setForeground(new Color(204,204,204));
        jp_mini_detalle_bitacora.setBackground(new Color(23,35,54));
        
        jp_sb_mantenimiento.setBackground(new Color(23,35,54));
        jl_mantenimiento.setForeground(new Color(204,204,204));
        jp_mini_detalle_mantenimiento.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(true);
    }//GEN-LAST:event_jp_sb_reportesMouseClicked

    private void jp_sb_mantenimientoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_mantenimientoMouseMoved
        if(!flag_mantenimiento){
            jp_sb_mantenimiento.setBackground(new Color(41, 57, 80));
        }
    }//GEN-LAST:event_jp_sb_mantenimientoMouseMoved

    private void jp_sb_bitacoraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_bitacoraMouseMoved
        if(!flag_bitacora){
            jp_sb_bitacora.setBackground(new Color(41, 57, 80));
        }
    }//GEN-LAST:event_jp_sb_bitacoraMouseMoved

    private void jp_sb_reportesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_reportesMouseMoved
        if(!flag_reportes){
            jp_sb_reportes.setBackground(new Color(41, 57, 80));
        }
    }//GEN-LAST:event_jp_sb_reportesMouseMoved

    private void jp_sb_mantenimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_mantenimientoMouseExited
        if(!flag_mantenimiento){
            jp_sb_mantenimiento.setBackground(new Color(23, 35, 54));
        }
    }//GEN-LAST:event_jp_sb_mantenimientoMouseExited

    private void jp_sb_bitacoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_bitacoraMouseExited
        if(!flag_bitacora){
            jp_sb_bitacora.setBackground(new Color(23, 35, 54));
        }
    }//GEN-LAST:event_jp_sb_bitacoraMouseExited

    private void jp_sb_reportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_sb_reportesMouseExited
        if(!flag_reportes){
            jp_sb_reportes.setBackground(new Color(23, 35, 54));
        }
    }//GEN-LAST:event_jp_sb_reportesMouseExited

    private void bt_crear_agenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crear_agenteMouseClicked
        try {
            //Obtenemos los datos del agente a agregar
            String identidad = tf_identidad_crear_agente.getText();
            String nombre = tf_nombre_crear_agente.getText();
            String direccion = tf_direccion_crear_agente.getText();
            String celular = tf_celular_crear_agente.getText();
            String telefono_oficina = tf_telefonoOficina_crear_agente.getText();
            
            if(verificar_id_agente(Integer.parseInt(identidad))){
                //
                Dba db = new Dba(db_Name);
                db.conectar();

                PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.createAgente_SP(?,?,?,?,?)}");
                pstmt.setInt(1, Integer.parseInt(identidad));
                pstmt.setString(2, nombre);
                pstmt.setString(3, direccion);
                pstmt.setInt(4, Integer.parseInt(celular));
                pstmt.setInt(5, Integer.parseInt(telefono_oficina));
                pstmt.execute();

                db.desconectar();
                //

                JOptionPane.showMessageDialog(jf_home, "Agente Creado Exitosamente!");
                // actualizamos la tabla de agentes
                listarAgentes();

                // Limpiar controles
                tf_identidad_crear_agente.setText("");
                tf_nombre_crear_agente.setText("");
                tf_direccion_crear_agente.setText("");
                tf_celular_crear_agente.setText("");
                tf_telefonoOficina_crear_agente.setText("");
            } else {
                JOptionPane.showMessageDialog(jf_home, "El #identidad ya se encuentra en la base de datos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_crear_agenteMouseClicked

    private void bt_modificar_agenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificar_agenteMouseClicked
        try {
            // Obtenemos los datos del agente
            String identidad = tf_identidad_crear_agente.getText();
            String nombre = tf_nombre_crear_agente.getText();
            String direccion = tf_direccion_crear_agente.getText();
            String celular = tf_celular_crear_agente.getText();
            String telefono_oficina = tf_telefonoOficina_crear_agente.getText();
            
            //
            Dba db = new Dba(db_Name);
            db.conectar();
            
            PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.updateAgente_SP(?,?,?,?,?,?)}");
            pstmt.setInt(1, Integer.parseInt(identidad));
            pstmt.setString(2, nombre);
            pstmt.setString(3, direccion);
            pstmt.setInt(4, Integer.parseInt(celular));
            pstmt.setInt(5, Integer.parseInt(telefono_oficina));
            pstmt.setInt(6, identidad_agente_a_modificar);
            pstmt.execute();
            
            db.desconectar();
            //
            
            JOptionPane.showMessageDialog(jf_home, "Agente modificado Exitosamente!");
            listarAgentes();
            
            tf_identidad_crear_agente.setText("");
            tf_nombre_crear_agente.setText("");
            tf_direccion_crear_agente.setText("");
            tf_celular_crear_agente.setText("");
            tf_telefonoOficina_crear_agente.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_modificar_agenteMouseClicked

    private void jmi_modificar_agenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificar_agenteActionPerformed
       int row = jtable_agentes.getSelectedRow();
       DefaultTableModel modelo = (DefaultTableModel) jtable_agentes.getModel();
       identidad_agente_a_modificar = Integer.parseInt(modelo.getValueAt(row, 0).toString());
       tf_identidad_crear_agente.setText(modelo.getValueAt(row, 0).toString());
       tf_nombre_crear_agente.setText(modelo.getValueAt(row, 1).toString());
       tf_direccion_crear_agente.setText(modelo.getValueAt(row, 2).toString());
       tf_celular_crear_agente.setText(modelo.getValueAt(row, 3).toString());
       tf_telefonoOficina_crear_agente.setText(modelo.getValueAt(row, 4).toString());
    }//GEN-LAST:event_jmi_modificar_agenteActionPerformed

    private void jtable_agentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_agentesMouseClicked
        if(jtable_agentes.getSelectedRow() >= 0){
            if(evt.isMetaDown()){
                jPopUp_agentes.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jtable_agentesMouseClicked

    private void jmi_eliminar_agenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminar_agenteActionPerformed
        int row = jtable_agentes.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jtable_agentes.getModel();
        identidad_agente_a_modificar = Integer.parseInt(modelo.getValueAt(row, 0).toString());
         try {
            Dba db = new Dba(db_Name);
            db.conectar();
            
            PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.deleteAgente_SP(?)}");
            pstmt.setInt(1, identidad_agente_a_modificar);
            pstmt.execute();
            
            db.desconectar();
            
            JOptionPane.showMessageDialog(jf_home, "Agente Eliminado Exitosamente!");
            listarAgentes();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jmi_eliminar_agenteActionPerformed

    private void bt_crear_compradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crear_compradorMouseClicked
        try {
            //Obtenemos los datos del comprador a agregar
            String identidad = tf_identidad_crear_comprador.getText();
            String nombre = tf_nombre_crear_comprador.getText();
            String direccion = tf_direccion_crear_comprador.getText();
            String celular = tf_celular_crear_comprador.getText();
            
            if(verificar_id_comprador(Integer.parseInt(identidad))){
                //
                Dba db = new Dba(db_Name);
                db.conectar();

                PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.createComprador_SP(?,?,?,?)}");
                pstmt.setInt(1, Integer.parseInt(identidad));
                pstmt.setString(2, nombre);
                pstmt.setString(3, direccion);
                pstmt.setInt(4, Integer.parseInt(celular));
                pstmt.execute();

                db.desconectar();
                //

                JOptionPane.showMessageDialog(jf_home, "Comprador Creado Exitosamente!");
                // actualizamos la tabla de agentes
                listarCompradores();

                // Limpiar controles
                tf_identidad_crear_comprador.setText("");
                tf_nombre_crear_comprador.setText("");
                tf_direccion_crear_comprador.setText("");
                tf_celular_crear_comprador.setText("");
            } else {
                JOptionPane.showMessageDialog(jf_home, "El #identidad ya se encuentra en la base de datos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_crear_compradorMouseClicked

    private void bt_modificar_compradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificar_compradorMouseClicked
        try {
            // Obtenemos los datos del comprador
            String identidad = tf_identidad_crear_comprador.getText();
            String nombre = tf_nombre_crear_comprador.getText();
            String direccion = tf_direccion_crear_comprador.getText();
            String celular = tf_celular_crear_comprador.getText();
            
            //
            Dba db = new Dba(db_Name);
            db.conectar();
            
            PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.updateComprador_SP(?,?,?,?,?)}");
            pstmt.setInt(1, Integer.parseInt(identidad));
            pstmt.setString(2, nombre);
            pstmt.setString(3, direccion);
            pstmt.setInt(4, Integer.parseInt(celular));
            pstmt.setInt(5, identidad_comprador_a_modificar);
            pstmt.execute();
            
            db.desconectar();
            //
            
            JOptionPane.showMessageDialog(jf_home, "Comprador modificado Exitosamente!");
            listarCompradores();
            
            tf_identidad_crear_comprador.setText("");
            tf_nombre_crear_comprador.setText("");
            tf_direccion_crear_comprador.setText("");
            tf_celular_crear_comprador.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_modificar_compradorMouseClicked

    private void jtable_compradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_compradorMouseClicked
    if(jtable_comprador.getSelectedRow() >= 0){
                if(evt.isMetaDown()){
                    jPopUp_compradores.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }        
    }//GEN-LAST:event_jtable_compradorMouseClicked

    private void jtp_mantenimientoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtp_mantenimientoStateChanged
        int selectedIndex = jtp_mantenimiento.getSelectedIndex(); 
        
        if(selectedIndex == 1){
            listarCompradores();
        } else if(selectedIndex == 2){
            listarVendedores();
        } else if(selectedIndex == 3){
            listarPropiedasEnMercado();
        }
    }//GEN-LAST:event_jtp_mantenimientoStateChanged

    private void jmi_modificar_compradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificar_compradorActionPerformed
        int row = jtable_comprador.getSelectedRow();
       DefaultTableModel modelo = (DefaultTableModel) jtable_comprador.getModel();
       identidad_comprador_a_modificar = Integer.parseInt(modelo.getValueAt(row, 0).toString());
       tf_identidad_crear_comprador.setText(modelo.getValueAt(row, 0).toString());
       tf_nombre_crear_comprador.setText(modelo.getValueAt(row, 1).toString());
       tf_direccion_crear_comprador.setText(modelo.getValueAt(row, 2).toString());
       tf_celular_crear_comprador.setText(modelo.getValueAt(row, 3).toString());
    }//GEN-LAST:event_jmi_modificar_compradorActionPerformed

    private void jmi_eliminar_compradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminar_compradorActionPerformed
        int row = jtable_comprador.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jtable_comprador.getModel();
        identidad_comprador_a_modificar = Integer.parseInt(modelo.getValueAt(row, 0).toString());
         try {
            Dba db = new Dba(db_Name);
            db.conectar();
            
            PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.deleteComprador_SP(?)}");
            pstmt.setInt(1, identidad_comprador_a_modificar);
            pstmt.execute();
            
            db.desconectar();
            
            JOptionPane.showMessageDialog(jf_home, "Comprador Eliminado Exitosamente!");
            listarCompradores();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jmi_eliminar_compradorActionPerformed

    private void bt_crear_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crear_vendedorMouseClicked
        try {
            //Obtenemos los datos del vendedor a agregar
            String identidad = tf_identidad_crear_vendedor.getText();
            String nombre = tf_nombre_crear_vendedor.getText();
            String direccion = tf_direccion_crear_vendedor.getText();
            String celular = tf_celular_crear_vendedor.getText();
            
            if(verificar_id_vendedor(Integer.parseInt(identidad))){
                //
                Dba db = new Dba(db_Name);
                db.conectar();

                PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.createVendedor_SP(?,?,?,?)}");
                pstmt.setInt(1, Integer.parseInt(identidad));
                pstmt.setString(2, nombre);
                pstmt.setString(3, direccion);
                pstmt.setInt(4, Integer.parseInt(celular));
                pstmt.execute();

                db.desconectar();
                //

                JOptionPane.showMessageDialog(jf_home, "Vendedor Creado Exitosamente!");
                // actualizamos la tabla de agentes
                listarVendedores();

                // Limpiar controles
                tf_identidad_crear_vendedor.setText("");
                tf_nombre_crear_vendedor.setText("");
                tf_direccion_crear_vendedor.setText("");
                tf_celular_crear_vendedor.setText("");
            } else {
                JOptionPane.showMessageDialog(jf_home, "El #identidad ya se encuentra en la base de datos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_crear_vendedorMouseClicked

    private void bt_modificar_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificar_vendedorMouseClicked
        try {
            // Obtenemos los datos del vendedor
            String identidad = tf_identidad_crear_vendedor.getText();
            String nombre = tf_nombre_crear_vendedor.getText();
            String direccion = tf_direccion_crear_vendedor.getText();
            String celular = tf_celular_crear_vendedor.getText();
            
            //
            Dba db = new Dba(db_Name);
            db.conectar();
            
            PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.updateVendedor_SP(?,?,?,?,?)}");
            pstmt.setInt(1, Integer.parseInt(identidad));
            pstmt.setString(2, nombre);
            pstmt.setString(3, direccion);
            pstmt.setInt(4, Integer.parseInt(celular));
            pstmt.setInt(5, identidad_vendedor_a_modificar);
            pstmt.execute();
            
            db.desconectar();
            //
            
            JOptionPane.showMessageDialog(jf_home, "Vendedor modificado Exitosamente!");
            listarVendedores();
            
            tf_identidad_crear_vendedor.setText("");
            tf_nombre_crear_vendedor.setText("");
            tf_direccion_crear_vendedor.setText("");
            tf_celular_crear_vendedor.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_modificar_vendedorMouseClicked

    private void jtable_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_vendedorMouseClicked
       if(jtable_vendedor.getSelectedRow() >= 0){
                if(evt.isMetaDown()){
                    jPopUp_vendedores.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            } 
    }//GEN-LAST:event_jtable_vendedorMouseClicked

    private void jmi_modificar_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificar_vendedorActionPerformed
       int row = jtable_vendedor.getSelectedRow();
       DefaultTableModel modelo = (DefaultTableModel) jtable_vendedor.getModel();
       identidad_vendedor_a_modificar= Integer.parseInt(modelo.getValueAt(row, 0).toString());
       tf_identidad_crear_vendedor.setText(modelo.getValueAt(row, 0).toString());
       tf_nombre_crear_vendedor.setText(modelo.getValueAt(row, 1).toString());
       tf_direccion_crear_vendedor.setText(modelo.getValueAt(row, 2).toString());
       tf_celular_crear_vendedor.setText(modelo.getValueAt(row, 3).toString());
    }//GEN-LAST:event_jmi_modificar_vendedorActionPerformed

    private void jmi_eliminar_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminar_vendedorActionPerformed
        int row = jtable_vendedor.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jtable_vendedor.getModel();
        identidad_vendedor_a_modificar= Integer.parseInt(modelo.getValueAt(row, 0).toString());
         try {
            Dba db = new Dba(db_Name);
            db.conectar();
            
            PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.deleteVendedor_SP(?)}");
            pstmt.setInt(1, identidad_vendedor_a_modificar);
            pstmt.execute();
            
            db.desconectar();
            
            JOptionPane.showMessageDialog(jf_home, "Vendedor Eliminado Exitosamente!");
            listarVendedores();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jmi_eliminar_vendedorActionPerformed

    private void jtable_prop_mercadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_prop_mercadoMouseClicked
        if(jtable_prop_mercado.getSelectedRow() >= 0){
                if(evt.isMetaDown()){
                    jPopUp_prop_merc.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            } 
    }//GEN-LAST:event_jtable_prop_mercadoMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            //Obtenemos los datos de la propiedad_en_mercado a agregar
            String nombre = tf_nombre_prop_mercado.getText();
            String ciudad = tf_ciudad_prop_mercado.getText();
            String direccion = tf_direccion_prop_mercado.getText();
            int cant_dormitorios = Integer.parseInt(tf_cant_dormitorios_prop_mercado.getText());
            String caracteristicas = tf_caracteristicas_prop_mercado.getText();
            double precio = Double.parseDouble(tf_precio_prop_mercado.getText());
            int id_agente = Integer.parseInt(tf_identidad_agente_prop_mercado.getText());
            int id_vendedor = Integer.parseInt(tf_identidad_vendedor_prop_mercado.getText());
            
            
               
            
                //
                Dba db = new Dba(db_Name);
                db.conectar();

                PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.createPropiedad_En_Mercado_SP(?,?,?,?,?,?,?,?)}");
                pstmt.setString(1, nombre);
                pstmt.setString(2, ciudad);
                pstmt.setString(3, direccion);
                pstmt.setInt(4, cant_dormitorios);
                pstmt.setString(5, caracteristicas);
                pstmt.setDouble(6, precio);
                pstmt.setInt(7, id_agente);
                pstmt.setInt(8, id_vendedor);
                pstmt.execute();

                db.desconectar();
                //

                JOptionPane.showMessageDialog(jf_home, "Propiedad_En_Mercado Creada Exitosamente!");
                // actualizamos la tabla de propiedades en mercado
                listarPropiedasEnMercado();

                // Limpiar controles
                tf_nombre_prop_mercado.setText("");
                tf_ciudad_prop_mercado.setText("");
                tf_direccion_prop_mercado.setText("");
                tf_cant_dormitorios_prop_mercado.setText("");
                tf_caracteristicas_prop_mercado.setText("");
                tf_precio_prop_mercado.setText("");
                tf_identidad_agente_prop_mercado.setText("");
                tf_identidad_vendedor_prop_mercado.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jmi_modificar_prop_mercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificar_prop_mercActionPerformed
        int row = jtable_prop_mercado.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jtable_prop_mercado.getModel();
        id_prop_merc_a_modificar= Integer.parseInt(modelo.getValueAt(row, 0).toString());
        System.out.println(id_prop_merc_a_modificar);
        tf_nombre_prop_mercado.setText(modelo.getValueAt(row, 1).toString());
        tf_ciudad_prop_mercado.setText(modelo.getValueAt(row, 2).toString());
        tf_direccion_prop_mercado.setText(modelo.getValueAt(row, 3).toString());
        tf_cant_dormitorios_prop_mercado.setText(modelo.getValueAt(row, 4).toString());
        tf_caracteristicas_prop_mercado.setText(modelo.getValueAt(row, 5).toString());
        tf_precio_prop_mercado.setText(modelo.getValueAt(row, 6).toString());
        tf_identidad_agente_prop_mercado.setText(modelo.getValueAt(row, 8).toString());
        tf_identidad_vendedor_prop_mercado.setText(modelo.getValueAt(row, 9).toString());
    }//GEN-LAST:event_jmi_modificar_prop_mercActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            //Obtenemos los datos de la propiedad_en_mercado a modificar
            String nombre = tf_nombre_prop_mercado.getText();
            String ciudad = tf_ciudad_prop_mercado.getText();
            String direccion = tf_direccion_prop_mercado.getText();
            int cant_dormitorios = Integer.parseInt(tf_cant_dormitorios_prop_mercado.getText());
            String caracteristicas = tf_caracteristicas_prop_mercado.getText();
            double precio = Double.parseDouble(tf_precio_prop_mercado.getText());
            int id_agente = Integer.parseInt(tf_identidad_agente_prop_mercado.getText());
            int id_vendedor = Integer.parseInt(tf_identidad_vendedor_prop_mercado.getText());
            
            java.util.Date utilDate = jdc_fecha_pub_prop_merc.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            final String stringDate= dateFormat.format(utilDate);
            final java.sql.Date sqlDate=  java.sql.Date.valueOf(stringDate);
               
            
                //
                Dba db = new Dba(db_Name);
                db.conectar();

                PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.updatePropiedad_En_Mercado_SP(?,?,?,?,?,?,?,?,?,?)}");
                pstmt.setString(1, nombre);
                pstmt.setString(2, ciudad);
                pstmt.setString(3, direccion);
                pstmt.setInt(4, cant_dormitorios);
                pstmt.setString(5, caracteristicas);
                pstmt.setDouble(6, precio);
                pstmt.setDate(7, sqlDate);
                pstmt.setInt(8, id_agente);
                pstmt.setInt(9, id_vendedor);
                pstmt.setInt(10, id_prop_merc_a_modificar);
                pstmt.execute();

                db.desconectar();
                //

                JOptionPane.showMessageDialog(jf_home, "Propiedad_En_Mercado Modificada Exitosamente!");
                // actualizamos la tabla de propiedades en mercado
                listarPropiedasEnMercado();

                // Limpiar controles
                tf_nombre_prop_mercado.setText("");
                tf_ciudad_prop_mercado.setText("");
                tf_direccion_prop_mercado.setText("");
                tf_cant_dormitorios_prop_mercado.setText("");
                tf_caracteristicas_prop_mercado.setText("");
                tf_precio_prop_mercado.setText("");
                tf_identidad_agente_prop_mercado.setText("");
                tf_identidad_vendedor_prop_mercado.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jmi_eliminar_prop_mercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminar_prop_mercActionPerformed
        int row = jtable_prop_mercado.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jtable_prop_mercado.getModel();
        id_prop_merc_a_modificar= Integer.parseInt(modelo.getValueAt(row, 0).toString());
         try {
            Dba db = new Dba(db_Name);
            db.conectar();
            
            PreparedStatement pstmt = db.conexion.prepareStatement("{call dbo.deletePropiedad_En_Mercado_SP(?)}");
            pstmt.setInt(1, id_prop_merc_a_modificar);
            pstmt.execute();
            
            db.desconectar();
            
            JOptionPane.showMessageDialog(jf_home, "Propiedad En Mercado Eliminada Exitosamente!");
            listarPropiedasEnMercado();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jf_home, "Valores no cumplen las restricciones!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jmi_eliminar_prop_mercActionPerformed

    public void listarPropiedasEnMercado(){
        Dba db = new Dba(db_Name);
        db.conectar();
        try {
            db.query.execute("Select * from PROPIEDAD_EN_MERCADO");
            ResultSet rs = db.query.getResultSet();
            DefaultTableModel modelo = (DefaultTableModel) jtable_prop_mercado.getModel();
            modelo.setRowCount(0);
            while(rs.next()){
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String ciudad = rs.getString(3);
                String direccion = rs.getString(4);
                int cant_dormitorios = rs.getInt(5);
                String caracteristicas = rs.getString(6);
                double precio = rs.getDouble(7);
                Date fechaPublicacion = rs.getDate(8);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                String v = sdf.format(fechaPublicacion);
                int id_agente = rs.getInt(9);
                int id_vendedor = rs.getInt(10);
                modelo.addRow(new Object[]{id, nombre, ciudad, direccion, cant_dormitorios, caracteristicas, precio, v,id_agente, id_vendedor});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void listarVendedores(){
        Dba db = new Dba(db_Name);
        db.conectar();
        try {
            db.query.execute("Select * from VENDEDOR");
            ResultSet rs = db.query.getResultSet();
            DefaultTableModel modelo = (DefaultTableModel) jtable_vendedor.getModel();
            modelo.setRowCount(0);
            while(rs.next()){
                int identidad = rs.getInt(1);
                String nombre = rs.getString(2);
                String direccion = rs.getString(3);
                int celular = rs.getInt(4);
                modelo.addRow(new Object[]{identidad, nombre, direccion, celular});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void listarCompradores(){
        Dba db = new Dba(db_Name);
        db.conectar();
        try {
            db.query.execute("Select * from COMPRADOR");
            ResultSet rs = db.query.getResultSet();
            DefaultTableModel modelo = (DefaultTableModel) jtable_comprador.getModel();
            modelo.setRowCount(0);
            while(rs.next()){
                int identidad = rs.getInt(1);
                String nombre = rs.getString(2);
                String direccion = rs.getString(3);
                int celular = rs.getInt(4);
                modelo.addRow(new Object[]{identidad, nombre, direccion, celular});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void listarAgentes(){
        Dba db = new Dba(db_Name);
        db.conectar();
        try {
            db.query.execute("Select * from AGENTE");
            ResultSet rs = db.query.getResultSet();
            DefaultTableModel modelo = (DefaultTableModel) jtable_agentes.getModel();
            modelo.setRowCount(0);
            while(rs.next()){
                int identidad = rs.getInt(1);
                String nombre = rs.getString(2);
                String direccion = rs.getString(3);
                int celular = rs.getInt(4);
                int tel_oficina = rs.getInt(5);
                modelo.addRow(new Object[]{identidad, nombre, direccion, celular, tel_oficina});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean verificar_id_Propiedad_En_Mercado(int identidad){
        Dba db = new Dba(db_Name);
        db.conectar();
        try {
            db.query.execute("Select idPropiedad from PROPIEDAD_EN_MERCADO");
            ResultSet rs = db.query.getResultSet();
            while(rs.next()){
                if(rs.getInt(1)== identidad){
                    return false;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public boolean verificar_id_vendedor(int identidad){
        Dba db = new Dba(db_Name);
        db.conectar();
        try {
            db.query.execute("Select noIdentidad from VENDEDOR");
            ResultSet rs = db.query.getResultSet();
            while(rs.next()){
                if(rs.getInt(1)== identidad){
                    return false;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public boolean verificar_id_comprador(int identidad){
        Dba db = new Dba(db_Name);
        db.conectar();
        try {
            db.query.execute("Select noIdentidad from COMPRADOR");
            ResultSet rs = db.query.getResultSet();
            while(rs.next()){
                if(rs.getInt(1)== identidad){
                    return false;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public boolean verificar_id_agente(int identidad){
        Dba db = new Dba(db_Name);
        db.conectar();
        try {
            db.query.execute("Select noIdentidad from AGENTE");
            ResultSet rs = db.query.getResultSet();
            while(rs.next()){
                if(rs.getInt(1)== identidad){
                    return false;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public void show_login(){
        jf_login.pack();
        jf_login.setLocationRelativeTo(this);
        this.setVisible(false);
        jf_login.setVisible(true);
        tf_correo_login.setText("Ingrese su correo");
        tf_correo_login.setForeground(Color.LIGHT_GRAY);
        pf_password_login.setText("********");
        pf_password_login.setForeground(Color.LIGHT_GRAY);
    }
    
    public void show_home(){
        jf_home.pack();
        jf_home.setLocationRelativeTo(this);
        jf_login.setVisible(false);
        jf_home.setVisible(true);
    }
    
    public void update_lista_users(){
        lista_users = new ArrayList();
        
        // Nos conectamos a la base de datos
        Dba db = new Dba(db_Name);
        db.conectar();
        try {
            db.query.execute("Select * from USERS");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                String correo = rs.getString(1);
                String password = rs.getString(2);
                String user_type = rs.getString(3);
                Usuario created_user = new Usuario(correo, password, user_type);
                lista_users.add(created_user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        db.desconectar();
        //System.out.println(lista_users);
    }
    
    public void log_agente(){
        flag_prop_ven_agente = true;
        flag_prop_asig_agente = false;
        
        jp_sb_prop_ven_agente.setBackground(new Color(41,57,80));
        jl_prop_ven_agente.setForeground(Color.WHITE);
        jp_mini_detalle_prop_ven_agente.setBackground(new Color(240,240,240));
        
        jp_sb_prop_asig_agente.setBackground(new Color(23,35,54));
        jl_prop_asig_agente.setForeground(new Color(204,204,204));
        jp_mini_detalle_prop_asig_agente.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(true);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
    }
    
    public void log_vendedor(){
        flag_prop_ven_vendedor = true;
        flag_prop_merc_vendedor = false;
        
        jp_sb_prop_ven_vendedor.setBackground(new Color(41,57,80));
        jl_prop_ven_vendedor.setForeground(Color.WHITE);
        jp_mini_detalle_prop_ven_vendedor.setBackground(new Color(240,240,240));
        
        jp_sb_prop_merc_vendedor.setBackground(new Color(23,35,54));
        jl_prop_merc_vendedor.setForeground(new Color(204,204,204));
        jp_mini_detalle_prop_merc_vendedor.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(true);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
    }
    
    public void log_comprador(){
        flag_prop_comp_comprador = true;
        flag_prop_merc_comprador = false;
        
        jp_sb_prop_comp_comprador.setBackground(new Color(41,57,80));
        jl_prop_comp_comprador.setForeground(Color.WHITE);
        jp_mini_detalle_prop_comp_comprador.setBackground(new Color(240,240,240));
        
        jp_sb_prop_merc_comprador.setBackground(new Color(23,35,54));
        jl_prop_merc_comprador.setForeground(new Color(204,204,204));
        jp_mini_detalle_prop_merc_comprador.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(true);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(false);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
    }
    
    public void log_admin(){
        flag_mantenimiento = true;
        flag_bitacora = false;
        flag_reportes = false;
        
        jp_sb_mantenimiento.setBackground(new Color(41,57,80));
        jl_mantenimiento.setForeground(Color.WHITE);
        jp_mini_detalle_mantenimiento.setBackground(new Color(240,240,240));
        
        jp_sb_bitacora.setBackground(new Color(23,35,54));
        jl_bitacora.setForeground(new Color(204,204,204));
        jp_mini_detalle_bitacora.setBackground(new Color(23,35,54));
        
        jp_sb_reportes.setBackground(new Color(23,35,54));
        jl_reportes.setForeground(new Color(204,204,204));
        jp_mini_detalle_reportes.setBackground(new Color(23,35,54));
        
        jp_propiedades_vendidas_agente.setVisible(false);
        jp_propiedades_asignadas_agente.setVisible(false);
        
        jp_propiedades_vendidas_vendedor.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_propiedades_compradas_comprador.setVisible(false);
        jp_propiedades_en_mercado.setVisible(false);
        
        jp_mantemiento_admin.setVisible(true);
        jp_bitacora_admin.setVisible(false);
        jp_reportes_admin.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_crear_agente;
    private javax.swing.JButton bt_crear_comprador;
    private javax.swing.JButton bt_crear_vendedor;
    private javax.swing.JButton bt_modificar_agente;
    private javax.swing.JButton bt_modificar_comprador;
    private javax.swing.JButton bt_modificar_vendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopUp_agentes;
    private javax.swing.JPopupMenu jPopUp_compradores;
    private javax.swing.JPopupMenu jPopUp_prop_merc;
    private javax.swing.JPopupMenu jPopUp_vendedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private com.toedter.calendar.JDateChooser jdc_fecha_pub_prop_merc;
    private javax.swing.JFrame jf_home;
    private javax.swing.JFrame jf_login;
    private javax.swing.JLabel jl_FechaActual_home;
    private javax.swing.JLabel jl_abrevNombre_home;
    private javax.swing.JLabel jl_bitacora;
    private javax.swing.JLabel jl_mantenimiento;
    private javax.swing.JLabel jl_prop_asig_agente;
    private javax.swing.JLabel jl_prop_comp_comprador;
    private javax.swing.JLabel jl_prop_merc_comprador;
    private javax.swing.JLabel jl_prop_merc_vendedor;
    private javax.swing.JLabel jl_prop_ven_agente;
    private javax.swing.JLabel jl_prop_ven_vendedor;
    private javax.swing.JLabel jl_reportes;
    private javax.swing.JLabel jl_username;
    private javax.swing.JMenuItem jmi_eliminar_agente;
    private javax.swing.JMenuItem jmi_eliminar_comprador;
    private javax.swing.JMenuItem jmi_eliminar_prop_merc;
    private javax.swing.JMenuItem jmi_eliminar_vendedor;
    private javax.swing.JMenuItem jmi_modificar_agente;
    private javax.swing.JMenuItem jmi_modificar_comprador;
    private javax.swing.JMenuItem jmi_modificar_prop_merc;
    private javax.swing.JMenuItem jmi_modificar_vendedor;
    private javax.swing.JPanel jp_Header_Inicio;
    private javax.swing.JPanel jp_adm;
    private test.PanelRound jp_admin;
    private javax.swing.JPanel jp_agente;
    private javax.swing.JPanel jp_bitacora_admin;
    private javax.swing.JPanel jp_comprador;
    private javax.swing.JPanel jp_container_menus;
    private javax.swing.JPanel jp_container_panels;
    private javax.swing.JPanel jp_crud_agentes;
    private javax.swing.JPanel jp_exit_home;
    private javax.swing.JPanel jp_exit_inicio;
    private javax.swing.JPanel jp_exit_login;
    private javax.swing.JPanel jp_header_home;
    private javax.swing.JPanel jp_header_login;
    private javax.swing.JPanel jp_mantemiento_admin;
    private javax.swing.JPanel jp_mini_detalle_bitacora;
    private javax.swing.JPanel jp_mini_detalle_mantenimiento;
    private javax.swing.JPanel jp_mini_detalle_prop_asig_agente;
    private javax.swing.JPanel jp_mini_detalle_prop_comp_comprador;
    private javax.swing.JPanel jp_mini_detalle_prop_merc_comprador;
    private javax.swing.JPanel jp_mini_detalle_prop_merc_vendedor;
    private javax.swing.JPanel jp_mini_detalle_prop_ven_agente;
    private javax.swing.JPanel jp_mini_detalle_prop_ven_vendedor;
    private javax.swing.JPanel jp_mini_detalle_reportes;
    private javax.swing.JPanel jp_opciones_admin;
    private javax.swing.JPanel jp_opciones_agente;
    private javax.swing.JPanel jp_opciones_comprador;
    private javax.swing.JPanel jp_opciones_vendedor;
    private javax.swing.JPanel jp_propiedades_asignadas_agente;
    private javax.swing.JPanel jp_propiedades_compradas_comprador;
    private javax.swing.JPanel jp_propiedades_en_mercado;
    private javax.swing.JPanel jp_propiedades_vendidas_agente;
    private javax.swing.JPanel jp_propiedades_vendidas_vendedor;
    private javax.swing.JPanel jp_reportes_admin;
    private javax.swing.JPanel jp_sb_bitacora;
    private javax.swing.JPanel jp_sb_mantenimiento;
    private javax.swing.JPanel jp_sb_prop_asig_agente;
    private javax.swing.JPanel jp_sb_prop_comp_comprador;
    private javax.swing.JPanel jp_sb_prop_merc_comprador;
    private javax.swing.JPanel jp_sb_prop_merc_vendedor;
    private javax.swing.JPanel jp_sb_prop_ven_agente;
    private javax.swing.JPanel jp_sb_prop_ven_vendedor;
    private javax.swing.JPanel jp_sb_reportes;
    private test.PanelRound jp_user;
    private javax.swing.JPanel jp_vendedor;
    private javax.swing.JTable jtable_agentes;
    private javax.swing.JTable jtable_comprador;
    private javax.swing.JTable jtable_prop_mercado;
    private javax.swing.JTable jtable_vendedor;
    private javax.swing.JTabbedPane jtp_mantenimiento;
    private javax.swing.JPasswordField pf_password_login;
    private test.PanelRound rp_entrar_login;
    private test.PanelRound rp_userHolder;
    private javax.swing.JTextField tf_cant_dormitorios_prop_mercado;
    private javax.swing.JTextField tf_caracteristicas_prop_mercado;
    private javax.swing.JTextField tf_celular_crear_agente;
    private javax.swing.JTextField tf_celular_crear_comprador;
    private javax.swing.JTextField tf_celular_crear_vendedor;
    private javax.swing.JTextField tf_ciudad_prop_mercado;
    private javax.swing.JTextField tf_correo_login;
    private javax.swing.JTextArea tf_direccion_crear_agente;
    private javax.swing.JTextArea tf_direccion_crear_comprador;
    private javax.swing.JTextArea tf_direccion_crear_vendedor;
    private javax.swing.JTextField tf_direccion_prop_mercado;
    private javax.swing.JTextField tf_identidad_agente_prop_mercado;
    private javax.swing.JTextField tf_identidad_crear_agente;
    private javax.swing.JTextField tf_identidad_crear_comprador;
    private javax.swing.JTextField tf_identidad_crear_vendedor;
    private javax.swing.JTextField tf_identidad_vendedor_prop_mercado;
    private javax.swing.JTextField tf_nombre_crear_agente;
    private javax.swing.JTextField tf_nombre_crear_comprador;
    private javax.swing.JTextField tf_nombre_crear_vendedor;
    private javax.swing.JTextField tf_nombre_prop_mercado;
    private javax.swing.JTextField tf_precio_prop_mercado;
    private javax.swing.JTextField tf_telefonoOficina_crear_agente;
    // End of variables declaration//GEN-END:variables
    
    private int xMouse, yMouse;
    private Usuario actual_user;
    private ArrayList<Usuario> lista_users = new ArrayList();
    private String db_Name = "Proyecto_db_1";
    
    private boolean flag_prop_ven_agente = true;
    private boolean flag_prop_asig_agente;
    
    private boolean flag_prop_ven_vendedor = true;
    private boolean flag_prop_merc_vendedor;
    
    private boolean flag_prop_comp_comprador = true;
    private boolean flag_prop_merc_comprador;
    
    private boolean flag_mantenimiento = true;
    private boolean flag_bitacora;
    private boolean flag_reportes;
    
    private int identidad_agente_a_modificar;
    private int identidad_comprador_a_modificar;
    private int identidad_vendedor_a_modificar;
    private int id_prop_merc_a_modificar;
}
