package com.theironyard.novauc;

/**
 * Created by dangelojoyce on 2/16/17.
 */


public class Person {

    int id;
    String first_name;
    String last_name;
    String email;
    String country;
    int ip_address;

    public Person(int id, String first_name, String last_name, String email, String country, int ip_address) {

        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.country = country;
        this.ip_address = ip_address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getIp_address() {
        return ip_address;
    }

    public void setIp_address(int ip_address) {
        this.ip_address = ip_address;
    }

    public int put(id) {
    }
}

