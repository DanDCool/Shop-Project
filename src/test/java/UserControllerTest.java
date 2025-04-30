import Controller.UserController;
import Model.*;
import org.junit.Assert;
import org.junit.Test;

public class UserControllerTest {
    @Test
    public void buyProductTest(){
        UserController.currentUser = new User("test","test",999);
        Product test = new ClothingProduct(998,"a","a","a", Size.small,"a", ClotheType.closed);
        String expected = "buy Successful";
        Assert.assertEquals(expected, UserController.getUserController().buyProduct(test));
        UserController.currentUser = new User("test","test",997);
        expected = "buy Failed";
        Assert.assertEquals(expected,UserController.getUserController().buyProduct(test));
    }
}
