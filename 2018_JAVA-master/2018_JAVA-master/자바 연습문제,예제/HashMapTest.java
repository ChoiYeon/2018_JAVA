import java.util.*;
public class HashMapTest {
	
		
	
	public static void main(String[] args) {
		String c;
		Scanner sc = new Scanner(System.in);
		Vector<String> v= new Vector<String>(); 
		while(true){
			
			System.out.println("�̸��� ����Ʈ �Է� �׸� �Է½� ���� ");
			String a = sc.next();
			if(a.equals("�׸�")){
				break;
			}
			int b = sc.nextInt();
			HashMap<String,Integer>h = new HashMap<String,Integer>();
			Integer itn = h.get(a);
			
			if(itn != null){
				b+=itn;
				
			}
			h.put(a,b);
			Iterator<String> it = h.keySet().iterator();
					String key = (String) it.next();
					
					a="("+key+","+h.get(key)+")";
					v.add(a);
					for(int i = 0; i<v.size();i++){
						System.out.print(v.get(i));
					}
					System.out.println("");
		}

	}

}
