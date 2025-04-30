package Controller;

import Model.Database;
import Model.Product;
import Model.User;

import java.util.ArrayList;

public class DataBaseController {
    private static DataBaseController database;
    private DataBaseController(){

    }
    public static DataBaseController getInstance(){
        if (database == null){
            database = new DataBaseController();
        }
        return database;
    }
    public ArrayList<User> getUsers(){
        return Database.getDatabase().getAllUsers();
    }
    public ArrayList<Product> getProduct(){
        return Database.getDatabase().getAllProducts();
    }
}
