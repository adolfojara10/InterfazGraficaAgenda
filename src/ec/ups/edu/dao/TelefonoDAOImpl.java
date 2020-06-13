/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.dao;

import ec.ups.edu.idao.ITelefonoDAO;
import ec.ups.edu.modelo.Telefono;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Adolfo
 */
public class TelefonoDAOImpl implements ITelefonoDAO{
    private Map<Integer, Telefono> listaTelefonos;

    public TelefonoDAOImpl() {
        listaTelefonos = new HashMap<>();
    }

    //mandar un telefono a la base datos
    @Override
    public void create(Telefono telefono) {
        listaTelefonos.put(telefono.getCodigo(), telefono);
    }

    //para devolver un telefono de la base de datos
    @Override
    public Telefono read(int id) {
        for (Map.Entry<Integer, Telefono> telefono : listaTelefonos.entrySet()) {
            int cod = telefono.getKey();
            if (cod == id) {
                Telefono tele = listaTelefonos.get(cod);
                return tele;
            }
        }
        return null;
    }

    //para actualizar un telefono
    @Override
    public void update(Telefono telefono) {
        for (Map.Entry<Integer, Telefono> telefono2 : listaTelefonos.entrySet()) {
            int cod = telefono2.getKey();
            if (cod == telefono.getCodigo()) {
                listaTelefonos.replace(cod, telefono);
                break;
            }
        }

    }

    //para eliminar un telefono
    @Override
    public void delete(Telefono telefono) {
        for (Map.Entry<Integer, Telefono> telefono2 : listaTelefonos.entrySet()) {
            int cod = telefono2.getKey();
            if (cod == telefono.getCodigo()) {
                listaTelefonos.remove(telefono.getCodigo());
                break;
            }
        }
    }

    //para devolver un mapa de telefonos
    @Override
    public Map<Integer, Telefono> findAll() {
        return listaTelefonos;
    }
}
