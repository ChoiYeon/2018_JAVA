import java.util.*;
public class Bag {
	static String iname ;
	static int i=0;
	static Vector<String> bag = new Vector();
	static Scanner sc = new Scanner(System.in);
	public static void getitem() {
		if(i<5) {
		bag.add(iname);
		i++;
		}
		else {
			System.out.println("������ �� á���ϴ�.");
		}
	}
	public static void viewitem() throws InterruptedException {
		
		if(bag.size()==0) {
			System.out.println("���� ������ ����ֽ��ϴ�.");
		}
		else {
		for(int j=0;j<bag.size();j++) {
			System.out.print("|"+bag.get(j)+"|");
		}
		System.out.println();
		System.out.println("1.����     2.���  3.������  4.���");
		String s= sc.next();
		if(s.equals("1")) {
			for(int j=0;j<bag.size();j++) {
				System.out.print(" |"+(j+1)+"."+bag.get(j)+"| ");
			}
			System.out.println("���ϴ� �������� ��ȣ�� �Է��ϼ���.");
			int si=sc.nextInt();
			if(bag.get(si-1).equals("���")) {
				System.out.println("�ް�� ������ �ָӴϿ��� ���� ����");
				System.out.println("����ġ�� �� ���� �� ����.");
				System.out.println("10 gold");
				viewitem();
			}
			else if(bag.get(si-1).equals("�ð�")) {
				System.out.println("�̸� �� ������ �ް�� ���а� �����ִ� �ð�");
				System.out.println("����ġ�� �� ���� �� ����.");
				System.out.println("20 gold");
				viewitem();
			}
			else if (bag.get(si-1).equals("����� ��")){
				System.out.println("����� �͸� �߶� ��");
				System.out.println("������ ���� �ȸ� ���� �ش�.");
				System.out.println("20 gold");
				viewitem();
			}
			else if (bag.get(si-1).equals("��ũ�� �����")) {
				System.out.println("��ũ�� ����ϴ� �����");
				System.out.println("�տ� ���� �ʾ� ����� ����ϱ� ���� �� ����.");
				System.out.println("30 gold");
				viewitem();
			}
			else if (bag.get(si-1).equals("ü�� ����")) {
				System.out.println("�˺��� ��ü�� ����ִ� �ö�ũ");
				System.out.println("������ �޸� ���̿��� �ʹ� �������� ������ ��� �����ִ�.");
				System.out.println("���� ü���� ȸ���ȴ�.");
				System.out.println("0 gold");
				viewitem();
			}
			else if (bag.get(si-1).equals("���� ����")) {
				System.out.println("û�ϻ� ��ü�� ����ִ� �ö�ũ");
				System.out.println("������ �޸� ���̿��� �ʹ� �������� ������ ��� �����ִ�.");
				System.out.println("���� ������ ȸ���ȴ�.");
				System.out.println("0 gold");
				viewitem();
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				viewitem();
			}
			
			
		}
		if(s.equals("2")) {
			for(int j=0;j<bag.size();j++) {
				System.out.print(" |"+(j+1)+"."+bag.get(j)+"| ");
			}
			System.out.println("���ϴ� �������� ��ȣ�� �Է��ϼ���.");
			int si1=sc.nextInt();
			 if (bag.get(si1-1).equals("ü�� ����")) {
				 System.out.println("ü���� "+Hero.MHp/4+"��ŭ ȸ���Ǿ����ϴ�.");
				Hero.Hp+=(Hero.MHp/4);
				if(Hero.Hp>Hero.Mmana) {
					Hero.Hp=Hero.MHp;
				}
				viewitem();
			}
			else if (bag.get(si1-1).equals("���� ����")) {
				System.out.println("������ "+Hero.Mmana/4+"��ŭ ȸ���Ǿ����ϴ�.");
				Hero.mana+=(Hero.Mmana/4);
				if(Hero.mana>Hero.Mmana) {
					Hero.mana=Hero.Mmana;
				}
				viewitem();
			}
			else {
				System.out.println("�߸��Է��ϼ̰ų� ����� �� ���� �������Դϴ�.");
			}
		}
		if(s.equals("3")) {
			Field.Work();
		}
		}
	}
	public static void buyitem() throws InterruptedException {
		System.out.println("������ ������ �� �� �� ȯ���� BOY~~��");
		System.out.println("1. ���    2. �Ǵ�");
		String giveMoney1=sc.next();
		if(giveMoney1.equals("1")) {
			System.out.println("�� ���ž�?");
			System.out.println();
			System.out.println("1.ü�� ���� 50G    2.���� ���� 70G");
			String buy = sc.next();
			if(buy.equals("1")) {
				if(i<5) {
					
					if(Hero.HGold-50<0) {
						System.out.println();
						System.out.println("������ ���� ���°�? ������������ ���� ");
						Field.City();
					}
					else {
						System.out.println();
					System.out.println("�������༭ ���� Boy~~");
					iname="ü�� ����";
					getitem();
					Hero.HGold-=50;
					buyitem();
					}
				}
				else if(i>4) {
					System.out.println("������ �̹� ������ �����ѵ�? ���� ���°� �?");
					buyitem();
				}
		}
			else if(buy.equals("2")) {
				if(i<5) {
					
					if(Hero.HGold-100<0) {
						System.out.println();
						System.out.println("������ ���� ���°�? ������������ ���� ");
						Field.City();
					}
					else {
						System.out.println();
					System.out.println("�������༭ ���� Boy~~");
					iname="���� ����";
					getitem();
					Hero.HGold-=100;
					buyitem();
					}
				}
				else if(i>4) {
					System.out.println("������ �̹� ������ �����ѵ�? ���� ���°� �?");
					buyitem();
				}
		}
		else if(giveMoney1.equals("2")) {
			System.out.println("�� �� �����̾�?");
		}
			for(int j=0;j<bag.size();j++) {
				System.out.print(" |"+(j+1)+"."+bag.get(j)+"| ");
			}
			System.out.println("���ϴ� �������� ��ȣ�� �Է��ϼ���.");
			int si1=sc.nextInt();
			if(bag.get(si1-1).equals("���")) {
				bag.remove(si1-1);
				System.out.println("10 gold�� ȹ���߽��ϴ�.");
				viewitem();
			}
			else if(bag.get(si1-1).equals("�ð�")) {
				bag.remove(si1-1);
				System.out.println("20 gold�� ȹ���߽��ϴ�.");
				viewitem();
			}
			else if (bag.get(si1-1).equals("����� ��")){
				bag.remove(si1-1);
				System.out.println("20 gold�� ȹ���߽��ϴ�.");
				viewitem();
			}
			else if (bag.get(si1-1).equals("��ũ�� �����")) {
				bag.remove(si1-1);
				System.out.println("30 gold�� ȹ���߽��ϴ�.");
				viewitem();
			}
			else if (bag.get(si1-1).equals("ü�� ����")) {
				bag.remove(si1-1);
				System.out.println("0 gold�� ȹ���߽��ϴ�.");
				viewitem();
			}
			else if (bag.get(si1-1).equals("���� ����")) {
				bag.remove(si1-1);
				System.out.println("0 gold�� ȹ���߽��ϴ�.");
				viewitem();
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				viewitem();
			}
		}
		
	}
}
