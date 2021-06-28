package com.hans.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 公司：Sunline
 * 作者：曾声强
 * 所属包 : com.hans.thread
 * 创建日期：2021/6/22 时间：16:14
 * 更新日期：2021/6/22 时间：16:14
 * 描述：这个类的主要功能及作用说明
 */
public class TestListSort {
    public static void main(String[] args){
        List<User> list = new ArrayList<>();
        list.add(new User("1","hans3"));
        list.add(new User("1","hans2"));
        list.add(new User("1","hans1"));
        list.add(new User("4","xiaoqiang1"));
        list.add(new User("4","xiaoqiang2"));
        list.add(new User("4","xiaoqiang3"));
        list.add(new User("5","xiao1"));
        Map<String,List<User>> userListMap = list.stream().collect(Collectors.groupingBy(User::getAge));
        for (Map.Entry<String,List<User>> map : userListMap.entrySet()){
            System.out.println(map.getKey());
        }


    }
}
