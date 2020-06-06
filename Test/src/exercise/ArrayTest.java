package exercise;

public class ArrayTest {
	public static void main(String[] args) {
//		FindMax();
//		TestTwo();
		TestThree();
	}
	public static void TestOne() {
		//写法一： 分配空间同时赋值
        //int[] a = new int[]{100,102,444,836,3236};
 
        //写法二： 省略了new int[],效果一样
        //int[] b = {100,102,444,836,3236};
         
        //写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
        //int[] c = new int[3]{100,102,444,836,3236};
		
		int[] a;
		a = new int[5];
		int i;
		System.out.println("数组中的各个随机数是:");
		for(i=0; i<5; i++)
		{
			a[i] = (int) (Math.random() * 100);
			System.out.println(a[i]);
		}
		//找出最小的一个值
		int min = a[0];
		for(i=0; i<5; i++)
		{
//			if(a[i]<a[i+1])   当i=4时,a[i+1]报错
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("本练习的目的是，找出最小的一个值: "+min);
		//反转数组
		int[] b = new int[5];
		System.out.println("for 反转后的数组是: ");
		for(i=0; i<5 ; i++)
		{
			b[i]=a[4-i];
			System.out.println(b[i]);
		}
		System.out.println("while 反转后的数组是: ");
		int j = 0;
		while(j<5)
		{
			b[j]=a[4-j];
			System.out.println(b[j]);
			j++;
		}
	}
	public static void FindMax() {
		//用增强型for循环找出最大的那个数
		int[] a;
		a = new int[5];
		int i;
		System.out.println("数组中的各个随机数是:");
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
		System.out.println("数组中的各个随机数是:");
		for(i=0; i<3; i++)
		{
			a[i] = (int) (Math.random() * 10);
			b[i] = (int) (Math.random() * 10);
			System.out.print("a["+i+"]:"+a[i]+ " ");
			System.out.print("b["+i+"]:"+b[i]+ " ");
		}
		System.arraycopy(a, 0, c, 0, 3);
		System.arraycopy(b, 0, c, 3, 3);
		//把内容打印出来
        for (int j = 0; j < c.length; j++) {
            System.out.print(c[j] + " ");
        }
	}
	public static void TestThree() {
		//初始化二维数组，
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
