package org.example;

public class House extends Asset {
    private int condition; // 1-excellent, 2-good, 3-fair, 4-poor
    private int squareFoot;
    private int lotSize;

    public House() {

    }

    public House(int condition, int squareFoot, int lotSize) {
        getDescription();
        getDateAquired();
        getOriginalCost();
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        int price = 0;
        switch (condition) {
            case 1:
                price = 180;
                break;
            case 2:
                price = 130;
                break;
            case 3:
                price = 90;
                break;
            case 4:
                price = 80;
                break;
            default:
                System.out.println("Condition must be 1-4");
                break;
        }
        return lotSize * price;
    }

    @Override
    public String toString() {
        return getDescription() + " " + getValue() + " " + lotSize;
    }
}
