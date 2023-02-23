
package polimorfismoEx2;

public class Main {

    public static void main(String[] args) {
       Funcionario joao = new Funcionario();
       joao.setSalario(1300);
       
        System.out.println(joao.getSalario());// Vai imprimir 1300
        
        Cordenador cordenadorNoite = new Cordenador();
        cordenadorNoite.setQuantidadeAlunos(30);
        
        joao = cordenadorNoite;
        
         System.out.println(joao.calcularSalario());// Vai imprimir 1300

        Professor professorEMN = new Professor();
        
        professorEMN.setQuantidadeHoras(30);
       
        joao = professorEMN;
        
        System.out.println(joao.calcularSalario()); //Vai imprimir 2400
        
        
        
    }
    
}
