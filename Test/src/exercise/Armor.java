package exercise;

public class Armor extends Item{
	int ac;   //���׵ȼ�
	public static void main(String[] args) {
		Armor a = new Armor();
		a.name = "����";
		a.price = 300;
		a.ac = 15;
		
		Armor b = new Armor();
		b.name = "���Ӽ�";
		b.price = 300;
		b.ac = 40;
	}
}
