package Controller;

import Model.Product;
import Model.User;

public class UserController {
    private static UserController userController;
    private UserController(){
    }
    public static UserController getUserController(){
        if(userController == null){
            userController = new UserController();
        }
        return userController;
    }
    public User currentUser;
    public void addUser(String name, String password, double money){
        DataBaseController.getInstance().getUsers().add(new User(name, password, money));
    }
    public String login(String name, String password){
        for (User user : DataBaseController.getInstance().getUsers()){
            if (user.getName().equals(name) && user.getPassword().equals(password)){
                currentUser = user;
                return "login Succesfule";
            }
        }
        return "login Failed";
    }
    public String logout(){
        currentUser = null;
        return "logout Succesfule";
    }
    public String increaseMoney(double money){
        currentUser.setMoney(currentUser.getMoney() + money);
        return "increase Succesfule";
    }
    public String buyProduct(Product product){
        if (currentUser.getMoney() >= product.getPrice()){
            currentUser.setMoney(currentUser.getMoney() - product.getPrice());
            currentUser.getBuyedProducts().add(product);
            return "buy Succesfule";
        }
        return "buy Failed";
    }


}
