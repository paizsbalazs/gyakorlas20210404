package gy;

abstract class Fish {

    private String name;
    private int weight;
    private String color;

    public Fish(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void increaseWeight(int i) {
        this.weight += i;
    }

    abstract String status();
    abstract void feed();



}
