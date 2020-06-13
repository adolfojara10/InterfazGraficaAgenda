/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adolfo
 */
public class Usuario {

    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    //atributo de telelfonos
    private List<Telefono> listaTelefonos;

    //constructores
    public Usuario() {
        listaTelefonos = new ArrayList<>();
    }

    public Usuario(String cedula, String nombre, String apellido, String correo,
            String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        listaTelefonos = new ArrayList<>();
    }

    //getters y setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //para obtener la lista de telefonos
    public List<Telefono> getListaTelefonos() {
        return listaTelefonos;
    }

    //para agregar un telefono
    public void agregarTelefono(Telefono telefono) {
        listaTelefonos.add(telefono);
    }

    public void actualizarTelefono(Telefono telefono) {
        if (listaTelefonos.contains(telefono)) {
            int index = listaTelefonos.indexOf(telefono);
            listaTelefonos.set(index, telefono);
        }
    }

    public void eliminarDireccion(Telefono telefono) {
        if (listaTelefonos.contains(telefono)) {
            int index = listaTelefonos.indexOf(telefono);
            listaTelefonos.remove(index);
        }
    }

    //imprimir telefonos
    public List<Telefono> listar() {
        return listaTelefonos;
    }

    //buscar un telefono
    public Telefono buscar(int id) {

        return listaTelefonos.get(id);

    }

    @Override
    public String toString() {
        return "\nUsuario:\n" + "cedula: " + cedula + "\nnombre: " + nombre
                + ", apellido: " + apellido + "\ncorreo: " + correo
                + ", contraseña: " + contraseña + "\ntelefono(s):\n " + listaTelefonos;
    }
}
