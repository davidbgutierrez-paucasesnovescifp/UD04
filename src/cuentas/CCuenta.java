package cuentas;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Inicializar clase sin parámetros
     * @author David Gutiérrez
     */
    public CCuenta()
    {
    }

    /**
     * Inicializar clase con todas las propiedades
     * @param nom Nombre del propietario de la cuenta.
     * @param cue Número de la cuenta.
     * @param sal Salario de la cuenta.
     * @param tipo Tipo de interés
     * @author David Gutiérrez
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Obtiene el nombre del propietario de la cuenta
     * @return Nombre del propietario de la cuenta
     * @author David Gutiérrez
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del propietario de la cuenta
     * @param nombre Nombre del propietario de la cuenta
     * @author David Gutiérrez
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de la cuenta
     * @return Número de la cuenta
     * @author David Gutiérrez
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de la cuenta
     * @param cuenta Número de la cuenta
     * @author David Gutiérrez
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * @return Tipo de interés
     * @author David Gutiérrez
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * @param tipoInteres El tipo de interés.
     * @author David Gutiérrez
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Obtiene la cantidad de saldo actual de la cuenta.
     * @return saldo
     * @author David Gutiérrez
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * Incrementa el saldo de la cuenta.
     * @param cantidad Cantidad a ingresar.
     * @throws Exception La cantidad es negativa
     * @author David Gutiérrez
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Retira el saldo de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception La cantidad es negativa o no hay suficiente saldo para retirar
     * @author David Gutiérrez
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
