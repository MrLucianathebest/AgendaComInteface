/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;
import java.util.Vector;
/**
 *
 * @author alunos
 */
public class Agenda {
    private Vector listaContatos;
    
    //Construtor
    public Agenda(){
        listaContatos= new Vector();
    }
    
 //metodos
    
    public String adicionarContato(Contato novoContato){
        listaContatos.add(novoContato);
        return "Adicionado na porra da minha Agenda!!!";
    }
    
    
}
