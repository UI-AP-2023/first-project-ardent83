package model.item.vehicles;

import model.item.Comment;

public class Car extends Vehicles {
    public Car(String name, double price, int availableNumber, String companyName, double engineVolume, boolean automatic) {
        super(name, price, availableNumber, companyName);
        this.engineVolume = engineVolume;
        this.automatic = automatic;
    }

    private final double engineVolume;
    private final boolean automatic;

    public double getEngineVolume() {
        return engineVolume;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n***********************************************");
        stringBuilder.append(super.toString())
                .append("\nengine volume : ").append(engineVolume);
        if (automatic){
            stringBuilder.append("\nautomatic ");
        } else {
            stringBuilder.append("\ngeared ");
        }
        stringBuilder.append("\n______________________________________________________");
        for (Comment comment : super.getCommentArrayList()) {
            stringBuilder.append(comment.toString());
            stringBuilder.append("\n______________________________________________________");
        }
        stringBuilder.append("\n***********************************************");
        return stringBuilder.toString();
    }
}
