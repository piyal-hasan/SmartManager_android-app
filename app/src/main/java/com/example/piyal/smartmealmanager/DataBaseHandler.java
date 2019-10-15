package com.example.piyal.smartmealmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piyal on 12/19/2017.
 */
public class DataBaseHandler extends SQLiteOpenHelper{
    private static final String DB_NAME="MEALABC";
    private static final int DB_VIRSION=1;
    public DataBaseHandler(Context context) {
        super(context,DB_NAME,null,DB_VIRSION);
    }
    CreateMealTable createMealTable=new CreateMealTable();
    CreateRegisterTable createRegisterTable=new CreateRegisterTable();
    CreateBazarListModelTable createBazarListModelTable=new CreateBazarListModelTable();
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createMealTable.getSql_meal_detail());
        db.execSQL(createRegisterTable.getCreateRegisterSql());
        db.execSQL(createBazarListModelTable.getBazar_list_sql());
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + createMealTable.getMEALDETAIL_TABLE());
        db.execSQL("DROP TABLE IF EXISTS " + createRegisterTable.getRegisterTable());
        db.execSQL("DROP TABLE IF EXISTS " + createBazarListModelTable.getBAZARLISTTABLE());
        onCreate(db);
    }
    public void addRegister(RegisterTable m){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(createRegisterTable.getFirstName(),m.getFirst_name());
        db.insert(createRegisterTable.getRegisterTable(),null,values);
        db.close();
    }
    public void addMeal(MealTableModel m){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(createMealTable.getMemberName(),m.getMember_name());
        values.put(createMealTable.getBREAKFIRST(),m.getBreakfirst());
        db.insert(createMealTable.getMEALDETAIL_TABLE(),null,values);
        db.close();
    }
    public void addBazarList(BazarListModelTable bl){
       SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(createBazarListModelTable.getDATE(),bl.getDate());
        db.insert(createBazarListModelTable.getBAZARLISTTABLE(),null,values);
    }
    public List<MealTableModel> getAllMemberList(){
        List<MealTableModel> list=new ArrayList<MealTableModel>();
        SQLiteDatabase db=this.getWritableDatabase();
        String sql="SELECT * FROM "+createMealTable.getMEALDETAIL_TABLE();
        Cursor cursor=db.rawQuery(sql,null);
        if(cursor.moveToFirst()){
            do{
               MealTableModel mt=new MealTableModel();
                mt.setMember_name(cursor.getString(1));
                list.add(mt);
            }while (cursor.moveToNext());
        }
        return list;
    }
    //all member component;
    public int updateMember(int key){
        MealTableModel meal=new MealTableModel();
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(createMealTable.getMemberName(),meal.getMember_name());
        return db.update(createMealTable.getMEALDETAIL_TABLE(),values,createMealTable.getKeyId()+"= ?",new String[]{String.valueOf(key)});
    }



    public void deleteMember(int m){
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete(createMealTable.getMEALDETAIL_TABLE(),createMealTable.getKeyId()+"= ?",new String[]{String.valueOf(m)});
        db.close();
    }



    public int addMember(MealTableModel meal){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(createMealTable.getMemberName(),meal.getMember_name());
        int i= (int) db.insert(createMealTable.getMEALDETAIL_TABLE(),null,values);
        db.close();
        return i;
    }
}
