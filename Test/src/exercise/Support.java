package exercise;

public class Support extends Hero implements Healer{
	public Support(String heroName, float heroHP, float heroAromor, int heroMoveSpeed) {
		super(heroName, heroHP, heroAromor, heroMoveSpeed);
		// TODO Auto-generated constructor stub
	}
	public void heal() {
		System.out.println("��Ѫ");
	}
	public void heal(Hero h) {
		System.out.println("Ϊ" + h.name + "��Ѫ");
	}
	public void heal(Hero h, int hp) {
		System.out.println("Ϊ" + h.name + "��" + hp +"Ѫ");
	}
}
