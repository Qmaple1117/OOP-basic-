import java.util.Scanner;

public class Method01{
	//��дһ�� main ����
	public static void main(String[] args){
		//�����ĵ��ã�ʹ�ã�
		//1.����д�ú���������ã��ǲ���������ڲ������
		//2.�ȴ�������Ȼ����÷�������
		Person p1 = new Person();
		p1.speak();//����speak
		p1.cal01();
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("����������n��ֵ��");
		int input = myScanner.nextInt();
		p1.cal02(input);
		
		System.out.print("�������һ������");
		int num1 = myScanner.nextInt();
		System.out.print("������ڶ�������");
		int num2 = myScanner.nextInt();
		int returnSum = p1.getSum(num1, num2);
		System.out.println("�������ĺ��ǣ�" + returnSum);
	}
}

class Person{
	String name;
	int age;

	//��������Ա������
	//���speak��Ա�������������һ������
	//1. public ��ʾ�÷�������
	//2. void ��ʾ�÷���û�з���ֵ
	//3. speak()��speak�Ƿ������������Ǹ÷������β��б�
	//4. {} �Ƿ����壬������Ҫִ�еĴ���
	public void speak(){
		System.out.println("����һ������");
	}

	//���cal01��Ա���������Լ��� 1+��������+1000 �Ľ��
	public void cal01(){
		int sum = 0;
		for(int i = 1; i <= 1000; i++){
			sum += i;
		}
		System.out.println("���ǣ�" + sum);
	}

	//���cal02��Ա���������Խ���һ������ n ������ 1+��������+n �Ľ��
	public void cal02(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		System.out.println("�������ǣ�" + sum);
	}

	//���getSum��Ա���������Խ����������ֲ������
	// int getSum ��ʾ�÷���ִ�к󣬻᷵��һ�� int ֵ
	public int getSum(int num1, int num2){
		int sum = num1 + num2;
		// System.out.println("�������ĺ��ǣ�" + sum);//ֱ�����Ҳ���ԣ�����Ա�����ĳ��޷���ֵ����
		return sum;
	}
}