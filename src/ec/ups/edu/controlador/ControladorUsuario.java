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
import java.util.Map;

/**
 *
 * @author Adolfo
 */
public class ControladorUsuario {

    //objetos vista
    private VentanaInicioSesion vista;

    //private VistaTelefono vistaT;
    //objetos modelo
    private Usuario usuario;
    private Telefono tele;
    //objetos DAO
    private IUsuarioDAO usuarioDAO;
    private ITelefonoDAO telefonoDAO;

    public ControladorUsuario(UsuarioDAOImpl clienteDAO, TelefonoDAOImpl direccionDAO) {
        //   this.vista = vistaCliente;
        this.usuarioDAO = clienteDAO;

        // this.vistaT = vistaDireccion;
        this.telefonoDAO = direccionDAO;

    }

    public void crearUsuario(String nombre, String apellido, String cedula, String correo,
            String password) {
        
        usuario = new Usuario(cedula, nombre, apellido, correo, password);
        usuarioDAO.create(usuario);
    }

    public boolean iniciarSesion(String correo, String password) {

        //se obtienen los datos de contraseÃ±a y correo
        //se envian los datos y se recibe una persona
        usuario = usuarioDAO.iniciarSesion(correo, password);
        if (usuario == null) {
            return false;
        } else {
            return true;
        }
    }

    public void imprimirTelefonos() {
        Map<Integer, Telefono> telefonos;
        telefonos = telefonoDAO.findAll();

        for (Map.Entry<Integer, Telefono> tele : telefonos.entrySet()) {
            System.out.println("uuu\n" + tele.toString());
        }
    }

    public void imprimirUsuario(Usuario usuario) {
        System.out.println(usuario);
    }

    public void imprimirUsuarios() {
        Map<String, Usuario> usuarios;
        usuarios = usuarioDAO.findAll();

        for (Map.Entry<String, Usuario> usu : usuarios.entrySet()) {
            System.out.println("uuu\n" + usu.toString());
        }
    }

    public void crearTelefono(Usuario usuario, Telefono telefono) {
        telefonoDAO.create(telefono);
        usuario.agregarTelefono(telefono);
        usuarioDAO.update(usuario);
    }

}
