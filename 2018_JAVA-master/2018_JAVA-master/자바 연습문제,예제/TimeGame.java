import java.util.Scanner;
import java.util.Calendar;
public class TimeGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cut;
		int i;
		int []last = new int [100];
		int nowtime[]=new int[100];
		int min=1000;
		int save=0;
		String result = null;
		String []a = new String[100];
		String key;
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.println("�÷��̾� �̸� �Է� �Ͻð� ,���̻� ���ٸ� x�� �Է��ϼ���");
		for(i = 0; i<a.length;i++){
			a[i]=sc.next();
			if(a[i].equals("x")){
				i=i--;
				break;
			}
			
		}
		key=sc.nextLine();
		for(int j=0;j<i;j++){
			System.out.println(a[j]+" ���� EnterŰ �Է�");
			
			 key=sc.nextLine();
			 Calendar cal = Calendar.getInstance();
			 nowtime[j]=cal.get(Calendar.SECOND);
			
				System.out.println("���� �� �ð� = "+nowtime[j]);
				System.out.println("10�� ���� �� Enter Ű �Է� ");
			 
				
				key=sc.nextLine();
				Calendar cal1 = Calendar.getInstance();
				last[j]=cal1.get(Calendar.SECOND);
					System.out.println("���� �� �ð� = "+last[j]);
				
					cut=nowtime[j]+10;
					if(nowtime[j]>last[j]){
						last[j]+=60;
						last[j]=  last[j]-cut ;
						last[j]=Math.abs(last[j]);
					}
					else if(nowtime[j]<last[j]){
						last[j]= last[j]-cut;
						last[j]=Math.abs(last[j]);
					}
					else if(nowtime[j]==last[j]){
						last[j]=10;
					}
					
			
		}
		for(int j=0;j<i;j++){
			if(min>last[j]){
				min=last[j];
				result="����ڴ� "+min+"�� ������ ����"+a[j]+"�Դϴ�.";
			}
			else if(min==last[j]){
				result="������ �����ϴ�.";
			}
		}
		for(int j=0;j<i;j++){
			System.out.println(a[j]+"�� ������ "+last[j]+"�Դϴ�.");
		}
		System.out.println(result);
		
	}

}
