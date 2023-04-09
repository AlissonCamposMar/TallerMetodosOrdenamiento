package MetodosOrdenamiento;

public class _10_MetodoStoogeSort {

    public static void StoogeSort (double[] arreglo){
        System.out.println("\n\n10. Método StoogeSort");
        stoogeSort(arreglo, 0, 0);
        System.out.println("Arreglo ordenado");
    }
    public static double[] stoogeSort(double[] arreglo, int l, int h) {
        if (l >= h)
            return arreglo;

        // Si el primer elemento es más pequeño
        // que el último, cámbialos
        if (arreglo[l] > arreglo[h]){
            double auxt = arreglo[l];
            arreglo[l] = arreglo[h];
            arreglo[h] = auxt;
        }

        // Si hay más de 2 elementos en
        // la matriz
        if (h - l + 1 > 2){
            int auxt = (h - l + 1) / 3;

            // Ordenar recursivamente los primeros 2/3 elementos
            stoogeSort(arreglo, l, h-auxt);

            // Ordenar recursivamente los últimos 2/3 elementos
            stoogeSort(arreglo, l + auxt, h);

            // Ordenar recursivamente los primeros 2/3 elementos
            // otra vez para confirmar
            stoogeSort(arreglo, l, h - auxt);
        }
        return arreglo;
    }
}
