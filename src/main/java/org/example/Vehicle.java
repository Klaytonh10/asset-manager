package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle() {

    }

    public Vehicle(String makeModel, int year, int odometer, double originalCost) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
        this.setOriginalCost(originalCost);
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double price = 0;
        double reduction = 0;
        double reductedPrice = this.getOriginalCost() - (this.getOriginalCost() * reduction);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        LocalDate today = LocalDate.parse(LocalDate.now().format(formatter));
        int todayInt = Integer.parseInt(String.valueOf(today));

        int yearDiff = todayInt - this.getYear();

        if(yearDiff < 4) {
            reduction = .03 * yearDiff;
            price = reductedPrice;
        } else if(yearDiff >= 4 && yearDiff <= 6) {
            reduction = .06 * yearDiff;
            price = reductedPrice;
        } else if(yearDiff >= 7 && yearDiff <= 10) {
            reduction = .08 * yearDiff;
            price = reductedPrice;
        } else if (yearDiff > 10) {
             reduction = (.08 * yearDiff) + 1000;
             price = reductedPrice;
        }

        if(this.odometer > 100_000 && !this.makeModel.equalsIgnoreCase("Honda") || !this.makeModel.equalsIgnoreCase("Toyota")) {
            price = price - (price * .25);
        }
        return price;
    }

    @Override
    public String getDescription() {
        return this.year + " " + this.makeModel + " Original value: $" + this.getOriginalCost()  + " Current value: $" + this.getValue();
    }
}
