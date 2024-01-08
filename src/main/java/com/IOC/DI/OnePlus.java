package com.IOC.DI;

public class OnePlus implements Mobiles{

    Color color;// Just initialized Not Created with new Color(). Get bean from container

    public OnePlus(Color color){ //Injecting color bean here by Contractors
        this.color=color;
    }

    public OnePlus(){
        System.out.println("OnePlus Constructor triggered"); //contractor will call when obj creates
    }
    @Override
    public void getModelAndColor() {
        System.out.println("Model : 9 pro");
        color.getOnePlusColor();
    }

}
