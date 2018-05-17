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
 * @author alumne
 */
public class testTest {

    test t=new test();
    @Test
    public void Diposit() {
        assertEquals(1000, t.ingresar(500));
        
    }
    
    @Test
    public void Enretirament() {
        assertEquals(400, t.enretirament(100));
        
    }
    
    /*
    @Test
    public void Transferencia() {
        
        
    }
    */
}
