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
		char e = '��';
		boolean f = false;
		String g = "��������";
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
		 //a+b�����ͱ�short����Ҫ��
		 int c = a+b;
	}
	public void method1(final int j) {
        System.out.println(11); //j�ڴ��ݲ���ʱ�Ѿ�����ֵ
    }
}
