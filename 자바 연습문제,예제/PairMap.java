import java.util.Scanner;
abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	
	abstract int length();
}
	class Dictionary extends PairMap{
		String re="null";
		int O=1;
		Dictionary(){
			keyArray = new String[10];
			valueArray = new String[10];
			
		}
	@Override
	String get(String key){
		for(int i=0; i<keyArray.length;i++){
			if(key.equals(keyArray[i])){

				return keyArray[i]+valueArray[i];
			}
			
		
		}
		return re;
	}

	@Override
	void put(String key, String value) {
		for(int i=1; i<keyArray.length;i++){
		if(key.equals(keyArray[i])){
			valueArray[i]=value;
			break;
		}
		}
		
		keyArray[O]=key;
		valueArray[O]=value;
		
		O++;
		
	}
	

	@Override
	String delete(String key) {
		for(int i=0; i<keyArray.length;i++){
			if(key.equals(keyArray[i])){
				keyArray[i]="null";
				valueArray[i]="";
						
			}
			}
		return re;
	}	

	@Override
	int length() {
		int a=0;
		a= keyArray.length;
		return a;
	}
	
	public void select(){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1.�Է� 2.�˻� 3.����");
		int s=sc.nextInt();
		if(s==1){
			System.out.println("�̸��� ���� �Է�");
			String name = sc.next();
			String value = sc.next();
			put(name,value);
			System.out.println("����Ǿ����ϴ�.");
			select();
			
		}
		else if(s==2){
			System.out.println("�̸� �Է�");
			String s_name= sc.next();
			System.out.println(get(s_name));
			select();
		}
		else if(s==3){
			System.out.println("������ �̸� �Է�");
			String d_name = sc.next();
			delete(d_name);
			System.out.println("�����Ǿ����ϴ�.");
			select();
		}
		sc.close();
	}
	public static void main(String[] args) {
		Dictionary d = new Dictionary();
		d.select();
	}
}
