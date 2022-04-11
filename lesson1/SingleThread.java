package lesson1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/11
 * Time: 18:02
 * Description: No Description
 */
public class SingleThread {
    public static void main(String[] args) {
        //第一种情况，耗时多的任务，前一个任务不执行完，无法执行后一个任务
        calculate(new ArrayList<>());
        calculate(new ArrayList<>());
        //第二种情况，阻塞任务，第一个print需要输入回车，否则第二个print无法执行
        Scanner sc = new Scanner(System.in);
        print(sc);
        print(sc);
    }

    private static void print(Scanner sc) {
        System.out.println(sc.nextLine());
    }

    private static void calculate(ArrayList<Object> objects) {
        //计算量非常大，假设要执行一次，需要5s
    }
}
