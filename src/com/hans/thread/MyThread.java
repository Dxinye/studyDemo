package com.hans.thread;

/**
 * 公司：Sunline
 * 作者：曾声强
 * 所属包 : com.hans.thread
 * 创建日期：2021/6/20 时间：11:14
 * 更新日期：2021/6/20 时间：11:14
 * 描述：这个类的主要功能及作用说明
 */
public class MyThread extends Thread {

    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                SynchronizedDemo.outPutName("Hans");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
