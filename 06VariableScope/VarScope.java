
public class VarScope{

	//��дһ�� main ����
	public static void main(String[] args){

		Cat cat = new Cat();
		cat.at();
	}
}

class Cat{

	public void cry(){
		//1.�ֲ�����һ����ָ�ڳ�Ա�����ж���ı���
		//  a ��name ���Ǿֲ�������ֻ����cry ������ʹ�ã�����������cry��
		int a = 0;
		String name = "1354";
	}

	//2.ȫ�ֱ�����Ҳ�������ԣ�������Ϊ��������
	//  �����ڶ����ʱ�򣬿���ֱ�Ӹ�ֵ
	//
	//  �ֲ���������������֮��ı���
	int age = 1;

	public void eat(){
		System.out.println("��eat������ʹ��age���ԣ�" + age);
	}

	//3.ȫ�ֱ��������ԣ�����ֱ��ʹ�ã���Ϊ��Ĭ��ֵ
	//  �ֲ���������ֱ��ʹ�ã���Ҫ��ֵ

	//4.ȫ�ֱ��������ԣ����Լ����η���public private protected ...��
	//  �ֲ����������Լ����η�  
}