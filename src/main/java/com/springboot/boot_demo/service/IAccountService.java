package com.springboot.boot_demo.service;

import com.springboot.boot_demo.entity.Account;

import java.util.List;

public interface IAccountService {

    /**
     * 查询所有
     * @return
     */
    List<Account> findALL();

    /**
     * 按id查询
     * @param id
     * @return
     */
    Account selectById(Integer id);

    /**
     * 保存账户
     * @param ac
     */
    void saveAccount(Account ac);
}
