package git;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author professor
 */
public class Compte {
    private int saldo;
    
    /**
     *
     * @param saldoInicial
     */
    public Compte(int saldoInicial){
        saldo = saldoInicial;
    }
    
    /**
     *
     * @param quantitat
     */
    public void Diposit (int quantitat){
        saldo += quantitat;      
    }
    
    /**
     *
     * @param quantitat
     */
    public void Enretirament (int quantitat){
        saldo -= quantitat;
    }
    
    /**
     *
     * @param desti
     * @param quantitat
     */
    public void Transferencia (Compte desti, int quantitat){
        desti.Diposit(quantitat);
        Enretirament(quantitat);
    }
    
    /**
     *
     * @return
     */
    public int Saldo(){
        return saldo;
    }
    
}


