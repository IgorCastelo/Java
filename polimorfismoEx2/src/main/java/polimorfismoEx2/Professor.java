package polimorfismoEx2;

public class Professor extends Funcionario {
    private int quantidadeHoras;
    
    public int getQuantidadeHoras(){
    return quantidadeHoras;
    }
    
    public void setQuantidadeHoras(int quantidadeHoras){
    this.quantidadeHoras = quantidadeHoras;
    }
    
    public double calcularSalario(){
    return getQuantidadeHoras() * 80;
    } 
    
}
