import java.util.Scanner;

public class Homework05{

	//��дһ��main����
	public static void main(String[] args){

		//����һ��Բ��Circle���������ԣ��뾶��
		//�ṩ��ʾԲ�ܳ����ܵķ������ṩ��ʾԲ����ķ���
		//radius �뾶     circumference �ܳ�     area ���
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("������Բ�뾶��");
		double radius = myScanner.nextDouble();
		Circle c = new Circle(radius);

		System.out.println("Բ���ܳ�Ϊ��" + c.circleCircum());
		System.out.println("Բ�����Ϊ��" + c.circleArea());
	}
}

class Circle{

	double radius;
	//������
	public Circle(double radius){
		this.radius = radius;
	}

	public double circleCircum(){
		return 2 * 3.14 * this.radius;
	}

	public double circleArea(){
		return 3.14 * this.radius * this.radius;
	}
}