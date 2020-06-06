package exercise;

public class VariableTest {
	public static void main(String[] args) {
		TypeTest();
		ValueType();
		TypeTrans();
		System.out.println("ok"); 
	}
	static void TypeTest() {
		double a = 3.14;
		float b = 2.769343f;
		long c = 365L;
		int d = 12;
		char e = '吃';
		boolean f = false;
		String g = "不可描述";
	}
	static void ValueType() {
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 900;
		float f = 4.566f;
		double d = 3.14;
		char c = 'c';
		String str = "aaaa";
	}
	static void TypeTrans() {
		 short a = 1;
		 short b = 2;
		 //a+b的类型比short类型要大
		 int c = a+b;
	}
	public void method1(final int j) {
        System.out.println(11); //j在传递参数时已经被赋值
    }
}
