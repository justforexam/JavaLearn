package exercise;

class Solution {
    public boolean isPalindrome(int x) {
        if ( x < 0 || (x % 10 == 0)) {
        	System.out.println(000);
            return false;
        }
        else {
            int res = 0;
            int y = x;
            while(y!=0) {
                //每次取末尾数字
                int tmp = y % 10;
                //判断是否 大于 最大32位整数
                if (res>214748364 || (res==214748364 && tmp>7)) {
                    return false;
                }
                res = res*10 + tmp;
                y /= 10;
            }
            System.out.println(x+","+res);
            if ( x == res) {
            	System.out.println(111);
                return true;
            }
            System.out.println(222);
            return false;
        }
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		s.isPalindrome(-121);
	}

}