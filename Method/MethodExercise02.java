
public class MethodExercise02{

	//��дһ�� main ����
	public static void main(String[] args){

		//��дһ������ copyPerson�����Ը���һ�� Person ���󣬷��ظ��ƵĶ���
		//��¡���� ע��Ҫ��õ��¶����ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ
		//
		Person person = new Person();
		person.name = "����";
		person.age = 118;
		System.out.println("�޸�ǰ��person.name��" + person.name);
		
		MyTools tool = new MyTools();
		Person copyPerson = tool.copyPerson(person);
		System.out.println("�޸�ǰ��copyPerson.name��" + copyPerson.name);
		person.name = "��˹";
		System.out.println("�޸ĺ��person.name��" + person.name);
		System.out.println("�޸�person.name���copyPerson.name��" + copyPerson.name);

		//����ʦ��ʾ������ͨ���������� hashCode ȷ�������Ƿ��Ƕ�����һ��
		//Ҳ����ͨ������ıȽ�ȷ��
		System.out.println(person == copyPerson);
	}
}

class Person{

	String name;
	int age;
}

class MyTools{

	public Person copyPerson(Person p){//����ֵ���Ϳ����Ƕ���ע����Ҫ���ض���Ҫдclass��������
		Person person02 = new Person();//�β��б�������������� ���������������
		person02.name = p.name;
		person02.age = p.age;
		return person02;
	}
}