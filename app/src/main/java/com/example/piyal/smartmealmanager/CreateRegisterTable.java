package com.example.piyal.smartmealmanager;

/**
 * Created by piyal on 12/19/2017.
 */
public class CreateRegisterTable {
    //table enetity
    private static final String R_ID="r_id";
    private static final String FIRST_NAME="first_name";
    private static final String LAST_NAME="last_name";
    private static final String DATE_OF_BIRTH="date_0f_birth";
    private static final String PASSWORD="password";
    //table name
    private static final String REGISTER_TABLE="register_table";

    //create table sql
    private static final String CREATE_REGISTER_SQL="CREATE TABLE " +REGISTER_TABLE+" (" +R_ID+" INTEGER PRIMARY KEY,"+ FIRST_NAME +" TEXT,"+ LAST_NAME +" TEXT,"+ DATE_OF_BIRTH +" TEXT,"+ PASSWORD +" TEXT" + ")";

    public CreateRegisterTable() {
    }

    public static String getrId() {
        return R_ID;
    }

    public static String getFirstName() {
        return FIRST_NAME;
    }

    public static String getLastName() {
        return LAST_NAME;
    }

    public static String getDateOfBirth() {
        return DATE_OF_BIRTH;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static String getRegisterTable() {
        return REGISTER_TABLE;
    }

    public static String getCreateRegisterSql() {
        return CREATE_REGISTER_SQL;
    }
}
