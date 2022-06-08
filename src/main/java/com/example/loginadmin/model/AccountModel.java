package com.example.loginadmin.model;

import com.example.loginadmin.entity.Account;

import java.util.List;

public interface AccountModel {
    boolean create(Account account);

    boolean create(Account account);

    boolean update(int id, Account account);

    boolean delete(int id);

    Account findById(int id);

    Account findByUsername(String username);

    List<Account> findAll();
}
