package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Dmytro", "Babych");
        Gson gson = new Gson();
        String jsonPerson = gson.toJson(myPerson);
        System.out.println(jsonPerson);
    }
}