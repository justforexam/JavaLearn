package exercise;
import java.util.Scanner;

public class BMITest {
	public static void main(String args[])
	{
		//计算BMI值，通过条件判断BMI的范围
		//BMI();
		//判断某一年是否为闰年
		RYear();
	}
	public static void BMI()
	{
		System.out.println("请输入身高:");
		Scanner s = new Scanner(System.in);
        float h = s.nextFloat();
        System.out.println("请输入体重:");
        float w = s.nextFloat();
        float BMI = w/(h*h);
		System.out.println("当前的BMI是:"+BMI);
		if(BMI < 18.5)
			System.out.println("体重过轻");
		else if(BMI >= 18.5 && BMI <24)
			System.out.println("正常范围");
		else if(BMI >= 24 && BMI <27)
			System.out.println("体重过重");
		else
			System.out.println("肥胖");
	}
	public static void RYear()
	{
		System.out.println("请输入年份:");
		Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if(y % 400 == 0)
        	System.out.println(y+"闰年");
        else if((y % 4 == 0) && (y % 100 != 0))
        	System.out.println(y+"闰年");
        else
        	System.out.println(y+"不是闰年");
	}
}
