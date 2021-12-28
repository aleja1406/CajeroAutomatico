/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author aleja
 */
public class ClaseHija_Consulta extends ClasePadre_Abstracta {
    
    @Override
    public void Transacciones(){
        System.out.println("------------------------");
        System.out.println("tu saldo es "+getSaldo());
        System.out.println("------------------------");
        
    }
}