package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 13:34
 * @description:
 **/
public class Person {
    private String name;
    private String gender;

    public Person(String name, String gender, String matitalStatus) {
        this.name = name;
        this.gender = gender;
        this.matitalStatus = matitalStatus;
    }

    private String matitalStatus;

    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }

    public String getMatitalStatus() {
        return matitalStatus;
    }

}
