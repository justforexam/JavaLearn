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
         * ������ F = p* ( (1+r)^n );
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
	//�ۺ���ϰ-�ƽ�ָ��
	public static void ComplexOne() {
		//Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���
		/*Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���
		 * ��ĸ�ͷ��Ӳ���ͬʱΪż��
		 * ��ĸ�ͷ��� ȡֵ��Χ��[1-20]*/
		double d = 0.618;
		
		
	}
	//�ۺ���ϰ-ˮ�ɻ���
	public static void ComplexTwo() {
		/*
		 * 1. һ����3λ��
		2. ÿһλ��������������ǡ�������������
		����153=1*1*1+5*5*5+3*3*3
		 */
		int f1,f2;
		int a,b,c;
		for(a=1; a<=9; a++) {
			for(b=0; b<=9; b++) {
				for(c=0; c<=9; c++){
					f1 = a*100 + b*10 + c;
					f2 = a*a*a + b*b*b + c*c*c;
					if(f1==f2)
						System.out.println(f1+"��ˮ�ɻ���");
				}
			}
		}
			
			
	}
	//�ۺ���ϰ-������
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
