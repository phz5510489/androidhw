package com.example.demo;


public class AppUserData {
    public int  userID = -1;
    public String appName;
    public String packageName = "";
    public int startTime = -1;
    public int endTime = -1;
    public int useTime = -1;

    public AppUserData(int id, String aName, String pName, int sTime, int eTime, int uTime) {
        userID = id;
        appName = aName;
        packageName = pName;
        startTime = sTime;
        endTime = eTime;
        useTime = uTime;
    }
    public AppUserData() {}

    @Override
    public String toString() {
        return "AppUserData{" +
                "userID=" + userID +
                ", appName='" + appName + '\'' +
                ", packageName='" + packageName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", useTime=" + useTime +
                '}';
    }
}
