package org.fkjava.controller;

import org.fkjava.bean.Person;

public class IndexController {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(28);
        p.setName("邹庭");
        p.setPhone("13094224146");
        System.out.println("p--->"+p);
    }
}
