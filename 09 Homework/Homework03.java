import java.util.Scanner;

public class Homework03{

	//��дһ�� main ����
	public static void main(String[] args){

		//����updatePrice��ʵ�ָ���ĳ����ļ۸�
		//���壺����۸����150�������Ϊ150������۸����100�������Ϊ100
		//���򲻱�
		Scanner myScanner = new Scanner(System.in);
		System.out.print("����ļ۸�Ϊ��");
		double price = myScanner.nextDouble();
		Tool03 t = new Tool03();


		price = t.updatePrice(price);
	}
}

class Tool03{

	public double updatePrice(double price){
		
		if(price > 150){
			System.out.println("��ļ۸��Ϊ150Ԫ");
			return 150;
		} else if(price > 100){
			System.out.println("��ļ۸��Ϊ100Ԫ");
			return 100;
		} else{
			System.out.println("��ļ۸񲻱�");
			return price;
		}
	}
}