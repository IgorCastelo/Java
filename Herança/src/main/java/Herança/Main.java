
package Herança;


public class Main {

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("IGor");
        v.setSalario(1000.0f);
        v.setCpf("9999999999");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salario ndo vendedor é : " + v.calcularSalario());
        Motorista m = new Motorista();
        
        
    }
    
}
