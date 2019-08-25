package wang.ismy.ssm.dao;

import wang.ismy.ssm.entity.Account;

import java.util.List;

/**
 * @author MY
 * @date 2019/8/25 13:30
 */
public interface AccountDao {

    List<Account> findAll();

    Account findById(Integer id);

}
