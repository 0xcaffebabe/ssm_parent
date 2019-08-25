package wang.ismy.ssm.service.impl;

import org.springframework.stereotype.Service;
import wang.ismy.ssm.dao.AccountDao;
import wang.ismy.ssm.entity.Account;
import wang.ismy.ssm.service.AccountService;

import java.util.List;

/**
 * @author MY
 * @date 2019/8/25 13:47
 */
@Service
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }
}
