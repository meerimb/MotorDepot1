package com.company;

public class Driver {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null||name.isBlank()||name.isEmpty()){
            throw new IllegalArgumentException("Name must contain a value");
        }
        this.name = name;
    }
    public static Driver autoBase(String id, String name){
        Driver driver=new Driver();
        driver.id=id;
        driver.name=name;
        if (name==null||name.isBlank()||name.isEmpty()){
            throw new IllegalArgumentException("Name must contain a value");
        }
        return driver;
    }
}
