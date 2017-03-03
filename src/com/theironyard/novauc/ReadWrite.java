package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by dangelojoyce on 2/26/17.
 */
public class ReadWrite {



    static File f = new File("people.txt");
    static File j = new File("people.json");
    Person p = new Person("" ,"", "", "", "", "");

    public ReadWrite() throws IOException {

    }
    public static void writeFile(HashMap p) throws IOException{
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.deep(true).serialize(p);
        FileWriter fw = new FileWriter(j); //unhandled exception: java io exception (IDE message)
        fw.write(json);
        fw.close();
    }
    public void readFile() throws IOException {
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.nextLine();
        JsonParser parser = new JsonParser();
        p = parser.parse(contents, Person.class);
        System.out.println(p);
    }

    public static void readCSV() throws FileNotFoundException {
        File f = new File("people.txt");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            //System.out.println("processing line: " + line);

            String[] columns = line.split(",");
            Person person = new Person(String.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
            //System.out.println("This is" + person);

            ArrayList<Person> countryList;

            if (null == Main.peopleMap.get(columns[4])) {
                countryList = new ArrayList<Person>(); //checking to see if there is a list first
            } else {
                countryList = Main.peopleMap.get(columns[4]);
            }

            countryList.add(person);
            Main.peopleMap.put(columns[4], countryList);


        }
        System.out.println(Main.peopleMap);
    }


}


