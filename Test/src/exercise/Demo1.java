package exercise;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		System.out.println("�������֣�");
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		System.out.println("���Խ���" + t + "���ر�");
		Runtime.getRuntime().exec("shutdown -s -t " + t);
	}

}
