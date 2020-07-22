package com.springboot.boot_demo.controller;

import com.springboot.boot_demo.entity.Account;
import com.springboot.boot_demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    IAccountService ias;

    @GetMapping("/findAll.json")
    public List<Account> findAll()
    {

        List<Account> res=ias.findALL();
        System.out.println("c fa");
        return res;
    }

    @GetMapping("/selectById.json")
    public Account selectById(Integer id)
    {
        Account ac= ias.selectById(id);
        System.out.println("c select id");
        return ac;
    }

    @PostMapping("/saveAccount")
    public void saveAccount(Account account)
    {
        ias.saveAccount(account);
        System.out.println("c acc");
    }
}
