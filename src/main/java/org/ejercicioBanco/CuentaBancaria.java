package org.ejercicioBanco;

public abstract class CuentaBancaria {

    public long id;
    protected int numeroDeCuenta;
    protected String titular;
    protected double saldo;

    //constructores (si bien una clase abstracta no puede ser instanciada, pongo los contructures para que las clases hijas hereden y ellas si pueden instanciar.

    protected CuentaBancaria() {
    }

    protected CuentaBancaria(int numeroDeCuenta, String titular, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //getter y setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double verSaldo() {
        return saldo;
    }

    public void ingresarDinero(double dinero) {
        this.saldo = this.saldo + dinero;
    }

    public void retirarDinero(double dinero) {
        if (dinero > this.saldo) {
                System.out.println("Saldo insuficiente para realizar el retiro. ");
        }else{
                this.saldo = this.saldo - dinero;
                System.out.println("Operacion exitosa, su nuevo saldo es: " + this.saldo);
            }
        }


    //metodos abastractos
    public abstract double transferir();

    public abstract double depositar();

    public abstract double retirar();

    public abstract double consultaSaldo();

}
