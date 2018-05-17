/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

/**
 *
 * @author David
 */
public class test {
    
    Compte compte=new Compte(500);
    
    public int ingresar(int num){
        compte.Diposit(num);
        return compte.Saldo();
    }
    
    public int enretirament(int num){
        compte.Enretirament(num);
        return compte.Saldo();
    }
    /*
    public int transferencia(int num){
        compte.Diposit(num);
        return compte.Saldo();
    }
    */
}
