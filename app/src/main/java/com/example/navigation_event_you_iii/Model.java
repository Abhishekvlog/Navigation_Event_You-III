package com.example.navigation_event_you_iii;

import java.io.Serializable;

public class Model implements Serializable {
    private String title,description,startDate,startTime,EndDate,EndTime,price;

    public Model(String title, String description, String startDate, String startTime, String endDate, String endTime, String price) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.startTime = startTime;
        EndDate = endDate;
        EndTime = endTime;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndDate() {
        return EndDate;
    }

    public String getEndTime() {
        return EndTime;
    }

    public String getPrice() {
        return price;
    }
}