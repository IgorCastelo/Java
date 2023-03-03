package ModificadoresDeAcesso.teste;

import ModificadoresDeAcesso.Pessoa;


public class Aluno extends Pessoa{
   
    private String curso;
    private double[] notas;
    
    public Aluno(){
        super();
    }
     public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
     }

    public String getCurso() {
        return curso;
    }

    public void setCursos(String[] cursos) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double [] notas) {
        this.notas = notas;
    }
    public double calcularMedia(){
    return 0;
    }
    public boolean verificarAprovacao(){
    return true;
    }
    public void metodoQualquer(){
    super.setCpf("9999999999");
    //ou this.getCpf();
    }
    }

