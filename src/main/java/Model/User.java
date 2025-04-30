package Model;

import java.util.ArrayList;

public class User extends Account{
    private double money;
    private ArrayList<Product> buyedProducts = new ArrayList<>();

    public ArrayList<Product> getBuyedProducts() {
        return buyedProducts;
    }

    public void setBuyedProducts(ArrayList<Product> buyedProducts) {
        this.buyedProducts = buyedProducts;
    }

    public User(String name, String password, double money) {
        super(name, password);
        this.money = money;
    }
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
