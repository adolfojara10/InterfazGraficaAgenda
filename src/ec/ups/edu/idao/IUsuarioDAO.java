/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.idao;

import ec.ups.edu.modelo.Usuario;
import java.util.Map;

/**
 *
 * @author Adolfo
 */
public interface IUsuarioDAO {

    /**
     * metodo create.
     *
     * este recibe un usuario ya creado y lo añade al diccionario de usuarios.
     *
     * @param usuario
     */
    public void create(Usuario usuario);

    /**
     * metodo read.
     *
     * este metodo recibe un parametro de tipo String que es llamado cedula,
     * pero que puede ser una cedula o un correo electronico. Este parametro nos
     * sirve para encontrar el usuario y devolver un objeto de tipo Uusuario.
     *
     * @param cedula
     * @return Usuario
     */
    public Usuario read(String cedula);

    /**
     * metodo update.
     *
     * este metodo recibe un objeto de tipo usuario y lo reemplza por uno ya
     * existente.
     *
     * @param usuario
     */
    public void update(Usuario usuario);

    /**
     * metodo delete.
     *
     * este metodo elimina un usuario ya creado. Recibe el usuario y lo busca y
     * luego lo elimina.
     *
     * @param usuario
     */
    public void delete(Usuario usuario);

    /**
     * metodo iniciarSesion.
     *
     * este metodo recibe el correo y la contraseña digitadas por un usuario que
     * desea inicar sesion de su cuenta. estos dos parametros compara con los
     * parametros de todos los clientes y una vez que los encuentra devuelve el
     * usuario encontrado.
     *
     * @param correo
     * @param contraseña
     * @return Usuario
     */
    public Usuario iniciarSesion(String correo, String contraseña);

    /**
     * metodo llamarUsuarios.
     *
     * este metodo solamente envia el diccionario de todos los usuarios
     *
     * @return Map<String, Usuario>
     */
    public Map<String, Usuario> findAll();
}
