package MetodosOrdenamiento;

public class _4_MetodoPorInsercion {

    public static void porInsercion( double arreglo[] ) {

        System.out.println("\n\n4. Inserción");
        int n = arreglo.length;
        for (int i = 1; i < n; ++i) {
            double key = arreglo[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = key;
        }
        System.out.println("Arreglo ordenado");
    }
}
