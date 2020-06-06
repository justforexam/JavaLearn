package exercise;


public class Hero {
    
    //String name; //姓名
     
    //float hp; //血量
     
    float armor; //护甲
     
    int moveSpeed; //移动速度
    public String name; //实例属性，对象属性，非静态属性
    protected float hp;
    static String copyright;//类属性,静态属性
    public Hero(){
        
    }
    public Hero(String name, float hp, float aromor, int movespeed) {
    	this(name,hp);//调用上一个构造方法
    	System.out.println("two");
    }
//    public Hero(String heroName, float heroHP, float heroAromor, int heroMoveSpeed) {
//    	System.out.println(name);
//    }
  //回血
    public void huixue(int xp){
        hp = hp + xp;
        //回血完毕后，血瓶=0
        xp=0;
    }
    
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
 
  //复活
    public void revive(Hero h){
        h = new Hero("提莫",383);
    }
 
//    public static void main(String[] args) {
//        Hero teemo =  new Hero("提莫",383);
//         
//        //受到400伤害，挂了
//        teemo.hp = teemo.hp - 400;
//         
//        teemo.revive(teemo);
//         
//        System.out.println(teemo.hp); //输出多少？ 怎么理解？
//         
//    }
    //实例方法,对象方法，非静态方法
    //必须有对象才能够调用
    public void die(){
        hp = 0;
    }
    
    public void kill(Mortal m) {
    	m.die();
    }
    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("battle win");
    }
	public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";
        
        ADhero ad = new ADhero();
        APhero ap = new APhero();
        ADAPhero adap = new ADAPhero();
        garen.kill(ad);
        garen.kill(ap);
        garen.kill(adap);
         
//        Hero.copyright = "版权由Riot Games公司所有";
//        garen.copyright = "Blizzard Entertainment Enterprise"; 
//        System.out.println(garen.name);
//        System.out.println(garen.copyright);
//         
//        Hero teemo =  new Hero();
//        teemo.name = "提莫";
//        System.out.println(teemo.name);    
//        System.out.println(teemo.copyright);
      
	}
      
}