package gy;

import javax.xml.namespace.QName;

public class Clownfish extends Fish {

    public Clownfish(String name, int weight, String color) {
        super(name, color, weight);
    }

    @Override
    String status() {
        return "" + this.getName() + ", weight: " + this.getWeight() + ", color: " + this.getColor() + ", short term memory loss: false";
    }

    @Override
    void feed() {
        increaseWeight(1);
    }
}
