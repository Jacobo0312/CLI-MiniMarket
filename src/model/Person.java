package model;

public class Person {

    private Id id;
    private String number;


    public Person(String id, String number) {
        this.id = Id.valueOf(id);
        this.number = number;
    }

    
}
