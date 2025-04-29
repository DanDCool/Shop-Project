package Controller;

import Model.Database;
import Model.Product;
import Model.User;

import java.util.ArrayList;

public class DataBaseController {
    private static DataBaseController database;
    private Database data;
    private DataBaseController(){

    }
    public static DataBaseController getInstance(){
        if (database == null){
            database = new DataBaseController();
        }
        return database;
    }
    public ArrayList<User> getUsers(){
        return data.getAllUsers();
    }
    public ArrayList<Product> getProduct(){
        return data.getAllProducts();
    }
}
