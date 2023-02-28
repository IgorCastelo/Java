
package RelacionamentoEntreClasses;

public class Main {


    public static void main(String[] args) {
      
        Contatos contato = new Contatos();
        contato.setNome("Francisca");
       // contato.setEndereco("Avenida Goncalves Dias, 893, Rodolfo Teofilo. Fortaleza-ce");
       // contato.setTelefone("11 (85)9-91859694");
    //CRIAR OBJETO ENDERECO
    
        Endereco endereco = new Endereco();
        
        endereco.setRua("Avenida  Dias");
        endereco.setNumero("999");
        endereco.setComplemento("N/A");
        endereco.setBairro("Rodolfo 2 ");
        endereco.setCidade("Fortaleza");
        endereco.setEstado("Ceara");
        endereco.setCep("60000");
        
        contato.setEndereco(endereco);// No atributo endereco foi adicionado o objeto end(da classe Endereco)
        
        System.out.println(contato.getNome());
       // System.out.println(contato.getEndereco());
        //System.out.println(contato.getTelefone());
        //System.out.println(contato.getEndereco());
                    
        //contato.setTelefone(tel);
        
            Telefone telefone = new Telefone();
            Telefone telefone2 = new Telefone();
            
                telefone.setTipo("Celular");
                telefone.setDdd("85");
                telefone.setNumero("9999-9999");
                
                telefone2.setTipo("Fixo");
                telefone2.setDdd("11");
                telefone2.setNumero("8888-888");
            
             Telefone[] telefones = new Telefone[2];
             
             telefones[0] = telefone;
             telefones[1] = telefone2;
             
             contato.setTelefones(telefones);
                
        
        if(contato !=null && contato.getEndereco() != null){
        System.out.println(contato.getEndereco().getRua());
        
        /*if(contato != null &&contato.getTelefone() != null){
        System.out.println(contato.getTelefone().getDdd() + "" + contato.getTelefone().getNumero());
        }*/
        if(contato!=null && contato.getTelefones()!=null){
            for(Telefone t : contato.getTelefones()){
            System.out.println(t.getDdd()+t.getNumero()+t.getTipo());
            }
        }
        }
    }
    
}
