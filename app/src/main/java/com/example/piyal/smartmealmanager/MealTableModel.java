package com.example.piyal.smartmealmanager;

/**
 * Created by piyal on 12/19/2017.
 */
public class MealTableModel{
    private int meal_id;
    private String member_name;
    private int breakfirst;
    private int lunch;
    private int dinner;
    private int meal_number;
    private double meal_cost;
    private double bazar_cost;
    private double other_cost;
    private int taka;
    private double remark;
    public MealTableModel() {
    }
    public MealTableModel(int meal_id, String member_name, int breakfirst, int lunch, int dinner, int meal_number, double meal_cost, double bazar_cost, double other_cost, int taka, double remark) {
        this.meal_id = meal_id;
        this.member_name = member_name;
        this.breakfirst = breakfirst;
        this.lunch = lunch;
        this.dinner = dinner;
        this.meal_number = meal_number;
        this.meal_cost = meal_cost;
        this.bazar_cost = bazar_cost;
        this.other_cost = other_cost;
        this.taka = taka;
        this.remark = remark;
    }

    public MealTableModel(String member_name, int breakfirst, int lunch, int dinner, int meal_number, double meal_cost, double bazar_cost, double other_cost, int taka, double remark) {
        this.member_name = member_name;
        this.breakfirst = breakfirst;
        this.lunch = lunch;
        this.dinner = dinner;
        this.meal_number = meal_number;
        this.meal_cost = meal_cost;
        this.bazar_cost = bazar_cost;
        this.other_cost = other_cost;
        this.taka = taka;
        this.remark = remark;
    }

    public int getMeal_id() {
        return meal_id;
    }

    public void setMeal_id(int meal_id) {
        this.meal_id = meal_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public int getBreakfirst() {
        return breakfirst;
    }

    public void setBreakfirst(int breakfirst) {
        this.breakfirst = breakfirst;
    }

    public int getLunch() {
        return lunch;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public int getDinner() {
        return dinner;
    }

    public void setDinner(int dinner) {
        this.dinner = dinner;
    }

    public int getMeal_number() {
        return meal_number;
    }

    public void setMeal_number(int meal_number) {
        this.meal_number = meal_number;
    }

    public double getMeal_cost() {
        return meal_cost;
    }

    public void setMeal_cost(double meal_cost) {
        this.meal_cost = meal_cost;
    }

    public double getBazar_cost() {
        return bazar_cost;
    }

    public void setBazar_cost(double bazar_cost) {
        this.bazar_cost = bazar_cost;
    }

    public double getOther_cost() {
        return other_cost;
    }

    public void setOther_cost(double other_cost) {
        this.other_cost = other_cost;
    }

    public int getTaka() {
        return taka;
    }

    public void setTaka(int taka) {
        this.taka = taka;
    }

    public double getRemark() {
        return remark;
    }
    public void setRemark(double remark) {
        this.remark = remark;
    }
}
