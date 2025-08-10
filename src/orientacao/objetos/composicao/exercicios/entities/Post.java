package orientacao.objetos.composicao.exercicios.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Post() {
	}

	public Post(String moment, String title, String content, Integer likes) throws ParseException {
		this.moment = sdf.parse(moment);
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
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
		String template = title + "\n" + likes + " likes - " + sdf.format(moment) + "\n" + content;
		template += "\nComments:";
		for (Comment c : comments) {
			template += "\n" + c;
		}
		return template;
	}
}
