package com.workintech.Burgers;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;
    public DeluxeBurger(String meat, double price, String breadRollType,String cips,String drink) {
        super(meat, price, breadRollType);
        this.cips=cips;
        this.drink=drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Kesinlikle malzeme eklenemez...");
    }
}
