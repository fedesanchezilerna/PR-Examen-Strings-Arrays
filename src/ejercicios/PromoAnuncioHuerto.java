package ejercicios;

public class PromoAnuncioHuerto {

    private static final String anuncio = "Hortalizas ricas en calcio y vitaminas recogidas en el día listas para ser comidas";
    private static final PromoAnuncioHuerto promocionHuerto = new PromoAnuncioHuerto();

    public static void promocionarHuerto() {
        // Imprimir precio del anuncio
        promocionHuerto.precioAnuncio(anuncio);

        // Imprimir anuncio (mayusc)
        String anuncioEnMayusculas = promocionHuerto.anuncioMayuscula(anuncio);
        System.out.println('"' + anuncioEnMayusculas + '"');
    }

    public static void anunciarHuerto() {
        // Anuncio a mayúsculas
        String anuncioEnMayusculas = promocionHuerto.anuncioMayuscula(anuncio);

        // Imprimir anuncio (al revés)
        mostrarAnuncioAlReves(anuncioEnMayusculas);
    }

    // Calcula el precio total del anuncio
    public void precioAnuncio(String anuncio) {
        double TARIFA_POR_PALABRA = 0.07; // Tarifa -> 7 céntimos / palabra

        // División del anuncio en palabras / espacios
        String[] palabras = anuncio.split(" ");

        // Contar cantidad de palabras
        int cantidadPalabras = palabras.length;

        // Calcular el precio total
        double precioTotal = cantidadPalabras * TARIFA_POR_PALABRA;

        // Mostrar el resultado
        System.out.printf("Estimado Ramiro su anuncio costará %d x %.0f = %.0f céntimos.%n",
                cantidadPalabras, TARIFA_POR_PALABRA * 100, precioTotal * 100);
    }

    // Devuelve anuncio en mayúsculas
    public String anuncioMayuscula(String anuncio) {
        return anuncio.toUpperCase();
    }

    // Muestra el anuncio al revés (de abajo hacia arriba)
    public static void mostrarAnuncioAlReves(String anuncio) {
        // División / espacios
        String[] palabras = anuncio.split(" ");

        // Imprimir palabras en orden inverso (cambio inicio variable i; límite 0; i--)
        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.println(palabras[i]);
        }
    }
}

