package br.com.serrgio.algoritmo19;

/**
 * Serviços oferecidos para calculo de log
 */
public class matematica {

    /**
     *
     * LogN
     *
     * @param n
     * @param k
     * @return e
     */
    public static int logn(int n, int k) {

        if ((n < 1) || (k < 2)) {
            throw new IllegalArgumentException("O valor de n ou de k é inválido");
        }

        int i = 2;
        int e = n + 1;
        int t = n;

        while (i <= k) {
            t = ((t * n) / i);
            e = e + t;
            i = i + 1;
        }
        return e;
    }
}
