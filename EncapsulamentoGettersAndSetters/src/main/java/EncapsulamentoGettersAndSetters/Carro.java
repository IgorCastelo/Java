 
package EncapsulamentoGettersAndSetters;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro() {}

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }
    
    
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
