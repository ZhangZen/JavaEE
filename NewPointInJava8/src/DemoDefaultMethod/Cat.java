/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDefaultMethod;

/**
 *
 * @author Zhang
 */
public abstract class Cat implements Animal {

    private String type;
    private String color;
    private int heigh;
    private int weight;

    public Cat() {
    }

    public Cat(String type, String color, int heigh, int weight) {
        this.type = type;
        this.color = color;
        this.heigh = heigh;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getHeigh() {
        return heigh;
    }

    public int getWeight() {
        return weight;
    }

}
