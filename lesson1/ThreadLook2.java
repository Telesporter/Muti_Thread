package lesson1;

public class ThreadLook2 {

    public static void main(String[] args) {
        //第一种创建线程的方式：使用Thread类，重写run()
        Thread t = new Thread("main中的子线程"){
            @Override
            public void run() {
                while (true){

                }
            }
        };
//        t.setDaemon(true);
        //线程要启动，必须使用start()===>告诉系统调度本线程
        t.start();
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
        System.out.println(t.isInterrupted());
    }
}
