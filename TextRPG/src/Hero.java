
public class Hero{
	static int PHp;
	static int MHp=50;
	static int Hp=50;
	static int Str=5;
	static int Magic=5;
	static double Speed=1;
	static int Armor=1;
	static int Level=1;
	static int Mmana=15;
	static int Pmana;
	static int mana=15;
	static int bag=5;
	static String name="���ΰ�";
	static Hero hero;
	static int Cool;
	static int HGold;
	static int HEXP;
	static int UP = 10;
	
	public static void Levelup() throws InterruptedException {
		if(HEXP>=UP) {
			System.out.println();
			System.out.println();
			System.out.println("LEVEL UP!");
			System.out.println();
			System.out.println();
			Thread.sleep(1000);
			Level+=1;
			if(Level<=2) {
				System.out.println("���� >> "+Level);
				System.out.println("�ִ� hp >> "+MHp*0.5+"��");
				System.out.println("���ݷ� >> "+Str*1.7+"��");
				System.out.println("���ǵ� >> "+1+"��");
				System.out.println("���� >> "+10+"��");
				System.out.println("������ >> "+10+"��");
				System.out.println("���� ���������� �ʿ��� ����ġ >>"+(int) (UP*2));
				PHp=MHp;
				Pmana=Mmana;
				MHp=(int) (MHp+(MHp*0.5));
				Str+=Str*1.7;
				Speed+=1;
				Mmana+=10;
				Magic+=10;
				UP=(int) (UP*2);
				Hp+=MHp-PHp;
				mana+=Mmana-Pmana;
			}
			else {
				System.out.println("���� >> "+Level+1);
				System.out.println("�ִ� hp >> "+MHp*0.5+"��");
				System.out.println("���ݷ� >> "+Str*1.3+"��");
				System.out.println("���ǵ� >> "+1+"��");
				System.out.println("���� >> "+10+"��");
				System.out.println("���� ���������� �ʿ��� ����ġ >>"+(int) (UP*2));
				PHp=MHp;
				Pmana=Mmana;
				Str+=(int)Str*1.3;
				Speed+=1;
				mana+=10+(Magic*1.2);
				Magic+=15;
				UP=(int) (UP*2);
				MHp=(int) (MHp+(MHp*0.3));
				Hp+=MHp-PHp;
				mana+=Mmana-Pmana;
			}
			if(Level==2) {
				System.out.println("[���]�ķ�ġ�⸦ ���̽��ϴ�.");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("�ķ�ġ��� �ڽ��� ü���� 10��ŭ �Һ��Ͽ� ����ϴ� ����Դϴ�.");
				Thread.sleep(1000);
				System.out.println("���� ������ ���� �������ظ� �ݴϴ�.");
			}
			if(Level==3) {
				System.out.println("[����]���̾ ���̽��ϴ�.");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("���̾� ���� �ڽ��� ���� 10�� �Һ��Ͽ� ����ϴ� �����Դϴ�.");
				Thread.sleep(1000);
				System.out.println("���� ������ �ڽ��� ������ ��ŭ�� �������� �ݴϴ�.");
			}
			
		}
	}
	public static void Stat() throws InterruptedException {
		System.out.println("�̸� : "+name);
		System.out.println("ü�� : "+MHp+"\\"+Hp);
		System.out.println("���� : "+Mmana+"\\"+mana);
		System.out.println("����: : "+Level);
		System.out.println("���ݷ� : "+Str);
		System.out.println("������ : "+Magic);
		System.out.println("���� : "+Armor);
		System.out.println("���ǵ� : "+Speed);
		System.out.println("���� ��� : "+HGold);
		System.out.println("���� �������� ���� EXP : "+(UP-HEXP));
		System.out.println("���� ������ �ִ� ĭ : "+bag);
		Field.Work();
	}
	public static void DIE() {
		System.out.println(" ����� ����ϼ̽��ϴ�.");
		System.out.println("   Game Over   ");
		
	}

	public static void Garde(Monster monster) throws InterruptedException {
		System.out.println(Hero.name+"��(��) �� �����߽��ϴ� !");
		Monster.Gattack(monster);
		Fight.Turn();
		
	}


	

	public static void Attack(Monster monster) throws InterruptedException {
		System.out.println();
		System.out.println(name+"�� ����!");
		System.out.println();
		Thread.sleep(1000);
		System.out.println(monster.name+"���� ������ "+Str+"��  ����ϴ�.");
		System.out.println();
		Thread.sleep(1000);
		monster.Hp-=Str;
		if(monster.Hp>0) {
			Monster.attack();
		}
			Fight.Turn();
			
	}
	public static void QAttack(Monster monster) throws InterruptedException {
		System.out.println("<���>"+name+"�� �ķ�ġ��");
		Thread.sleep(1000);
		System.out.println();
		System.out.println("����"+monster.name+"���� ������ "+Str*1.3+"�� ����ϴ�.");
		System.out.println();
		Thread.sleep(1000);
		monster.Hp-=Str*1.3;
		Hp-=10;
		if(monster.Hp>0) {
			Monster.attack();
		}
			Fight.Turn();
	}
	public static void WAttack(Monster monster) throws InterruptedException {
		if(Cool==0) {
		System.out.println("<����>"+name+"�� ���̾� ��!");
		Thread.sleep(1000);
		System.out.println();
		System.out.println("10��ŭ�� ������ ����� ����"+monster.name+"���� ������ "+Magic+"�� ����ϴ�.");
		monster.Hp-=Magic;
		Thread.sleep(1000);
		System.out.println("����� ���� ������ "+mana+"�Դϴ�.");
		System.out.println();
		if(monster.Hp>0) {
			Monster.attack();
		}
		Fight.Turn();
		}
	}
	public void EAttack(Monster monster) throws InterruptedException {
		System.out.println(name+"�� ȸ��!");
		System.out.println();
		System.out.println(name+"�� ü���� 150��ŭ ȸ���˴ϴ�.");
		System.out.println();
		mana-=30;
		Hp+=150;
		Fight.Turn();
		
	}
	public void RAttack(Monster monster) {
		System.out.println("è�Ǿ�"+name+"�� �ñر�!");
		System.out.println("����"+monster.name+"���� ������ "+Str*5+"��(��) ��");
		monster.Hp-=Str*5;
		
	}
	

}
