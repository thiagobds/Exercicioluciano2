package cadastro;

import cadastro.Pessoa;

public class TestaPessoa {
    
    public static void main(String[] args) {
 
        Pessoa p1 = new Pessoa("Thiago","Rua Constantino","99725-7865");
        
        System.out.println(p1.getNome() + p1.getEndereco() + p1.getTelefone());
  }
    
}
