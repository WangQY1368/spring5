package com.atguigu.spring5.entity;

public class Book {
    private String userId;
    private String useName;
    private String ustatus;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    public String getUserId() {
        return userId;
    }

    public String getUseName() {
        return useName;
    }

    public String getUstatus() {
        return ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", useName='" + useName + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
