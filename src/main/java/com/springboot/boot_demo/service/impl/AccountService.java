package com.springboot.boot_demo.service.impl;

import com.springboot.boot_demo.dao.AccountMapper;
import com.springboot.boot_demo.entity.Account;
import com.springboot.boot_demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountService implements IAccountService {

    @Autowired
    AccountMapper am;

    @Override
    public List<Account> findALL() {
        List<Account> res=am.selectAll();
        System.out.println("service : findAll");
        return res;
    }

    @Override
    public Account selectById(Integer id) {
        Account res=am.selectById(id);
        System.out.println("service : select By Id");
        return res;
    }

    @Override
    public void saveAccount(Account ac) {
        Integer res=am.saveAccount(ac);
        System.out.println("service: save Account");
        System.out.println(res);
    }
}
