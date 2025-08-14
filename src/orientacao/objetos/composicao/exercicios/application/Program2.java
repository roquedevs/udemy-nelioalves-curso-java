package orientacao.objetos.composicao.exercicios.application;

import java.text.ParseException;

import orientacao.objetos.composicao.exercicios.entities.Comment;
import orientacao.objetos.composicao.exercicios.entities.Post;

public class Program2 {

	public static void main(String[] args) throws ParseException {

		Post post1 = new Post("21/06/2018 13:05:44", "Traveling to New Zeland",
				"I'm going to visit this wonderful country", 12);

		Post post2 = new Post("28/07/2018 23:14:19", "Good night guys", "See you tomorrow", 5);

		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awsome!"));

		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));

		System.out.println(post1);
		System.out.println();
		System.out.println(post2);
	}

}
