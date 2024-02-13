
package cuentas;
/**
 * @author ANDRE
 * @version 1.0
 * @since 12/2/24
 
 * La clase Ccuenta representa una cuenta bancaria con funciones para ingresar, retirar,
 * y gestionar información como nombre, número de cuenta, saldo y tipo de interés.
 */
 
public class CCuenta {


    private String nombre;  // Nombre del titular de la cuenta
    private String cuenta;  // Número de cuenta
    private double saldo;   // Saldo actual de la cuenta
    private double tipoInterés;  // Tasa de interés de la cuenta

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre = nom;
        cuenta = ue;
        saldo = sal;
        tipoInterés = tipo;
    }

    public double estado()
    {
        return getSaldo();
    }
     /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad Cantidad a ingresar. Debe ser mayor que 0.
     * @throws Exception Si la cantidad es negativa.
     * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad Cantidad a retirar. Debe ser mayor que 0.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
       
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre El nombre del titular cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

   /**
     * Establece el número de cuenta.
     *
     * @param cuenta El número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

     /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

     /**
     * Establece el saldo actual de la cuenta.
     *
     * @param saldo El saldo actual de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   /**
     * Obtiene la tasa de interés de la cuenta.
     *
     * @return La tasa de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

     /**
     * Establece la tasa de interés de la cuenta.
     *
     * @param tipoInterés La tasa de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
