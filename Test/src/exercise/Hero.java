package exercise;


public class Hero {
    
    //String name; //����
     
    //float hp; //Ѫ��
     
    float armor; //����
     
    int moveSpeed; //�ƶ��ٶ�
    public String name; //ʵ�����ԣ��������ԣ��Ǿ�̬����
    protected float hp;
    static String copyright;//������,��̬����
    public Hero(){
        
    }
    public Hero(String name, float hp, float aromor, int movespeed) {
    	this(name,hp);//������һ�����췽��
    	System.out.println("two");
    }
//    public Hero(String heroName, float heroHP, float heroAromor, int heroMoveSpeed) {
//    	System.out.println(name);
//    }
  //��Ѫ
    public void huixue(int xp){
        hp = hp + xp;
        //��Ѫ��Ϻ�Ѫƿ=0
        xp=0;
    }
    
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
 
  //����
    public void revive(Hero h){
        h = new Hero("��Ī",383);
    }
 
//    public static void main(String[] args) {
//        Hero teemo =  new Hero("��Ī",383);
//         
//        //�ܵ�400�˺�������
//        teemo.hp = teemo.hp - 400;
//         
//        teemo.revive(teemo);
//         
//        System.out.println(teemo.hp); //������٣� ��ô��⣿
//         
//    }
    //ʵ������,���󷽷����Ǿ�̬����
    //�����ж�����ܹ�����
    public void die(){
        hp = 0;
    }
    
    public void kill(Mortal m) {
    	m.die();
    }
    //�෽������̬����
    //ͨ����Ϳ���ֱ�ӵ���
    public static void battleWin(){
        System.out.println("battle win");
    }
	public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "����";
        
        ADhero ad = new ADhero();
        APhero ap = new APhero();
        ADAPhero adap = new ADAPhero();
        garen.kill(ad);
        garen.kill(ap);
        garen.kill(adap);
         
//        Hero.copyright = "��Ȩ��Riot Games��˾����";
//        garen.copyright = "Blizzard Entertainment Enterprise"; 
//        System.out.println(garen.name);
//        System.out.println(garen.copyright);
//         
//        Hero teemo =  new Hero();
//        teemo.name = "��Ī";
//        System.out.println(teemo.name);    
//        System.out.println(teemo.copyright);
      
	}
      
}