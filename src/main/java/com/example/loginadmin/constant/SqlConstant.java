package com.example.loginadmin.constant;

public class SqlConstant {
    public static final String ACCOUNT_INSERT = "INSERT INTO accounts (fullName, username, email, password, roleId, phoneNumber, createdAt, updatedAt, createdBy, updatedBy, status) " +
            "                                                   VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String ACCOUNT_UPDATE = "UPDATE accounts SET fullName = ?, username = ?, email =  ?, password = ?, roleId = ?, phoneNumber = ?," +
            "createdAt = ?, updatedAt = ?, deletedAt = ?, createdBy = ?, updatedBy = ?, deletedBy = ?, status = ?, slug = ? WHERE id = ?;";
    public static final String ACCOUNT_DELETE = "DELETE FROM accounts WHERE id = ?;";
    public static final String ACCOUNT_FIND_BY_ID = "SELECT * FROM accounts WHERE id = ?;";
    public static final String ACCOUNT_FIND_BY_USERNAME = "SELECT * FROM accounts WHERE username = ?;";
    public static final String ACCOUNT_FIND_ALL = "SELECT * FROM accounts ORDER BY createdAt DESC;";

    public static final String ACCOUNT_FIELD_ID = "id";
    public static final String ACCOUNT_FIELD_USERNAME = "username";
    public static final String ACCOUNT_FIELD_FULL_NAME = "fullName";
    public static final String ACCOUNT_FIELD_PHONE_NUMBER = "phoneNumber";
    public static final String ACCOUNT_FIELD_EMAIL = "email";
    public static final String ACCOUNT_FIELD_PASSWORD = "password";
    public static final String ACCOUNT_FIELD_ROLE_ID = "roleId";
    public static final String ACCOUNT_FIELD_STATUS = "status";
    public static final String FIELD_DELETED_BY = "";
}