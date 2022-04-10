package lesson1;

public class CreateThread {

    public static void main(String[] args) {
        Runnable r = new Runnable() {//任务描述的可执行类：传入线程对象的构造方法
            @Override
            public void run() {//线程运行态时，执行

            }
        };
        Thread t = new Thread(r, "子线程A");
        t.start();

        //合并的代码
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }, "子线程B").start();

        //runnable只有一个接口方法，可以直接用lambda表达式
        new Thread(() -> {
            System.out.println();//和在run()方法写代码一样的效果
        }, "子线程C").start();
    }
}
