package test09;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Article> articles;
	private List<User> users;
	public Board() {
		articles = new ArrayList<>();
		users = new ArrayList<>();
	}
	public void addArticle(Article at) {
		articles.add(at);
	}
	public void addUser(User us) {
		users.add(us);
	}
	public List<Article> getArticles() {
		return articles;
	}
	public List<User> getUsres() {
		return users;
	}
	
}
