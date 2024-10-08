package com.example.mimshak1;

public class main {
    public static void main(String[] args) {
        Chargeable[] chargeables = new Chargeable[3];
        chargeables[0] = (new Laptop());
        chargeables[1] = (new Tablet());
        chargeables[2] = (new Phone());

        for (Chargeable crature : chargeables) {
            crature.charge();
        }
    }
}
