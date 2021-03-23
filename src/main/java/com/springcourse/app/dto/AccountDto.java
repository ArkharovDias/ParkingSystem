package com.springcourse.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private Long id;
    private String login;
    private String password;
    private AccountStatus accountStatus;
    private PersonDto personDto;
}
