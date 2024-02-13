package cuentas;


import cuentas.CCuenta;
/**
 * La clase Main contiene el método principal (main) que inicia la ejecución del programa.
 */
public class Main {
/**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Argumentos de la línea de comandos (no utilizado en este caso).
     */
    public static void main(String[] args) {
        
        CCuenta cuenta1;
        double saldoActual;
        float cantidad = 1000.0f;  // Declarar la variable cantidad
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
         // Llamada al método operativa_cuenta
        operativa_cuenta(cuenta1, cantidad);// Pasar la variable cantidad
    }

     
    /**
     * Realiza operaciones en una cuenta y muestra resultados.
     *
     * @param cuenta   La cuenta en la que se realizarán las operaciones.
     * @param cantidad La cantidad a utilizar en las operaciones.
     */
    private static void operativa_cuenta(CCuenta cuenta , float cantidad) {
        try {
            System.out.println("Operativa de la cuenta");
            cuenta.retirar(1000);
            System.out.println("Saldo después de retirar  "+ cantidad + cuenta.estado());
            cuenta.ingresar(500);
            System.out.println("Saldo después de ingresar  " +cantidad + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Error en la operativa de la cuenta: " + e.getMessage());
           
                    
           
                 
                    
        }
    }
}
    

