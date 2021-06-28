package com.hans;

import com.hans.thread.MyThread;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("","");
    }
}
