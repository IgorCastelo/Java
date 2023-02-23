/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoEx2;

/**
 *
 * @author freit
 */
public class Cordenador extends Funcionario {
    
    private int quantidadeAlunos;
    
    public int getQuantidadeAlunos(){
       return quantidadeAlunos; 
    }
    public void setQuantidadeAlunos(int quantidadeAlunos){
        this.quantidadeAlunos = quantidadeAlunos;
    }
    
    public double calcularSalario(){
       return getQuantidadeAlunos()*20;
    }
}
