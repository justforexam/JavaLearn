package exercise;

public class ArrayTest {
	public static void main(String[] args) {
//		FindMax();
//		TestTwo();
		TestThree();
	}
	public static void TestOne() {
		//д��һ�� ����ռ�ͬʱ��ֵ
        //int[] a = new int[]{100,102,444,836,3236};
 
        //д������ ʡ����new int[],Ч��һ��
        //int[] b = {100,102,444,836,3236};
         
        //д������ͬʱ����ռ䣬��ָ������
        //����������������3��������5��������ì����
        //�������ָ������������ݣ��Ͳ���ͬʱ��������ĳ���
        //int[] c = new int[3]{100,102,444,836,3236};
		
		int[] a;
		a = new int[5];
		int i;
		System.out.println("�����еĸ����������:");
		for(i=0; i<5; i++)
		{
			a[i] = (int) (Math.random() * 100);
			System.out.println(a[i]);
		}
		//�ҳ���С��һ��ֵ
		int min = a[0];
		for(i=0; i<5; i++)
		{
//			if(a[i]<a[i+1])   ��i=4ʱ,a[i+1]����
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("����ϰ��Ŀ���ǣ��ҳ���С��һ��ֵ: "+min);
		//��ת����
		int[] b = new int[5];
		System.out.println("for ��ת���������: ");
		for(i=0; i<5 ; i++)
		{
			b[i]=a[4-i];
			System.out.println(b[i]);
		}
		System.out.println("while ��ת���������: ");
		int j = 0;
		while(j<5)
		{
			b[j]=a[4-j];
			System.out.println(b[j]);
			j++;
		}
	}
	public static void FindMax() {
		//����ǿ��forѭ���ҳ������Ǹ���
		int[] a;
		a = new int[5];
		int i;
		System.out.println("�����еĸ����������:");
		for(i=0; i<5; i++)
		{
			a[i] = (int) (Math.random() * 100);
			System.out.println(a[i]);
		}
		int max = 0;
		for (int each : a) {
			if(max<each)
				max=each;
		}
		System.out.println("max:"+max);
	}
	public static void TestTwo() {
		int[] a = new int[3];
		int[] b = new int[3];
		int[] c = new int[6];
		int i;
		System.out.println("�����еĸ����������:");
		for(i=0; i<3; i++)
		{
			a[i] = (int) (Math.random() * 10);
			b[i] = (int) (Math.random() * 10);
			System.out.print("a["+i+"]:"+a[i]+ " ");
			System.out.print("b["+i+"]:"+b[i]+ " ");
		}
		System.arraycopy(a, 0, c, 0, 3);
		System.arraycopy(b, 0, c, 3, 3);
		//�����ݴ�ӡ����
        for (int j = 0; j < c.length; j++) {
            System.out.print(c[j] + " ");
        }
	}
	public static void TestThree() {
		//��ʼ����ά���飬
	    int[][] a = new int[5][5]; 
	    for(int i=0; i<=4; i++) {
	    	for( int j=0; i<=4; j++) {
	    		a[i][j] = (int) (Math.random() * 100);
	    		System.out.print(a[i][j] + " ");
	    	}
	    }
	    int max = a[0][0];
	    for(int k=0; k<=4; k++) {
	    	for( int h=0; h<=4; h++) {
	    		if(max < a[k][h])
	    			max = a[k][h];
	    	}
	    }
	    System.out.println("max:"+max);
	}
}
