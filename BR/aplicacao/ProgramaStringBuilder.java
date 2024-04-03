package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comentario;
import entidade.Post;

public class ProgramaStringBuilder {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario ("Tenho uma boa viagem!");
		Comentario c2 = new Comentario ("Uahu isso é incrível");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Viajando para a Nova Zelândia", 
				"Eu vou viajar para esse país maravilhoso!", 
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario ("Boa noite");
		Comentario c4 = new Comentario ("Que a força esteja com você");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Boa noite pessoal", 
				"Vejo vocês amanhã!", 
				5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
