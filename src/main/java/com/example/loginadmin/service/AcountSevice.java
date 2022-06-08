package com.example.loginadmin.service;

import com.example.loginadmin.entity.Account;
import com.example.loginadmin.entity.entity_enum.AccountStatus;
import com.example.loginadmin.model.AccountModel;
import com.example.loginadmin.model.MySqlAccount;
import com.example.loginadmin.util.SHA512Hasher;

public class AccountService {
    private AccountModel accountModel;

    public AccountService() {
        accountModel = new MySqlAccount();
    }

    public Account register(Account account) {
        String salt = SHA512Hasher.randomString(15);
        String hashedPassword = SHA512Hasher.encode(account.getPassword(), salt);
        String savedPassword = hashedPassword + "." + salt;
        if(accountModel.create(Account.AccountBuilder.anAccount()
                .withFullName(account.getFullName())
                .withRoleId(account.getRoleId())
                .withUsername(account.getUsername())
                .withEmail(account.getEmail())
                .withPhoneNumber(account.getPhoneNumber())
                .withStatus(AccountStatus.ACTIVE)
                .withPassword(savedPassword)
                .build())) {
            return account;
        }
        return null;
    }

    public Account login(String username, String password) {
        Account account = accountModel.findByUsername(username);
        if(account != null && SHA512Hasher.checkPassword(account.getPassword(), password)) {
            return account;
        }
        return null;
    }
}
