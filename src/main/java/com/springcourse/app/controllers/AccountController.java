package com.springcourse.app.controllers;

import com.springcourse.app.dto.AccountDto;
import com.springcourse.app.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/{id}")
    public AccountDto findById(@PathVariable("id") Long id){
        return accountService.findById(id);
    }

    @PostMapping("{id}")
    public AccountDto create(@RequestBody AccountDto accountDto){
        return accountService.create(accountDto);
    }

    @PutMapping("{id}")
    public AccountDto updateByPut(@RequestBody AccountDto accountDto, @PathVariable Long id){
        return accountService.updateByPut(accountDto, id);
    }

    @PatchMapping("{id}")
    public AccountDto updateByPatch(@RequestBody AccountDto accountDto, @PathVariable Long id){
        return accountService.updateByPatch(accountDto, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        accountService.delete(id);
    }

}
