import java.util.Scanner;

public class Homework06{

	//��дһ��main����
	public static void main(String[] args){

		//��̴���һ��Cale�����࣬�����ж��� 2 ��������ʾ������������
		//�����ĸ�����ʵ����͡���ˡ��̣�����Ϊ 0 �Ļ���Ҫ��ʾ����������������ֱ����
		Scanner myScanner = new Scanner(System.in);
		System.out.print("�������һ������");
		double num1 = myScanner.nextDouble();
		System.out.print("������ڶ�������");
		double num2 = myScanner.nextDouble();

		Cale c = new Cale(num1, num2);

		c.sum();
		c.subtract();
		c.multiply();
		c.devide();


	}
}

class Cale{
	double num1;
	double num2;

	public Cale(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	public void sum(){
		double res = this.num1 + this.num2;
		System.out.println("�������ĺ�Ϊ��" + res);
	}

	public void subtract(){
		double res = this.num1 - this.num2;
		System.out.println("�������Ĳ�Ϊ��" + res);
	}

	public void multiply(){
		double res = this.num1 * this.num2;
		System.out.println("�������ĳ˻�Ϊ��" + res);
	}

	public void devide(){
		if(this.num2 != 0){
			double res = this.num1 / this.num2;
			System.out.println("����������Ϊ��" + res);
		} else{
			System.out.println("����Ϊ0�����޷�����");
		}
		
	}
}