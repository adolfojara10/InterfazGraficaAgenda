/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.idao;

import ec.ups.edu.modelo.Telefono;
import java.util.Map;

/**
 *
 * @author Adolfo
 */
public interface ITelefonoDAO {

    /**
     * metodo agregarTelefono.
     *
     * este metodo es usado cuando el usuario inicia Sesion. Una vez hecho eso,
     * el usuario podra agregar numero de telefono a su cuenta. Recibe como
     * parametro el usuario que inicio sesion y un telefono ya creado y lo añade
     * al diccionario de telefonos del usuario. Devuelve un el diccionario de
     * telefonos para imprimir al usuario sus nuevos numeros telefonicos.
     *
     * @param telefono
     */
    public void create(Telefono telefono);

    /**
     * metodo readTelefono.
     *
     * este metodo es el encargado de recibir al usuario que inicio sesion y el
     * codigo de uno de sus telefonos. Busca el telefono del usuario y lo
     * devuelve para su futura impresion.
     *
     * @param id
     * @return Telefono
     */
    public Telefono read(int id);

    /**
     * metodo agregarTelefonoEditado.
     *
     * este metodo es el encargado de recibir el usuario que ya ha iniciado
     * sesion, el telefono ya creado, y el codigo del telefono antiguo. En el
     * telefono antiguo se borra y luego se añade el nuevo telefono que tiene
     * diferentes datos. Devuelve el nuevo diccionario de telefonos del usuario.
     *
     * @param telefono
     */
    public void update(Telefono telefono);

    /**
     * metodo eliminarTelefono.
     *
     * este metodo recibe al usuario que ha iniciado sesion, y al codigo del
     * telefono que va a hacer eliminado. Borra el telefono y devuelve el nuevo
     * diccionario del usuario.
     *
     * @param telefono
     */
    public void delete(Telefono telefono);

    /**
     * metodo findAll.
     *
     * metodo encargado de devolver todos los telefenos creados.
     *
     * @return Map
     */
    public Map<Integer, Telefono> findAll();
    
    public int codigoTelefono();
    
}
