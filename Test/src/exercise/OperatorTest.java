package exercise;

import java.util.Scanner;

public class OperatorTest {
	public static void main(String[] args) {
		GetSum();
		SumTest();
		LogicTest();
	}
	//算术操作符练习
	public static void GetSum() {
		System.out.println("请输入第1个整数:");
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("请输入第2个整数:");
        int b = s.nextInt();
        System.out.println("两个整数分别是："+a+"和"+b);
        int c = a + b;
        System.out.println("sum="+c);
	}
	public static void SumTest() {
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		System.out.println(j);
	}
	//逻辑操作符练习
	public static void LogicTest() {
		int i = 1;
		boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
		System.out.println(b);
		System.out.println(i);
	}
}
