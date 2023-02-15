package com.example.ajj.sgeajj;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.util.Callback;


import java.io.FileOutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;


import com.itextpdf.text.Document;


import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;

import javax.swing.*;


public class HelloController implements Initializable {

    public Button btVolverAInicio11;
    public Button btimprimirFacVenta;
    public Button btimprimirFacComp;
    @FXML
    private ComboBox<String> cbProveedorProd;
    public Button btElimProducto;
    public Button btCrearProducto;
    public Button btNuevoProducto;
    public Button btNuevoProducto1;
    public Button btIngresaComp;
    public Button btModiCompra;
    public Button btElimCompra;
    public Button btFacturaVolver;
    public Button btVolverAInicio;
    public Button bImprimirFactura;
    public ImageView iRImagen11;
    public ImageView iRImagen1;
    public Button btVolverAInicio1;
    private int idFactura;


    @FXML
    private Button bAnadeProducto;

    @FXML
    private Button bCrearCompra;

    @FXML
    private Button bCrearFactura;

    @FXML
    private Button bCrearProducto;

    @FXML
    private DatePicker bEntregaEsperada;

    @FXML
    private DatePicker bFechaLim;

    @FXML
    private ImageView bICompras;

    @FXML
    private ImageView bIFacturas;

    @FXML
    private ImageView bIInventario;


    @FXML
    private FlowPane fpBasesDatos;

    @FXML
    private ImageView bIVentas;

    @FXML
    private Button bRRegistro;

    @FXML
    private Button bSIniSesion;

    @FXML
    private Button bSRegistro;

    @FXML
    private Button bVerFactura;

    @FXML
    private Button bVerProducto;

    @FXML
    private Button btCrearBaseDatos;

    @FXML
    private TextField txfCantidadCompra;

    @FXML
    private TextField txfEtiquetaCompra;
    @FXML
    private Label lbSubtotalCompra;
    @FXML
    private TextField txfPrecioCompra;

    @FXML
    private ComboBox<String> cbProductoCompra;

    @FXML
    private Label lbBienvenidaUsuario;

    @FXML
    private Label lbNombreBaseDatos;

    @FXML
    private Pane pPrincipalUsuario;

    @FXML
    private ComboBox<String> cbProveedorCompra;

    @FXML
    private DatePicker dpFechaLimCompra;
    @FXML
    private DatePicker dpEntregaEspCompra;
    @FXML
    private ImageView iRImagen;

    @FXML
    private ImageView iRImagen112;

    @FXML
    private ImageView iRImagen1121;

    @FXML
    private ImageView iRImagen12;

    @FXML
    private ImageView iSImagen;

    @FXML
    private ImageView iSImagen1;

    @FXML
    private Label lBEmpresa;
    @FXML
    private ComboBox<String> cbImpuestoCompra;
    @FXML
    private Label lBEmpresa1;

    @FXML
    private Pane pAnadeProducto;

    @FXML
    private Pane pBotones;

    @FXML
    private Pane pCompras;

    @FXML
    private Pane pCrearCompra;

    @FXML
    private Pane pVentas;

    @FXML
    private Pane pInventario;

    @FXML
    private Pane pRegistro;

    @FXML
    private Pane pSesion;

    @FXML
    private RadioButton rbCompras;

    @FXML
    private RadioButton rbFacturacion;

    @FXML
    private RadioButton rbInventario;

    @FXML
    private RadioButton rbVentas;

    @FXML
    private TableView<ObservableList> tCCompras;

    @FXML
    private TextField txfCantidad;

    @FXML
    private DatePicker dPEntregaEsperada;

    @FXML
    private DatePicker dPFechaLim;

    @FXML
    private TextField txfProducto;

    @FXML
    private TextField txfProveedor;

    @FXML
    private TextField txfApellidoRegistro;

    @FXML
    private TextField txfCorreoRegistro;

    @FXML
    private TextField txfDniRegistro;

    @FXML
    private TextField txfEmpresaRegistro;

    @FXML
    private DatePicker dpFecNaRegistro;
    @FXML
    private TextField txfUsuarioRegistro;
    @FXML
    private TextField txfNombreRegistro;
    @FXML
    private TextField txfPwdRegistro;
    @FXML
    private TextField txfVentaCreaCantidad;

    @FXML
    private TextField txfVentaCreaEtiqueta;

    @FXML
    private TextField txfIdVenta;

    @FXML
    private TextField txfVentaCreaImpuestos;

    @FXML
    private TextField txfVentaCreaPrecio;

    @FXML
    private ComboBox<String> cbProductoVenta;

    @FXML
    private TextField txfFacturaCreaSubtotal;


    @FXML
    private TextField tSUsuario;

    @FXML
    private TableView<ObservableList> tablaVentas;


    @FXML
    private TableView<ObservableList> tablaInventario;

    @FXML
    private TableView<ObservableList> tableFacCompras;

    @FXML
    private TableView<ObservableList> tableFacVentas;

    @FXML
    private Pane pCreaBaseDeDatos;

    @FXML
    private TextField txfNombreBaseDatos;

    @FXML
    private Button btFacturaCalculaSTotal;

    @FXML
    private TextField txfIdCompra;
    @FXML
    private Label lbFacturaSubTotal;
    @FXML
    private Button btFacturaCrearFac;

    @FXML
    private Button btModiProducto;


    @FXML
    private Button btFacturaElimFac;

    @FXML
    private Button btFacturaModiFac;
    @FXML
    private TextField txfIdProducto;
    @FXML
    private Pane pCrearVentas;
    @FXML
    private ComboBox<String> cbImpuestosVenta;
    @FXML
    private TextField txfNombreFactura;

    @FXML
    private Pane pFacturas;

    @FXML
    private PasswordField tSContrase;

    private String usuarioActual;

    private String nombreBaseDatos;



    @FXML
    void CrearBaseDatos(ActionEvent event) {
        nombreBaseDatos = JOptionPane.showInputDialog("Introduce el nombre de la base de datos");

        try {
            String sql = "CREATE DATABASE " + " " + nombreBaseDatos;
            PreparedStatement encapsulaPSCons = conBD().prepareStatement(sql);
            ResultSet rs = encapsulaPSCons.executeQuery();


            CrearTablaCompra(nombreBaseDatos);


            rs.close();
            conBD().close();
            insertaPanelBaseDatos(nombreBaseDatos);
            insertaBaseDatos(nombreBaseDatos);

            pCreaBaseDeDatos.setVisible(false);
            pPrincipalUsuario.setVisible(true);



        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void muestraPanel() {
        pPrincipalUsuario.setVisible(false);
        pCreaBaseDeDatos.setVisible(true);
    }

    void CargaDatos () throws SQLException, ClassNotFoundException {

        nombreBaseDatos = lbNombreBaseDatos.getText();
        construyeDatos("ventas", tablaVentas,nombreBaseDatos);
        construyeDatos("productos", tablaInventario,nombreBaseDatos);
        construyeDatos("compras", tCCompras,nombreBaseDatos);

        construyeDatos2("facturas", tableFacVentas,nombreBaseDatos);
        construyeDatos3("facturas", tableFacCompras,nombreBaseDatos);
        datosProductoFacComboB(nombreBaseDatos);
        datosImpuestoFacComboB(nombreBaseDatos);
        datosProveedorFacComboB(nombreBaseDatos);

    }

    void CrearTablaCompra(String nombreTabla) {
        try {
            Connection connection = conBDPersonalizada(nombreTabla);
            Statement st = connection.createStatement();
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `impuestos` (\n" +
                    "  `idImpuesto` int(11) NOT NULL AUTO_INCREMENT,\n" +
                    "  `nomImpuesto` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,\n" +
                    "  `porcenImp` double DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`idImpuesto`)\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;");
            st.executeUpdate("INSERT INTO `impuestos` (`idImpuesto`, `nomImpuesto`, `porcenImp`) VALUES\n" +
                    "\t(1, 'IVA', 0.2);");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `proveedor` (\n" +
                    "  `idproveedor` int(11) NOT NULL,\n" +
                    "  `nombreProveedor` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`idproveedor`)\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;\n");
            st.executeUpdate("INSERT INTO `proveedor` (`idproveedor`, `nombreProveedor`) VALUES\n" +
                    "\t(1, 'Pakeko');");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `productos` (\n" +
                    "  `idproducto` int(11) NOT NULL AUTO_INCREMENT,\n" +
                    "  `idProveedor` int(11) NOT NULL,\n" +
                    "  `pNombre` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,\n" +
                    "  `cantidad` int(11) DEFAULT NULL,\n" +
                    "  `fechaLimite` date DEFAULT NULL,\n" +
                    "  `entregaEsperada` date DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`idproducto`),\n" +
                    "  KEY `idproveedor` (`idProveedor`),\n" +
                    "  CONSTRAINT `idproveedor` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idproveedor`) ON DELETE CASCADE ON UPDATE CASCADE\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `ventas` (\n" +
                    "  `idventas` int(11) NOT NULL,\n" +
                    "  `idproducto` int(11) NOT NULL DEFAULT 0,\n" +
                    "  `cantidad` double NOT NULL DEFAULT 0,\n" +
                    "  `impuestos` double NOT NULL DEFAULT 0,\n" +
                    "  `etiqueta` varchar(50) COLLATE latin1_spanish_ci NOT NULL DEFAULT '0',\n" +
                    "  `precio` double NOT NULL DEFAULT 0,\n" +
                    "  `subtotal` double NOT NULL DEFAULT 0,\n" +
                    "  PRIMARY KEY (`idventas`) USING BTREE,\n" +
                    "  KEY `FK_facturas_impuestos` (`impuestos`),\n" +
                    "  KEY `idproducto` (`idproducto`),\n" +
                    "  CONSTRAINT `idproducto` FOREIGN KEY (`idproducto`) REFERENCES `productos` (`idproducto`) ON DELETE CASCADE ON UPDATE CASCADE\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;\n");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `compras` (\n" +
                    "  `idcompras` int(11) NOT NULL AUTO_INCREMENT,\n" +
                    "  `idproveedor` int(11) DEFAULT NULL,\n" +
                    "  `idproducto` int(11) DEFAULT NULL,\n" +
                    "  `idimpuesto` double DEFAULT NULL,\n" +
                    "  `cantidad` int(11) DEFAULT NULL,\n" +
                    "  `etiqueta` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,\n" +
                    "  `precio` int(11) DEFAULT NULL,\n" +
                    "  `subtotal` int(11) DEFAULT NULL,\n" +
                    "  `fechaLim` date DEFAULT NULL,\n" +
                    "  `entregaEsp` date DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`idcompras`),\n" +
                    "  KEY `FK_compras_impuestos` (`idimpuesto`),\n" +
                    "  KEY `FK_compras_productos` (`idproducto`),\n" +
                    "  KEY `FK_compras_proveedor` (`idproveedor`),\n" +
                    "  CONSTRAINT `FK_compras_productos` FOREIGN KEY (`idproducto`) REFERENCES `productos` (`idproducto`) ON DELETE CASCADE ON UPDATE CASCADE,\n" +
                    "  CONSTRAINT `FK_compras_proveedor` FOREIGN KEY (`idproveedor`) REFERENCES `proveedor` (`idproveedor`) ON DELETE CASCADE ON UPDATE CASCADE\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `facturas` (\n" +
                    "  `idfactura` int(11) NOT NULL AUTO_INCREMENT,\n" +
                    "  `idventa` int(11) DEFAULT NULL,\n" +
                    "  `idcompra` int(11) DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`idfactura`) USING BTREE,\n" +
                    "  KEY `FK__ventas` (`idventa`),\n" +
                    "  KEY `FK__ventas_2` (`idcompra`) USING BTREE,\n" +
                    "  CONSTRAINT `FK__ventas` FOREIGN KEY (`idventa`) REFERENCES `ventas` (`idventas`) ON DELETE CASCADE ON UPDATE CASCADE,\n" +
                    "  CONSTRAINT `FK_facturas_compras` FOREIGN KEY (`idcompra`) REFERENCES `compras` (`idcompras`) ON DELETE CASCADE ON UPDATE CASCADE\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;");


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static Connection conBD() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bd_gestion_erp",
                "root", "root");
        return con;

    }


    public void login() {
        if (devuelveUsuarios() && devuelvepassword()) {
            usuarioActual = tSUsuario.getText();
            lbBienvenidaUsuario.setText(usuarioActual);
            pPrincipalUsuario.setVisible(true);
            pSesion.setVisible(false);
            creaPanalesUsuario();
        } else {
            System.out.println("Usuario o contraseña erroneos");
        }
        System.out.println("El usuario es: " + devuelveUsuarios());
        System.out.println("La contraseña es: " + devuelvepassword());
    }

    private Pane insertaPanelBaseDatos(String dis) {
        /**
         * Método que añade imágenes
         * al panel a través de una consulta externa
         */
        //Seteando Textos
        Label label = new Label(dis);

        //Creando VBox
        GridPane gridPane = new GridPane();
        Pane pane = new Pane();
        VBox imagBox = new VBox();
        VBox tituBox = new VBox();
        VBox geneVBox = new VBox();
        pane.setPrefWidth(600);
        pane.setId("panelesBaseDatos");

        tituBox.getChildren().add(label);
        geneVBox.getChildren().addAll(imagBox, tituBox);
        pane.getChildren().add(geneVBox);
        pane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.getChildren().add(pane);

        muestraDatos(pane, dis);
        //Añadiendo a panel
        fpBasesDatos.getChildren().add(gridPane);
        return pane;
    }


    public int devuelveIdUsuario() {
        Statement statement;
        ResultSet resultSet;
        int idUsuarioObtenido = 0;
        try {
            Connection co = conBD();
            statement = co.createStatement();
            resultSet = statement.executeQuery("SELECT idUsuario FROM usuarios WHERE nomUsuario = " + "'" + usuarioActual + "'");

            while (resultSet.next()) {
                idUsuarioObtenido = resultSet.getInt("idUsuario");
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return idUsuarioObtenido;
    }

    public void creaPanalesUsuario() {
        Statement statement;
        ResultSet resultSet;
        String basesDatos;
        try {
            Connection co = conBD();
            statement = co.createStatement();
            resultSet = statement.executeQuery("SELECT nombre FROM basesdedatos WHERE idUsuario IN (SELECT idUsuario FROM usuarios WHERE nomUsuario = " + "'" + usuarioActual + "')");

            while (resultSet.next()) {
                basesDatos = resultSet.getString("nombre");

                insertaPanelBaseDatos(basesDatos);
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean devuelveUsuarios() {
        Statement statement;
        ResultSet resultSet;
        String usurioObtenido;
        try {
            Connection co = conBD();
            statement = co.createStatement();
            resultSet = statement.executeQuery("SELECT nomUsuario FROM usuarios ");
            while (resultSet.next()) {
                usurioObtenido = resultSet.getString("nomUsuario");
                System.out.println(usurioObtenido);
                if (usurioObtenido.equals(tSUsuario.getText())) {
                    return true;
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean compruebaUSuarios() {
        Statement statement;
        ResultSet resultSet;
        String usurioObtenido;
        boolean bandera = false;
        try {
            Connection co = conBD();
            statement = co.createStatement();
            resultSet = statement.executeQuery("SELECT nomUsuario FROM usuarios ");
            while (resultSet.next()) {
                usurioObtenido = resultSet.getString("nomUsuario");
                System.out.println(usurioObtenido);
                if (usurioObtenido.equals(txfUsuarioRegistro.getText())) {
                    JOptionPane.showMessageDialog(null, "Nombre de usuario ya existe");
                    bandera = false;
                    break;
                } else {
                    bandera = true;
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return bandera;
    }

    public boolean devuelvepassword() {
        Statement statement;
        ResultSet resultSet;
        String passObtenida;
        try {
            Connection co = conBD();
            statement = co.createStatement();
            resultSet = statement.executeQuery("SELECT pwd FROM usuarios WHERE nomUsuario = " + "'" + tSUsuario.getText() + "'");
            while (resultSet.next()) {
                passObtenida = resultSet.getString("pwd");

                if (passObtenida.equals(tSContrase.getText())) {
                    return true;
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    /**
     * Método que muestra los datos del libro
     * seleccionado en el panel donde se muestra
     */
    private void muestraDatos(Pane pane, String nombreBaseDatos) {


        //Cambiando a panel informacion
        pane.setOnMouseClicked(e -> {
            pPrincipalUsuario.setVisible(false);
            lbNombreBaseDatos.setText(nombreBaseDatos);
            pBotones.setVisible(true);
            try {
                CargaDatos();
            } catch (SQLException | ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        });
    }

    @FXML
    void cambiaPanelRegistro() {
        pSesion.setVisible(false);
        pRegistro.setVisible(true);
    }

    @FXML
    void cambiaPanelSesion() {
        pSesion.setVisible(true);
        pRegistro.setVisible(false);
    }

    @FXML
    void salirRegistro() {
        pSesion.setVisible(true);
        pRegistro.setVisible(false);
    }

    @FXML
    void salirPresupuesto() {
        pCompras.setVisible(true);
        pCrearCompra.setVisible(false);
    }

    @FXML
    void volverSesion() {
        pSesion.setVisible(true);
        pBotones.setVisible(false);
    }


    void insertaBaseDatos(String nomBaseDatos) throws SQLException, ClassNotFoundException {
        Connection co = conBD();
        try {

            PreparedStatement ps = co.prepareStatement("INSERT INTO basesdedatos VALUES (NULL,?,?)");
            ps.setString(1, nomBaseDatos);
            ps.setInt(2, devuelveIdUsuario());
            ps.executeUpdate();

            ps.close();
            co.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    /**
     * Método que recoge datos del panel
     * para añadirlos a la base de datos
     *
     * @param event
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @FXML
    void mCreaUsuario(ActionEvent event ) throws SQLException, ClassNotFoundException {
        String nombre;
        String apellidos;
        String email;
        String nomUsuario;
        Date fechaNac;
        String empresa;
        String dni;
        String pwd;
        Connection co = conBD();
        if (revisaDatosUsuario()) {

            try {
                nombre = txfNombreRegistro.getText();
                apellidos = txfApellidoRegistro.getText();
                email = txfCorreoRegistro.getText();
                nomUsuario = txfUsuarioRegistro.getText();
                fechaNac = Date.valueOf(dpFecNaRegistro.getValue());
                empresa = txfEmpresaRegistro.getText();
                dni = txfDniRegistro.getText();
                pwd = txfPwdRegistro.getText();

                PreparedStatement ps = co.prepareStatement("INSERT INTO usuarios VALUES (NULL,?,?,?,?,?,?,?,?)");
                ps.setString(1, nombre);
                ps.setString(2, apellidos);
                ps.setString(3, email);
                ps.setString(4, nomUsuario);
                ps.setDate(5, fechaNac);
                ps.setString(6, empresa);
                ps.setString(7, dni);
                ps.setString(8, pwd);
                ps.executeUpdate();

                cambiaPanelSesion();

                ps.close();
                co.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }


    @FXML
    void mVerPanelFacs(MouseEvent event) {
        pBotones.setVisible(false);
        pFacturas.setVisible(true);

    }

    @FXML
    void mVerPanelCompra(MouseEvent event) {
        pBotones.setVisible(false);
        pCompras.setVisible(true);
        nombreBaseDatos=lbNombreBaseDatos.getText();
    }

    @FXML
    void mVerPanelVent(MouseEvent event) {
        pBotones.setVisible(false);
        pVentas.setVisible(true);
    }

    @FXML
    void mVerPanelInv(MouseEvent event) {
        pBotones.setVisible(false);
        pInventario.setVisible(true);
        nombreBaseDatos=lbNombreBaseDatos.getText();

    }

    @FXML
    void mNuevaCompra(ActionEvent event) {
        pCompras.setVisible(false);
        pCrearCompra.setVisible(true);
    }

    private void cierraCompra() {
        pCompras.setVisible(true);
        pCrearCompra.setVisible(false);
    }

    private void cierraDatosFactura() {
        pVentas.setVisible(true);
        pCrearVentas.setVisible(false);
    }

    private void cierraDatosModi() {
        pAnadeProducto.setVisible(false);
        pInventario.setVisible(true);
    }

    @FXML
    private void mNuevoProducto() {
        pAnadeProducto.setVisible(true);
        pInventario.setVisible(false);
    }

    @FXML
    void mVolverAPFactura(ActionEvent event) {

        cierraDatosFactura();
    }

    @FXML
    void mNuevaVenta(ActionEvent event) {
        pVentas.setVisible(false);
        pCrearVentas.setVisible(true);

    }

    @FXML
    void mVolverAInicio(ActionEvent event) {
        pInventario.setVisible(false);
        pFacturas.setVisible(false);
        pVentas.setVisible(false);
        pCompras.setVisible(false);
        pBotones.setVisible(true);
    }

    /**
     * Método que coge gracias
     * a selected item los valores que
     * queremos reflejar en otro panel
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @FXML
    public void mverDatosProducto() throws SQLException, ClassNotFoundException {
        ObservableList<String> data = tablaInventario.getSelectionModel().getSelectedItem();
        idFactura = Integer.parseInt(data.get(0));
        pInventario.setVisible(false);
        pAnadeProducto.setVisible(true);
        controllerTablaProductos(data , nombreBaseDatos);
    }

    /**
     * Método que coge gracias
     * a selected item los valores que
     * queremos reflejar en otro panel
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @FXML
    public void verDatosFactura() throws SQLException, ClassNotFoundException {
        ObservableList<String> data = tablaVentas.getSelectionModel().getSelectedItem();
        idFactura = Integer.parseInt(data.get(0));
        pVentas.setVisible(false);
        pCrearVentas.setVisible(true);
        controllerTablaFacturas(data, nombreBaseDatos);
    }


    /**
     * Método que coge gracias
     * a selected item los valores que
     * queremos reflejar en otro panel
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @FXML
    public void mVerCompra() throws SQLException, ClassNotFoundException {
        ObservableList<String> data = tCCompras.getSelectionModel().getSelectedItem();
        idFactura = Integer.parseInt(data.get(0));
        pCompras.setVisible(false);
        pCrearCompra.setVisible(true);
        controllerTablaCompras(data,nombreBaseDatos);
    }

    /**
     * Método Accion Event
     * Al pusar el botón genera
     * un pdf donde le indica el
     * método llamado
     *
     * @param event
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @FXML
    void mImprimeFacVenta(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList<String> data = tableFacVentas.getSelectionModel().getSelectedItem();
        getString();
        controllerDatosFacVenta(data);
    }

    /**
     * Método Accion Event
     * Al pusar el botón genera
     * un pdf donde le indica el
     * método llamado
     *
     * @param event
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @FXML
    void mImprimeFacCompra(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList<String> data = tableFacCompras.getSelectionModel().getSelectedItem();

        getString();


        controllerDatosFacCompra(data);
    }


    /**
     * Método que devuelve
     * un double para obtener
     * el valor de los impuestos
     *
     * @param
     */
    public double obtenerPImpuesto() {

        Statement statement;
        ResultSet resultSet;
        try {
            Connection co = conBDPersonalizada(nombreBaseDatos);
            statement = co.createStatement();
            resultSet = statement.executeQuery("SELECT porcenImp FROM impuestos WHERE idImpuesto = 1");

            if (resultSet.next()) {
                return resultSet.getDouble("porcenImp");
            } else {
                return 0.0;
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Método que devuelve el string del
     * OptionPane para nombrar
     * al pdf
     *
     * @return
     */
    private static String getString() {
        JTextField field = new JTextField();
        JOptionPane.showMessageDialog(null, field, "Ingresa el nombre del archivo PDF", JOptionPane.QUESTION_MESSAGE);
        String fileName = field.getText();
        return fileName;
    }

    /**
     * Método que al pulsar un botón
     * devuelve un valor a través de un
     * Label
     *
     * @param event
     */
    @FXML
    void mCalculaSubTotal(ActionEvent event) {
        double cantidad = Double.parseDouble(txfVentaCreaCantidad.getText());

        double precio = Double.parseDouble(txfVentaCreaPrecio.getText());

        double impuesto = Double.parseDouble((cbImpuestosVenta.getValue().split("->"))[0]);

        double total = ((impuesto * precio * cantidad) + (precio * cantidad));
        lbFacturaSubTotal.setText(String.valueOf(total) + " €");
    }

    @FXML
    void mCalculaSubTotalPresupuesto(ActionEvent event) {
        double cantidad = Double.parseDouble(txfCantidadCompra.getText());

        double precio = Double.parseDouble(txfPrecioCompra.getText());

        double impuesto = Double.parseDouble((cbImpuestoCompra.getValue().split("->"))[0]);

        double total = ((impuesto * precio * cantidad) + (precio * cantidad));
        lbSubtotalCompra.setText(String.valueOf(total) + " €");
    }

    /**
     * Comprobaciones
     * <p>
     * Pacientes
     * <p>
     * <p>
     * Comprueban los datos  introducidos en la pestaña pacientes
     * Strings --> Comprueba que no estén en blanco y que solo contengan caracteres de la A a la Z
     * Decimal --> Según el dato, comprueba el tamaño y que no estén en blanco
     */

    /**
     * Comprueba que no estén en blanco
     *
     * @return StringValido
     */
    public boolean revisaNomUsuario() {
        boolean stringValido = false;
        String texto = tSUsuario.getText();

        if (tSUsuario.getText().length() != 0) {
            stringValido = true;
        }
        return stringValido;
    }

    /**
     * Comprueba que no estén en blanco
     *
     * @return StringValido
     */
    public boolean revisaContrasena() {
        boolean stringValido = false;
        String texto = tSContrase.getText();

        if (tSContrase.getText().length() != 0) {
            stringValido = true;
        }
        return stringValido;
    }

    public boolean revisaDatosLogin() {
        String colorFondo = "-fx-background-color: #FF5959";

        if (!revisaNomUsuario()) {
            tSUsuario.setStyle(colorFondo);
        } else {
            tSUsuario.setStyle(null);
        }
        if (!revisaContrasena()) {
            tSContrase.setStyle(colorFondo);
        } else {
            tSContrase.setStyle(colorFondo);
        }
        return revisaNomUsuario() && revisaContrasena();
    }

    /**
     * Comprueba que no estén en blanco y que solo contengan caracteres de la A a la Z
     *
     * @return StringValido
     */
    public boolean revisaNomusuarioR() {
        boolean stringValido = false;
        String texto = txfNombreRegistro.getText();

        if (txfNombreRegistro.getText().length() != 0 && texto.matches("[a-zA-Z\\u00f1\\u00d1]*$")) {
            stringValido = true;
        }
        return stringValido;
    }

    /**
     * Comprueba que no estén en blanco y que solo contengan caracteres de la A a la Z
     *
     * @return StringValido
     */
    public boolean revisaApellidoR() {
        boolean stringValido = false;
        String texto = txfApellidoRegistro.getText();

        if (txfApellidoRegistro.getText().length() != 0 && texto.matches("[a-zA-Z\\u00f1\\u00d1]*$")) {
            stringValido = true;
        }
        return stringValido;
    }

    /**
     * Comprueba que no estén en blanco y que solo contengan caracteres de la A a la Z
     *
     * @return StringValido
     */
    public boolean revisaEmail() {
        boolean stringValido = false;
        String texto = txfCorreoRegistro.getText();
        if (txfCorreoRegistro.getText().length() != 0 && texto.matches("^[A-Za-z0-9]+@[A-Za-z]+(\\.[A-Za-z]+)$")) {
            stringValido = true;
        }
        return stringValido;
    }


    public boolean revisaEmpresaR() {
        boolean stringValido = false;
        String texto = txfEmpresaRegistro.getText();

        if (txfEmpresaRegistro.getText().length() != 0) {
            stringValido = true;
        }
        return stringValido;
    }


    public boolean revisaDniUsuario() {
        boolean numValido = true;
        String numero = txfDniRegistro.getText();

        if (numero.matches("^[0-9]{8}[A-Z]$")) {
            try {

                numValido = true;
            } catch (IllegalFormatException e) {
                numValido = false;
            }
        } else {
            numValido = false;
        }
        return numValido;
    }

    /**
     * Comprueba que no estén en blanco
     *
     * @return StringValido
     */
    public boolean revisaUsuarioR() {
        boolean stringValido = false;
        String texto = txfUsuarioRegistro.getText();

        if (txfUsuarioRegistro.getText().length() != 0) {
            stringValido = true;
        }
        return stringValido;
    }

    /**
     * Comprueba que no estén en blanco
     *
     * @return StringValido
     */
    public boolean revisaContraseñaR() {
        boolean stringValido = false;
        String texto = txfPwdRegistro.getText();

        if (txfPwdRegistro.getText().length() != 0) {
            stringValido = true;
        }
        return stringValido;
    }


    /**
     *
     */
    public boolean revisaDatosUsuario() {
        String colorFondo = "-fx-background-color: #FF5959";

        if (!revisaNomusuarioR()) {
            txfNombreRegistro.setStyle(colorFondo);
        } else {
            txfNombreRegistro.setStyle(null);
        }
        if (!revisaApellidoR()) {
            txfApellidoRegistro.setStyle(colorFondo);
        } else {
            txfApellidoRegistro.setStyle(null);
        }
        if (!revisaDniUsuario()) {
            txfDniRegistro.setStyle(colorFondo);
        } else {
            txfDniRegistro.setStyle(null);
        }
        if (!revisaEmail()) {
            txfCorreoRegistro.setStyle(colorFondo);
        } else {
            txfCorreoRegistro.setStyle(null);
        }
        if (!revisaUsuarioR()) {
            txfUsuarioRegistro.setStyle(colorFondo);
        } else {
            txfUsuarioRegistro.setStyle(null);
        }
        if (!revisaContraseñaR()) {
            txfPwdRegistro.setStyle(colorFondo);
        } else {
            txfPwdRegistro.setStyle(null);
        }
        if (!revisaEmpresaR()) {
            txfEmpresaRegistro.setStyle(colorFondo);
        } else {
            txfEmpresaRegistro.setStyle(null);
        }


        return revisaNomusuarioR() && revisaDniUsuario() && revisaApellidoR() && revisaEmail() && revisaEmpresaR() && revisaUsuarioR() && revisaContraseñaR();

    }

    /**
     * Revisa que sea un número y no esté vacio
     *
     * @return numValido
     */
    public boolean revisaIdventa() {
        boolean numValido = false;
        String numero = txfIdVenta.getText();
        if (numero.matches("[0-9]")) {
            try {
                Integer.parseInt(numero);
                numValido = true;
            } catch (NumberFormatException e) {
                numValido = false;
            }
        } else {
            numValido = false;
        }
        return numValido;
    }

    public boolean revisaCantVenta() {
        boolean numValido = false;
        String numero = txfVentaCreaCantidad.getText();
        if (numero.matches("[0-9]")) {
            try {
                Integer.parseInt(numero);
                numValido = true;
            } catch (NumberFormatException e) {
                numValido = false;
            }
        } else {
            numValido = false;
        }
        return numValido;
    }

    public boolean revisaCantPrecio() {
        boolean numValido = false;
        String numero = txfVentaCreaPrecio.getText();
        if (numero.matches("[0-9]")) {
            try {
                Integer.parseInt(numero);
                numValido = true;
            } catch (NumberFormatException e) {
                numValido = false;
            }
        } else {
            numValido = false;
        }
        return numValido;
    }

    public boolean revisaEtiquetaVenta() {
        boolean stringValido = false;
        String texto = txfVentaCreaEtiqueta.getText();

        if (txfEmpresaRegistro.getText().length() != 0) {
            stringValido = true;
        }
        return stringValido;
    }

    public boolean revisaDatospVenta() {
        String colorFondo = "-fx-background-color: #FF5959";

        if (!revisaIdventa()) {
            txfIdVenta.setStyle(colorFondo);
        } else {
            txfIdVenta.setStyle(null);
        }
        if (!revisaCantVenta()) {
            txfVentaCreaCantidad.setStyle(colorFondo);
        } else {
            txfVentaCreaCantidad.setStyle(colorFondo);
        }
        if (!revisaCantPrecio()) {
            txfVentaCreaPrecio.setStyle(colorFondo);
        } else {
            txfVentaCreaPrecio.setStyle(colorFondo);
        }
        if (!revisaEtiquetaVenta()) {
            txfVentaCreaEtiqueta.setStyle(colorFondo);
        } else {
            txfVentaCreaEtiqueta.setStyle(colorFondo);
        }
        return revisaCantVenta() && revisaIdventa() && revisaCantPrecio() && revisaEtiquetaVenta();
    }

    /**
     * Revisa que sea un número y no esté vacio
     *
     * @return numValido
     */
    public boolean revisaIdCompra() {
        boolean numValido = false;
        String numero = txfIdCompra.getText();
        if (numero.matches("[0-9]")) {
            try {
                Integer.parseInt(numero);
                numValido = true;
            } catch (NumberFormatException e) {
                numValido = false;
            }
        } else {
            numValido = false;
        }
        return numValido;
    }

    public boolean revisaCantCompra() {
        boolean numValido = false;
        String numero = txfCantidadCompra.getText();
        if (numero.matches("[0-9]")) {
            try {
                Integer.parseInt(numero);
                numValido = true;
            } catch (NumberFormatException e) {
                numValido = false;
            }
        } else {
            numValido = false;
        }
        return numValido;
    }

    public boolean revisaprecioCompra() {
        boolean numValido = false;
        String numero = txfPrecioCompra.getText();
        if (numero.matches("[0-9]")) {
            try {
                Integer.parseInt(numero);
                numValido = true;
            } catch (NumberFormatException e) {
                numValido = false;
            }
        } else {
            numValido = false;
        }
        return numValido;
    }


    /**
     * Revisa que sea un número y no esté vacio
     *
     * @return numValido
     */

    public boolean revisaEtiquetaCompra() {
        boolean stringValido = false;
        String texto = txfEtiquetaCompra.getText();

        if (txfEtiquetaCompra.getText().length() != 0) {
            stringValido = true;
        }
        return stringValido;
    }

    public boolean revisaDatospCompra() {
        String colorFondo = "-fx-background-color: #FF5959";

        if (!revisaCantCompra()) {
            txfCantidadCompra.setStyle(colorFondo);
        } else {
            txfCantidadCompra.setStyle(null);
        }
        if (!revisaEtiquetaCompra()) {
            txfEtiquetaCompra.setStyle(colorFondo);
        } else {
            txfEtiquetaCompra.setStyle(colorFondo);
        }
        if (!revisaIdCompra()) {
            txfIdCompra.setStyle(colorFondo);
        } else {
            txfIdCompra.setStyle(colorFondo);
        }
        if (!revisaprecioCompra()) {
            txfPrecioCompra.setStyle(colorFondo);
        } else {
            txfPrecioCompra.setStyle(colorFondo);
        }

        return revisaCantCompra() && revisaEtiquetaCompra() && revisaIdCompra() && revisaprecioCompra();
    }

    public boolean revisaIdProd() {
        boolean numValido = false;
        String numero = txfIdProducto.getText();
        if (numero.matches("[0-9]")) {
            try {
                Integer.parseInt(numero);
                numValido = true;
            } catch (NumberFormatException e) {
                numValido = false;
            }
        } else {
            numValido = false;
        }
        return numValido;
    }

    public boolean revisaCantProd() {
        boolean numValido = false;
        String numero = txfCantidad.getText();
        if (numero.matches("[0-9]")) {
            try {
                Integer.parseInt(numero);
                numValido = true;
            } catch (NumberFormatException e) {
                numValido = false;
            }
        } else {
            numValido = false;
        }
        return numValido;
    }


    /**
     * Revisa que sea un número y no esté vacio
     *
     * @return numValido
     */

    public boolean revisaNomProd() {
        boolean stringValido = false;
        String texto = txfProducto.getText();

        if (txfProducto.getText().length() != 0) {
            stringValido = true;
        }
        return stringValido;
    }


    public boolean revisaDatospProd() {
        String colorFondo = "-fx-background-color: #FF5959";

        if (!revisaNomProd()) {
            txfProducto.setStyle(colorFondo);
        } else {
            txfProducto.setStyle(null);
        }
        if (!revisaIdProd()) {
            txfIdProducto.setStyle(colorFondo);
        } else {
            txfIdProducto.setStyle(colorFondo);
        }
        if (!revisaCantProd()) {
            txfCantidad.setStyle(colorFondo);
        } else {
            txfCantidad.setStyle(colorFondo);
        }

        return revisaNomProd() && revisaCantProd() && revisaIdProd() ;
    }

    /**
     * Método que devuelve
     * una cadena de string
     * llena de los id necesarios
     *
     * @param
     */
    public String obtenIdFactura() {
        List<Integer> resultIds = new ArrayList<>();
        Statement statement;
        ResultSet resultSet;
        nombreBaseDatos = lbNombreBaseDatos.getText();
        try {
            Connection co = conBDPersonalizada(nombreBaseDatos);
            statement = co.createStatement();
            resultSet = statement.executeQuery("SELECT idfactura FROM facturas");

            while (resultSet.next()) {
                resultIds.add(resultSet.getInt("idfactura"));
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return resultIds.stream().map(Object::toString).collect(Collectors.joining(", "));
    }

    /**
     * Construye la tabla e inserta los datos
     *
     * @param nomTabla nombre de la tabla a reflejar
     * @param tabla    componente tableview donde se escribirá dicha información
     */
    public void construyeDatos(String nomTabla, TableView tabla, String nombreBaseDatos) throws SQLException, ClassNotFoundException {

        ObservableList<ObservableList> data;
        Connection c = conBDPersonalizada(nombreBaseDatos);
        System.out.println(nombreBaseDatos);
        data = FXCollections.observableArrayList();
        try {

            String SQL = "SELECT * from " + nomTabla;
            ResultSet rs = c.createStatement().executeQuery(SQL);

            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                //We are using non property style for making dynamic table
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });
                tabla.getColumns().addAll(col);
                if (i == 0) {
                    col.setVisible(false);
                }
                System.out.println("Column [" + i + "] ");
            }
            while (rs.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row);
                data.add(row);
            }
            //FINALLY ADDED TO TableView
            tabla.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }

    /**
     * Construye la tabla e inserta los datos
     *
     * @param nomTabla nombre de la tabla a reflejar
     * @param tabla    componente tableview donde se escribirá dicha información
     */
    public void construyeDatos2(String nomTabla, TableView tabla, String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        String value = obtenIdFactura();
        ObservableList<ObservableList> data;
        Connection c = conBDPersonalizada(nombreBaseDatos);
        data = FXCollections.observableArrayList();
        try {

            String SQL = "select * from ventas where idventas IN (select idventa from " + nomTabla + " where idfactura IN ('" + value + "'))";
            ResultSet rs = c.createStatement().executeQuery(SQL);

            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                //We are using non property style for making dynamic table
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });
                tabla.getColumns().addAll(col);
                if (i == 0) {
                    col.setVisible(false);
                }
                System.out.println("Column [" + i + "] ");
            }
            while (rs.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row);
                data.add(row);
            }
            //FINALLY ADDED TO TableView
            tabla.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }

    /**
     * Construye la tabla e inserta los datos
     *
     * @param nomTabla nombre de la tabla a reflejar
     * @param tabla    componente tableview donde se escribirá dicha información
     */
    public void construyeDatos3(String nomTabla, TableView tabla, String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        String value = obtenIdFactura();
        ObservableList<ObservableList> data;
        Connection c = conBDPersonalizada(nombreBaseDatos);
        data = FXCollections.observableArrayList();
        try {

            String SQL = "select * from compras where idcompras IN (select idcompra from " + nomTabla + " where idfactura IN  ('" + value + "'))";
            ResultSet rs = c.createStatement().executeQuery(SQL);

            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                //We are using non property style for making dynamic table
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });
                tabla.getColumns().addAll(col);
                if (i == 0) {
                    col.setVisible(false);
                }
                System.out.println("Column [" + i + "] ");
            }
            while (rs.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Añadida " + row);
                data.add(row);
            }
            //FINALLY ADDED TO TableView
            tabla.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }


    /**
     * Método que recoge datos del panel
     * para añadirlos a la base de datos
     *
     * @param event
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @FXML
    void mCreaCompra(ActionEvent event) throws SQLException, ClassNotFoundException {
        int idproveedor;

        int idproducto;
        int idimpuestos = 1;
        double cantidad;

        String etiqueta;
        double precio = 0;
        double subtotal;
        Date fechaLim;
        Date entregaEsp;


        Connection co = conBDPersonalizada(nombreBaseDatos);

        if (revisaDatospCompra()) {
            try {

                idproveedor = Integer.parseInt((cbProveedorCompra.getValue().split("->"))[0]);
                idproducto = Integer.parseInt((cbProductoCompra.getValue().split("->"))[0]);
                double precioF = obtenerPImpuesto();
                cantidad = Double.parseDouble(txfCantidadCompra.getText());
                etiqueta = txfEtiquetaCompra.getText();
                precio = Double.parseDouble(txfPrecioCompra.getText());
                subtotal = ((precioF * precio * cantidad) + (precio * cantidad));
                fechaLim = Date.valueOf(dpFechaLimCompra.getValue());
                entregaEsp = Date.valueOf(dpEntregaEspCompra.getValue());

                PreparedStatement ps = co.prepareStatement("INSERT INTO compras  VALUES (NULL,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, idproveedor);
                ps.setInt(2, idproducto);
                ps.setDouble(3, precioF);
                ps.setDouble(4, cantidad);
                ps.setString(5, etiqueta);
                ps.setDouble(6, precio);
                ps.setDouble(7, subtotal);
                ps.setDate(8, fechaLim);
                ps.setDate(9, entregaEsp);
                ps.executeUpdate();

                ps.close();
                co.close();

                pCrearCompra.setVisible(false);
                pCompras.setVisible(true);

                agregaFilaCompra("compras", tCCompras,nombreBaseDatos);
                agregaFilaFacCompras("facturas", tableFacCompras);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Método que recoge datos del panel
     * para modificarlos a la base de datos
     *
     * @param event
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @FXML
    void mModiCompra(ActionEvent event) throws SQLException, ClassNotFoundException {

        int idproveedor;

        int idproducto;
        int idimpuestos = 1;
        double cantidad;

        String etiqueta;
        double precio = 0;
        double subtotal;
        Date fechaLim;
        Date entregaEsp;

        Connection co = conBDPersonalizada(nombreBaseDatos);
        if (revisaDatospCompra()) {
            try {


                idproveedor = Integer.parseInt((cbProveedorCompra.getValue().split("->"))[0]);
                idproducto = Integer.parseInt((cbProductoCompra.getValue().split("->"))[0]);
                double precioF = obtenerPImpuesto();
                cantidad = Double.parseDouble(txfCantidadCompra.getText());
                etiqueta = txfEtiquetaCompra.getText();
                precio = Double.parseDouble(txfPrecioCompra.getText());
                subtotal = ((precioF * precio * cantidad) + (precio * cantidad));
                fechaLim = Date.valueOf(dpFechaLimCompra.getValue());
                entregaEsp = Date.valueOf(dpEntregaEspCompra.getValue());

                PreparedStatement ps = co.prepareStatement("update compras SET  idproveedor=?, idproducto=?, idimpuesto=?" +
                        ",cantidad=?,precio=?, subtotal=? , fechalim=?,entregaEsp = ? where etiqueta=?");
                ps.setInt(1, idproveedor);
                ps.setInt(2, idproducto);
                ps.setDouble(3, precioF);
                ps.setDouble(4, cantidad);
                ps.setDouble(6, precio);
                ps.setDouble(7, subtotal);
                ps.setDate(8, fechaLim);
                ps.setDate(8, entregaEsp);
                ps.setString(9, etiqueta);

                ps.executeUpdate();
                if (ps.executeUpdate() == 1) {
                    System.out.println("ACTUALIZA");
                } else {
                    System.out.println("ESTO NO HACE NA");
                }

                //cierra panel();
                cierraDatosFactura();
                agregaFilaCompra("compras", tCCompras,nombreBaseDatos);

                //Cierra las conexiones
                ps.close();
                co.close();


            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Método que recoge datos del panel
     * para eliminarlos de la base de datos
     *
     * @param event
     */
    @FXML
    void mElimCompra(ActionEvent event) {

        try {
            ObservableList<String> data;
            Object value = null;


            data = tCCompras.getSelectionModel().getSelectedItem();
            value = data.get(0);
            Connection con = conBDPersonalizada(nombreBaseDatos);
            PreparedStatement ps = con.prepareStatement("DELETE FROM compras where idcompras=?");
            ps.setObject(1, value);

            ps.executeUpdate();

            agregafilaProductos("compras", tCCompras,nombreBaseDatos);

            con.close();
            cierraDatosModi();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que recoge datos del panel
     * para añadirlos a la base de datos
     *
     * @param event
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @FXML
    void mCreaVenta(ActionEvent event) throws SQLException, ClassNotFoundException {
        int idVenta;

        int idproducto;
        double cantidad;
        double impuestos;
        String etiqueta;
        double precio;
        double subtotal;


        Connection co = conBDPersonalizada(nombreBaseDatos);

            try {

                idVenta = Integer.parseInt(txfIdVenta.getText());
                idproducto = Integer.parseInt((cbProductoVenta.getValue().split("->"))[0]);
                cantidad = Double.parseDouble(txfVentaCreaCantidad.getText());
                impuestos = Double.parseDouble((cbImpuestosVenta.getValue().split("->"))[0]);
                etiqueta = txfVentaCreaEtiqueta.getText();
                precio = Double.parseDouble(txfVentaCreaPrecio.getText());
                subtotal = ((impuestos * precio * cantidad) + (precio * cantidad));


                PreparedStatement ps = co.prepareStatement("INSERT INTO ventas VALUES (?,?,?,?,?,?,?)");
                ps.setInt(1, idVenta);
                ps.setInt(2, idproducto);
                ps.setDouble(3, cantidad);
                ps.setDouble(4, impuestos);
                ps.setString(5, etiqueta);
                ps.setDouble(6, precio);
                ps.setDouble(7, subtotal);
                ps.executeUpdate();

                agregaFilasVentas("ventas", tablaVentas,nombreBaseDatos);
                agregaFilaFacVentas("facturas", tableFacVentas, idVenta);
                ps.close();

                co.close();


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

    }

    /**
     * Método que recoge datos del panel
     * para modificarlos a la base de datos
     *
     * @param event
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    @FXML
    void mModiVenta(ActionEvent event) throws SQLException, ClassNotFoundException {
        int idVenta;

        int idproducto;
        double cantidad;
        double impuestos;
        String etiqueta;
        double precio;
        double subtotal;


        Connection co = conBDPersonalizada(nombreBaseDatos);

        if (revisaDatospVenta()) {
            try {
                idVenta = Integer.parseInt(txfIdVenta.getText());
                idproducto = Integer.parseInt((cbProductoVenta.getValue().split("->"))[0]);
                cantidad = Double.parseDouble(txfVentaCreaCantidad.getText());
                impuestos = Double.parseDouble((cbImpuestosVenta.getValue().split("->"))[0]);
                etiqueta = txfVentaCreaEtiqueta.getText();
                precio = Double.parseDouble(txfVentaCreaPrecio.getText());
                subtotal = ((impuestos * precio * cantidad) + (precio * cantidad));

                PreparedStatement ps = co.prepareStatement("update ventas SET  idproducto=?, cantidad=?, impuestos=?,etiqueta=?,precio=?,subtotal=? where idventas=?");
                ps.setInt(1, idproducto);
                ps.setDouble(2, cantidad);
                ps.setDouble(3, impuestos);
                ps.setString(4, etiqueta);
                ps.setDouble(5, precio);
                ps.setDouble(6, subtotal);
                ps.setInt(7, idVenta);
                ps.executeUpdate();
                if (ps.executeUpdate() == 1) {
                    System.out.println("ACTUALIZA");
                } else {
                    System.out.println("ESTO NO HACE NA");
                }

                PreparedStatement ps2 = co.prepareStatement("update facturas set idventa=? ");
                ps.setInt(1, idVenta);


                //cierra panel();
                cierraDatosFactura();
                agregaFilasVentas("ventas", tablaVentas,nombreBaseDatos);
                agregaFilaFacVentas("facturas", tableFacVentas, idVenta);

                //Cierra las conexiones
                ps.close();
                co.close();


            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Método que recoge datos del panel
     * para eliminarlos de la base de datos
     *
     * @param event
     */

    @FXML
    void mElimVenta(ActionEvent event) {


        try {
            ObservableList<String> data;
            Object value = null;


            data = tablaVentas.getSelectionModel().getSelectedItem();
            value = data.get(0);
            Connection con = conBDPersonalizada(nombreBaseDatos);
            PreparedStatement ps = con.prepareStatement("DELETE FROM ventas where idventas=?");
            ps.setObject(1, value);

            ps.executeUpdate();

            agregaFilasVentas("ventas", tablaVentas,nombreBaseDatos);
            cierraDatosFactura();
            con.close();


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Método que recoge datos del panel
     * para añadirlos a la base de datos
     *
     * @param event
     * @throws SQLException
     * @throws ClassNotFoundException
     */

    @FXML
    void mCreaProducto(ActionEvent event) throws SQLException, ClassNotFoundException {
        CreaProducto(nombreBaseDatos);
    }

    void CreaProducto(String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        int idproducto;
        int idproveedor;
        String producto;
        int cantidad;
        Date fechaLimite;
        Date entregaEsperada;



        System.out.println(nombreBaseDatos);

        Connection co = conBDPersonalizada(nombreBaseDatos);

        if (revisaDatospProd()) {
            try {
                idproducto = Integer.parseInt(txfIdProducto.getText());
                idproveedor = Integer.parseInt((cbProveedorProd.getValue().split("->"))[0]);
                producto = txfProducto.getText();
                cantidad = Integer.parseInt(txfCantidad.getText());
                fechaLimite = Date.valueOf(dPFechaLim.getValue());
                entregaEsperada = Date.valueOf(dPEntregaEsperada.getValue());


                PreparedStatement ps = co.prepareStatement("INSERT INTO productos  VALUES (?,?,?,?,?,?)");
                ps.setInt(1, idproducto);
                ps.setInt(2, idproveedor);
                ps.setString(3, producto);
                ps.setInt(4, cantidad);
                ps.setDate(5, fechaLimite);
                ps.setDate(6, entregaEsperada);
                ps.executeUpdate();
                agregafilaProductos("productos", tablaInventario, nombreBaseDatos);
                cierraDatosModi();
                ps.close();
                co.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Método que recoge datos del panel
     * para modificarlos a la base de datos
     *
     * @param event
     * @throws SQLException
     * @throws ClassNotFoundException
     */

    @FXML
    void mModiProducto(ActionEvent event) throws SQLException, ClassNotFoundException {
        int idproducto;
        int idproveedor;
        String producto;
        int cantidad;
        Date fechaLimite;
        Date entregaEsperada;


        Connection co = conBDPersonalizada(nombreBaseDatos);
        if (revisaDatospProd()) {
            try {
                idproducto = Integer.parseInt(txfIdProducto.getText());
                idproveedor = Integer.parseInt((cbProveedorProd.getValue().split("->"))[0]);
                producto = txfProducto.getText();
                cantidad = Integer.parseInt(txfCantidad.getText());
                fechaLimite = Date.valueOf(dPFechaLim.getValue());
                entregaEsperada = Date.valueOf(dPEntregaEsperada.getValue());


                PreparedStatement ps = co.prepareStatement("update productos SET  pNombre=?, cantidad=?, fechalimite=?,entregaesperada=? ,idproveedor=? where idproducto=?");
                ps.setString(1, producto);
                ps.setInt(2, cantidad);
                ps.setDate(3, fechaLimite);
                ps.setDate(4, entregaEsperada);
                ps.setInt(5, idproveedor);
                ps.setInt(6, idproducto);
                ps.executeUpdate();
                if (ps.executeUpdate() == 1) {
                    System.out.println("ACTUALIZA");
                } else {
                    System.out.println("ESTO NO HACE NA");
                }

                //cierra panel();
                cierraDatosModi();
                agregafilaProductos("productos", tablaInventario,nombreBaseDatos);

                //Cierra las conexiones
                ps.close();
                co.close();


            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Método que recoge datos del panel
     * para eliminarlos de la base de datos
     *
     * @param event
     */
    @FXML
    void mElimProd(ActionEvent event) {

        try {
            ObservableList<String> data;
            Object value = null;


            data = tablaInventario.getSelectionModel().getSelectedItem();
            value = data.get(0);
            Connection con = conBDPersonalizada(nombreBaseDatos);
            PreparedStatement ps = con.prepareStatement("DELETE FROM productos where idProducto=?");
            ps.setObject(1, value);

            ps.executeUpdate();

            agregafilaProductos("productos", tablaInventario,nombreBaseDatos);

            con.close();
            cierraDatosModi();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Método que rellena los ComboBox
     * Con datos de la base de datos
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void datosProductoFacComboB(String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        cbProductoVenta.getItems().clear();
        cbProductoCompra.getItems().clear();

        Connection co = conBDPersonalizada(nombreBaseDatos);
        try {
            Statement s = co.createStatement();
            ResultSet rs = s.executeQuery("select * from productos");

            String auxNombre;

            while (rs.next()) {
                byte[] dataNombre = rs.getBytes("pnombre");
                auxNombre = new String(dataNombre, StandardCharsets.UTF_8);

                int dataId = rs.getInt("idproducto");
                String nue = String.valueOf(dataId);

                cbProductoVenta.getItems().add(nue + "->" + auxNombre);
                cbProductoCompra.getItems().add(nue + "->" + auxNombre);
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }


    /**
     * Método que rellena los ComboBox
     * Con datos de la base de datos
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void datosImpuestoFacComboB(String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        cbImpuestosVenta.getItems().clear();
        cbImpuestoCompra.getItems().clear();
        double pImp;
        Connection co = conBDPersonalizada(nombreBaseDatos);
        try {
            Statement s = co.createStatement();
            ResultSet rs = s.executeQuery("select * from impuestos");

            String auxNombre;

            while (rs.next()) {
                pImp = rs.getDouble("porcenImp");

                byte[] dataNombre = String.valueOf(pImp).getBytes();
                auxNombre = new String(dataNombre, StandardCharsets.UTF_8);

                String dataId = rs.getString("nomImpuesto");
                String nue = String.valueOf(dataId);

                cbImpuestosVenta.getItems().add(auxNombre + " -> " + nue);
                cbImpuestoCompra.getItems().add(auxNombre + " -> " + nue);
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    /**
     * Método que rellena los ComboBox
     * Con datos de la base de datos
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void datosProveedorFacComboB(String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        cbProveedorCompra.getItems().clear();
        cbProveedorProd.getItems().clear();
        Connection co = conBDPersonalizada(nombreBaseDatos);
        System.out.println(nombreBaseDatos
        );
        try {
            Statement s = co.createStatement();
            ResultSet rs = s.executeQuery("select * from proveedor");

            String auxNombre;

            while (rs.next()) {

                byte[] dataNombre = rs.getBytes("nombreProveedor");
                auxNombre = new String(dataNombre, StandardCharsets.UTF_8);
                int dataId = rs.getInt("idproveedor");
                String nue = String.valueOf(dataId);


                cbProveedorCompra.getItems().add(nue + "->" + auxNombre);
                cbProveedorProd.getItems().add(nue + "->" + auxNombre);
            }
        } catch (Exception x) {
            x.printStackTrace();
        }

    }


    public String datosConsultaProductoFacComboBox(Object value) {
        String resultado = null;
        try {
            Statement s = conBDPersonalizada(nombreBaseDatos).createStatement();
            ResultSet rs = s.executeQuery("select * from productos where idproducto = (select idproducto from ventas where idproducto = " + value + ")");

            String auxNombre;
            while (rs.next()) {
                byte[] dataNombre = rs.getBytes("pNombre");
                auxNombre = new String(dataNombre, StandardCharsets.UTF_8);
                int dataId = rs.getInt("idproducto");
                String nue = String.valueOf(dataId);
                resultado = nue + "," + auxNombre;
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
        return resultado;
    }

    /**
     * Método que controla los
     * datos a generar en el pdf de facturas
     * asociada a ventas
     *
     * @param data
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private void controllerDatosFacVenta(ObservableList<String> data) throws SQLException, ClassNotFoundException {
        Object value = null;
        value = data.get(0);
        String value2 = obtenIdFactura();
        System.out.println(value);

        nombreBaseDatos = lbNombreBaseDatos.getText();

        Connection c = conBDPersonalizada(nombreBaseDatos);
        Document document = new Document();

        try {
            String ruta = System.getProperty("user.home");

            String fileName = getString();
            PdfWriter.getInstance(document, new FileOutputStream(ruta + "/Desktop/" + fileName + ".pdf"));

            PdfWriter.getInstance(document, new FileOutputStream(ruta + "/Desktop/FacturaVenta.pdf"));
            document.open();
            PdfPTable table = new PdfPTable(7);
            table.addCell("IdVenta");
            table.addCell("IdProducto");
            table.addCell("Cantidad");
            table.addCell("Impuestos");
            table.addCell("Etiqueta");
            table.addCell("Precio");
            table.addCell("Subtotal");

            try {
                PreparedStatement ps = c.prepareStatement("select * from ventas where idventas IN (select idventa from facturas where idfactura IN  (" + value2 + "))");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    do {
                        table.addCell(rs.getObject(1).toString());
                        table.addCell(rs.getObject(2).toString());
                        table.addCell(rs.getObject(3).toString());
                        table.addCell(rs.getObject(4).toString());
                        table.addCell(rs.getObject(5).toString());
                        table.addCell(rs.getObject(6).toString());
                        table.addCell(rs.getObject(7).toString());
                    } while (rs.next());
                    document.add(table);

                } else {

                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
            document.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }


    }


    /**
     * Método que controla los
     * datos a generar en el pdf de facturas
     * asociada a compras
     *
     * @param data
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private void controllerDatosFacCompra(ObservableList<String> data) throws SQLException, ClassNotFoundException {
        Object value = null;
        value = data.get(0);
        String value2 = obtenIdFactura();

        Connection c = conBDPersonalizada(nombreBaseDatos);
        Document document = new Document();

        try {
            String ruta = System.getProperty("user.home");

            String fileName = getString();
            PdfWriter.getInstance(document, new FileOutputStream(ruta + "/Desktop/" + fileName + ".pdf"));

            PdfWriter.getInstance(document, new FileOutputStream(ruta + "/Desktop/FacturaCompra.pdf"));

            document.open();
            PdfPTable table = new PdfPTable(7);
            table.addCell("IdCompra");
            table.addCell("IdProveedor");
            table.addCell("IdProducto");
            table.addCell("IdImpuesto");
            table.addCell("Cantidad");
            table.addCell("Etiqueta");
            table.addCell("Precio");
            table.addCell("Subtotal");
            table.addCell("Fecha Límite");

            table.addCell("Entrega Esperada");


            try {
                PreparedStatement ps = c.prepareStatement("select * from compras where idcompras IN (select idcompra from facturas where idfactura IN  (" + value2 + "))");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    do {
                        table.addCell(rs.getObject(1).toString());
                        table.addCell(rs.getObject(2).toString());
                        table.addCell(rs.getObject(3).toString());
                        table.addCell(rs.getObject(4).toString());
                        table.addCell(rs.getObject(5).toString());
                        table.addCell(rs.getObject(6).toString());
                        table.addCell(rs.getObject(7).toString());
                        table.addCell(rs.getObject(8).toString());
                        table.addCell(rs.getObject(9).toString());
                        table.addCell(rs.getObject(10).toString());
                    } while (rs.next());
                    document.add(table);

                } else {

                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
            document.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }


    }

    /**
     * Método que controla los
     * datos a generar en el pane asociado
     * a facturas
     *
     * @param data
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private void controllerTablaFacturas(ObservableList<String> data , String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        Object value = null;
        value = data.get(0);
        System.out.println(value);

        Connection c = conBDPersonalizada(nombreBaseDatos);

        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from ventas where idventas = " + value);
            if (rs.next()) {

                txfIdVenta.setText(rs.getObject(1).toString());
                cbProductoVenta.setValue(rs.getObject(2).toString());
                txfVentaCreaCantidad.setText(rs.getObject(3).toString());
                cbImpuestosVenta.setValue(rs.getObject(4).toString());
                txfVentaCreaEtiqueta.setText(rs.getObject(5).toString());
                txfVentaCreaPrecio.setText(rs.getObject(6).toString());

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Método que controla los
     * datos a generar en el pane asociado
     * a compras
     *
     * @param data
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private void controllerTablaCompras(ObservableList<String> data, String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        Object value = null;
        value = data.get(0);
        System.out.println(value);
        Connection c = conBDPersonalizada(nombreBaseDatos);

        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from compras where idcompras = " + value);
            if (rs.next()) {
                txfIdCompra.setText(rs.getObject(1).toString());
                cbProductoCompra.setValue(rs.getObject(2).toString());
                cbProductoCompra.setValue(rs.getObject(3).toString());
                cbImpuestoCompra.setValue(rs.getObject(4).toString());
                txfCantidadCompra.setText(rs.getObject(5).toString());
                txfEtiquetaCompra.setText(rs.getObject(6).toString());
                txfPrecioCompra.setText(rs.getObject(7).toString());
                lbSubtotalCompra.setText(rs.getObject(8).toString());
                dpFechaLimCompra.setValue(LocalDate.parse(rs.getObject(9).toString()));
                dpEntregaEspCompra.setValue(LocalDate.parse(rs.getObject(10).toString()));


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    /**
     * Método que controla los
     * datos a generar en el pane asociado
     * a productos
     *
     * @param data
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private void controllerTablaProductos(ObservableList<String> data , String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        Object value = null;
        value = data.get(0);
        System.out.println(value);
        Connection c = conBDPersonalizada(nombreBaseDatos);

        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from productos where idproducto = " + value);
            if (rs.next()) {
                txfIdProducto.setText(rs.getObject(1).toString());
                txfProveedor.setText(rs.getObject(2).toString());
                txfProducto.setText(rs.getObject(3).toString());
                txfCantidad.setText(rs.getObject(4).toString());
                dPFechaLim.setValue(LocalDate.parse(String.valueOf(rs.getObject(5).toString())));
                dPEntregaEsperada.setValue(LocalDate.parse(String.valueOf(rs.getObject(6).toString())));


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Método que agrega filas
     * a la tabla Productos
     *
     * @param nomTabla
     * @param tabla
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void agregafilaProductos(String nomTabla, TableView tabla, String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        ObservableList<ObservableList> data;
        Connection c = conBDPersonalizada(nombreBaseDatos);
        data = FXCollections.observableArrayList();
        try {

            String SQL = "SELECT *  from " + nomTabla;
            ResultSet rs = c.createStatement().executeQuery(SQL);

            while (rs.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row);
                data.add(row);

            }

            tabla.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }

    /**
     * Método que agrega filas
     * a la tabla Factura de Ventas
     *
     * @param nomTabla
     * @param tabla
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void agregaFilaFacVentas(String nomTabla, TableView tabla, int value) throws SQLException, ClassNotFoundException {
        ObservableList<ObservableList> data;
        nombreBaseDatos = lbNombreBaseDatos.getText();
        Connection c = conBDPersonalizada(nombreBaseDatos);
        data = FXCollections.observableArrayList();
        try {

            String SQL = "select * from ventas where idventas = (select idventa from facturas where idventa = " + value + ")";
            ResultSet rs = c.createStatement().executeQuery(SQL);

            while (rs.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row);
                data.add(row);

            }

            tabla.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }

    /**
     * Método que agrega filas
     * a la tabla Factura de Compras
     *
     * @param nomTabla
     * @param tabla
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void agregaFilaFacCompras(String nomTabla, TableView tabla) throws SQLException, ClassNotFoundException {
        String value = obtenIdFactura();
        ObservableList<ObservableList> data;
        nombreBaseDatos = lbNombreBaseDatos.getText();
        Connection c = conBDPersonalizada(nombreBaseDatos);
        data = FXCollections.observableArrayList();
        try {

            String SQL = "select * from compras where idcompras IN (select idcompra from " + nomTabla + " where idfactura = '" + value + "')";
            ResultSet rs = c.createStatement().executeQuery(SQL);

            while (rs.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row);
                data.add(row);

            }

            tabla.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }

    /**
     * Método que agrega filas
     * a la tabla Ventas
     *
     * @param nomTabla
     * @param tabla
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void agregaFilasVentas(String nomTabla, TableView tabla, String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        ObservableList<ObservableList> data;
        Connection c = conBDPersonalizada(nombreBaseDatos);
        data = FXCollections.observableArrayList();
        try {

            String SQL = "SELECT idventas, idproducto,cantidad,impuestos,etiqueta,precio,subtotal from " + nomTabla;
            ResultSet rs = c.createStatement().executeQuery(SQL);

            while (rs.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row);
                data.add(row);

            }

            tabla.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }

    public void agregaFilaCompra(String nomTabla, TableView tabla, String nombreBaseDatos) throws SQLException, ClassNotFoundException {
        ObservableList<ObservableList> data;
        Connection c = conBDPersonalizada(nombreBaseDatos);
        data = FXCollections.observableArrayList();
        try {

            String SQL = "SELECT  * from " + nomTabla;
            ResultSet rs = c.createStatement().executeQuery(SQL);

            while (rs.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row);
                data.add(row);

            }

            tabla.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }


    public static Connection conBDPersonalizada(String nombreBd) throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306" + "/" + nombreBd,
                "root", "root");
        return connection;

    }
    /**
     * Método Inicializador
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println(nombreBaseDatos);

    }
}