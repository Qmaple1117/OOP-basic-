
public class This01{

	//��дһ�� main ����
	public static void main(String[] args){

		Person p2 = new Person("Qmaple", 17);
		System.out.println("p2��name�ǣ�" + p2.name + " age�ǣ�" + p2.age);
	}
}

class Person{

	String name;
	int age;

	//java����� ���ÿһ��������䵥���� this �ؼ���
	//���ĸ�������ʹ�� thisǰ׺ this����ľ�����һ������
	//this.name �������Person(this)�е�name����
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}