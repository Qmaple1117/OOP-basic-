
public class ConstructorDetail{

	//��дһ�� main ����
	public static void main(String[] args){

		Fine f = new Fine();
		System.out.println(f.name);

	}
}

class Fine{

	String name;
	int age;
	//1.������Ҳ��������
	public Fine(String name){

	}
	public Fine(String name, int age){

	}

	//2.�������ǳ�ʼ�����󣬲��Ǵ�������
	//3.�����˹�����Ĺ�������ϵͳ���Զ�����һ���޲ι�������Ĭ�Ϲ�������
	
	//4.һ���Լ������˹�������Ĭ�Ϲ������ͻᱻ���ǣ�������ʹ��Ĭ�Ϲ�����
	//  ������ʽ�Ķ���һ��(��Ĭ�Ϲ���������ʽд����)
	Fine(){

	}
}