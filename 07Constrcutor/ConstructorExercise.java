
public class ConstructorExercise{

	//��дһ�� main ����
	public static void main(String[] args){

		Person p1 = new Person();
		Person p2 = new Person("Qmaple", 17);
		System.out.println("p1��name�ǣ�" + p1.name + " age�ǣ�" + p1.age);
		System.out.println("p2��name�ǣ�" + p2.name + " age�ǣ�" + p2.age);
	}
}

class Person{

	String name;
	int age;

	//��һ�������������ù��������������˵�����Ϊ18
	public Person(){
		age = 18;
	}

	//�ڶ�������������pName��pAge���ֲ�����ÿ�δ�������ʱ��ʼ������
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
}