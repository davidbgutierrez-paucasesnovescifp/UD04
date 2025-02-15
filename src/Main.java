import cuentas.CCuenta;

public class Main {


    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1,100);
    }

    /**
     * Operativa para comprobar el saldo actual y realiza las operaciones de retirar e ingresar.
     * @param cuenta Cuenta del usuario
     * @param cantidad Cantidad a retirar e ingresar.
     */
    public static void operativa_cuenta(CCuenta cuenta,float cantidad) {
        double saldoActual = cuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
