
public class Homework02{

	//��дһ�� main ����
	public static void main(String[] args){

		//����find��ʵ�ֲ���ĳ�ַ����Ƿ����ַ��������У������ط�������������Ҳ���������-1
		String[] arr = {"1.1", "2.5", "1.0", "5.6", "5.4"};
		Tool02 t = new Tool02();

		System.out.println("Ѱ�� 2.6");
		int find = t.find("2.6", arr);
		if(find == -1){
			System.out.println("û�ҵ�");
		} else{
			System.out.println("���ַ����±�Ϊ��" + find);
		}

		System.out.println("Ѱ�� 5.4");
		int find02 = t.find("5.4", arr);
		if(find02 == -1){
			System.out.println("û�ҵ�");
		} else{
			System.out.println("���ַ����±�Ϊ��" + find02);
		}
	}
}

class Tool02{

	public int find(String name, String[] s){
		
		int find = -1;
		for(int i = 0; i < s.length; i++){
			if(name.equals(s[i])){
				find = i;
				break;
			}
		}
		return find;
	}
}