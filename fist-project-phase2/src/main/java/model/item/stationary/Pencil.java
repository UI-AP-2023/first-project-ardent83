package model.item.stationary;

import model.item.Category;
import model.item.Comment;
import model.item.CommentStatus;
import model.item.Discount;

public class Pencil extends Stationary implements Discount {
    public Pencil(String name, double price, int availableNumber, String producingCountry, PencilType pencilType) {
        super(name, price, availableNumber, Category.STATIONERY, producingCountry);
        this.pencilType = pencilType;
    }

    @Override
    public void addDiscount(double discountPercent) {
        this.discountPercent = discountPercent;
        this.setPrice(this.getPrice() * discountPercent / 100);
    }

    @Override
    public void removeDiscount() {
        this.setPrice(this.getPrice() * 100 / this.discountPercent);
        discountPercent = 0;
    }

    private final PencilType pencilType;
    private double discountPercent;

    public PencilType getPencilType() {
        return pencilType;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n***********************************************");
        stringBuilder.append(super.toString())
                .append("\npencil type : ").append(pencilType)
                .append("\n______________________________________________________");
        for (Comment comment : super.getCommentArrayList()) {
            if (comment.getCommentStatus().equals(CommentStatus.ACCEPTED)){
                stringBuilder.append(comment);
                stringBuilder.append("\n______________________________________________________");
            }
        }
        stringBuilder.append("\n***********************************************");
        return stringBuilder.toString();
    }
}
