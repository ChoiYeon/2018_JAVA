import java.util.*;
public class Fight {
	static Scanner sc = new Scanner(System.in);
	private static Monster monster;
	static Hero hero;
	public static void Turn() throws InterruptedException{
		if(monster.Hp<=0) {
			System.out.println("���Ͱ� ���������ϴ� ! ");
			Thread.sleep(1000);
			System.out.println("Gold "+ monster.Gold+"�� ����ġ"+monster.EXP+"�� ȹ���ϼ̽��ϴ�!");
			Hero.HGold+=monster.Gold;
			Hero.HEXP+=monster.EXP;
			if(Field.random==2) {
				Bag.getitem();
				System.out.println();
				System.out.println(Bag.iname+"�� ȹ���ϼ̽��ϴ�.");
			}
			Thread.sleep(1000);
			Hero.Levelup();
			System.out.println();
			Field.Progress+=1;
			Field.Work();
		}
		else if(monster.Hp>0) {
			
		System.out.println("������ �Ͻðڽ��ϱ�?");
		System.out.println("����� HP = "+Hero.Hp);
		System.out.println("������ ���� HP = "+Monster.Hp);
		System.out.println("1.���� 2.��� 3.���� 4.����5.tset");
		String c=sc.next();
		
		
		if(c.equals("1")) {
			
			cfight(hero);
		}
		else if (c.equals("2")) {
			Hero.Garde(monster);
		}
		else if (c.equals("3")) {
			
		}
		else if(c.equals("4")) {
			System.out.println("����ġ�̽��ϴ�.");
			Field.Progress+=1;
			Field.Work();
		}
		else if(c.equals("5")) {
			Hero.HEXP+=20;
			Hero.Levelup();
		}
		else{
			System.out.println();
			System.out.println("�߸� �Է��ϼ̽��ϴ�!");
			System.out.println();

			Turn();
		}
		}
	}
	public static void cfight(Hero hero) throws InterruptedException {
		System.out.println();
		System.out.println("��� �����Ͻðڽ��ϱ�?");
		
		System.out.println("1. ���    2. ����  3. �⺻ ����  ");
		int p=sc.nextInt();
		if(p==1) {
			if(Hero.Level<2) {
				System.out.println("���� ������ ��ų�� �������� �ʽ��ϴ�!");
				cfight(hero);
			}
			else if(Hero.Level>=2) {
				System.out.println("� ��ų�� ����Ͻðڽ��ϱ�?");
				System.out.println("1.�ķ�ġ��  2.���ư���");
				System.out.print(">>");
				int choose = sc.nextInt();
				if(choose==1) {
					Hero.QAttack(monster);
				}
				else if(choose==2) {
					cfight(hero);
				}
			}
		}
		else if(p==2) {
			if(Hero.Level<3) {
			System.out.println("���� ������ ������ �������� �ʽ��ϴ�!");
			cfight(hero);
			}
			else if(Hero.Level>=2) {
				System.out.println("� ������ ����Ͻðڽ��ϱ�?");
				System.out.println("1.���̾� ��  2.���ư���");
				System.out.print(">>");
				int choose = sc.nextInt();
				if(choose==1) {
					Hero.WAttack(monster);
				}
				else if(choose==2) {
					cfight(hero);
				}
			}
		}
		else if(p==3) {
			hero.Attack(monster);
		}
		else {
			System.out.println();
			System.out.println("�߸� �Է��ϼ̽��ϴ�!");
			System.out.println();
			Thread.sleep(2000);
			Turn();
		}
	}
}
