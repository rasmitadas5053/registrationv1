package com.api;

public class Employee
{
    private long id;
    private  String name;
    private  int Sal;

    public Employee() {
    }

    //setter
    public Employee(long id, String name, int sal) {
        this.id = id;
        this.name = name;
        Sal = sal;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return Sal;
    }
}
