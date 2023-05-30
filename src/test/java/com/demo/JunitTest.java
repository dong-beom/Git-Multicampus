package com.demo;

import org.junit.Test;

public class JunitTest {

    @Test
    public void getMulticampus() {

        // 하나의 기능만 동작하는게 아니라
                    // 여러개의 기능이 들어가는 경우가 있음.
        System.out.println("Multicampus");
    }


    @Test
    public void getMulticampus1(){

        // 하나의 기능만 동작하는게 아니라
        // 여러개의 기능이 들어가는 경우가 있음.
        System.out.println("Multicampus");

        if(true){
            System.out.println("Multicampus");
        }

        if(true) {
            System.out.println("Multicampus");
        }
    }
}
