package exercise;

public class Support extends Hero implements Healer{
	public Support(String heroName, float heroHP, float heroAromor, int heroMoveSpeed) {
		super(heroName, heroHP, heroAromor, heroMoveSpeed);
		// TODO Auto-generated constructor stub
	}
	public void heal() {
		System.out.println("加血");
	}
	public void heal(Hero h) {
		System.out.println("为" + h.name + "加血");
	}
	public void heal(Hero h, int hp) {
		System.out.println("为" + h.name + "加" + hp +"血");
	}
}
