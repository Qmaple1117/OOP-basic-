
public class Constructor01{

	//��дһ�� main ����
	public static void main(String[] args){

		//����һ�����󲢳�ʼ��
		//Person p = new Person("Qmaple");���󣬺���ͨ����һ������������������Ҫ�붨��ʱһ��
		Person p = new Person("Qmaple", 15);

		System.out.println("p��nameΪ��" + p.name);
		System.out.println("p��ageΪ��" + p.age);
	}
}

class Person{

	String name;
	int age;

	//����������һ���ر�ķ�����
	//1.��������û�з���ֵ�ģ���Ҫд����ֵ���ͣ���void������
	//2.�����������ƺ��������� ������ ��һ����
	//3.�������Ĵ����б��������ͨ������һ����
	public Person(String nameP, int ageP){
		System.out.println("�����������á�����");
		name = nameP;
		age = ageP;
	}
}