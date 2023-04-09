package MetodosOrdenamiento;

public class _2_MetodoBurbujaDobleDireccion {

    public static double[] BurbujaDobleDireccion(double[] x) {

        double aux;
        int primero, ultimo, dir;
        primero = 1;
        ultimo = x.length - 1;
        dir = x.length - 1;

        System.out.println("\n\n2. Burbuja En Doble Dirección");

        while ( ultimo >= primero ) {
            for( int i = ultimo ; i >= primero ; i--) {
                if ( x [i - 1] > x[ i ] ) {
                    aux = x[i - 1];
                    x[i - 1] = x[ i ];
                    x[ i ] = aux;
                    dir = i;
                }
            }
            primero = dir + 1;
            for( int i = primero ; i <= ultimo; i++ ) {
                if ( x [i - 1] > x[ i ] ) {
                    aux = x[i - 1];
                    x[i - 1] = x[ i ];
                    x[ i ] = aux;
                    dir = i;
                }
            }
            ultimo = dir - 1;
        }
        System.out.println("Arreglo ordenado");

        return x;
    }

}
