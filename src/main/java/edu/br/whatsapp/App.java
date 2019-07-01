package edu.br.whatsapp;

import edu.br.whatsapp.modelo.Mensagem;
import edu.br.whatsapp.modelo.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Usuario usuario1 = new Usuario();
        usuario1.setNome("José");
        usuario1.setNumero("8298741563");
        
        Usuario usuario2 = new Usuario("Ana", "8295682587");
        
        Mensagem msg = new Mensagem("Oi", usuario1, usuario2);
        System.out.println(msg.getTexto());
        System.out.println(msg.getHorario());
        

        Usuario usuario3 = new Usuario("Zé", "8299583012");
        Usuario usuario4 = new Usuario("Maria", "7999583012");
        Mensagem hello = new Mensagem("Oi", usuario3, usuario4);

    }
}
