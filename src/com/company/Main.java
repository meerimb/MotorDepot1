package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
        public static final GsonBuilder BUILDER = new GsonBuilder();
        public static final GsonBuilder BUILDER1 = new GsonBuilder();
        public static final Gson GSON = BUILDER.setPrettyPrinting().create();
        public static final Gson GSON1 = BUILDER1.setPrettyPrinting().create();
//        public static final Path WRITE_PATH = Paths.get("./buses.json");
//        public static final Path WRITEDRIVER_PATH = Paths.get("./drivers.json");
    // new line

        public static void main(String[] args) throws IOException {

            Bus[] buses = {
                    Bus.autoBase(1, "Renault Magnum", "", "base"),
                    Bus.autoBase(2, "Volvo", "", "base"),
                    Bus.autoBase(3, "DAF XT", "", "base")
            };

            Driver[] drivers = {
                    Driver.autoBase("driver-1", "Petr"),
                    Driver.autoBase("driver-2", "Askar"),
                    Driver.autoBase("driver-3", "Uson")
            };

            String allBuses = GSON.toJson(buses);
            write(allBuses);
            String allDrivers = GSON1.toJson(drivers);
            write(allDrivers);
//            System.out.println(readFile());
//            System.out.println(readFile1());
            System.out.println("-----First stage-----");
            System.out.println("#" + " | " + "Bus   " + " | " + "Driver  " + " | " + "State");
            System.out.println("--+--------+----------+------");
            System.out.println("1" + " | " + "Renault" + "| " + "        " + " | " + "On Base");
            System.out.println("2" + " | " + "Volvo " + "| " + "         " + " | " + "On Base");
            System.out.println("3" + " | " + "DAF XT " + "| " + "        " + " | " + "On Base");
            System.out.println();
            System.out.println("-----Second stage-----");
            System.out.println("#" + " | " + "Driver   " + " | " + "Bus  ");
            System.out.println("--+-----------+-------+");
            System.out.println("1" + " | " + "Petr      " + "| " + "        ");
            System.out.println("2" + " | " + "Askar     " + "| " + "         ");
            System.out.println("3" + " | " + "Uson      " + "| " + "        ");

            while (true){
                Scanner scanner=new Scanner(System.in);
                System.out.println();
                System.out.println("Choose one of the bus:");
                int input=scanner.nextInt();
                scanner.hasNextLine();
                System.out.println("#" + " | " + "Bus   " + " | " + "Driver  " + " | " + "State");
                System.out.println("--+--------+----------+------");
            }
        }

        private static void write(String obj1) {
            Path write = Paths.get("./buses.json");
            try {
                Files.writeString(write, obj1, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            } catch (IOException e) {
                e.getMessage();
            }
        }

        private static String readFile1() {
            String json = " ";
            try {
                FileReader fr1 = new FileReader("./buses.json");
                int a;
                while ((a = fr1.read()) != -1) json += (char) a;
                return json;

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.getMessage();
            }
            return json;
        }
        private static void writeDriver(String obj){
            Path writeDriver=Paths.get("./drivers.json");
            try {
                Files.writeString(writeDriver, obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            }catch (IOException e){
                e.getMessage();
            }
        }
        private static String readFile(){
            String json="";
            try {
                FileReader fr = new FileReader ("./drivers.json");
                int a;
                while ((a = fr.read()) != -1) json += (char) a;
                return json;
            }catch (IOException e){
                e.getMessage();
            }
            return json;
        }

    }

