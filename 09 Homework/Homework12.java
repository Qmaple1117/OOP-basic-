
public class Homework12{

	//��дһ��main����
	public static void main(String[] args){

		//����һ��Employee�࣬�����У����֣��Ա����䣬ְλ��нˮ�����ṩ�������췽����
		//���Գ�ʼ����
		//1.���֣��Ա����䣬ְλ��нˮ
		//2.���֣��Ա�����
		//3.ְλ��нˮ
		//Ҫ���ָ��ù�����
		
		/*
		1.������String���Ա���String��������int��ְλ��String��нˮ��double
		2.Ҫ���ṩ�������췽������Ҫ��ָ��ù�����������Ҫ��VariableParameter
		3.��ְλ��нˮ��Ϊ�ɱ����
		 */
		
		//���õ���˼�ǹ��������Ա��ظ�ʹ�ã���Ŀ������
	}
}

class Tool12{
	String name;
	String gender;
	int age;
	String office;
	String salary;
	//1.���֣��Ա����䣬ְλ��нˮ
	//2.���֣��Ա�����
	public Tool12(String name, String gender, int age, String... information){
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.office = information[0];
		this.salary = information[1];
	}

	//3.ְλ��нˮ
	public Tool12(String office, String salary){
		this.salary = salary;
		this.office = office;
	}
}