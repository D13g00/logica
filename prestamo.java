/**
 * prestamo
 */
public class prestamo {
    public static void main(String[] args) {
        String nombre = IO.readln("Escribe tu nombre: ");
        float ingresos_mensuales = Float.parseFloat(IO.readln("Ingresos mensuales: "));
        float monto_solicitado = Float.parseFloat(IO.readln("Monto solicitado: "));

        if (monto_solicitado > ingresos_mensuales) {
            System.out.println("No puedes solicitar un préstamo");
        } else {
            System.out.println("Puedes solicitar un préstamo");

            int meses = Integer.parseInt(IO.readln("Meses: "));
            float pago_mensual = Float.parseFloat(IO.readln("Pago mensual: "));
            float interes = Float.parseFloat(IO.readln("Interés: "));
            float monto_total = Float.parseFloat(IO.readln("Monto total: "));
        }
    }
}
