package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekdayRegularRate;
    int weekendRegularRate;
    int weekdayRewardRate;
    int weekendRewardRate;
    int ratings;
    int total;

    public Hotel(String hotelName, int weekdayRegularRate, int weekendRegularRate, int weekdayRewardRate, int weekendRewardRate, int ratings) {
        this.hotelName = hotelName;
        this.weekdayRegularRate = weekdayRegularRate;
        this.weekendRegularRate = weekendRegularRate;
        this.weekdayRewardRate = weekdayRewardRate;
        this.weekendRewardRate = weekendRewardRate;
        this.ratings = ratings;
        this.total = total;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdayRegularRate() {
        return weekdayRegularRate;
    }

    public void setWeekdayRegularRate(int weekdayRegularRate) {
        this.weekdayRegularRate = weekdayRegularRate;
    }

    public int getWeekendRegularRate() {
        return weekendRegularRate;
    }

    public void setWeekendRegularRate(int weekendRegularRate) {
        this.weekendRegularRate = weekendRegularRate;
    }

    public int getWeekdayRewardRate() {
        return weekdayRewardRate;
    }

    public void setWeekdayRewardRate(int weekdayRewardRate) {
        this.weekdayRewardRate = weekdayRewardRate;
    }

    public int getWeekendRewardRate() {
        return weekendRewardRate;
    }

    public void setWeekendRewardRate(int weekendRewardRate) {
        this.weekendRewardRate = weekendRewardRate;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRegularRate=" + weekdayRegularRate +
                ", weekendRegularRate=" + weekendRegularRate +
                ", weekdayRewardRate=" + weekdayRewardRate +
                ", weekendRewardRate=" + weekendRewardRate +
                ", ratings=" + ratings +
                ", total=" + total +
                '}';
    }
}
