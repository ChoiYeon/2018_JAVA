import java.util.*;
public class Field {
	static int random;
	static int Random;
	static int Progress;
	String thisStage;
	static int Gorandom;
	static int Citycnt=0;;
	
	static Scanner sc= new Scanner(System.in);
public static void Hello_Monster() throws InterruptedException {
		if(Progress<15&&Random==0) {
			Gorandom=(int) (Math.random() * 2) + 6;
			Monster.name="�ް�� ����";
			Monster.Str=3;
			Monster.Hp=10;
			Monster.EXP=2;
			Monster.Gold=Gorandom;
			Bag.iname="���";
			random=(int) (Math.random() * 3) ;
		}
		else if(Progress==15) {
			Gorandom=(int) (Math.random() * 5) ;
			Monster.name="�̸� �� ���� �ް�� ����";
			Monster.Str=5;
			Monster.Hp=17;
			Monster.Gold=10;
			Monster.EXP=5;
			Bag.iname="�ð�";
			random=(int) (Math.random() * 3) ;

		}
		else if(Progress>15&&Random==1) {
			Gorandom=(int) (Math.random() * 5) + 10;
			Monster.name="���";
			Monster.Str=5;
			Monster.Hp=18;
			Monster.EXP=7;
			Monster.Gold=Gorandom;
			random=(int) (Math.random() * 3) ;
			if(random==2) {
				Bag.iname="����� ��";
			}
			
		}
		else if(Progress>15&&Random==2) {
			Gorandom=(int) (Math.random() * 7) + 13;
			Monster.name="��ũ";
			Monster.Str=8;
			Monster.Hp=21;
			Monster.EXP=10;
			Monster.Gold=Gorandom;
			random=(int) (Math.random() * 5) ;
			if(random==4) {
				Bag.iname="��ũ�� �����";
			
			}
		}
		System.out.println(Monster.name+"��(��) ��Ÿ����!");
		Thread.sleep(1000);
		Fight.Turn();
	}

	public static void Work() throws InterruptedException {
		if(Progress==0) {
			System.out.println();
			System.out.println("===============");
			System.out.println("STAGE 1 : �� �� ��");
			System.out.println("===============");
			System.out.println("! �� ������������ ������ �������� �ʽ��ϴ�!");
			System.out.println();
			Thread.sleep(2000);
			Progress++;
			Work();
		}
		if(Progress==16) {
			System.out.println();
			System.out.println("===============");
			System.out.println(" STAGE 2 : �� ��");
			System.out.println("===============");
			System.out.println();
			Thread.sleep(2000);
			Progress++;
			Work();
		}
		if(Progress<16) {
			if(Progress==15) {
				Hello_Monster();
			}
		System.out.println("���� �������� : �ް�� <Stage1>");
		System.out.println("���� ���൵ 15\\"+Progress);
		
		}
		if(Progress>15&&Progress<31) {
			System.out.println("���� �������� : �ʿ� <Stage2>");
			System.out.println("���� ���൵ 15\\"+(Progress-16));
		}
		System.out.println("w = ����   t = ������   i = �κ��丮");
		String W=sc.next();
		if(W.equals("w")) {
			Stage();
		}
		else if(W.equals("t")) {
			Hero.Stat();
		}
		else if(W.equals("i")) {
			System.out.println("����");
			Bag.viewitem();
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			Thread.sleep(1000);
			Work();
		}
		
	}
	public static void Stage() throws InterruptedException {
		if(Progress<15) {
			Random=(int) (Math.random() * 3) ;
			if(Random==0) {
				Hello_Monster();
			}
			Progress+=1;
			Hero.mana+=5;
			Work();
		}
		if(Progress==15) {
			System.out.println("�������� ������ �����߽��ϴ�!");
			Hello_Monster();
		}
		if(Progress>15&&Progress<30) {
			Random=(int) (Math.random() * 7) + 1;
			if(Random==1||Random==2) {
				Hello_Monster();
			}
			else if(Random==7&&Citycnt<2) {
				System.out.println("������ �߰��ϼ̽��ϴ�!");
				Thread.sleep(1000);
				Citycnt++;
				City();
			}
			Progress+=1;
			Hero.mana+=3;
			if(Hero.mana>Hero.Mmana) {
				Hero.mana=Hero.Mmana;
			}
			Work();
			
		}
		
	}
	
static void City() throws InterruptedException {
	if(Citycnt==1) {
		System.out.println("������ ó���̽Ű���?");
		Thread.sleep(800);
		System.out.println("�� ���� ���࿡ �ʿ��� ��ǰ Ȥ�� ��� �����ϰų� ��� ���� ü���� ȸ���� �� �ִ� ����Դϴ�.");
		Thread.sleep(1000);
		System.out.println("�ƽ��Ե� "+Hero.name+"���� �̰��� ���� �ӹ� �ð��� ���� �� �ϴ� �ϳ��� �����ϼż��߰ڳ׿�.");
		Thread.sleep(1000);
		System.out.println("������ �ӹ��ô� ���� "+Hero.name+"���� ������ ��� �޽��� ���ϰų�, ���� �� �� ���� ������ �� ������ �����Ͻðų� �Ľ� �� �ֽ��ϴ�.");
		Thread.sleep(1000);
		System.out.println("������ ũ�� �������� ������ ������ ������ ���� ����, �� �������� �������ֽ��ϴ�.");
		Thread.sleep(1000);
		System.out.println("�� �������� �Ĵ� ������ �ٸ��� ���������� ���� ��ǰ�� ���� �޶����ϴ�.");
		Thread.sleep(1000);
		System.out.println("������ �ִ� ������ ���͸� ��� ȹ���� Gold�� �������� �Ǹ��Ͽ� ȹ���� Gold�� ��� �� �ֽ��ϴ�.");
		Thread.sleep(1000);
		System.out.println("���� ������ �鸮�� ���� �����Ͻð� �������� ���Ŵٸ� ��带 �����Ͽ� ������ �̿��Ͻ� �� ������ �̿��� ������������ �޶����ϴ�.");
		Thread.sleep(1000);
		System.out.println("������ �̿��Ͻ� �Ŀ��� ü���� ȸ���˴ϴ�. ");
		Thread.sleep(1000);
		System.out.println("�̻� ��ſ� �ð� �ǽñ� �ٶ��ϴ�.");
		Thread.sleep(800);
		Citycnt=2;
	}
	else if(Citycnt==2) {
		System.out.println("������ ���Ű��� ȯ���մϴ�.");
	}
	System.out.println("������ �̿��Ͻðڽ��ϱ�?");
	Thread.sleep(800);
	System.out.println("1.����    2.����  3.������ ������.");
	String Cityc=sc.next();
	if(Cityc.equals("1")) {
		System.out.println("��� ������ �̿��Ͻðڽ��ϱ�?");
		Thread.sleep(800);
		System.out.println("1.������ ����    2.���� ����    3.�� ����");
		String giveMoney=sc.next();
		if(giveMoney.equals("1")) {
			Bag.buyitem();
		}
	}
	else if(Cityc.equals("2")) {
		System.out.println("������ �̿��Ͻðڽ��ϱ�? 1.yes 2.no");
		String real = sc.next();
		if(real.equals("1")) {
			if(Hero.HGold-10<0) {
				System.out.println("���� �����Ͻñ��� ��������.");
				City();
			}
			else {
			System.out.println("������ �̿��ϼ̽��ϴ�.");
			random=(int) (Math.random() * 4)+1;
			if(random <3) {
				System.out.println("�׷����� �� �������ϴ�.");
				Thread.sleep(800);
				System.out.println("ü���� 1/3��ŭ ȸ���˴ϴ�.");
				Thread.sleep(800);
				
				Hero.Hp+=((int)Hero.MHp/3);
				if(Hero.Hp>Hero.MHp) {
					Hero.Hp=Hero.MHp;
				}
				System.out.println("������ �������ϴ�.");
				Thread.sleep(1000);
				Work();
			}
			else if(random==3) {
				System.out.println("���� ��� ���� ��� ���Դϴ�.");
				Thread.sleep(1000);
				System.out.println("�̷��� ������ ��ħ�� ���� �������ε��մϴ�.");
				Thread.sleep(1000);
				System.out.println("ü���� 1/2�� ȸ���˴ϴ�.");
				Hero.Hp+=((int)Hero.MHp/2);
				if(Hero.Hp>Hero.MHp) {
					Hero.Hp=Hero.MHp;
				}
				System.out.println("������ �������ϴ�.");
				Thread.sleep(1000);
				Work();
			}
			}
		}
		else if(real.equals("2")) {
			City();
		}
		else{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	else if(Cityc.equals("3")) {
		Work();
	}
	else {
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		City();
	}
	}

public static void main(String args[]) throws InterruptedException {
	Field a = new Field();
	a.Work();
}
}
