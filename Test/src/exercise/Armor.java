package exercise;

public class Armor extends Item{
	int ac;   //护甲等级
	public static void main(String[] args) {
		Armor a = new Armor();
		a.name = "护甲";
		a.price = 300;
		a.ac = 15;
		
		Armor b = new Armor();
		b.name = "锁子甲";
		b.price = 300;
		b.ac = 40;
	}
}
