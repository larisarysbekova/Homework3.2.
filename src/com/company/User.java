package com.company;

public class User {
    String name;
   int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if (name.length() > 20){
            throw  new IllegalAgeLengthException("Too long name");
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws  Exception {
        if (age < 0 || age > 100){
            throw  new IllegalAgeLengthException("Too long age");
        }
        this.age = age;

    }
}
