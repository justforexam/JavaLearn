package exercise;
import java.util.Scanner;

public class BMITest {
	public static void main(String args[])
	{
		//����BMIֵ��ͨ�������ж�BMI�ķ�Χ
		//BMI();
		//�ж�ĳһ���Ƿ�Ϊ����
		RYear();
	}
	public static void BMI()
	{
		System.out.println("���������:");
		Scanner s = new Scanner(System.in);
        float h = s.nextFloat();
        System.out.println("����������:");
        float w = s.nextFloat();
        float BMI = w/(h*h);
		System.out.println("��ǰ��BMI��:"+BMI);
		if(BMI < 18.5)
			System.out.println("���ع���");
		else if(BMI >= 18.5 && BMI <24)
			System.out.println("������Χ");
		else if(BMI >= 24 && BMI <27)
			System.out.println("���ع���");
		else
			System.out.println("����");
	}
	public static void RYear()
	{
		System.out.println("���������:");
		Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y % 400 == 0)
        	System.out.println(y+"����");
        else if((y % 4 == 0) && (y % 100 != 0))
        	System.out.println(y+"����");
        else
        	System.out.println(y+"��������");
	}
}
