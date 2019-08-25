package wang.ismy.ssm.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.ismy.ssm.entity.Account;
import wang.ismy.ssm.service.AccountService;

import java.util.List;

/**
 * @author MY
 * @date 2019/8/25 14:14
 */
@RequestMapping("/account")
@RestController
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping("/list")
    public List<Account> list(){
        return accountService.findAll();
    }
}
