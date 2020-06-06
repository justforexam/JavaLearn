package exercise;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		System.out.println("输入数字：");
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		System.out.println("电脑将在" + t + "秒后关闭");
		Runtime.getRuntime().exec("shutdown -s -t " + t);
	}

}
