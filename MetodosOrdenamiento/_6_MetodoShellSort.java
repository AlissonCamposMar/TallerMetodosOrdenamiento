package MetodosOrdenamiento;

public class _6_MetodoShellSort {
    public static void shellSort(double a[]) {

        System.out.println("\n\n6. Método shellSor");

        for (int incr = a.length/2; incr>0; incr/= 2 ) {
            for (int i = incr ; i < a.length ; i++ ) {
                int j = i - incr;
                while (j >= 0) {
                    if (a[j] > a[j + incr]) {
                        double T = a[ j ];
                        a[ j ] = a[j+incr];
                        a[j+incr] = T;
                        j -= incr;
                    } else {
                        j = -1;
                    }
                }
            }
        }
        System.out.println("Arreglo ordenado");
    }
}
