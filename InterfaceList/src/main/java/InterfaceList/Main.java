/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author freit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         List<String> listaNome = new ArrayList<>();
        listaNome.add("Igor"); 
        listaNome.add("Francisca");
        listaNome.add("Assis");
        listaNome.add("Isaura");
        listaNome.add("Lucas");
        
        System.out.println("Antes");
        
        for(String nome:listaNome){
        System.out.println(nome);
        }
        listaNome.set(1,"MAE S2");
        
        System.out.println("");
        System.out.println("");
        
        for(String nome: listaNome)
            System.out.println(nome);
        
    }
    
}
    
