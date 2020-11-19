package polymorphism2;

import java.util.ArrayList;

class Animal{  //상위 클래스
	public void move() {
		System.out.println("동물은 움직입니다");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람은 두발로 걷습니다");
	}
	
	public void readBook() {
		System.out.println("사람은 책을 읽습니다");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이는 네발로 뜁니다");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리는 하늘을 납니다");
	}
	public void flying() {
		System.out.println("독수리가 날개를 펴고 멀리 날아갑니다");
	}
}
public class AnimalTset {
	static ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTset aTset = new AnimalTset();
		aTset.addAnimal();
		System.out.println("원래형으로 다운 캐스팅");
		aTset.testCasting();
	}
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	public void testCasting() {
			for(int i=0;i<aniList.size(); i++) {
				Animal ani = aniList.get(i);
				if(ani instanceof Human) {
					Human h =(Human)ani;
					h.readBook();
				}
				else if(ani instanceof Tiger) {
					Tiger t = (Tiger)ani;
					t.hunting();
				}
				else if (ani instanceof Eagle) {
					Eagle e =(Eagle)ani;
					e.flying();
				}
				else {
					System.out.println("지원 돼지 않는 형입니다");
					
				}
			}
		}

}
