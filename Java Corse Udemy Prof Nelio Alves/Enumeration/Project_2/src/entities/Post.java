package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Post {

	private static DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime momment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	public Post() {
	}

	public Post(LocalDateTime momment, String title, String content, Integer likes) {

		this.momment = momment;
		this.title   = title;
		this.content = content;
		this.likes   = likes;
	}

	public Post(LocalDateTime momment, String title, String content) {

		this.momment = momment;
		this.title   = title;
		this.content = content;

	}

	public LocalDateTime getMomment() {
		return momment;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Integer getLikes() {
		return likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setMomment(LocalDateTime momment) {
		this.momment = momment;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes: ");
		sb.append(momment.format(formatDate) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for(Comment comm : comments) {
			sb.append(comm.getText() + "\n");
		}
		
		
		return sb.toString();

	}

}
