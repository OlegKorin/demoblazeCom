package api;

import api.UserController;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class PatchUserTests extends UserController {

    @Test
    public void patchUser(){
        Response response = patchUpdateUser("2");
        System.out.println(response.getBody().print());
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        Assert.assertTrue(response.getBody().print().contains(localDate.toString()));
    }
}
