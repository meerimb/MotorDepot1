package com.company;

public class Bus {
    private int id;
    private String name;
    private String driver;
    private String state;

    public static Bus autoBase(int id,String name,String driver,String state){
        Bus bus=new Bus();
        bus.id=id;
        bus.name=name;
        bus.driver=driver;
        bus.state=state;
        return bus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
