package com.example.piyal.smartmealmanager;

import org.w3c.dom.ProcessingInstruction;

/**
 * Created by piyal on 12/19/2017.
 */
public class CreateMealTable {
    private static final String KEY_ID="meal_key";
    private static final String MEMBER_NAME="member";
    private  static final String BREAKFIRST="breakfirst";
    private static final String LUNCH="lunch";
    private static final String DINNER="dinner";
    private static final String MEAL="meal";
    private static final String MEAL_COST="meal_cost";
    private static final String BAZAR_TAKA="bazar_cost";
    private static  final String OTHER_COST="other_cost";
    private static final String TAKA="taka";
    private static final String REMARK="remark";
    private static final String TAKATEMP="TAKATEMP";
    private static final String OTHERCOSTTEMP="COSTTEMP";
    private static final String BAZARTAKA_TEMP="BAZARTAKA_TEMP";
    private static final String MEALDETAIL_TABLE ="mealdetailtable";

    //create meal table sql
    private static final String sql_meal_detail="CREATE TABLE "
            +MEALDETAIL_TABLE+" ("+ KEY_ID + " INTEGER PRIMARY KEY,"
            + MEMBER_NAME +" TEXT,"
            + BREAKFIRST +" INTEGER,"
            + LUNCH +" INTEGER,"
            + DINNER +" INTEGER,"
            + MEAL +" INTEGER,"
            + MEAL_COST +" DOUBLE,"
            + OTHER_COST +" DOUBLE,"
            + OTHERCOSTTEMP +" DOUBLE,"
            + BAZAR_TAKA +" DOUBLE,"
            + BAZARTAKA_TEMP +" DOUBLE,"
            + TAKA +" INTEGER,"
            + TAKATEMP +" INTEGER,"
            + REMARK+" DOUBLE" + ")";

    public static String getMEALDETAIL_TABLE() {
        return MEALDETAIL_TABLE;
    }
    public CreateMealTable() {
    }
    public static String getOTHERCOSTTEMP() {
        return OTHERCOSTTEMP;
    }

    public static String getTAKATEMP() {
        return TAKATEMP;
    }

    public static String getBazartakaTemp() {
        return BAZARTAKA_TEMP;
    }

    public static String getSql_meal_detail() {
        return sql_meal_detail;
    }
    public static String getKeyId() {
        return KEY_ID;
    }

    public static String getMemberName() {
        return MEMBER_NAME;
    }

    public static String getBREAKFIRST() {
        return BREAKFIRST;
    }

    public static String getLUNCH() {
        return LUNCH;
    }

    public static String getDINNER() {
        return DINNER;
    }

    public static String getMEAL() {
        return MEAL;
    }

    public static String getMealCost() {
        return MEAL_COST;
    }

    public static String getBazarTaka() {
        return BAZAR_TAKA;
    }

    public static String getOtherCost() {
        return OTHER_COST;
    }

    public static String getTAKA() {
        return TAKA;
    }

    public static String getREMARK() {
        return REMARK;
    }
}
