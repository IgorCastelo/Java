
package POOClasses;

public class testeCarro {
    public static void main(String[] args){
    
        Carro van = new Carro();
        van.marca =  "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        van.exibirAutonimoia();
    }
}
