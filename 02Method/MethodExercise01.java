import java.util.Scanner;

public class MethodExercise01{

	//��дһ�� main ����
	public static void main(String[] args){

		//��д��AA ��һ���������ж�һ������ż����������������boolean
		AA a = new AA();
		Scanner myScanner = new Scanner(System.in);
		System.out.print("�������жϵ����֣�");
		int numble = myScanner.nextInt();
		if(a.odd(numble)){
			System.out.println("������ż��");
		} else{
			System.out.println("����������");
		}


		//�����У��У��ַ� ��ӡ��Ӧ�������������ַ�
		//�ַ���#
		System.out.print("������");
		int line = myScanner.nextInt();
		System.out.print("������");
		int list = myScanner.nextInt();
		a.print(line, list);
	}
}

class AA{

	public boolean odd(int numble){

		boolean judge = false;
		if(numble % 2 == 0){
			judge = true;
		}
		return judge;
	}

	public void print(int line, int list){
		
		for(int i = 0; i < line; i++){//�����Ӧ�������ķ���#
			for(int j = 0; j < list; j++){
				System.out.print('#');
			}
			System.out.println();
		}
	}
}

