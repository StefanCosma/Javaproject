package com.company.lab4.AnimalRescue;

public class Activity {

    private String activityName;
    private int activityTime;

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityTime(int activityTime) {
        this.activityTime = activityTime;
    }

    public int getActivityname(){
        return activityTime;
    }


    public void play() {
        System.out.println("The dog is playing ball");
    }

    public void run() {
        System.out.println("The dog is running slow");
    }
}
