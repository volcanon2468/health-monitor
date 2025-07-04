package com.healthmonitor;

public class HealthMonitor {
    public static void main(String[] args) {
        System.out.println("Health Monitor API Running");
    }
    public String getSystemHealth() {
        return "CPU: 15%, Memory: 45%";
    }
}
