package wang.ismy.ssm.service;

import wang.ismy.ssm.entity.Account;

import java.util.List;

/**
 * @author MY
 * @date 2019/8/25 13:47
 */
public interface AccountService {

    List<Account> findAll();

    Account findById(Integer id);
}
