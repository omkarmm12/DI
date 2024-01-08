package com.IOC.DI;

public class Iphone implements Mobiles{

    Color color;

    public Iphone(Color color){  //this is dependency injection
        this.color=color;
    }
    public Iphone(){
        System.out.println("Iphone Constructor triggered"); //contractor will call when obj creates
    }

    @Override
    public void getModelAndColor() {
        System.out.println("Model : 15 pro");
        color.getIphoneColor();
    }
}
