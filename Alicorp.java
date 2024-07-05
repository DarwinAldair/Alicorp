import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Alicorp {

    private Scanner darwin = new Scanner(System.in);
    private double[] preciosDetergentes = {1.50, 1.20, 1.00, 2.00, 1.80};
    private double[] preciosJabones = {3.60, 2.60, 4.90};
    private double[] preciosDesinfectantes = {14.50, 13.99, 14.50, 15.20};
    private double[] preciosAceites = {6.50, 7.50, 8.50, 9.50, 7.50};
    private double[] preciosCereales = {2.50, 2.50, 2.50, 5.10, 5.10, 5.10};
    private double[] preciosGalletas = {5.30, 6.30, 5.30, 5.30, 6.30, 5.30};
    private double[] preciosHarinas = {14.00, 8.40, 10.50, 16.90};
    private double[] preciosKitsDento = {12.50, 15.00, 25.00, 8.50};
    private String[] productos = {"Detergentes", "Jabones", "Desinfectantes", "Aceites", "Cereales", "Galletas", "Harinas y Saturados", "Kits Dento"};
    private String[] detergentes = {"Bolívar  S/ 1.50", "Marcella  S/ 1.20", "Patito  S/ 1.00", "Opal  S/ 2.00", "Trome  S/ 1.80"};
    private String[] jabones = {"Jabón Bolívar  S/ 3.60", "Jabón Marcella  S/ 2.60", "Jabón Jumbo  S/ 4.90"};
    private String[] desinfectantes = {"Trome Desinfectante Premium x 350 g  S/ 14.50", "Control Desinfectante  S/ 13.99", "Intra Amor Desinfectante  S/ 14.50", "Intra Protex Desinfectante  S/ 15.20"};
    private String[] aceites = {"Mirasol 1L  S/ 6.50", "Primor 1L  S/ 7.50", "Trial 1L  S/ 8.50", "Frijol 1L  S/ 9.50", "Sayon 1L  S/ 7.50"};
    private String[] cereales = {"Cereal Fife x 42 g  S/ 2.50", "Copixx 42 g  S/ 2.50", "Zucks x 42 g  S/ 2.50", "Fresia  S/ 5.10", "Frut  S/ 5.10", "Flaquez  S/ 5.10"};
    private String[] galletas = {"Casino  S/ 5.30", "Puro x 65 g  S/ 6.30", "Margarita  S/ 5.30", "Tentación  S/ 5.30", "Glasitas  S/ 6.30", "Día  S/ 5.30"};
    private String[] harinas = {"Blanca Flor  S/ 14.00", "Master Break  S/ 8.40", "Mantequilla Mati 200 g  S/ 10.50", "Norf Chaef  S/ 16.90"};
    private String[] kitsDento = {"Enjuague Bucal  S/ 12.50", "Cepillos  S/ 15.00", "Pasta Dental  S/ 25.00", "Hilos Dentales  S/ 8.50"};
    private int[] carrito = new int[8];
    private double total = 0;
    private double subtotal;
    private double igv;
    private double totalPagar;

    public void menuPrincipal() {
        while (true){
            System.out.println("---------Bienvenido a Alicorp-----------");
            System.out.println("Marque alguna de las siguientes opciones:");
            System.out.println(" 1.- Comprar Detergente");
            System.out.println(" 2.- Comprar Jabón");
            System.out.println(" 3.- Comprar Desinfectante");
            System.out.println(" 4.- Comprar Aceite");
            System.out.println(" 5.- Comprar Cereal");
            System.out.println(" 6.- Comprar Galletas");
            System.out.println(" 7.- Comprar Harina");
            System.out.println(" 8.- Comprar Kit Dental");
            System.out.println(" 9.- Ver Carrito");
            System.out.println("10.- Pagar");
            System.out.println("11.- Salir");

            int opcion = darwin.nextInt();
            darwin.nextLine();

            switch (opcion) {
                case 1:
                    comprarDetergente();
                    break;
                case 2:
                    comprarJabon();
                    break;
                case 3:
                    comprarDesinfectante();
                    break;
                case 4:
                    comprarAceite();
                    break;
                case 5:
                    comprarCereal();
                    break;
                case 6:
                    comprarGalleta();
                    break;
                case 7:
                    comprarHarina();
                    break;
                case 8:
                    comprarKitDental();
                    break;
                case 9:
                    verCarrito();
                    break;
                case 10:
                    pagar();
                    break;
                case 11:
                    System.out.println("Gracias por visitar Alicorp. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void comprarDetergente() {
        System.out.println("------ Detergentes ------");
        for (int i = 0; i < detergentes.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + detergentes[i]);
        }
        System.out.println("Seleccione el detergente a comprar:");
        int opcion = darwin.nextInt();
        darwin.nextLine();
        if (opcion >= 1 && opcion <= detergentes.length) {
            System.out.println("¿Cuántos comprará?");
            int cantidad = darwin.nextInt();
            darwin.nextLine();
            carrito[0] += cantidad;
            total += cantidad * preciosDetergentes[opcion - 1];
            System.out.println("Ud ha pedido " + cantidad + " unidades de " + detergentes[opcion - 1]);
        } else {
            System.out.println("Opción no válida");
        }
    }

    private void comprarJabon() {
        System.out.println("------ Jabones ------");
        for (int i = 0; i < jabones.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + jabones[i]);
        }
        System.out.println("Seleccione el jabón a comprar:");
        int opcion = darwin.nextInt();
        darwin.nextLine();
        if (opcion >= 1 && opcion <= jabones.length) {
            System.out.println("¿Cuántos comprará?");
            int cantidad = darwin.nextInt();
            darwin.nextLine();
            carrito[1] += cantidad;
            total += cantidad * preciosJabones[opcion - 1];
            System.out.println("Ud ha pedido " + cantidad + " unidades de " + jabones[opcion - 1]);
        } else {
            System.out.println("Opción no válida");
        }
    }

    private void comprarDesinfectante() {
        System.out.println("------ Desinfectantes ------");
        for (int i = 0; i < desinfectantes.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + desinfectantes[i]);
        }
        System.out.println("Seleccione el desinfectante a comprar:");
        int opcion = darwin.nextInt();
        darwin.nextLine();
        if (opcion >= 1 && opcion <= desinfectantes.length) {
            System.out.println("¿Cuántos comprará?");
            int cantidad = darwin.nextInt();
            darwin.nextLine();
            carrito[2] += cantidad;
            total += cantidad * preciosDesinfectantes[opcion - 1];
            System.out.println("Ud ha pedido " + cantidad + " unidades de " + desinfectantes[opcion - 1]);
        } else {
            System.out.println("Opción no válida");
        }
    }

    private void comprarAceite() {
        System.out.println("------ Aceites ------");
        for (int i = 0; i < aceites.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + aceites[i]);
        }
        System.out.println("Seleccione el aceite a comprar:");
        int opcion = darwin.nextInt();
        darwin.nextLine();
        if (opcion >= 1 && opcion <= aceites.length) {
            System.out.println("¿Cuántos comprará?");
            int cantidad = darwin.nextInt();
            darwin.nextLine();
            carrito[3] += cantidad;
            total += cantidad * preciosAceites[opcion - 1];
            System.out.println("Ud ha pedido " + cantidad + " unidades de " + aceites[opcion - 1]);
        } else {
            System.out.println("Opción no válida");
        }
    }

    private void comprarCereal() {
        System.out.println("------ Cereales ------");
        for (int i = 0; i < cereales.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + cereales[i]);
        }
        System.out.println("Seleccione el cereal a comprar:");
        int opcion = darwin.nextInt();
        darwin.nextLine();
        if (opcion >= 1 && opcion <= cereales.length) {
            System.out.println("¿Cuántos comprará?");
            int cantidad = darwin.nextInt();
            darwin.nextLine();
            carrito[4] += cantidad;
            total += cantidad * preciosCereales[opcion - 1];
            System.out.println("Ud ha pedido " + cantidad + " unidades de " + cereales[opcion - 1]);
        } else {
            System.out.println("Opción no válida");
        }
    }

    private void comprarGalleta() {
        System.out.println("------ Galletas ------");
        for (int i = 0; i < galletas.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + galletas[i]);
        }
        System.out.println("Seleccione la galleta a comprar:");
        int opcion = darwin.nextInt();
        darwin.nextLine();
        if (opcion >= 1 && opcion <= galletas.length) {
            System.out.println("¿Cuántos comprará?");
            int cantidad = darwin.nextInt();
            darwin.nextLine();
            carrito[5] += cantidad;
            total += cantidad * preciosGalletas[opcion - 1];
            System.out.println("Ud ha pedido " + cantidad + " unidades de " + galletas[opcion - 1]);
        } else {
            System.out.println("Opción no válida");
        }
    }

    private void comprarHarina() {
        System.out.println("------ Harinas y Saturados ------");
        for (int i = 0; i < harinas.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + harinas[i]);
        }
        System.out.println("Seleccione la harina a comprar:");
        int opcion = darwin.nextInt();
        darwin.nextLine();
        if (opcion >= 1 && opcion <= harinas.length) {
            System.out.println("¿Cuántos comprará?");
            int cantidad = darwin.nextInt();
            darwin.nextLine();
            carrito[6] += cantidad;
            total += cantidad * preciosHarinas[opcion - 1];
            System.out.println("Ud ha pedido " + cantidad + " unidades de " + harinas[opcion - 1]);
        } else {
            System.out.println("Opción no válida");
        }
    }

    private void comprarKitDental() {
        System.out.println("------ Kits Dentales ------");
        for (int i = 0; i < kitsDento.length; i++) {
            System.out.println("Opción " + (i + 1) + ": " + kitsDento[i]);
        }
        System.out.println("Seleccione el kit dental a comprar:");
        int opcion = darwin.nextInt();
        darwin.nextLine();
        if (opcion >= 1 && opcion <= kitsDento.length) {
            System.out.println("¿Cuántos comprará?");
            int cantidad = darwin.nextInt();
            darwin.nextLine();
            carrito[7] += cantidad;
            total += cantidad * preciosKitsDento[opcion - 1];
            System.out.println("Ud ha pedido " + cantidad + " unidades de " + kitsDento[opcion - 1]);
        } else {
            System.out.println("Opción no válida");
        }
    }

    private void verCarrito() {
        System.out.println("------ Carrito de Compras ------");
        if (total == 0) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Contenido del carrito:");
            System.out.println("1. Detergentes: " + carrito[0] + " unidades");
            System.out.println("2. Jabones: " + carrito[1] + " unidades");
            System.out.println("3. Desinfectantes: " + carrito[2] + " unidades");
            System.out.println("4. Aceites: " + carrito[3] + " unidades");
            System.out.println("5. Cereales: " + carrito[4] + " unidades");
            System.out.println("6. Galletas: " + carrito[5] + " unidades");
            System.out.println("7. Harinas: " + carrito[6] + " unidades");
            System.out.println("8. Kits Dentales: " + carrito[7] + " unidades");
            System.out.println("Total a pagar: S/ " + total);
        }
    }

    private void pagar() {
        if (total == 0) {
            System.out.println("El carrito está vacío. No hay nada que pagar.");
            return;
        }

        System.out.println("------ Pago ------");
        System.out.println("El total a pagar es: S/ " + total);
        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");

        int metodoPago = darwin.nextInt();
        darwin.nextLine();

        switch (metodoPago) {
            case 1:
                pagarConEfectivo();
                break;
            case 2:
                pagarConTarjeta();
                break;
            default:
                System.out.println("Método de pago no válido.");
        }
    }

    private void pagarConEfectivo() {
        System.out.println("Ingrese el monto con el que pagará:");
        double montoPagado = darwin.nextDouble();
        darwin.nextLine();
        if (montoPagado >= total) {
            double cambio = montoPagado - total;
            System.out.println("Pago recibido. Su cambio es: S/ " + cambio);
            PagoBoleta();
            ExportarBoleta();
            total = 0;
            for (int i = 0; i < carrito.length; i++) {
                carrito[i] = 0;
            }
        } else {
            System.out.println("Monto insuficiente. Por favor, ingrese un monto mayor o igual al total.");
        }
    }

    private void pagarConTarjeta() {
        System.out.println("------ Pago ------");
        System.out.println("Ingrese el número de tarjeta de crédito (16 dígitos):");
        String numeroTarjeta = darwin.nextLine();
        if (!esNumeroTarjetaValido(numeroTarjeta)) {
            System.out.println("Número de tarjeta inválido. Asegúrese de que tenga 16 dígitos.");
            return;
        }

        System.out.println("Ingrese la fecha de vencimiento de la tarjeta (MM/AA):");
        String fechaVencimiento = darwin.nextLine();
        if (!esFechaVencimientoValida(fechaVencimiento)) {
            System.out.println("Fecha de vencimiento inválida. Asegúrese de que esté en el formato MM/AA.");
            return;
        }

        System.out.println("Ingrese el código de seguridad (CVV) de la tarjeta (3 dígitos):");
        String cvv = darwin.nextLine();
        if (!esCVVValido(cvv)) {
            System.out.println("Código de seguridad (CVV) inválido. Asegúrese de que tenga 3 dígitos.");
            return;
        }

        System.out.println("Pago realizado con éxito. ¡Gracias por su compra!");
        ExportarBoleta();
        carrito = new int[8];
        total = 0;
    }

    private boolean esNumeroTarjetaValido(String numero) {
        return numero.matches("\\d{16}");
    }

    private boolean esFechaVencimientoValida(String fecha) {
        return fecha.matches("(0[1-9]|1[0-2])/[0-9]{2}");
    }

    private boolean esCVVValido(String cvv) {
        return cvv.matches("\\d{3}");
    }

    private void PagoBoleta() {
        double[] preciosTotales = {
                carrito[0] * preciosDetergentes[0],
                carrito[1] * preciosJabones[0],
                carrito[2] * preciosDesinfectantes[0],
                carrito[3] * preciosAceites[0],
                carrito[4] * preciosCereales[0],
                carrito[5] * preciosGalletas[0],
                carrito[6] * preciosHarinas[0],
                carrito[7] * preciosKitsDento[0]
        };
        subtotal = Arrays.stream(preciosTotales).sum();
        igv = subtotal * 0.18;
        totalPagar = subtotal + igv;

        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL : S/ " + subtotal);
        System.out.println(" IGV : S/ " + igv);
        System.out.println(" TOTAL : S/ " + totalPagar);
    }

    private void ExportarBoleta() {
        try {
            File archivo = new File("boleta.txt");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("----BOLETA DE VENTA---------\n");
            escritor.write(" SUBTOTAL : S/ " + subtotal + "\n");
            escritor.write(" IGV : S/ " + igv + "\n");
            escritor.write(" TOTAL : S/ " + totalPagar + "\n");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al exportar la boleta.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Alicorp tienda = new Alicorp();
        tienda.menuPrincipal();
    }
}
