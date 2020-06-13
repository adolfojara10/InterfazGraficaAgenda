/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.dao.TelefonoDAOImpl;
import ec.ups.edu.dao.UsuarioDAOImpl;
import ec.ups.edu.idao.ITelefonoDAO;
import ec.ups.edu.idao.IUsuarioDAO;
import ec.ups.edu.modelo.Telefono;
import ec.ups.edu.modelo.Usuario;
import ec.ups.edu.vista.VentanaInicioSesion;

/**
 *
 * @author Adolfo
 */
public class ControladorUsuario {

    //objetos vista
    private VentanaInicioSesion vista;

    //private VistaTelefono vistaT;
    //objetos modelo
    private Usuario cliente;
    private Telefono tele;
    //objetos DAO
    private IUsuarioDAO clienteDAO;
    private ITelefonoDAO telefonoDAO;

    public ControladorUsuario(UsuarioDAOImpl clienteDAO, TelefonoDAOImpl direccionDAO) {
     //   this.vista = vistaCliente;
        this.clienteDAO = clienteDAO;

       // this.vistaT = vistaDireccion;
        this.telefonoDAO = direccionDAO;

    }
    
    public void crearUsuario(Usuario usuario){
      //  clienteDAO.create(new Usuario("123131", "pocho", "lavezzi", "admin", "1234"));
      clienteDAO.create(usuario);
    }
    
    
    public Usuario iniciarSesion(String correo, String contrasena) {

        //se obtienen los datos de contraseÃ±a y correo
        //se envian los datos y se recibe una persona
        cliente = clienteDAO.iniciarSesion(correo, contrasena);

        return cliente;
    }

    public void imprimirUsuario(Usuario usuario){
        System.out.println(usuario);
    }
    
}
