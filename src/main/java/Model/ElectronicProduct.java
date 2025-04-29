package Model;

import java.io.StringReader;

public class ElectronicProduct extends Product{
    private String company;
    private double power;
    public ElectronicProduct(double price, String picture, String name, String company, double power) {
        super(price, picture, name);
        this.company = company;
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
