import ejercicios.PromoAnuncioHuerto;
import ejercicios.SeguimientoStock;
import utils.Menu;
import utils.ScannerUtils;

public class HuertoApp {

    public static void main(String[] args) {
        int option;

        do {
            Menu.menuHuerto();
            option = ScannerUtils.readInt();

            System.out.println(); // Salto de línea visual

            switch (option) {
                case 1:
                    // Seguimiento de stock
                    SeguimientoStock.guardaStock(SeguimientoStock.nombresHortalizas);
                    break;
                case 2:
                    // Promocionar productos
                    PromoAnuncioHuerto.promocionarHuerto();
                    break;
                case 3:
                    // Anunciar huerto
                    PromoAnuncioHuerto.anunciarHuerto();
                    break;
                case 4:
                    // Salir del programa
                    System.out.println("Fin del programa. Examen realizado por Federico Sánchez Vidarte. 17 de diciembre de 2024.");
                    System.out.println("\nEspero vuestra respuesta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (option != 4);

        ScannerUtils.closeScanner();
    }
}

