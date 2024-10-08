package com.example.mimshak1;

public class Tablet implements Chargeable{
    @Override
    public void charge(){
        System.out.println("the tablet is charging");
    }

    public void color(){
        System.out.println("The tablet is pink");
    }
}
