package com.company;

public class Triangle extends Shape{
    public Triangle(){
        super("Triangle");
    }

    @Override
    public void useColor(){
        System.out.println(angles+" draw");
        this.color.applyColor();
    }

}
