package exercise;
import java.util.Scanner;

public class JieCheng {
	public static void main(String[] args) {
		System.out.println("������һ������:");
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum = 1;
        while(a>1)
        {
        	sum = a*sum;
        	a = a-1;
        }
        System.out.println("�׳�Ϊ:"+sum);
	}
}
