package dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseGetUserListDto {
    private int page;
    private int  per_page;
    private int total;
    private int total_pages;
    private UserDtoApi [] data;
    private SupportDto support;
}
