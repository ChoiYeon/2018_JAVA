
public class Monster {
	static String name;
	static int Hp;
	static int Str;
	static int Magic;
	static int Speed;
	static int Gold;
	static int EXP;
	static int RandomG;
	public static void attack() throws InterruptedException {
		System.out.println(name+"�� ����!");
		System.out.println();
		Thread.sleep(1000);
		Hero.Hp-=(Hero.Armor-Monster.Str);
		System.out.println(name+"�� �������� "+Hero.name+"(��)�� "+Str+"�� �������� �Ծ����ϴ�.");
		Thread.sleep(1000);
		System.out.println();
		if(Hero.Hp<=0) {
			System.out.println();
			System.out.println();
			System.out.println();
			Hero.DIE();
		}
	}
	public static void Gattack(Monster monster) throws InterruptedException {
		System.out.println("����"+name+"�� ����!");
		System.out.println();
		Thread.sleep(1000);
		RandomG=(int) (Math.random() * 2)+1 ;
		if(RandomG==1) {
			Thread.sleep(500);
			System.out.println("�� �����߽��ϴ�!");
			System.out.println();
			if(Hero.Hp<=0) {
				System.out.println();
				System.out.println();
				System.out.println();
				Hero.DIE();
			}
		}
		if(RandomG==2) {
			System.out.println("�� ������ �Ϻ� �������� �޾ҽ��ϴ�.");
			Thread.sleep(500);
			System.out.println();
			System.out.println(name+"�� �������� "+Hero.name+"(��)�� "+Str/3+"�� �������� �Ծ����ϴ�.");
			Hero.Hp-=Monster.Str/3;
		}
	}

	}
	
	

