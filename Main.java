package com.company;

public class Main {

    public static void main(String[] args) {
        Color blue =new Blue();
        Color yellow = new Yellow();

        Shape penta =new Pentagon();
        penta.setColor(blue);
        penta.useColor();

        penta.setColor(yellow);
        penta.useColor();


        Shape tri =new Triangle();
        tri.setColor(blue);
        tri.useColor();

        tri.setColor(yellow);
        tri.useColor();
    }
}
