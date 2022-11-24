import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Post p1 = new Post(sdf2.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);
		Post p2 = new Post(sdf2.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);

		p1.addComment(new Comment("Have a nice trip"));
		p1.addComment(new Comment("Wow that's awesome!"));

		p2.addComment(new Comment("Good night"));
		p2.addComment(new Comment("May the force be with you"));

		System.out.println(p1);
		System.out.println(p2);

		teclado.close();
	}

}
