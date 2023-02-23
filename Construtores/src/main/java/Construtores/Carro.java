
package Construtores;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //construtor
   Carro(String marca_,String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
   marca = marca_;
   modelo= modelo_;
   numPassageiros = numPassageiros_;
   capCombustivel = capCombustivel_;
   consumoCombustivel = consumoCombustivel_;
   }
  
  //Procedimentos 
   void exibirAutonimoia(){
        System.out.println("A autonomia do carro e:"+ capCombustivel*consumoCombustivel+"km");
    }
    
    double obterAutonomia(){
        System.out.println("Metodo Obter Autonomia foia chamado");
        return capCombustivel * consumoCombustivel;
    } 
       
}
