package de.neuefische.covidcases.model.api;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CovidApiCountryPerDay {

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Confirmed")
    private long confirmed;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(long confirmed) {
        this.confirmed = confirmed;
    }
}
