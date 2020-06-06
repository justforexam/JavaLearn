package exercise;

public class ControlTest {
	public static void main(String[] args) {
		//ContinueTest();
		//BreakTest();
//		ComplexOne();
		ComplexTwo();
		//ComplexThree();
	}
	public static void ContinueTest() {
		int i;
		for(i=1;i<=100;i++) {
			if((i%3==0) || (i%5==0))
				continue;
			System.out.println(i);
		}
	}
	public static void BreakTest() {
		/*
         * 百万富翁 F = p* ( (1+r)^n );
         */
        int y = 0;
        double sum = 0;
        int p = 12000;
        while (sum < 1000000) {
            y += 1;
            sum = sum + p * Math.pow(1.2, y);
        }
        System.out.println(y);
    }
	//综合练习-黄金分割点
	public static void ComplexOne() {
		//寻找某两个数相除，其结果 离黄金分割点 0.618最近
		/*寻找某两个数相除，其结果 离黄金分割点 0.618最近
		 * 分母和分子不能同时为偶数
		 * 分母和分子 取值范围在[1-20]*/
		double d = 0.618;
		
		
	}
	//综合练习-水仙花数
	public static void ComplexTwo() {
		/*
		 * 1. 一定是3位数
		2. 每一位的立方，加起来恰好是这个数本身，
		比如153=1*1*1+5*5*5+3*3*3
		 */
		int f1,f2;
		int a,b,c;
		for(a=1; a<=9; a++) {
			for(b=0; b<=9; b++) {
				for(c=0; c<=9; c++){
					f1 = a*100 + b*10 + c;
					f2 = a*a*a + b*b*b + c*c*c;
					if(f1==f2)
						System.out.println(f1+"是水仙花数");
				}
			}
		}
			
			
	}
	//综合练习-算术题
	public static void ComplexThree() {
		int a = 0, b = 0, c = 0, d = 0;
		while((c-d)==6) {
			for( ; a<=8; a++) {
				b = 8 - a;
				c = 14 - a;
				d = 10 - b;
			}
		}
		System.out.println(a+"/"+b+"/"+c+"/"+d);
	}
}
