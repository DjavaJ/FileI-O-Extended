package com.theironyard.novauc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner (System.in);
    public static File f = new File("people.txt");
    public static HashMap<String, ArrayList<Person>> persons = new HashMap<String, ArrayList<Person>>();

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(f);

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();

            String[] columns = line.split(" ,");

            persons.put("id", new ArrayList<String, ArrayList(Person.)>());



            for (int i = 1; i< 1000; i++  ) {

                System.out.printf("%s", "%s", "%i" );



            }

        }

        Scanner consoleScanner = new Scanner(System.in);

        int id = 1000;
        while (2 < 3) {
            int i = 0;

            for (Person persons: persons) {

                if (persons.put()== id) {
                    System.out.printf("(%d) %s by %s\n", id, persons.country, persons.first_name);

                }
                id++;
            }

            System.out.println("type the id you want to see replies to: ");
            id = Integer.valueOf(consoleScanner.nextLine());


            }




        }




    }

