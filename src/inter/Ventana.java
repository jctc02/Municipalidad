/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;
//detalles//detalles
import Animacion.Animacion;
import AppPackage.AnimationClass;
import java.awt.Image;
import static java.awt.SystemColor.window;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.jdesktop.swingx.prompt.PromptSupport;
import static sun.security.jgss.GSSUtil.login;

        
public class Ventana extends javax.swing.JFrame {

    public int valor=0;     
    public int botones=0;
    int Modic1=0;
    int Modic2=0;
    int Modic3=0;
    int usuario=1;
    String cedulatxt;
    String productxt;
    String correotxt;
    String teltxt;
    String faxtxt;
    String ubicatxt;
    String codprotxt;
    String nomprotxt;
    int conta=0;
    int campos=0;

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Proveeduria");
        fechain.setText(fechaactual()); 
        fechaexpira();
        mostrardatos();
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        PromptSupport.setPrompt("Buscar", Buscar);
        PromptSupport.setPrompt("Buscar", txtFiltro);
        PromptSupport.setPrompt("Usuario", userText);
        PromptSupport.setPrompt("Contraseña", jPassword);
    }
    
    

    
    
    
    
    
    
    /*Cambiar imagen de la barra de tareas*/
    public Image getIconImage() 
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo muni.png"));
        return retValue;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPrincipal = new javax.swing.JPanel();
        jPanelLogin = new javax.swing.JPanel();
        panel_user = new javax.swing.JPanel();
        User1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_datos = new javax.swing.JPanel();
        userText = new javax.swing.JTextField();
        iconUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Passw = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        icono_login = new javax.swing.JLabel();
        LogoMuni = new javax.swing.JLabel();
        jSalir = new javax.swing.JLabel();
        jEnter = new javax.swing.JButton();
        jPanelEsc = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Bienvenido = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();
        btn_buscar2 = new javax.swing.JButton();
        minimizar = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        jMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel_añadir = new javax.swing.JPanel();
        cedula = new javax.swing.JLabel();
        Añapro = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtcedulaproveedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnombreproveedor = new javax.swing.JTextField();
        tel = new javax.swing.JLabel();
        fax = new javax.swing.JLabel();
        btn_añade = new javax.swing.JButton();
        btn_regresa = new javax.swing.JButton();
        Act = new javax.swing.JLabel();
        txtactividadcomer = new javax.swing.JTextField();
        ubi = new javax.swing.JLabel();
        txtubicacion = new javax.swing.JTextField();
        txttelefono2 = new javax.swing.JTextField();
        txttelefono3 = new javax.swing.JTextField();
        txtcorreo2 = new javax.swing.JTextField();
        txtcorreo3 = new javax.swing.JTextField();
        txtfax1 = new javax.swing.JTextField();
        txtfax2 = new javax.swing.JTextField();
        txtfax3 = new javax.swing.JTextField();
        modipro = new javax.swing.JLabel();
        btn_modi = new javax.swing.JButton();
        cedula1 = new javax.swing.JLabel();
        txtcodigoproveedor = new javax.swing.JTextField();
        MAS_3 = new javax.swing.JLabel();
        MAS1 = new javax.swing.JLabel();
        MAS3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcorreo1 = new javax.swing.JTextField();
        Fechaex = new javax.swing.JTextField();
        txttelefono1 = new javax.swing.JTextField();
        fechain = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        PanelModi = new javax.swing.JPanel();
        regresar_modi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtFiltro = new javax.swing.JTextField();
        comboFiltro = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        btn_buscar1 = new javax.swing.JButton();
        btn_añadir = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        comboFiltro1 = new javax.swing.JComboBox();

        jPopupMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("MODIFICAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("ELIMINAR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_user.setBackground(new java.awt.Color(255, 255, 255));
        panel_user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User1.setBackground(new java.awt.Color(238, 112, 82));
        User1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        User1.setForeground(new java.awt.Color(238, 112, 82));
        User1.setText("Usuario");
        panel_user.add(User1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio2.png"))); // NOI18N
        panel_user.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 220));

        jPanelLogin.add(panel_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, 190, 280, 230));

        panel_datos.setBackground(new java.awt.Color(255, 255, 255));
        panel_datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(255, 99, 71));
        userText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTextMouseClicked(evt);
            }
        });
        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });
        userText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userTextKeyTyped(evt);
            }
        });
        panel_datos.add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 30));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_customer_32px_1.png"))); // NOI18N
        panel_datos.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 30, 30));

        jLabel2.setBackground(new java.awt.Color(255, 99, 71));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 99, 71));
        jLabel2.setText("Usuario");
        panel_datos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        Passw.setBackground(new java.awt.Color(238, 112, 82));
        Passw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Passw.setForeground(new java.awt.Color(238, 112, 82));
        Passw.setText("Contraseña");
        panel_datos.add(Passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Key_32px.png"))); // NOI18N
        panel_datos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 30, 30));

        jPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPassword.setForeground(new java.awt.Color(255, 99, 71));
        jPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordMouseClicked(evt);
            }
        });
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordKeyTyped(evt);
            }
        });
        panel_datos.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, 30));

        jPanelLogin.add(panel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 170));

        icono_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_User_96px_2.png"))); // NOI18N
        jPanelLogin.add(icono_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, 120));

        LogoMuni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo muni.png"))); // NOI18N
        jPanelLogin.add(LogoMuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 30, -1, 220));

        jSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-Exportar-50.png"))); // NOI18N
        jSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSalirMouseEntered(evt);
            }
        });
        jPanelLogin.add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 400, 120, 90));

        jEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar.png"))); // NOI18N
        jEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnterActionPerformed(evt);
            }
        });
        jPanelLogin.add(jEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 110, 40));

        jPrincipal.add(jPanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 580));

        jPanelEsc.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEsc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo muni.png"))); // NOI18N
        jPanelEsc.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 200, 210));

        Bienvenido.setFont(new java.awt.Font("Vivaldi", 1, 80)); // NOI18N
        Bienvenido.setForeground(new java.awt.Color(255, 99, 71));
        Bienvenido.setText("Bienvenido");
        jPanelEsc.add(Bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 380, 80));

        jPrincipal.add(jPanelEsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 950, 520));

        Buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 99, 71));
        Buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarMouseExited(evt);
            }
        });
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarKeyTyped(evt);
            }
        });
        jPrincipal.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -100, 220, 30));

        btn_buscar2.setBackground(new java.awt.Color(255, 255, 255));
        btn_buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar boton.png"))); // NOI18N
        btn_buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar2ActionPerformed(evt);
            }
        });
        jPrincipal.add(btn_buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, -100, 30, 30));

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        jPrincipal.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 30, 30));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jPrincipal.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, 30));

        jMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Menu_32px.png"))); // NOI18N
        jMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMouseClicked(evt);
            }
        });
        jPrincipal.add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex , int colIndex){
                return false;
            }
        };
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("N proveedor");
        }

        jPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1000, 970, 440));

        panel_añadir.setBackground(new java.awt.Color(255, 255, 255));
        panel_añadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cedula.setForeground(new java.awt.Color(255, 99, 71));
        cedula.setText("Cedula:");
        panel_añadir.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        Añapro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Añapro.setForeground(new java.awt.Color(255, 99, 71));
        Añapro.setText("Añadir Proveedor");
        panel_añadir.add(Añapro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));
        panel_añadir.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 230, 10));

        txtcedulaproveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcedulaproveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcedulaproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcedulaproveedorMouseClicked(evt);
            }
        });
        panel_añadir.add(txtcedulaproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 140, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 99, 71));
        jLabel5.setText("Nombre:");
        panel_añadir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, 20));

        txtnombreproveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnombreproveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombreproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreproveedorMouseClicked(evt);
            }
        });
        panel_añadir.add(txtnombreproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 180, -1));

        tel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tel.setForeground(new java.awt.Color(255, 99, 71));
        tel.setText("Telefono:");
        panel_añadir.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        fax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fax.setForeground(new java.awt.Color(255, 99, 71));
        fax.setText("Fax:");
        panel_añadir.add(fax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        btn_añade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Añadir.png"))); // NOI18N
        btn_añade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_añade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_añadeMouseClicked(evt);
            }
        });
        btn_añade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadeActionPerformed(evt);
            }
        });
        panel_añadir.add(btn_añade, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 110, 40));

        btn_regresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        btn_regresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresaMouseClicked(evt);
            }
        });
        btn_regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresaActionPerformed(evt);
            }
        });
        panel_añadir.add(btn_regresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 140, 40));

        Act.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Act.setForeground(new java.awt.Color(255, 99, 71));
        Act.setText("Actividad comercial :");
        panel_añadir.add(Act, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 20));

        txtactividadcomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtactividadcomer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtactividadcomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtactividadcomerMouseClicked(evt);
            }
        });
        txtactividadcomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactividadcomerActionPerformed(evt);
            }
        });
        panel_añadir.add(txtactividadcomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 390, 80));

        ubi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ubi.setForeground(new java.awt.Color(255, 99, 71));
        ubi.setText("Ubicación:");
        panel_añadir.add(ubi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, 20));

        txtubicacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtubicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtubicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtubicacionMouseClicked(evt);
            }
        });
        panel_añadir.add(txtubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 170, 20));

        txttelefono2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttelefono2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_añadir.add(txttelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -1000, 160, 20));

        txttelefono3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttelefono3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_añadir.add(txttelefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -1000, 160, -1));

        txtcorreo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcorreo2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_añadir.add(txtcorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -1000, 260, -1));

        txtcorreo3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcorreo3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_añadir.add(txtcorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -1000, 250, -1));

        txtfax1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfax1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtfax1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfax1MouseClicked(evt);
            }
        });
        panel_añadir.add(txtfax1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 150, 20));

        txtfax2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfax2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_añadir.add(txtfax2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -1000, 160, 20));

        txtfax3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfax3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_añadir.add(txtfax3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -1000, 160, -1));

        modipro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        modipro.setForeground(new java.awt.Color(255, 99, 71));
        modipro.setText("Modificar Proveedor");
        panel_añadir.add(modipro, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1000, 10, 250, 30));

        btn_modi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        btn_modi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modiActionPerformed(evt);
            }
        });
        panel_añadir.add(btn_modi, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1000, 430, 140, 40));

        cedula1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cedula1.setForeground(new java.awt.Color(255, 99, 71));
        cedula1.setText("CODIGO PROVEEDOR");
        panel_añadir.add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        txtcodigoproveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcodigoproveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcodigoproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcodigoproveedorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcodigoproveedorMouseExited(evt);
            }
        });
        panel_añadir.add(txtcodigoproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, -1));

        MAS_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MAS_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logomas.png"))); // NOI18N
        MAS_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MAS_3MouseClicked(evt);
            }
        });
        panel_añadir.add(MAS_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 30, 40));

        MAS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MAS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logomas.png"))); // NOI18N
        MAS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MAS1MouseClicked(evt);
            }
        });
        panel_añadir.add(MAS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 30, 40));

        MAS3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MAS3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logomas.png"))); // NOI18N
        MAS3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MAS3MouseClicked(evt);
            }
        });
        panel_añadir.add(MAS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 30, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 99, 71));
        jLabel12.setText("Correo:");
        panel_añadir.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        txtcorreo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcorreo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcorreo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcorreo1MouseClicked(evt);
            }
        });
        txtcorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreo1ActionPerformed(evt);
            }
        });
        panel_añadir.add(txtcorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 240, -1));

        Fechaex.setEditable(false);
        Fechaex.setBackground(new java.awt.Color(255, 255, 255));
        Fechaex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fechaex.setForeground(new java.awt.Color(255, 99, 71));
        Fechaex.setBorder(null);
        Fechaex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaexMouseClicked(evt);
            }
        });
        Fechaex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaexActionPerformed(evt);
            }
        });
        panel_añadir.add(Fechaex, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 90, 20));

        txttelefono1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttelefono1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txttelefono1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttelefono1MouseClicked(evt);
            }
        });
        panel_añadir.add(txttelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 150, 20));

        fechain.setEditable(false);
        fechain.setBackground(new java.awt.Color(255, 255, 255));
        fechain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fechain.setForeground(new java.awt.Color(255, 99, 71));
        fechain.setBorder(null);
        fechain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechainMouseClicked(evt);
            }
        });
        fechain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechainActionPerformed(evt);
            }
        });
        panel_añadir.add(fechain, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 90, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 99, 71));
        jLabel3.setText("Fecha de Actualizacion:");
        panel_añadir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, -1));
        panel_añadir.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 110, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 99, 71));
        jLabel6.setText("Fecha de Ingreso:");
        panel_añadir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, -1, -1));
        panel_añadir.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 110, 10));

        jPrincipal.add(panel_añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1000, 50, 980, 490));

        PanelModi.setBackground(new java.awt.Color(255, 255, 255));
        PanelModi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresar_modi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar_modi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasp.png"))); // NOI18N
        regresar_modi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar_modi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresar_modiMouseClicked(evt);
            }
        });
        PanelModi.add(regresar_modi, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 50, 30));

        jTable2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex , int colIndex){
                return false;
            }
        };
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setComponentPopupMenu(jPopupMenu1);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable2);

        PanelModi.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 980, 440));

        txtFiltro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        txtFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFiltroMouseExited(evt);
            }
        });
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });
        PanelModi.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 220, 30));

        comboFiltro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Proveedor", "Actividad/servicio" }));
        comboFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        comboFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelModi.add(comboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 100, 30));

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelModi.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 110, 30));

        btn_buscar1.setBackground(new java.awt.Color(255, 255, 255));
        btn_buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar boton.png"))); // NOI18N
        btn_buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar1ActionPerformed(evt);
            }
        });
        PanelModi.add(btn_buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 30, 30));

        jPrincipal.add(PanelModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2000, 10, 980, 510));

        btn_añadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-Añadir lista-50.png"))); // NOI18N
        btn_añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_añadirMouseClicked(evt);
            }
        });
        jPrincipal.add(btn_añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 100, 90));

        Modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-edit-property-50.png"))); // NOI18N
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        jPrincipal.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 60, 60));

        comboFiltro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboFiltro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Proveedor", "Actividad/servicio" }));
        comboFiltro1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        comboFiltro1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPrincipal.add(comboFiltro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, -100, 100, 30));

        getContentPane().add(jPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed
     public void  fechaexpira(){
         Calendar cal= Calendar.getInstance(); 
        int year= cal.get(Calendar.YEAR); 
        int mes =cal.get(Calendar.MONTH);
        mes=mes+1;
        int Dia =cal.get(Calendar.DATE);
        year=year+2;
        Fechaex.setText(""+year+"/"+mes+"/"+Dia);      
     }
         public static String fechaactual(){
     Date fecha=new Date();
     SimpleDateFormat formatofecha=new SimpleDateFormat("yyyy/MM/dd");
     return formatofecha.format(fecha);    
 }
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
                   
    }//GEN-LAST:event_BuscarActionPerformed

    private void jMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMouseClicked
        int pos_menu = jMenu.getX();
            if (pos_menu>200 && pos_menu<400) 
            {
                Animacion.mover_izquierda(0, -300, 7, 5, jPanelLogin);
                Animacion.mover_izquierda(310, 7, 7, 5, jMenu);
            }
            else
            {
                Animacion.mover_derecha(-300,0, 7, 5, jPanelLogin);
                Animacion.mover_derecha(7, 310, 7, 5, jMenu);
            } 
    }//GEN-LAST:event_jMenuMouseClicked
        /*boton de minimizar*/
    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        /*this.setState(Ventana.ICONIFIED);*/
        setExtendedState(JFrame.CROSSHAIR_CURSOR); 
    }//GEN-LAST:event_minimizarMouseClicked
        /*Boton de salir */
    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        
        int resul = JOptionPane.showConfirmDialog(rootPane, "Desea salir");
        if (resul==0) 
        {
            System.exit(0);
        }
    }//GEN-LAST:event_cerrarMouseClicked
        /*estos procedimientos vacian las cajas de texto*/
    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked

    }//GEN-LAST:event_BuscarMouseClicked

    private void userTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextMouseClicked
        
    }//GEN-LAST:event_userTextMouseClicked

    private void jPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMouseClicked
        
    }//GEN-LAST:event_jPasswordMouseClicked

    private void jSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirMouseClicked
        Animacion.mover_derecha(-120, 90, 7, 5, jEnter);
        Animacion.mover_izquierda(90,-120, 7, 5, jSalir);
        Animacion.mover_izquierda(1600, 80, 7, 10, jPanelEsc);
        Animacion.mover_derecha(-290, 30, 7, 5, panel_datos );
        Animacion.mover_izquierda(10, -290, 7, 10, panel_user);
        Animacion.bajar(40, 600, 0, 5, btn_añadir);
        Animacion.mover_izquierda(50, -1000, 0, 5, panel_añadir);
        Animacion.bajar(140,1000 , 0, 5, jScrollPane1);
        Animacion.subir(20, -100, 0, 5, Buscar);
        Animacion.subir(20,-100, 0, 5, btn_buscar2);
        Animacion.mover_izquierda(50, -1000, 0, 5, PanelModi);
        valor=0;        
        userText.setText("");
        jPassword.setText("");
    }//GEN-LAST:event_jSalirMouseClicked

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
       
        
    }//GEN-LAST:event_BuscarMouseExited

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        
            
    }//GEN-LAST:event_formWindowIconified

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        if (valor==1) 
        {
            Animacion.mover_izquierda(0, -300, 0, 5, jPanelLogin);
            Animacion.mover_izquierda(310, 7, 0, 5, jMenu);
            Animacion.mover_derecha(80, 1600, 0, 10, jPanelEsc);
            Animacion.mover_izquierda(30, -290, 7, 5, panel_datos );
            Animacion.mover_derecha(-290, 10, 7, 10, panel_user);
            Animacion.mover_izquierda(90, -120, 7, 5, jEnter);
            Animacion.mover_derecha(-120, 90, 7, 5, jSalir);
            Animacion.subir(600, 30, 0, 5, btn_añadir);
            Animacion.subir(1000, 110, 0, 5, jScrollPane1);
            Animacion.bajar(-100, 60, 0, 5, comboFiltro1);
            Animacion.bajar(-100, 20, 0, 5, Buscar);
            Animacion.bajar(-100, 20, 0, 5, btn_buscar2);
        }
        if (valor==2) 
        {
            Animacion.bajar(40, 600, 0, 5, btn_añadir);
            Animacion.bajar(140, 1000, 0, 5, jScrollPane1);
            Animacion.mover_derecha(-1000, 45, 0, 5, panel_añadir);
            Animacion.mover_derecha(-1000, 380, 0, 5, Añapro);
            Animacion.mover_derecha(-1000, 700, 0, 5, btn_añade);
            Animacion.mover_izquierda(0, -300, 0, 5, jPanelLogin);
            Animacion.mover_izquierda(310, 7, 0, 5, jMenu);
            Animacion.mover_derecha(80, 1600, 0, 10, jPanelEsc);
            Animacion.mover_izquierda(90, -120, 7, 5, jEnter);
            Animacion.mover_derecha(-120, 90, 7, 5, jSalir);
            Animacion.mover_derecha(-290, 10, 7, 10, panel_user);
        }
        if (valor == 3) 
        {
            Animacion.bajar(40, 600, 0, 5, btn_añadir);
            Animacion.bajar(140, 1000, 0, 5, jScrollPane1);
            Animacion.mover_derecha(-1000, 45, 0, 5, panel_añadir);
            Animacion.mover_izquierda(380, -1000, 0, 5, Añapro);
            Animacion.mover_derecha(-1000, 365, 0, 5, modipro);
            Animacion.mover_izquierda(700, -1000, 0, 5, btn_añade);
            Animacion.mover_derecha(-1000, 680, 0, 5, btn_modi);
            Animacion.mover_izquierda(0, -300, 0, 5, jPanelLogin);
            Animacion.mover_izquierda(310, 7, 0, 5, jMenu);
            Animacion.mover_derecha(80, 1600, 0, 10, jPanelEsc);
            Animacion.mover_izquierda(90, -120, 7, 5, jEnter);
            Animacion.mover_derecha(-120, 90, 7, 5, jSalir);
            Animacion.mover_derecha(-290, 10, 7, 10, panel_user);
        }
        if (valor==4) {
            Animacion.mover_derecha(80, 1600, 0, 10, jPanelEsc);
            Animacion.mover_izquierda(310, 7, 0, 5, jMenu);
            Animacion.mover_izquierda(0, -300, 0, 5, jPanelLogin);
            Animacion.bajar(140, 1000, 0, 5, jScrollPane1);
            Animacion.mover_derecha(-2000, 45, 0, 5, PanelModi);
            Animacion.bajar(170, 1000, 0, 5, jScrollPane1);
            Animacion.subir(20, -50, 0, 5, Buscar);
            Animacion.subir(20, -50, 0, 5, btn_buscar2);
            Animacion.mover_izquierda(90, -120, 7, 5, jEnter);
            Animacion.mover_derecha(-120, 90, 7, 5, jSalir);
            Animacion.mover_derecha(-290, 10, 7, 10, panel_user);
        }
        if (valor==5) {
            Animacion.mover_derecha(80, 1600, 0, 10, jPanelEsc);
            Animacion.mover_izquierda(310, 7, 0, 5, jMenu);
            Animacion.mover_izquierda(0, -300, 0, 5, jPanelLogin);
            Animacion.bajar(140, 1000, 0, 5, jScrollPane1);
            Animacion.bajar(40, 600, 0, 5, btn_añadir);
            Animacion.bajar(140,1000, 0, 5, jScrollPane1);
            Animacion.mover_derecha(-1000, 45, 0, 5, panel_añadir);
            Animacion.mover_derecha(-1000, 380, 0, 5, modipro);
            Animacion.mover_izquierda(380, -1000, 0, 5, Añapro);
            Animacion.mover_izquierda(700, -1000, 0, 5, btn_añade);
            Animacion.mover_derecha(-1000, 650, 0, 5, btn_modi);
            Animacion.mover_izquierda(45, -2000, 0, 5, PanelModi);
            Animacion.mover_izquierda(90, -120, 7, 5, jEnter);
            Animacion.mover_derecha(-120, 90, 7, 5, jSalir);
            Animacion.mover_derecha(-290, 10, 7, 10, panel_user);
        }
        
    }//GEN-LAST:event_formWindowStateChanged

    private void btn_añadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_añadeMouseClicked
 
    }//GEN-LAST:event_btn_añadeMouseClicked

    private void txtactividadcomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactividadcomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtactividadcomerActionPerformed

    private void btn_regresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresaMouseClicked

    private void btn_regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresaActionPerformed
        mostrardatos();
        //txtFiltro.setText("");
        //la primera condicion es para el regresar de añadir y el else es para modificar 
        if (botones==1) 
        {
            Animacion.subir(600, 30, 0, 5, btn_añadir);
            Animacion.subir(1000, 110, 0, 5, jScrollPane1);
            Animacion.mover_izquierda(45, -1000, 0, 5, panel_añadir);
            Animacion.bajar(-100, 60, 0, 5, comboFiltro1);
            valor=1;
            Modic1=0;
            Modic2=0;
            Modic3=0;
            vaciar();
            conta=0;
            Animacion.subir(310, -1000, 0, 5, txtfax3);
            Animacion.subir(280, -1000, 0, 5, txtfax2);
            Animacion.subir(280, -1000, 0, 5, txttelefono2);
            Animacion.subir(310, -1000, 0, 5, txttelefono3);
            Animacion.subir(280, -1000, 0, 5, txtcorreo2);
            Animacion.subir(310, -1000, 0, 5, txtcorreo3);
            Animacion.bajar(-50, 20, 0, 5, Buscar);
            Animacion.bajar(-50, 20, 0, 5, btn_buscar2);
            
            valor=1;
            
        } 
        else 
            //Este es para el regresar de modificar
        {
            vaciar();
            //Animacion.bajar(-100, 60, 0, 5, comboFiltro1);
            //Animacion.subir(1000, 110, 4, 5, jScrollPane1);
            Animacion.mover_derecha(-2000, 45, 0, 5, PanelModi);
            Animacion.bajar(170, 1000, 0, 5, jScrollPane1);
            Animacion.subir(20, -50, 0, 5, Buscar);
            Animacion.subir(20, -50, 0, 5, btn_buscar2);
            Animacion.subir(60, -100, 0, 5, comboFiltro1);
            Animacion.mover_izquierda(45, -1000, 0, 5, panel_añadir);
            Animacion.mover_izquierda(380, -1000, 0, 5, Añapro);
            Animacion.mover_izquierda(365, -1000, 0, 5, modipro);
            Animacion.mover_izquierda(700, -1000, 0, 5, btn_añade);
            Animacion.mover_izquierda(680, -1000, 0, 5, btn_modi);
            Animacion.subir(310, -1000, 0, 5, txtfax3);
            Animacion.subir(280, -1000, 0, 5, txtfax2);
            Animacion.subir(280, -1000, 0, 5, txttelefono2);
            Animacion.subir(310, -1000, 0, 5, txttelefono3);
            Animacion.subir(280, -1000, 0, 5, txtcorreo2);
            Animacion.subir(310, -1000, 0, 5, txtcorreo3);
            //Animacion.bajar(-50, 20, 0, 5, Buscar);
            //Animacion.bajar(-50, 20, 0, 5, btn_buscar2);
            conta=0;
        }
        
    }//GEN-LAST:event_btn_regresaActionPerformed

    private void btn_añadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadeActionPerformed
        //este es el procedimiento de para añadir un proveedor 
        aString();
        validar(conta);
    }//GEN-LAST:event_btn_añadeActionPerformed

    private void MAS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAS1MouseClicked
        
        if (Modic1==0 || Modic1==1) 
        {
            Animacion.bajar(-1000, 280, 0, 5, txtfax2);
            Modic1=Modic1 + 1;
            if (Modic1==2) 
            {

                    Animacion.bajar(-1000, 310, 0, 5, txtfax3);

            }
        }
        
    }//GEN-LAST:event_MAS1MouseClicked

    private void MAS3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAS3MouseClicked
        if (Modic2==0 || Modic2==1) 
        {
            Animacion.bajar(-1000, 280, 0, 5, txttelefono2);
            Modic2=Modic2 + 1;
            if (Modic2==2) 
            {
                Animacion.bajar(-1000, 310, 0, 5, txttelefono3);

            }
        }
    }//GEN-LAST:event_MAS3MouseClicked

    private void MAS_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAS_3MouseClicked
        if (Modic3==0 || Modic3==1) 
        {
            Animacion.bajar(-1000, 280, 0, 5, txtcorreo2);
            Modic3=Modic3 + 1;
        }
        if (Modic3==2) 
            {
                Animacion.bajar(-1000, 310, 0, 5, txtcorreo3);

            }
    }//GEN-LAST:event_MAS_3MouseClicked

    private void txtcodigoproveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcodigoproveedorMouseExited
       
        
    }//GEN-LAST:event_txtcodigoproveedorMouseExited

    private void txtcedulaproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcedulaproveedorMouseClicked
        
    }//GEN-LAST:event_txtcedulaproveedorMouseClicked

    private void btn_modiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modiActionPerformed
        /*boton modificar*/
        
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        fechaexpira();
        conta=1;
        aString();
                     try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/consulta", "root", "root");
                Statement st = conexion.createStatement();
                
    int fila=jTable2.getSelectedRow();
    String cedula="";
    String idcorreo="";
    String idfax="";
    String idtelefono;
    String idfecha="";
    String txtcodigo=txtcodigoproveedor.getText();
    String txtnombre=txtnombreproveedor.getText();
    String txtactividad=txtactividadcomer.getText();
    String txtubicacion2=txtubicacion.getText();
    cedula=jTable2.getValueAt(fila,2).toString();
    idcorreo=jTable2.getValueAt(fila,5).toString();
    String txtcorreo12=txtcorreo1.getText(),txtcorreo22=txtcorreo2.getText(),txtcorreo32=txtcorreo3.getText();   
    idfax=jTable2.getValueAt(fila,9).toString();
    String txtfax12=txtfax1.getText(),txtfax22=txtfax2.getText(),txtfax32=txtfax3.getText();
    idtelefono=jTable2.getValueAt(fila,13).toString();
    String telefono1=txttelefono1.getText(),telefono2=txttelefono2.getText(),telefono3=txttelefono3.getText();
    
    idfecha=jTable2.getValueAt(fila,17).toString();
    String fechaingreso=fechain.getText(),fechaexpiracion=Fechaex.getText();
    
    
       // ResultSet rs =st.executeQuery("CALL consulta.Proveedoreditar('"+cedula+"','"+txtcodigo+"','"+txtnombre+"','"+txtdetalles+"','"+txtubicacion+"','"+txtactividad+"');");
        validar(conta);
                         if (campos==0) {
                                PreparedStatement pstsp=cn.prepareStatement("CALL consulta.Proveedoreditar('"+cedula+"','"+txtcodigo+"','"+txtnombre+"','"+txtubicacion2+"','"+txtactividad+"');");
                                pstsp.executeUpdate();        
                                PreparedStatement psts=cn.prepareStatement("CALL consulta.Correoseditar('"+idcorreo+"','"+txtcorreo12+"','"+txtcorreo22+"','"+txtcorreo32+"')");
                                psts.executeUpdate();
                                PreparedStatement pstss=cn.prepareStatement("CALL consulta.Faxeditar('"+idfax+"','"+txtfax12+"','"+txtfax22+"','"+txtfax32+"');");
                                pstss.executeUpdate();              
                                PreparedStatement pstsss=cn.prepareStatement("CALL consulta.Telefonoeditar('"+idtelefono+"','"+telefono1+"','"+telefono2+"','"+telefono3+"');");
                                pstsss.executeUpdate();                
                                PreparedStatement pstsssss=cn.prepareStatement("CALL consulta.Fechaseditar('"+idfecha+"','"+fechaingreso+"','"+fechaexpiracion+"');");
                                pstsssss.executeUpdate();                

                                        JOptionPane.showMessageDialog(rootPane, "MODIFICACION EXITOSA");
                         }
       
               

} catch (Exception e){
    JOptionPane.showMessageDialog(rootPane, "seleccione un proveedor");
}
        
    }//GEN-LAST:event_btn_modiActionPerformed

    private void txtcodigoproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcodigoproveedorMouseClicked
        
    }//GEN-LAST:event_txtcodigoproveedorMouseClicked

    private void txtnombreproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreproveedorMouseClicked
        
    }//GEN-LAST:event_txtnombreproveedorMouseClicked

    private void txtactividadcomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtactividadcomerMouseClicked
        
    }//GEN-LAST:event_txtactividadcomerMouseClicked

    private void txtfax1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfax1MouseClicked
        
    }//GEN-LAST:event_txtfax1MouseClicked

    private void txtubicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtubicacionMouseClicked
        
    }//GEN-LAST:event_txtubicacionMouseClicked

    private void btn_añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_añadirMouseClicked
        fechain.setText(fechaactual()); 
        fechaexpira();
        Animacion.bajar(40, 600, 0, 5, btn_añadir);
        Animacion.bajar(140,1000, 0, 5, jScrollPane1);
        Animacion.mover_derecha(-1000, 45, 0, 5, panel_añadir);
        Animacion.mover_derecha(-1000, 380, 0, 5, Añapro);
        Animacion.mover_izquierda(380, -1000, 0, 5, modipro);
        Animacion.mover_derecha(-1000, 700, 0, 5, btn_añade);
        Animacion.mover_izquierda(650,-1000, 0, 5, btn_modi);
        Animacion.subir(20, -50, 0, 5, Buscar);
        Animacion.subir(20, -50, 0, 5, btn_buscar2);
        Animacion.subir(60, -100, 0, 5, comboFiltro1);
        DatosAñadir();
        botones=1;
        valor = 2;
    }//GEN-LAST:event_btn_añadirMouseClicked

    public void mostrardatos(){
       // String valor1=txtbuscar.getText();
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/consulta", "root", "root");
                Statement st = conexion.createStatement();
                ResultSet rs =st.executeQuery("SELECT proveedor.Codigo_Proveedor,proveedor.Proveedor,proveedor.Cedula_Juridica,proveedor.Actividad,proveedor.Ubicacion,\n" +
"                      correo.Correo_1,correo.Correo_2,\n" +
"                        correo.Correo_3,fax.Fax_1,fax.Fax_2,\n" +
"                        fax.Fax_3,telefono.Telefono_1,telefono.Telefono_2,telefono.Telefono_3,\n" +
"                        fechas.Fecha_ingreso,fechas.Fecha_expira\n" +
"                        from proveedor,correo,fax,telefono,fechas\n" +
"                   where proveedor.id_proveedor\n" +
"                   and proveedor.id_corrreo=correo.id_correo and proveedor.id_fax=fax.id_fax and \n" +
"                        proveedor.id_telefono=telefono.id_telefono and \n" +
"                        proveedor.id_fechas=fechas.id_fechas");
                ResultSetMetaData rsmeta=rs.getMetaData();
                int numerocolumnas = rsmeta.getColumnCount();
                
                
                
                DefaultTableModel modelo= new DefaultTableModel();
                modelo.getColumnCount();
                this.jTable1.setModel(modelo);
                
                for (int x=1; x<=numerocolumnas; x++){
                    
                      modelo.addColumn(rsmeta.getColumnLabel(x));
                    
                    TableColumnModel columnModel = jTable1.getColumnModel();
                    for (int i = 0; i < columnModel.getColumnCount(); i++) {
                    columnModel.getColumn(i).setPreferredWidth(200);  
                    }
                                      
                    
                    }

                
                while (rs.next()) {
                  Object [] fila=new Object[numerocolumnas];
                  
                    for (int y=0; y<numerocolumnas; y++){
                    
                    fila [y]=rs.getObject(y+1);
                    
                }
                    modelo.addRow(fila);
                    
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void mostrar(){
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        String f1=txtfax1.getText(),f2=txtfax2.getText(),f3=txtfax3.getText();
        String c1=txtcorreo1.getText(),c2=txtcorreo2.getText(),c3=txtcorreo3.getText();
        String codigo=txtcodigoproveedor.getText(),proveedor=txtnombreproveedor.getText(),cedula=txtcedulaproveedor.getText(),actividad=txtactividadcomer.getText(),ubicacion=txtubicacion.getText();
        
        String fechaingreso=fechain.getText(),fechaexpira=Fechaex.getText();
        String telefono1=txttelefono1.getText(),telefono2=txttelefono2.getText(),telefono3=txttelefono3.getText();
           if (f1.equals("")&&f2.equals("")&&f3.equals("")){
            try{
                PreparedStatement pst=cn.prepareStatement("CALL consulta.Faxagregar('NO TIENE FAX','NO TIENE FAX','NO TIENE FAX');");
                pst.execute();
                //JOptionPane.showMessageDialog(rootPane, "registro exitoso");
            }catch(Exception e){
                System.out.print(e.getMessage());
            }
        }
        else
        {
            try{
                PreparedStatement pst=cn.prepareStatement("CALL consulta.Faxagregar('"+f1+"','"+f2+"','"+f3+"');");
                pst.execute();
                //JOptionPane.showMessageDialog(rootPane, "registro exitoso");
            }catch(Exception e){
                System.out.print(e.getMessage());
            }
        }

        if (c1.equals("")&&c2.equals("")&&c3.equals(""))
        {
            try{
                PreparedStatement pst=cn.prepareStatement("CALL consulta.Correosagregar(last_insert_id(),'NO TIENE CORREO','NO TIENE CORREO','NO TIENE CORREO');");
                pst.execute();
               // JOptionPane.showMessageDialog(rootPane, "registro exitoso");
            }catch(Exception e){
                System.out.print(e.getMessage());
            }
        }
        else
        {
            try
            {
                PreparedStatement pst=cn.prepareStatement("CALL consulta.Correosagregar(last_insert_id(),'"+c1+"','"+c2+"','"+c3+"');");
                pst.execute();
               // JOptionPane.showMessageDialog(rootPane, "registro exitoso");
            }catch(Exception e){
                System.out.print(e.getMessage());
            }
        }
        if (fechaingreso.equals("")&&fechaexpira.equals("")){
              try{
                PreparedStatement pst=cn.prepareStatement("CALL consulta.Fechasagregar(last_insert_id(),'2000/01/01','2000/02/02');");
                pst.execute();
              //  JOptionPane.showMessageDialog(rootPane, "registro exitoso");
            }catch(Exception e){
                System.out.print(e.getMessage());
            }
        }
        else
        {
            try{
                PreparedStatement pst=cn.prepareStatement("CALL consulta.Fechasagregar(last_insert_id(),'"+fechaingreso+"','"+fechaexpira+"');");
                pst.execute();
               // JOptionPane.showMessageDialog(rootPane, "registro exitoso");
            }catch(Exception e){
                System.out.print(e.getMessage());
            } 
        } 
        
        if (telefono1.equals("")&&telefono2.equals("")&&telefono3.equals("")){
            try{
                PreparedStatement pst=cn.prepareStatement("CALL consulta.Telefonoagregar(last_insert_id(),'NO TIENE TELEFONO','NO TIENE TELEFONO','NO TIENE TELEFONO');");
                pst.execute();
                //JOptionPane.showMessageDialog(rootPane, "registro exitoso");
            }catch(Exception e){
                System.out.print(e.getMessage());
            }
        }
        else
        {
            try{
                PreparedStatement pst=cn.prepareStatement("CALL consulta.Telefonoagregar(last_insert_id(),'"+telefono1+"','"+telefono2+"','"+telefono3+"');");
                pst.execute();
                //JOptionPane.showMessageDialog(rootPane, "registro exitoso");
            }catch(Exception e){
                System.out.print(e.getMessage());
                               }             
        }
        try{
            PreparedStatement pst=cn.prepareStatement("insert into proveedor (Codigo_Proveedor,Proveedor,Cedula_Juridica,Actividad,Ubicacion,id_corrreo,id_fax,id_fechas,id_telefono) values ('"+codigo+"','"+proveedor+"','"+cedula+"','"+actividad+"','"+ubicacion+"',last_insert_id(),last_insert_id(),last_insert_id(),last_insert_id())");
            pst.execute();
           JOptionPane.showMessageDialog(rootPane, "registro exitoso");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }    
        }
    
    public void mostrardatos2(){
        //String valor1=txtbuscar.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/consulta", "root", "root");
                Statement st = conexion.createStatement();
                ResultSet rs =st.executeQuery("SELECT proveedor.Codigo_Proveedor,proveedor.Proveedor,proveedor.Cedula_Juridica,proveedor.Actividad,proveedor.Ubicacion,\n" +
"                      correo.id_correo,correo.Correo_1,correo.Correo_2,\n" +
"                        correo.Correo_3,fax.id_Fax,fax.Fax_1,fax.Fax_2,\n" +
"                        fax.Fax_3,telefono.id_telefono,telefono.Telefono_1,telefono.Telefono_2,telefono.Telefono_3,\n" +
"                        fechas.id_fechas,fechas.Fecha_ingreso,fechas.Fecha_expira\n" +
"                        from proveedor,correo,fax,telefono,fechas\n" +
"                   where proveedor.id_proveedor\n" +
"                   and proveedor.id_corrreo=correo.id_correo and proveedor.id_fax=fax.id_fax and \n" +
"                        proveedor.id_telefono=telefono.id_telefono and \n" +
"                        proveedor.id_fechas=fechas.id_fechas");
                ResultSetMetaData rsmeta=rs.getMetaData();
                int numerocolumnas = rsmeta.getColumnCount();
                DefaultTableModel modelo= new DefaultTableModel();
                modelo.getColumnCount();
                this.jTable2.setModel(modelo);
                
                for (int x=1; x<=numerocolumnas; x++){
                    
                    modelo.addColumn(rsmeta.getColumnLabel(x));
                    
                    TableColumnModel columnModel = jTable2.getColumnModel();
                    for (int i = 0; i < columnModel.getColumnCount(); i++) {
                    columnModel.getColumn(i).setPreferredWidth(200);
                    }

                }
                while (rs.next()) {
                  Object [] fila=new Object[numerocolumnas];
                  
                    for (int y=0; y<numerocolumnas; y++){
                    fila [y]=rs.getObject(y+1);
                    
                }
                    modelo.addRow(fila);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtcorreo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcorreo1MouseClicked
        
        
    }//GEN-LAST:event_txtcorreo1MouseClicked

    private void txtcorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreo1ActionPerformed

    private void FechaexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaexMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaexMouseClicked

    private void txttelefono1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttelefono1MouseClicked
        
    }//GEN-LAST:event_txttelefono1MouseClicked

    private void fechainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechainMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fechainMouseClicked

    private void txtFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroMouseClicked
        
    }//GEN-LAST:event_txtFiltroMouseClicked

    private void txtFiltroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroMouseExited

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
            mostrardatos2();
            valor=4;
            Animacion.mover_derecha(-2000, 45, 0, 5, PanelModi);
            Animacion.bajar(170, 1000, 0, 5, jScrollPane1);
            Animacion.subir(20, -50, 0, 5, Buscar);
            Animacion.subir(20, -50, 0, 5, btn_buscar2);
            Animacion.subir(60, -100, 0, 5, comboFiltro1);
    }//GEN-LAST:event_ModificarMouseClicked
String id="";
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         int fila3=jTable2.getSelectedRow();
         int fila=jTable2.getSelectedRow();
         if(fila>=0 || fila3>=0){
        String Nombrepro="";
        Nombrepro=jTable2.getValueAt(fila3,1).toString();
        int opt=JOptionPane.showConfirmDialog(rootPane,"Desea modificar el proveedor: "+Nombrepro+"");
        if (opt==0) {
        valor=5;
        Animacion.bajar(40, 600, 0, 5, btn_añadir);
        Animacion.bajar(140,1000, 0, 5, jScrollPane1);
        Animacion.mover_derecha(-1000, 45, 0, 5, panel_añadir);
        Animacion.mover_derecha(-1000, 380, 0, 5, modipro);
        Animacion.mover_izquierda(380, -1000, 0, 5, Añapro);
        Animacion.mover_izquierda(700, -1000, 0, 5, btn_añade);
        Animacion.mover_derecha(-1000, 650, 0, 5, btn_modi);
        Animacion.mover_izquierda(45, -2000, 0, 5, PanelModi);
        Animacion.bajar(-1000, 310, 0, 5, txtfax3);
        Animacion.bajar(-1000, 280, 0, 5, txtfax2);
        Animacion.bajar(-1000, 280, 0, 5, txttelefono2);
        Animacion.bajar(-1000, 310, 0, 5, txttelefono3);
        Animacion.bajar(-1000, 280, 0, 5, txtcorreo2);
        Animacion.bajar(-1000, 310, 0, 5, txtcorreo3);
        

    if(fila>=0){
         txtcodigoproveedor.setText(jTable2.getValueAt(fila,0).toString());
         txtnombreproveedor.setText(jTable2.getValueAt(fila,1).toString());
         txtcedulaproveedor.setText(jTable2.getValueAt(fila,2).toString());
         txtactividadcomer.setText(jTable2.getValueAt(fila,3).toString());
         txtubicacion.setText(jTable2.getValueAt(fila,4).toString());
         txtcorreo1.setText(jTable2.getValueAt(fila,6).toString());
         txtcorreo2.setText(jTable2.getValueAt(fila,7).toString());
         txtcorreo3.setText(jTable2.getValueAt(fila,8).toString());
         txtfax1.setText(jTable2.getValueAt(fila,10).toString());
         txtfax2.setText(jTable2.getValueAt(fila,11).toString());
         txtfax3.setText(jTable2.getValueAt(fila,12).toString());
         txttelefono1.setText(jTable2.getValueAt(fila,14).toString());
         txttelefono2.setText(jTable2.getValueAt(fila,15).toString());
         txttelefono3.setText(jTable2.getValueAt(fila,16).toString());
         fechain.setText(jTable2.getValueAt(fila,18).toString());
         Fechaex.setText(jTable2.getValueAt(fila,19).toString());      
         id = jTable2.getValueAt(fila,2).toString();          
             }
         else{
         JOptionPane.showMessageDialog(null,"No se encontro fila");
             } 
             }
         }else{
             JOptionPane.showMessageDialog(rootPane, "No seleccionó ningún proveedor");
         }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        int fila3=jTable2.getSelectedRow();
        int fila=jTable2.getSelectedRow();
        if(fila>=0 || fila3>=0){
            
        String Nombrepro="";
        Nombrepro=jTable2.getValueAt(fila3,1).toString();
        int opt=JOptionPane.showConfirmDialog(rootPane,"Desea eliminar el proveedor: "+Nombrepro+"");
        
             
        if (opt==0) {
            conectar cc=new conectar();
            Connection cn=cc.conexion();     
            String cedula="";
            String idcorreo="";
            String idfax="";
            String idtelefono;
            cedula=jTable2.getValueAt(fila,2).toString();
            idcorreo=jTable2.getValueAt(fila,6).toString();
            idfax=jTable2.getValueAt(fila,10).toString();
            idtelefono=jTable2.getValueAt(fila,14).toString();
            try{
                if (cedula.equals("")){
                    JOptionPane.showMessageDialog(rootPane, "El proveedor no tiene cedula");
                }else{
            PreparedStatement pst=cn.prepareStatement("DELETE FROM proveedor WHERE Cedula_Juridica='"+cedula+"'");
            pst.executeUpdate();
            PreparedStatement psts=cn.prepareStatement("DELETE FROM correo WHERE id_correo='"+idcorreo+"'");
            psts.executeUpdate();
            PreparedStatement pstss=cn.prepareStatement("DELETE FROM fax WHERE id_fax='"+idfax+"'");
            pstss.executeUpdate();
            PreparedStatement pstsss=cn.prepareStatement("DELETE FROM telefono WHERE id_telefono='"+idtelefono+"'");
            pstsss.executeUpdate();
            mostrardatos2();
                }
            } catch (Exception e){
                     
            }  
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "ningún proveedor seleccionado");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER) {
            btn_buscar1.doClick();
            
        }
            
        

        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void fechainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechainActionPerformed

    private void FechaexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaexActionPerformed

    private void regresar_modiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresar_modiMouseClicked
        mostrardatos();
        txtFiltro.setText("");
        Animacion.subir(600, 30, 0, 5, btn_añadir);
        mostrardatos2();
        valor=1;
        Animacion.bajar(-100, 60, 0, 5, comboFiltro1);
        Animacion.mover_izquierda(45, -2000, 0, 5, PanelModi);
        Animacion.subir(1000, 110, 0, 5, jScrollPane1);
        Animacion.bajar(-50, 20, 0, 5, Buscar);
        Animacion.bajar(-50, 20, 0, 5, btn_buscar2);
    }//GEN-LAST:event_regresar_modiMouseClicked

    private void jSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalirMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrardatos2();
        txtFiltro.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar1ActionPerformed
        String option="";
        if (comboFiltro.getSelectedItem() == "Codigo") {
            option="proveedor.Codigo_Proveedor";
        }
        if (comboFiltro.getSelectedItem().toString() == "Proveedor") {
           option="proveedor.Proveedor";
        }
        if (comboFiltro.getSelectedItem() == "Actividad/servicio") {
            option="proveedor.Actividad";
        }
        String valor1=txtFiltro.getText();
        buscarp(option, valor1);
        
    }//GEN-LAST:event_btn_buscar1ActionPerformed

    private void jEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnterActionPerformed
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        
        String user =userText.getText();
        String pass=jPassword.getText();
        String sql="SELECT * FROM usuario WHERE (Nombre='"+user+"'  AND Contraseña='"+pass+"')";
              
            Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if (rs.next()) 
            {
                
                mostrardatos();
                Animacion.mover_izquierda(90, -120, 7, 5, jEnter);
                Animacion.mover_derecha(-120, 90, 7, 5, jSalir);
                Animacion.mover_izquierda(30, -290, 7, 5, panel_datos );
                Animacion.mover_derecha(-290, 10, 7, 10, panel_user);
                Animacion.subir(600, 30, 0, 5, btn_añadir);
                Animacion.subir(1000, 110, 0, 5, jScrollPane1);
                Animacion.bajar(-100, 20, 0, 5, Buscar);
                Animacion.bajar(-100, 20, 0, 5, btn_buscar2);
                Animacion.bajar(-100, 60, 0, 5, comboFiltro1);
                
                /*esconder panel de login*/
        int posicion = jEnter.getX();
        if (posicion==90) 
        {
            Animacion.mover_izquierda(0, -300, 7, 5, jPanelLogin);
            Animacion.mover_izquierda(310, 7, 7, 5, jMenu);
            Animacion.mover_derecha(80, 1600, 7, 10, jPanelEsc);
            valor=1;
        }
             /* JOptionPane.showMessageDialog(rootPane, "correcto");*/
            }else
            {
                JOptionPane.showMessageDialog(rootPane, "Datos Incorrecto");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jEnterActionPerformed

    private void userTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTextKeyTyped
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER) {
            jEnter.doClick();
        }
    }//GEN-LAST:event_userTextKeyTyped

    private void jPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyTyped
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER) {
            jEnter.doClick();
        }
    }//GEN-LAST:event_jPasswordKeyTyped

    private void btn_buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar2ActionPerformed
        String options="";
      
        if (comboFiltro1.getSelectedItem() == "Codigo") {
            options="proveedor.Codigo_Proveedor";
        }
        if (comboFiltro1.getSelectedItem().toString() == "Proveedor") {
           options="proveedor.Proveedor";
        }
        if (comboFiltro1.getSelectedItem() == "Actividad/servicio") {
            options="proveedor.Actividad";
        }
        String valor2=Buscar.getText();
        buscarpro(options, valor2);
        
    }//GEN-LAST:event_btn_buscar2ActionPerformed

    private void BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyTyped
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER) {
            btn_buscar2.doClick();
            
        }
    }//GEN-LAST:event_BuscarKeyTyped

   
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Act;
    private javax.swing.JLabel Añapro;
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JTextField Buscar;
    private javax.swing.JTextField Fechaex;
    private javax.swing.JLabel LogoMuni;
    private javax.swing.JLabel MAS1;
    private javax.swing.JLabel MAS3;
    private javax.swing.JLabel MAS_3;
    private javax.swing.JLabel Modificar;
    private javax.swing.JPanel PanelModi;
    private javax.swing.JLabel Passw;
    private javax.swing.JLabel User1;
    private javax.swing.JButton btn_añade;
    private javax.swing.JLabel btn_añadir;
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JButton btn_buscar2;
    private javax.swing.JButton btn_modi;
    private javax.swing.JButton btn_regresa;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel cerrar;
    private javax.swing.JComboBox comboFiltro;
    private javax.swing.JComboBox comboFiltro1;
    private javax.swing.JLabel fax;
    private javax.swing.JTextField fechain;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel icono_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanelEsc;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPanel jPrincipal;
    private javax.swing.JLabel jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel modipro;
    private javax.swing.JPanel panel_añadir;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panel_user;
    private javax.swing.JLabel regresar_modi;
    private javax.swing.JLabel tel;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtactividadcomer;
    private javax.swing.JTextField txtcedulaproveedor;
    private javax.swing.JTextField txtcodigoproveedor;
    private javax.swing.JTextField txtcorreo1;
    private javax.swing.JTextField txtcorreo2;
    private javax.swing.JTextField txtcorreo3;
    private javax.swing.JTextField txtfax1;
    private javax.swing.JTextField txtfax2;
    private javax.swing.JTextField txtfax3;
    private javax.swing.JTextField txtnombreproveedor;
    private javax.swing.JTextField txttelefono1;
    private javax.swing.JTextField txttelefono2;
    private javax.swing.JTextField txttelefono3;
    private javax.swing.JTextField txtubicacion;
    private javax.swing.JLabel ubi;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables

    private void DatosAñadir() {
        PromptSupport.setPrompt("1-234-56789", txtcedulaproveedor);
        PromptSupport.setPrompt("Codigo proveedor", txtcodigoproveedor);
        PromptSupport.setPrompt("Proveedor", txtnombreproveedor);
        PromptSupport.setPrompt("A que se dedican", txtactividadcomer);
        PromptSupport.setPrompt("12345678", txtfax1);
        PromptSupport.setPrompt("12345678", txttelefono1);
        PromptSupport.setPrompt("Ejemplo@ejemplo.com", txtcorreo1);
        PromptSupport.setPrompt("Donde se localizan", txtubicacion);
        
       }

    private void vaciar() {
        txttelefono2.setText("");
        txttelefono3.setText("");
        txtfax2.setText("");
        txtfax3.setText("");
        txtcorreo2.setText("");
        txtcorreo3.setText("");
        txtcodigoproveedor.setText("");
        txtcedulaproveedor.setText("");
        txtnombreproveedor.setText("");
        txtactividadcomer.setText("");
        txtcorreo1.setText("");
        txtfax1.setText("");
        txttelefono1.setText("");
        txtubicacion.setText("");
    }

    private void aString() {
        cedulatxt=txtcedulaproveedor.getText();
        correotxt=txtcorreo1.getText();
        teltxt=txttelefono1.getText();
        faxtxt=txtfax1.getText();
        ubicatxt=txtubicacion.getText();
        codprotxt=txtcodigoproveedor.getText();
        nomprotxt=txtnombreproveedor.getText();
        
    }

    private void validar(int val) {
        if (cedulatxt.equals("")){
        JOptionPane.showMessageDialog(rootPane, "Dato importante \n Cedula no digitada \n Por favor digite la cedula:");     
        campos=1;
        }
        else{
            if (nomprotxt.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Dato importante \n Nombre no digitado \n Por favor digite el Nombre:");
                campos=1;
            } else {
                if (codprotxt.equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Dato importante \n Código del proveedor no digitado \n Por favor digite el código:");
                    campos=1;
                } else {
                    if (teltxt.equals("")) {
                        JOptionPane.showMessageDialog(rootPane, "Dato importante \n teléfono no digitado \n Por favor digite el teléfono:");
                        campos=1;
                    } else {
                        if (faxtxt.equals("")) {
                            JOptionPane.showMessageDialog(rootPane, "Dato importante \n Fax no digitado \n Por favor digite el fax:");
                            campos=1;
                        } else {
                            if (ubicatxt.equals("")) {
                                JOptionPane.showMessageDialog(rootPane, "Dato importante \n Ubicacion no digitada \n Por favor digite la ubicación:");
                                campos=1;
                            } else {
                                if (correotxt.equals("")) {
                                    JOptionPane.showMessageDialog(rootPane, "Dato importante \n Correo no digitado \n Por favor digite el correo:");
                                    campos=1;
                                } else {
                                    if (conta==0) {
                                            mostrar();
                                            vaciar();
                                        }else{
                                            campos=0;
                                        }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void buscarp(String option, String valor1) {
        if (valor1.equals("")) {
            mostrardatos2();
        }
        else{
            if (String.valueOf(txtFiltro.getText().charAt(0)).equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "En la búsqueda su primer caracter es un espacio");
            
        }
        else
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/consulta", "root", "root");
                Statement st = conexion.createStatement();
                //ResultSet rs =st.executeQuery("SELECT * FROM proveedor WHERE (id_proveedor='"+valor1+"'OR ubicacion='"+valor1+"')");
                ResultSet rs =st.executeQuery("SELECT proveedor.Codigo_Proveedor,proveedor.Proveedor,proveedor.Cedula_Juridica,proveedor.Actividad,proveedor.Ubicacion,\n" +
"                      correo.id_correo,correo.Correo_1,correo.Correo_2,\n" +
"                        correo.Correo_3,fax.id_Fax,fax.Fax_1,fax.Fax_2,\n" +
"                        fax.Fax_3,telefono.id_telefono,telefono.Telefono_1,telefono.Telefono_2,telefono.Telefono_3,\n" +
"                        fechas.id_fechas,fechas.Fecha_ingreso,fechas.Fecha_expira\n" +
"                        from proveedor,correo,fax,telefono,fechas\n" +
"                   where "+option+" LIKE '%"+valor1+"%' \n" +
"                   and proveedor.id_corrreo=correo.id_correo and proveedor.id_fax=fax.id_fax and \n" +
"                        proveedor.id_telefono=telefono.id_telefono and \n" +
"                        proveedor.id_fechas=fechas.id_fechas");
                ResultSetMetaData rsmeta=rs.getMetaData();
                
              
                
                
                int numerocolumnas = rsmeta.getColumnCount();
                
                DefaultTableModel modelo= new DefaultTableModel();
                this.jTable2.setModel(modelo);
                
                for (int x=1; x<=numerocolumnas; x++){
                                                     
                    modelo.addColumn(rsmeta.getColumnLabel(x));  
                     TableColumnModel columnModel = jTable2.getColumnModel();
                    for (int i = 0; i < columnModel.getColumnCount(); i++) {
                    columnModel.getColumn(i).setPreferredWidth(200);
                    }
                }
                while (rs.next()) {
                  Object [] fila=new Object[numerocolumnas];
                  
                    for (int y=0; y<numerocolumnas; y++){
                    
                    fila [y]=rs.getObject(y+1);
                    
                }
                    modelo.addRow(fila);
                    
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        } 
    }

    private void buscarpro(String option, String valor1) {
    
        if (valor1.equals("")) {
            mostrardatos();
        }
        else{
            if (String.valueOf(Buscar.getText().charAt(0)).equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "En la búsqueda su primer caracter es un espacio");
            
        }
        else
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/consulta", "root", "root");
                Statement st = conexion.createStatement();
                //ResultSet rs =st.executeQuery("SELECT * FROM proveedor WHERE (id_proveedor='"+valor1+"'OR ubicacion='"+valor1+"')");
                ResultSet rs =st.executeQuery("SELECT proveedor.Codigo_Proveedor,proveedor.Proveedor,proveedor.Cedula_Juridica,proveedor.Actividad,proveedor.Ubicacion,\n" +
"                      correo.Correo_1,correo.Correo_2,\n" +
"                        correo.Correo_3,fax.Fax_1,fax.Fax_2,\n" +
"                        fax.Fax_3,telefono.Telefono_1,telefono.Telefono_2,telefono.Telefono_3,\n" +
"                        fechas.Fecha_ingreso,fechas.Fecha_expira\n" +
"                        from proveedor,correo,fax,telefono,fechas\n" +
"                   where "+option+" LIKE '%"+valor1+"%' \n" +
"                   and proveedor.id_corrreo=correo.id_correo and proveedor.id_fax=fax.id_fax and \n" +
"                        proveedor.id_telefono=telefono.id_telefono and \n" +
"                        proveedor.id_fechas=fechas.id_fechas");
                ResultSetMetaData rsmeta=rs.getMetaData();
                
              
                
                
                int numerocolumnas = rsmeta.getColumnCount();
                
                DefaultTableModel modelo= new DefaultTableModel();
                this.jTable1.setModel(modelo);
                
                for (int x=1; x<=numerocolumnas; x++){
                                                     
                    modelo.addColumn(rsmeta.getColumnLabel(x));  
                     TableColumnModel columnModel = jTable1.getColumnModel();
                    for (int i = 0; i < columnModel.getColumnCount(); i++) {
                    columnModel.getColumn(i).setPreferredWidth(200);
                    }
                }
                while (rs.next()) {
                  Object [] fila=new Object[numerocolumnas];
                  
                    for (int y=0; y<numerocolumnas; y++){
                    
                    fila [y]=rs.getObject(y+1);
                    
                }
                    modelo.addRow(fila);
                    
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }
    }
    
}
