package model.for_user.request;

import model.for_item.Comment;

public class CommentRequest extends Request{
    public CommentRequest(Comment comment) {
        this.comment = comment;
    }

    private Comment comment;

    public Comment getComment() {
        return comment;
    }
}
