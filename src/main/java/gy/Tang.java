package gy;

public class Tang extends Fish {

    public Tang(String name, int weight, String color) {
        super(name, color, weight);
    }

    @Override
    String status() {
        return "" + this.getName() + ", weight: " + this.getWeight() + ", color: " + this.getColor() + ", short term memory loss: true";
    }

    @Override
    void feed() {
        increaseWeight(1);
    }
}
