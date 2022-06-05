package lesson3;

public class MethodArgument {

    // int i = 方法调用传入的值;
    public static void suibian(int i){//suibian方法栈帧
        i = 1;
    }
    public static void suibian(User u){//suibian方法栈帧
        //注释，和不注释，结果是u局部变量指向不同的堆对象
//        u = new User();
        u.username = "李四";
    }

    //main线程，执行main方法（栈帧）
    public static void main(String[] args) {
        int i = 0;
        suibian(i);//产生方法调用
        System.out.println(i);

        User u = new User();
        u.username = "张三";
        suibian(u);
        System.out.println(u.username);
    }

    private static class User {
        private String username;
    }
}
