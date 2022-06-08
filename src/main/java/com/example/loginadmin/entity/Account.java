package com.example.loginadmin.entity;

import com.example.loginadmin.entity.base.BaseEntity;
import com.example.loginadmin.entity.entity_enum.AccountStatus;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Account extends BaseEntity {
    private int id;
    private String fullName;
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String confirmPassword;
    private int roleId;
    private AccountStatus status;
    private HashMap<String, String> errors;

    public Account() {
    }


    public Account(String fullName, String username, String email, String phoneNumber, String password, String confirmPassword, int roleId, AccountStatus status) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.roleId = roleId;
        this.status = status;
        this.confirmPassword = confirmPassword;
    }

    public Account(LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, int id, String fullName, String username, String email, String phoneNumber, String password, int roleId, AccountStatus status) {
        super(createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy);
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.roleId = roleId;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public HashMap<String, String> getErrors() {
        return errors;
    }

    public void setErrors(HashMap<String, String> errors) {
        this.errors = errors;
    }

    public static final class AccountBuilder {
        public LocalDateTime createdAt;
        public LocalDateTime updatedAt;
        public LocalDateTime deletedAt;
        public int createdBy;
        public int updatedBy;
        public int deletedBy;
        private int id;
        private String fullName;
        private String username;
        private String email;
        private String phoneNumber;
        private String password;
        private String confirmPassword;
        private int roleId;
        private AccountStatus status;
        private HashMap<String, String> errors;

        private AccountBuilder() {
            this.fullName = "";
            this.email = "";
            this.phoneNumber = "";
            this.username = "";
            this.password = "";
            this.confirmPassword = "";
            this.createdAt = LocalDateTime.now();
            this.updatedAt = LocalDateTime.now();
            this.status = AccountStatus.ACTIVE;
            this.errors = new HashMap<>();
        }
    }
}
