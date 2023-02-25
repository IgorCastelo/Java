package VariaveisEMetodosStaticos;

public class TesteCalculadora {
    
    static int resultSoma;
    public static void main(String[] args){
               
        System.out.println(MinhaCalculadora.soma(1,2,3));
        System.out.println(MinhaCalculadora.soma(3.0,3.0));
       
        resultSoma = soma2Valores(2,3);
        System.out.println(resultSoma);      
        }
     static int soma2Valores(int num1, int num2){   
             return MinhaCalculadora.soma(num1 , num2);
    }

}
