/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class testTest {

    test t = new test();
    Compte compte = new Compte(100);

    @Test
    public void Diposit() {
        assertEquals(1000, t.ingresar(500));

    }

    @Test
    public void Enretirament() {
        assertEquals(400, t.enretirament(100));

    }

    @Test
    public void Transferencia() {
        assertEquals(200, t.transferencia(compte,100));

    }

}
