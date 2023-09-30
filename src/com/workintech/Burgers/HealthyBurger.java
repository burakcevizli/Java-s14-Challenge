package com.workintech.Burgers;

public class HealthyBurger extends Hamburger{

    private String healtyExtra1Name;
    private double healtyExtra1Price;
    private String healtyExtra2Name;
    private double healtyExtra2Price;

    public HealthyBurger(String meat, double price, String breadRollType, String healtyExtra1Name, double healtyExtra1Price, String healtyExtra2Name, double healtyExtra2Price) {
        super(meat, price, breadRollType);
        this.healtyExtra1Name = healtyExtra1Name;
        this.healtyExtra1Price = healtyExtra1Price;
        this.healtyExtra2Name = healtyExtra2Name;
        this.healtyExtra2Price = healtyExtra2Price;
    }

    public HealthyBurger(String meat, double price, String breadRollType, String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price, String addition4Name, double addition4Price, String healtyExtra1Name, double healtyExtra1Price, String healtyExtra2Name, double healtyExtra2Price) {
        super(meat, price, breadRollType, addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name, addition4Price);
        this.healtyExtra1Name = healtyExtra1Name;
        this.healtyExtra1Price = healtyExtra1Price;
        this.healtyExtra2Name = healtyExtra2Name;
        this.healtyExtra2Price = healtyExtra2Price;
    }

    public void addHealthyAddition1(String healtyExtra1Name , double healtyExtra1Price){
        this.healtyExtra1Name= healtyExtra1Name;
        this.healtyExtra1Price=healtyExtra1Price;
    }
    public void addHealthyAddition2(String healtyExtra2Name , double healtyExtra2Price){
        this.healtyExtra2Name= healtyExtra2Name;
        this.healtyExtra2Price=healtyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        if (healtyExtra1Name != null) {
            builder.append("Healthy Extra 1: " + healtyExtra1Name + " - $" + healtyExtra1Price + "\n");
            healtyExtra1Price += healtyExtra1Price; // Healthy Extra 1'in fiyatını toplam fiyata ekle
        }
        if (healtyExtra2Name != null) {
            builder.append("Healthy Extra 2: " + healtyExtra2Name + " - $" + healtyExtra2Price + "\n");
            healtyExtra2Price += healtyExtra2Price; // Healthy Extra 2'nin fiyatını toplam fiyata ekle
        }

        System.out.println(builder.toString());
        return healtyExtra1Price + healtyExtra2Price; // Toplam fiyatı döndür
    }
    }

