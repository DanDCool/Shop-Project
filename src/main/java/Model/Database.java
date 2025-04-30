package Model;

import java.util.ArrayList;

public class Database {
    private static Database database;
    public static Database getDatabase(){
        if(database == null){
            database = new Database();
        }
        return database;
    }
    private ArrayList<User> allUsers = new ArrayList<>();
    private ArrayList<Product> allProducts = new ArrayList<>();

    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(ArrayList<Product> allProducts) {
        this.allProducts = allProducts;
    }

    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<User> allUsers) {
        this.allUsers = allUsers;
    }
}
