package lesson2;

public class InterruptTest2 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //Thread.interrupted(); 返回当前线程中断标志位，然后重置中断标志位
                for(int i=0; i<10000; i++){
                    System.out.println(i+": "+Thread.interrupted());
                }
            }
        });
        t.start();//线程启动，中断标志位=false
        System.out.println("t start");
        //告诉t线程，要中断（设置t线程的中断标志位为true），由t的代码自行决定是否中断
        //如果t线程处于阻塞状态，会抛出InterruptedException，并且重置t线程的中断标志位
        t.interrupt();
        System.out.println("t stop");
    }
}
