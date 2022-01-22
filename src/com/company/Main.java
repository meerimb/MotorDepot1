package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./buses.json");

    public static void main(String[] args) {

        Bus[] buses = {
                Bus.autoBase(1, "Renault Magnum", "", "base"),
                Bus.autoBase(2, "Volvo", "", "base"),
                Bus.autoBase(3, "DAF XT", "", "base")
        };
        String allBuses = GSON.toJson(buses);
        write(allBuses);
//        System.out.println(readFile());
        System.out.println("#" + " | " + "Bus   " + " | " + "Driver  " + " | " + "State");
        System.out.println("--+--------+----------+------");
        System.out.println("1" + " | " + "Renault" + "| " + "        " + " | " + "On Base");
        System.out.println("2" + " | " + "Volvo " + "| " + "         " + " | " + "On Base");
        System.out.println("3" + " | " + "DAF XT " + "| " + "        " + " | " + "On Base");
    }

    private static void write(String obj) {
        Path write = Paths.get(String.valueOf(WRITE_PATH));
        try {
            Files.writeString(write, obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static String readFile() {
        String json = " ";
        try {
            FileReader fr = new FileReader(String.valueOf(WRITE_PATH));
            int a;
            while ((a = fr.read()) != -1) json += (char) a;
            return json;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.getMessage();
        }
        return json;
    }

       }

