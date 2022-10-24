/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Restu
 */
public class Person {
    private String name;
    private String nim;

    public Person(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ",nim=" + nim + "]";
    }
}