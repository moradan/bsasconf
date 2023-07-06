package com.cac.bsasconf;

import com.cac.bsasconf.oradores.Orador;
import java.util.List;

public interface Modelo {
    /**
     * Devuelve una lista de oradores existentes
     * @return 
     */
    public List<Orador> getOradores();
    
    /**
     * Devuelve un Orador por ID
     * @param id el id del Orador a devolver
     * @return El Orador encontrado por ID o null si no existe
     */
    public Orador getOrador(int id);
    
    /**
     * Agrega un Orador al modelo
     * @param Orador El Orador a agregar
     * @return La cantidad de registros modificados
     */
    public int addOrador(Orador Orador);
    
    /**
     * Modifica un Orador del modelo
     * @param Orador El Orador que contiene los datos para modificar
     * @return La cantidad de registros modificados
     */
    public int updateOrador(Orador Orador);
    
    /**
     * Borra un Orador por ID
     * @param id el id del Orador a borrar
     * @return La cantidad de registros modificados
     */
    public int removeOrador(int id);
}
