public class prestamo_personal {
    public static void main(String[] args) {

        String Nombre = IO.readln("Ingrese el nombre del solicitante: ");
        Float Ingreso = Float.parseFloat(IO.readln("Ingrese el ingreso mensual: "));
        Float Monto_Solicitado = Float.parseFloat(IO.readln("Ingrese el monto solicitado: "));
        Float Meses_a_Pagar = Float.parseFloat(IO.readln("Ingrese el número de meses a pagar: "));

        Float Aprob = Ingreso * 3;
        Float Pago_Mes;
        Float Monto_Total;
        Float Interes;

        if (Monto_Solicitado <= Aprob) {

            if (Meses_a_Pagar <= 12) {
                Interes = (Monto_Solicitado / Meses_a_Pagar) * 0.03f;

            } else {
                if (Meses_a_Pagar > 12 && Meses_a_Pagar <= 24) {
                    Interes = (Monto_Solicitado / Meses_a_Pagar) * 0.05f;

                } else {
                    Interes = (Monto_Solicitado / Meses_a_Pagar) * 0.07f;
                }
            }

            Monto_Total = Monto_Solicitado + (Interes * Meses_a_Pagar);
            Pago_Mes = Monto_Total / Meses_a_Pagar;

            System.out.println("PRESTAMO APROBADO, Felicidades!!");
            System.out.println("Nombre del solicitante: " + Nombre);
            System.out.println("Monto solicitado: $" + Monto_Solicitado);
            System.out.println("Porcentaje de interes: " + Interes + "%");
            System.out.println("Numero de mensualidades: " + Meses_a_Pagar);
            System.out.println("Pago mensual: $" + Pago_Mes);
            System.out.println("Monto total a pagar: $" + Monto_Total);

        } else {

            System.out.println("PRESTAMO RECHAZADO, chambeale mas");
            System.out.println("El monto solicitado supera 3 veces el ingreso mensual.");
            System.out.println("El prestamo maximo que puedes pedir es: " + Aprob);
        }
    }
}

