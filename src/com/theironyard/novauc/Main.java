package com.theironyard.novauc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//import static com.theironyard.novauc.ReadWrite.readCSV;


public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static HashMap<String, ArrayList<Person>> peopleMap = new HashMap();

    public static void main(String[] args) throws IOException {

        ReadWrite.readCSV();
        ReadWrite.writeFile(peopleMap);


    }







        }




