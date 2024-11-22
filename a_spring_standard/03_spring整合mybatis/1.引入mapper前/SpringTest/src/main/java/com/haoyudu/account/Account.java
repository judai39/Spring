package com.haoyudu.account;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private Integer id;
    private String name;
    private Double salary;

    /**如果想要将一个带有参数的构造类传入bean池中,必须要声明一个无参构造器作为反射的依据,否则系统无法通过编译*/
    public Account(){}

    public Account(String name, Double salary) {
//        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Account(int id,String name,Double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
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

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
