
package POOClasses;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonimoia(){
        System.out.println("A autonomia do carro e:"+ capCombustivel*consumoCombustivel+"km");
    }

        }
