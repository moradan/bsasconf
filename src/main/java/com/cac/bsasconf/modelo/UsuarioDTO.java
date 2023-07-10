
package com.cac.bsasconf.modelo;

public class UsuarioDTO {
    private final String NOMBRE_ADMIN = "rodrigo";
    private final String PASSWORD_ADMIN = "123";
    private String nombre;
    private  String password;

    public UsuarioDTO(String nombre, String password) {
        this.nombre = nombre.toLowerCase();
        this.password = password;
    }

    public boolean autenticar() {
        return (nombre.equals(NOMBRE_ADMIN) && password.equals(PASSWORD_ADMIN));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "nombre=" + nombre + ", password=" + password + '}';
    }
  
}
