package api;

import dto.UserDtoApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends UserController {

    @Test
    public void registrationPositiveTest(){
        UserDtoApi userDto = UserDtoApi.builder()
                .email("tracey.ramos@reqres.in")
                .password("Password123!")
                .build();
        System.out.println(userDto.getId());
        System.out.println(userDto.getEmail());
        Assert.assertEquals(registrationUser(userDto).getStatusCode(), 200);
    }

    @Test
    public void registrationNegativeTest(){
        UserDtoApi userDto = UserDtoApi.builder()
                .email("tracey.ramos@reqres.in")
                .password("")
                .build();
        System.out.println(userDto.getId());
        System.out.println(userDto.getEmail());
        Assert.assertEquals(registrationUser(userDto).getStatusCode(), 400);
    }
}
