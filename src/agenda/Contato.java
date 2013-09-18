/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author André  Dantas <ymateus@hotmail.com>
 *         Lucas Freitas <luquex_skynet@hotmail.com>
 */
public class Contato {
    
    private String nome;
    private String telefone;

   //construtor
   public Contato(String nome){
       this.setNome(nome);
       
   }
   
    
    
    
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
