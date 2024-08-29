package api;

import dto.UserDtoApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class UserController implements BaseApi {

    RequestSpecification requestSpecification = new RequestSpecBuilder()
            .addHeader("accept", "application/json")
            .addHeader("Content-Type", "application/json")
            .build();
        protected Response registrationUser(UserDtoApi userDtoApi) {
        return given()
                .body(userDtoApi)
                .spec(requestSpecification)
                .when()
                .post(BASE_URL+REGISTRATION_URL)
                .thenReturn();
    }


//    protected Response registrationUser(UserDtoApi userDtoApi) {
//        return given()
//                .body(userDtoApi)
//                .contentType(ContentType.JSON)
//                .when()
//                .post(BASE_URL+REGISTRATION_URL)
//                .thenReturn();
    protected Response getUsersList(int page, int per_page){
        return given()
                .queryParam("page", page)
                .queryParam("per_page", per_page)
                .when()
                .get(BASE_URL+GET_USER_LIST_URL)
                .thenReturn();
    }

    protected Response patchUpdateUser(String id){
        return given()
                .when()
                .patch(BASE_URL+GET_USER_LIST_URL+"/"+id)
                .thenReturn();
    }
    protected  Response deleteUser(String id){
          return  given()
                    .when()
                    .delete(BASE_URL+GET_USER_LIST_URL+"/"+id)
                    .thenReturn();

    }
}

