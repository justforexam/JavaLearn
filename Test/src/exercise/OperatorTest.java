package exercise;

import java.util.Scanner;

public class OperatorTest {
	public static void main(String[] args) {
		GetSum();
		SumTest();
		LogicTest();
	}
	//������������ϰ
	public static void GetSum() {
		System.out.println("�������1������:");
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("�������2������:");
        int b = s.nextInt();
        System.out.println("���������ֱ��ǣ�"+a+"��"+b);
        int c = a + b;
        System.out.println("sum="+c);
	}
	public static void SumTest() {
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		System.out.println(j);
	}
	//�߼���������ϰ
	public static void LogicTest() {
		int i = 1;
		boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
		System.out.println(b);
		System.out.println(i);
	}
}
