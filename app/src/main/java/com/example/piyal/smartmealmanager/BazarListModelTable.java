package com.example.piyal.smartmealmanager;

/**
 * Created by piyal on 12/20/2017.
 */
public class BazarListModelTable {
    private int bazarlist_id;
    private String name;
    private String date;

    public BazarListModelTable() {
    }

    public BazarListModelTable(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public BazarListModelTable(int bazarlist_id, String name, String date) {
        this.bazarlist_id = bazarlist_id;
        this.name = name;
        this.date = date;
    }

    public int getBazarlist_id() {
        return bazarlist_id;
    }

    public void setBazarlist_id(int bazarlist_id) {
        this.bazarlist_id = bazarlist_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
