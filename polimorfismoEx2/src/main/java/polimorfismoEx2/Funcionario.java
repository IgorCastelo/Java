
package polimorfismoEx2;

public class Funcionario {
//Atributos
    
 private double salario;
 
 //M�todos
 
 public double getSalario(){
     return salario;
 }

 public void setSalario(double salario){
 this.salario = salario;
 }

 public double calcularSalario(){
    return this.getSalario();
 }
}
