package com.Package;

public class Main {

    public static void main(String[] args) {
//	    DeskPhone myPhone = new DeskPhone("7977424564");
//        myPhone.powerOn();
//        myPhone.callPhone("7977424564");
//        myPhone.answer();

        MobilePhone myPhone = new MobilePhone("7977424564");
        myPhone.callPhone("7977424564");
        myPhone.answer();
    }
}
