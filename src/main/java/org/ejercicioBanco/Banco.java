package org.ejercicioBanco;
import java.util.List;


public class Banco {
    private String sucursal;
    private String direccion;
    private int id;

    private List<Cliente> clientes;


    // constructores

    public Banco() {
    }

    public Banco(String sucursal, String direccion) {
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.id = id;
    }


    // getters y setters

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //metodos
    public double abrirCuenta(){

    }

    public void gestionarServicios(){

    }

}
