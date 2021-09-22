package de.neuefische.covidcases.model;

public class ConfirmedByDay {

    private String date;
    private long confirmed;

    public ConfirmedByDay(String date, long confirmed) {
        this.date = date;
        this.confirmed = confirmed;
    }

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
