package com.springcourse.app.services;

import com.springcourse.app.dto.AccountDto;

import java.util.List;

public interface AccountService extends CrudService<AccountDto, Long> {
    List<AccountDto> findAll();
}
