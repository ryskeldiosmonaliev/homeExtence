package com.company;

public class Car implements AutoCloseable  {
    @Override
    public void close(){
        System.out.println("машина жабылып жатат");
    }
    public  void drive(){

        System.out.println("машина журуп  жатат");
    }
}
