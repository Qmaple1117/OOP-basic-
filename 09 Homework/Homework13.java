import java.util.Scanner;

public class Homework13{

	//��дһ��main����
	public static void main(String[] args){

		//��1������һ��Բ��Circle������һ��double���͵�radius���Դ���Բ�İ뾶
		//		findArea������������Բ�����
		//��2������һ����PassObject�������ж���һ������printAreas()���÷����Ķ������£�
		//	   public void printAreas(Circle c, int times)
		//��3����printAreas�����д�ӡ��� 1 �� times ֮���ÿ�������뾶ֵ���Լ���Ӧ�������
		//    ���磺times = 3����� 1��2��3�Լ���Ӧ�����
		//��4����main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ��
		//
		//radius �뾶     circumference �ܳ�     area ���
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("������Times");
		int times = myScanner.nextInt();
		
		Circle c = new Circle();
		PassObject p = new PassObject();

		if(times < 1){
			System.out.println("����ֵС��1������������");
		} else{
			System.out.println("Radius" + "\t" + "Area");
			p.printAreas(c, times);
		}
	}
}

class Circle{

	double radius;

	public double findArea(double radius){
		this.radius = radius;
		System.out.print(this.radius + "\t");
		return 3.1415926535 * this.radius * this.radius;
	}
}

class PassObject{

	public void printAreas(Circle c, int times){
		for(int i = 1; i <= times; i++){
			System.out.println(c.findArea(i));
		}
	}
}