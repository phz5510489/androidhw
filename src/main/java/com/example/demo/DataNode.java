package com.example.demo;

public class DataNode {
    public String appName;
    public String packageName;
    public int startStamp;
    public int endStamp;
    public int useStamp;

    public DataNode(String aName, String pName, int sT, int eT, int uT) {
        appName = aName;
        packageName = pName;
        startStamp = sT;
        endStamp = eT;
        useStamp = uT;
    }

    public  DataNode() {}

    @Override
    public String toString() {
        return "appName = " + appName + ' ' +
                "packageName = " + packageName + ' ' +
                "startTime = " + startStamp + ' ' +
                "endTime = " + endStamp + ' ' +
                "useTime = " + useStamp;
    }
}

