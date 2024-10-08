package com.example.mimshak1;

public class Phone implements Chargeable{

    @Override
    public void charge(){
        System.out.println("the phone is charging");
    }

    public void CameraQuality(){
        System.out.println("the camera quality is not so good");
    }
}
