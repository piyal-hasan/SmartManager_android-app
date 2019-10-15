package com.example.piyal.smartmealmanager;

/**
 * Created by piyal on 12/20/2017.
 */
public class CreateBazarListModelTable {
    private static final String BAZARLISTTABLE="bazarlist";
    private static final String MEMBER_NAME="Membername";
    private static final String DATE="DATE";
    private static final String LIST_ID="list_id";

    public static String getBazar_list_sql() {
        return bazar_list_sql;
    }

    private static final String bazar_list_sql="CREATE TABLE "+BAZARLISTTABLE+" ("+ LIST_ID +"INTEGER PRIMARY KEY,"+ MEMBER_NAME +" TEXT,"+DATE+" TEXT" + ")";

    public CreateBazarListModelTable() {
    }
    public static String getBAZARLISTTABLE() {
        return BAZARLISTTABLE;
    }

    public static String getMemberName() {
        return MEMBER_NAME;
    }

    public static String getDATE() {
        return DATE;
    }

    public static String getListId() {
        return LIST_ID;
    }
}
