package com.bloomtech.springboot.guidedproject.first_springboot_app.model;

// This class will hold data being sent in an HTTP request
//
// a POJO is normally used in HTTP requests
// a POJO has data, constructors, standard getters/setters, toString(), equals(), hashCode() overrides

import java.util.Objects;

public class theDataForRequest {
    String theData; // the data to send with the request
                    // the data variable names must match the JSON attribute names

    public theDataForRequest() {} // Always have a default constructor for a POJO
                                  // in case Java needs it

    public theDataForRequest(String theData) {
        this.theData = theData;
    }

    public String getTheData() {
        return theData;
    }

    public void setTheData(String theData) {
        this.theData = theData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof theDataForRequest that)) return false;
        return Objects.equals(getTheData(), that.getTheData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTheData());
    }

    @Override
    public String toString() {
        return "theDataForRequest{" +
                "theData='" + theData + '\'' +
                '}';
    }
}
