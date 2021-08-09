package com.crazy_java.Thread_16;

//build inner class
class  MyTest extends Thread{
    //provide specified constructor
    public MyTest(String name){
        super(name);
    }
    //provide appointed name and threadGroup  of threads
    public MyTest(ThreadGroup  group,String name){
        super(group,name);
    }
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(getName()+"线程i的变量:"+i);
        }
    }
}
public class ThreadGropeTest_p766 {
    public static void main(String[] args) {
        ThreadGroup mainGroup=Thread.currentThread().getThreadGroup();
        System.out.println("主线程的名字:"+mainGroup.getName());
        System.out.println("主线程是否是后台线程组:"+mainGroup.isDaemon());
        new MyTest("boyunv的主线程线程").start();
        ThreadGroup tg = new ThreadGroup("新线程组");
        tg.setDaemon(true);
        System.out.println("主线程是否是后台线程组"+tg.isDaemon());
        MyTest group = new MyTest(tg, "tg组的线程甲");
        group.start();
      new MyTest(tg,"泊云V线程进行启动").start();

    }
}
