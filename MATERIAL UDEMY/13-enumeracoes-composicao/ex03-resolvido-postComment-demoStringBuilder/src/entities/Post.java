package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	// Usamos abaixo o private static para que nao seja necessario uma copia do objeto para cada post criado.
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	public Post() {

	}

	public Post(Date moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public void addComment(Comment comment) {
		this.comments.add(comment);
	}

	public void removeComment(Comment comment) {
		this.comments.remove(comment);
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(title+"\n"+likes+" Likes - ");
		sb.append(sdf2.format(moment)+"\n"+content+"\n"+"Comments:\n");
		for (Comment c:this.getComments()) {
			sb.append(c.getText()+"\n");
		}
		
		return sb.toString();
		
		/*
		
		ABAIXO CODIGO FEITO POR MIM SEM STRING BUILDER:
		
		String sumComments = "";
		for (Comment c : this.getComments()) {
			sumComments += "\n" + c.getText();
		}
		return this.getTitle() + "\n" + this.getLikes() + " Likes - " + sdf2.format(getMoment()) + "\n" + this.getContent()
				+ "\n" + "Comments:" + sumComments + "\n";
				
		*/
	}

}
