import java.util.*;
public class VectorAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int j = 0;
		double sum=0;
		Vector<Integer> v = new Vector<Integer>();
		while(i!=0){
			System.out.println("������ �Է�(0 �Է½�)����");
			i=sc.nextInt();
			if(i==0){break;}
			v.add(i);
			int e=v.get(j);
			j++;
			for(int k = 0; k<j;k++){
			System.out.print(v.get(k)+" ");
			}
			System.out.println("");
			sum+=e;
			System.out.println("������� : "+sum/v.size());
			
		}

	}

}
