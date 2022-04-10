package lesson1;

public class ThreadStartVsRun {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                }
            }
        }).run();
        /**
         * main线程直接调用Thread对象的run方法，会直接在main线程
         * 运行Thread对象的run()--->传入的runnable对象.run()
         * 结果：main线程直接运行 while(true)
         * 对比通过start()调用的区别
         */
    }
}
