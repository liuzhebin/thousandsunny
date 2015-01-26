package com.ekoo.springdemo.bean;

public class User {
    private Integer id;

    private String name;

    private Integer age;

    private String password;

    public User() {
		super();
	}

	public User(int id, String name, int age) {
    	this.id=id;
    	this.name=name;
    	this.age=age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}