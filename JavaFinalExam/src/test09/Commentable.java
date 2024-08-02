package test09;

import java.util.List;

public interface Commentable {
	abstract void addComment(Comment cm);
	abstract List<Comment> getComments();
}
