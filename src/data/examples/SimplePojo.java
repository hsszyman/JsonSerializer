package data.examples;

import java.util.ArrayList;

public class SimplePojo {
    public String name;
    public int age;
    public int[] arr = {3,2,3};
    public thing n = new thing();

    public SimplePojo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


