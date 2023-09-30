package com.workintech.Burgers;

public class Hamburger {
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;
    private String name;

    public Hamburger(String meat, double price, String breadRollType) {
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public Hamburger(String meat, double price, String breadRollType, String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price, String addition4Name, double addition4Price) {
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public void setAddition1Name(String addition1Name) {
        this.addition1Name = addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public void setAddition2Name(String addition2Name) {
        this.addition2Name = addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public void setAddition3Name(String addition3Name) {
        this.addition3Name = addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public void setAddition3Price(double addition3Price) {
        this.addition3Price = addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public void setAddition4Name(String addition4Name) {
        this.addition4Name = addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setAddition4Price(double addition4Price) {
        this.addition4Price = addition4Price;
    }

    public void addHamburgerAddition1(String name,double price){
        this.name = name;
        this.price = price;
    }
    public double itemizeHamburger(){
        StringBuilder builder = new StringBuilder();
        builder.append("Name :"+getName() + "\n");
        builder.append("Meat: " + getMeat() + "\n");
        if(addition1Name != null){
            builder.append("Addition1 :" + getAddition1Name());
            price = price + getAddition1Price();
        }
        if(addition2Name != null){
            builder.append("Addition2 :" + getAddition2Name());
            price = price + getAddition2Price();
        }
        if(addition3Name != null){
            builder.append("Addition3 :" + getAddition3Name());
            price = price + getAddition3Price();
        }
        if(addition4Name != null){
            builder.append("Addition4 :" + getAddition4Name());
            price = price + getAddition4Price();
        }
        System.out.println(builder);
        return getPrice();
    }
}
