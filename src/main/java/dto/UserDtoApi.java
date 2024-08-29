package dto;

import lombok.*;


    @Getter
    @Setter
    @Builder
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor

    public class UserDtoApi {
        private int id;
        private String email;
        private String first_name;
        private String last_name;
        private String avatar;
        private String password;
    }

