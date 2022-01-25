package com.company;

import java.util.Random;

public class Condition {
    public void changeDriver(Bus bus,Driver driver) {
        if (bus.getState().equals(State.ROUTE)){
            System.out.println("Водитель уже в пути");
        }else {
            System.out.println("Водитель уже в пути, невозможно сменить водителя");
        }
    }
    public void startDriving(Bus bus){
        if (bus.getState().equals(State.BASE)){
            if (bus.getName()!=null){
                bus.getState();
                System.out.println("Успешно вышли на маршрут");
            }else {
                System.out.println("Водитель не найден");
            }

            }else {
            Random random=new Random();
            int rd= random.nextInt(2);
            if (rd==0){
                bus.getState();
                System.out.println("Машина в пути");
            }else {
                bus.getState();
                System.out.println("Машина на базе");
            }
        }

    }
    public void startRepair(Bus bus){
        if (bus.getState().equals(State.BASE)){
            bus.getState();
            System.out.println("Машина в ремонте");
        }else if (bus.getState().equals(State.ROUTE)){
            bus.setState(String.valueOf(State.REPAIR));
        }else {
            System.out.println("Уже в ремонте");
        }
    }

}
