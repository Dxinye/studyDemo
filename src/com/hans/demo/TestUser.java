package com.hans.demo;

import com.hans.thread.User;

/**
 * 公司：Sunline
 * 作者：曾声强
 * 所属包 : com.hans.demo
 * 创建日期：2021/6/24 时间：14:56
 * 更新日期：2021/6/24 时间：14:56
 * 描述：这个类的主要功能及作用说明
 */
public class TestUser {
    public static void main(String[] args){
        User user = new User();
        User user1 = new User("90","Hans");
        user = user1;
        System.out.println(user.getAge());

    }
}
