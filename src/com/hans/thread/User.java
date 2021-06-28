package com.hans.thread;

/**
 * 公司：Sunline
 * 作者：曾声强
 * 所属包 : com.hans.thread
 * 创建日期：2021/6/22 时间：16:14
 * 更新日期：2021/6/22 时间：16:14
 * 描述：这个类的主要功能及作用说明
 */
public class User {
    private String age;
    private String name;

    public User() {
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String age, String name) {
        this.age = age;
        this.name = name;
    }
}
