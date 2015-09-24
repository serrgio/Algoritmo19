package br.com.serrgio.algoritmo19;

import org.junit.Test;

public class matematicaTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testlognNinvalido() {
        int n = 0;
        int k = 2;
        matematica.logn(n, k);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testlognKinvalido() {
        int n = 1;
        int k = 1;
        matematica.logn(n, k);
    }   
}
