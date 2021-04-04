package gy;

public class Kong extends Fish{

    public Kong(String name, int weight, String color) {
        super(name, color, weight);
    }

    @Override
    String status() {
        return "" + this.getName() + ", weight: " + this.getWeight() + ", color: " + this.getColor() + ", short term memory loss: false";

    }

    @Override
    void feed() {
        increaseWeight(2);
    }

}
