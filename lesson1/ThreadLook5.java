package lesson1;

public class ThreadLook5 {

    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                for(int i=0; i<10000; i++){
                    //某个线程抛异常，如果抛到run方法，整个线程直接终止，
                    // 但是不会影响其他线程
                    // 线程中，处理异常的方式：线程对象.setUncaughtExceptionHandler
                    // 或者自己在run()捕获并处理
                    if(i == 20)
                        throw new RuntimeException();
                    System.out.println(i);
                }
            }
        };
        t.start();
        while(true){

        }
    }
}
