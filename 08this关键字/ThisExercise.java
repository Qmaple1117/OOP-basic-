
public class ThisExercise{

	//��дһ�� main ����
	public static void main(String[] args){

		//���� Person �࣬������ name��age ���ԣ�
		//���ṩ compareTo �ȽϷ����������ж��Ƿ����һ������ȣ�
		//�ṩ������ TestPerson���ڲ���, ���ֺ�������ȫһ�����ͷ��� true, ���򷵻�false
		/*
		1.����һ��Person�࣬������ name��age ����
		2.����һ�����������������Ϊ name �� age
		2.���巵��ֵ����Ϊboolean��compareTo �������������Ϊ��һ���˵����֣�
		  �Ƚ�ʱ��this.name��name ��Ƚ�
		 */
		Person p = new Person("Qmaple", 17);
		System.out.println("p�������ǣ�" + p.name + " �����ǣ�" + p.age);
		TestPerson p2 = new TestPerson("Qmaple", 17);
		System.out.println("p�������ǣ�" + p.name + " �����ǣ�" + p.age);
		System.out.println("�����Ƿ���ͬ��" + p.compareTo(p2.name, p2.age));
	}
}

class Person{

	String name;
	int age;
	//����һ��������
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(String name, int age){
		return name.equals(this.name) && age == this.age;
	}
}

class TestPerson{

	String name;
	int age;
	//����һ��������
	public TestPerson(String name, int age){
		this.name = name;
		this.age = age;
	}
}