package org.example;

public class Asset {

    private String description;
    private String dateAquired;
    private double originalCost;

    public Asset() {

    }

    public Asset(String description, String dateAquired, double originalCost) {
        this.description = description;
        this.dateAquired = dateAquired;
        this.originalCost = originalCost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateAquired(String dateAquired) {
        this.dateAquired = dateAquired;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public String getDateAquired() {
        return dateAquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public double getValue() {
        return originalCost;
    }

}
