package com.company;

public class Pentagon extends  Shape{
    public Pentagon(){
        super("Pentagon");
    }

    @Override
    public void useColor(){
        System.out.println(angles+"  draw");
        this.color.applyColor();
    }
}
