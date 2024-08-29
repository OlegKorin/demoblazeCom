package api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteUsersTests extends UserController{
    @Test
    public  void  deleteUser(){
        Response response= deleteUser("1");
        System.out.println(response.getStatusCode());
        Assert.assertEquals(204,response.getStatusCode());
    }




}
