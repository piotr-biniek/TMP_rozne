/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.kolekcje;

import java.util.Objects;

/**
 *
 * @author piotr
 */
public class CarForListTest {

    private String name;
    private int id;

    public CarForListTest(int id) {

        this.id = id;
        name = "noname";
    }

    public CarForListTest(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CarForListTest{" + "name=" + name + ", id=" + id + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CarForListTest other = (CarForListTest) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return id*name.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

}
