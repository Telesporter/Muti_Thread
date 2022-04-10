package lesson1;

public class InnerClass {

    public static void main(String[] args) {
        //匿名内部类：重新定义了一个A的子类，重写了方法
        A a = new A(){
            @Override
            public void x() {
                System.out.println("Y");
            }
        };
        //需要明确的先调用，才会执行方法
    }

    // 静态内部类：和普通类使用没什么区别，只是需要明确是哪个类的内部类。
    // 其他包使用：InnerClass.A
    public static class A{
        public void x(){
            System.out.println("A");
        }
    }
}
