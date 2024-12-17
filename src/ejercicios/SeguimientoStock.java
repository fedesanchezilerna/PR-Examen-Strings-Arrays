package ejercicios;

public class SeguimientoStock {

    public static final String[] nombresHortalizas = {"Zanahorias", "Tomates", "Pepinos", "Alubias", "Sandías", "Melones", "Cardos", "Borrajas"};

    public static void guardaStock(String[] array) {
        int[] cantidades = new int[array.length]; // Array para almacenar cantidades de cada hortaliza

        int total = 0; // Cantidad total hortalizas
        int menorCantidad = Integer.MAX_VALUE; // Menor cantidad
        String hortalizaMenor = ""; // Nombre hortaliza con menor cantidad

        System.out.println("Hola! Dime cuántas hortalizas tienes de:");

        // Rellenar el array con valores aleatorios y mostrar los valores
        for (int i = 0; i < array.length; i++) {
            cantidades[i] = (int) ((Math.random() * 70) + 2);  // Generador num random (entre 2 y 70)
            System.out.println(array[i] + ": " + cantidades[i]);

            total += cantidades[i]; // Sumar al total

            // Comprobar/actualizar hortaliza con menor cantidad
            if (cantidades[i] < menorCantidad) {
                menorCantidad = cantidades[i];
                hortalizaMenor = array[i];
            }
        }

        // Calcular la media
        double media = (double) total / array.length;

        // Imprimir resultados
        System.out.println(); // Salto de línea visual
        System.out.println("La cantidad total de hortalizas es: " + total);
        System.out.println("¡La hortaliza " + hortalizaMenor + " solo tiene " + menorCantidad + " unidades!");
        System.out.printf("La media de las hortalizas es: %.2f%n", media);
    }

}

