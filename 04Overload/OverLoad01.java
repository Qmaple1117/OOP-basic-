
public class OverLoad01{

	//����һ�� main ����
	public static void main(String[] args){

		//��������ʾ��
		//�������أ�ͬһ���еķ�������ͬ������ǰ����ÿһ�����βζ���ͬ
		MyCalculator cal = new MyCalculator();
		System.out.println(cal.calculator(1, 2));
		System.out.println(cal.calculator(1, 2.0));
		System.out.println(cal.calculator(1.1, 2));
		System.out.println(cal.calculator(1, 2, 3));
	}
}

class MyCalculator{

	public int calculator(int n1, int n2){//����int�ĺ�
		return n1 + n2;
	}
	public double calculator(int n1, double n2){//һ��int��һ��double�ĺ�
		return n1 + n2;
	}
	public double calculator(double n1, int n2){//һ��double��һ��int�ĺ�
		return n1 + n2;
	}
	public int calculator(int n1, int n2, int n3){//����int�ĺ�
		return n1 + n2 + n3;
	}
}