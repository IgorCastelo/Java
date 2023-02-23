
package ConstrutorThis;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //construtor
   public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    
        System.out.println("Chamando o costrutor com 5 parametros");
   }

    public Carro(String marca, String modelo){
        this(marca, modelo, 10);
        System.out.println("Chamando o costrutor com 2 parametros");
    }

    public Carro() {}

    //Procedimentos
    public void exibirAutonimoia(){
       System.out.println("A autonomia do carro e:"+ this.capCombustivel*this.consumoCombustivel+"km");
    }
    
    public double obterAutonomia(){
        System.out.println("Metodo Obter Autonomia foia chamado");
        return this.capCombustivel * this.consumoCombustivel;
    } 
    private double divideKMPorConsumoCombustivel(double km){
    return km/consumoCombustivel;
    }
    public double calcularCombustivel(double km){
                return divideKMPorConsumoCombustivel(km);
    }   
}   
