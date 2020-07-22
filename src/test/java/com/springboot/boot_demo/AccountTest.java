package com.springboot.boot_demo;

import com.springboot.boot_demo.entity.Account;
import com.springboot.boot_demo.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(BootDemoApplication.class)
public class AccountTest {
    @Autowired
    private IAccountService accountService;

    @Test
    public void findAllTest() {
        System.out.println("begin");
        List<Account> re = accountService.findALL();
        re.stream().forEach(System.out::println);
    }
}
