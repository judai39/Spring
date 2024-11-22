package com.haoyudu.account;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private Integer id;
    private String name;
    private Double salary;

    /**mapper反射处理过无参构造的bean传入?*/
//    public Account(){}

    public Account(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Account(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
