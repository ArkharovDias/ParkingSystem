package com.springcourse.app.services;

import com.springcourse.app.dto.AccountDto;
import com.springcourse.app.dto.PersonDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public AccountDto findById(Long id) {
        return AccountDto.builder()
                .id(id)
                .login("myLogin")
                .password("ggwp")
                .build();
    }

    @Override
    public AccountDto create(AccountDto accountDto) {
        return accountDto;
    }

    @Override
    public AccountDto updateByPut(AccountDto accountDto, Long id) {
        return accountDto;
    }

    @Override
    public AccountDto updateByPatch(AccountDto accountDto, Long id) {
        return accountDto;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AccountDto> findAll() {
        return Arrays.asList(AccountDto.builder().build());
    }
}
