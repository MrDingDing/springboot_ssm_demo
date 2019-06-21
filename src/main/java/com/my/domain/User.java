package com.my.domain;

import org.springframework.stereotype.Component;


public class User {
    private int Tid;
    private String Tname;
    private String Tpwd;

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public String getTpwd() {
        return Tpwd;
    }

    public void setTpwd(String tpwd) {
        Tpwd = tpwd;
    }

    public int getTid() {
        return Tid;
    }

    public void setTid(int tid) {
        Tid = tid;
    }

    @Override
    public String toString() {
        return "User{" +
                "Tid=" + Tid +
                ", Tname='" + Tname + '\'' +
                ", Tpwd='" + Tpwd + '\'' +
                '}';
    }
}
