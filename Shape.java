package com.company;

public abstract class Shape {
    protected String angles;
    protected Color color;

    public Shape(String angles){
        this.angles= angles;
    }

    public abstract void useColor();

    public void setColor(Color color){
        this.color =color;
    }

}
