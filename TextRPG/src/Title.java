import java.util.*;
public class Title {

	public void Main() throws InterruptedException{
		int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("-----����������-----------�����������----------������������-----------");
		System.out.println("----��---------��---------��----------��--------��-----------��----------");
		System.out.println("----��----------��--------��-----------��------��-------------��---------");
		System.out.println("----��----------��--------��-----------��-----��------------------------");
		System.out.println("----��---------��---------��----------��------��------------------------");
		System.out.println("----�����������----------������������-------��------------------------");
		System.out.println("----��--------��----------��-----------------��--------��������---------");
		System.out.println("----��---------��---------��-----------------��---------------��--------");
		System.out.println("----��----------��--------��------------------��--------------��--------");
		System.out.println("----��-----------��-------��-------------------��------------��---------");
		System.out.println("----��------------��------��--------------------�������������----------");
		System.out.println("                                                                   ");
		System.out.println("                     ����������������������������������������                          ");
		System.out.println("                    |  1.   ���� ����                |                         ");
		System.out.println("                    |  2.   ���� ����                |                         ");
		System.out.println("                     ����������������������������������������		                   ");
		System.out.print("                             >>");
		choice=sc.nextInt();
		if(choice == 1) {
			System.out.println("������ �����մϴ� .");
			Thread.sleep(1000);
			Field.Work();
			
		}
		else if(choice == 2) {
			Game_description();
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			Thread.sleep(1000);
			Main();
		}
	}
		public void	Game_description() throws InterruptedException {
			System.out.println("�� ������ �� ��Ұ� �ۿ��մϴ�.");
			Thread.sleep(2000);
			System.out.println("���� ������ �����ϰڽ��ϴ�.");
			Thread.sleep(2000);
			System.out.println("�� ������ �� ���������� �����ϸ� ���͸� ��� ");
			Thread.sleep(2000);
			System.out.println("����ġ�� ��� ������ �ø� �� �ֽ��ϴ�.");
			Thread.sleep(2000);
			System.out.println("������ ����ϸ� ������ ����ϸ�");
			Thread.sleep(2000);
			System.out.println("������ ������ �޼��� ��ų�� �ϳ� �ϳ� �ر��� �Ǹ�");
			Thread.sleep(2000);
			System.out.println("�ش� ��ų�� ����� �� �ְԵ˴ϴ�.");
			Thread.sleep(2000);
			System.out.println("���������� �����ϴٺ��� ���������� �� �� ������ �����ϸ�");
			Thread.sleep(2000);
			System.out.println("���������� ���͸� ��� ȹ���� Gold�� ������ Ȥ�� ���� , ����");
			Thread.sleep(2000);
			System.out.println("�����Ͻ� �� �ֽ��ϴ�.");
			Thread.sleep(2000);
			System.out.println("���� �� ���������� ���������� ������ �����ϸ� ������ �ʵ� ���ͺ��� ������ ���մϴ�.");
			Thread.sleep(2000);
			System.out.println("<�� ��ħ�ϼ���!>");
			Thread.sleep(2000);
			System.out.println("���� �� ������ �̿ϼ��Դϴ�! ");
			Thread.sleep(2000);
			Main();
		}

}
