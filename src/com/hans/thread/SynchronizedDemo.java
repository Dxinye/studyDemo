package com.hans.thread;

/**
 * 公司：Sunline
 * 作者：曾声强
 * 所属包 : com.hans.thread
 * 创建日期：2021/6/20 时间：11:09
 * 更新日期：2021/6/20 时间：11:09
 * 描述：这个类的主要功能及作用说明
 */
public class SynchronizedDemo {
    public static synchronized void outPutName(String msg) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("打印信息："+msg);
    }

}
