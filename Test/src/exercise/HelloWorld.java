package exercise;

public class HelloWorld {
	public static void main(String[] args) {
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
}