
public class Homework07{

	//��дһ��main����
	public static void main(String[] args){

		//Dog�࣬��������ɫ���䣬����show������ʾ����Ϣ��������������в���
		Dog d = new Dog("���", "green", 3);
		d.show();

	}
}

class Dog{
	String name;
	String color;
	int age;

	public Dog(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show(){
		System.out.println("���������ǣ�" + this.name);
		System.out.println("������ɫ�ǣ�" + this.color);
		System.out.println("���������ǣ�" + this.age);
	}
}