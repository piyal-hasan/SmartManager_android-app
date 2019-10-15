package com.example.piyal.smartmealmanager;

/**
 * Created by piyal on 12/19/2017.
 */
public class RegisterTable {
    private int r_id;
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String password;

    public RegisterTable() {
    }

    public RegisterTable(int r_id, String first_name, String last_name, String date_of_birth, String password) {
        this.r_id = r_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.password = password;
    }

    public RegisterTable(String first_name, String last_name, String date_of_birth, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.password = password;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
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

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
