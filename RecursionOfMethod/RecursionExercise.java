import java.util.Scanner;

public class RecursionExercise{

	//����һ�� main ����
	public static void main(String[] args){

		//쳲������� 1��1��2��3��5��8��13....
		//��һ������ n ����ǰ n ��쳲��������ĺ�
		//˼·��
		//��1���� i ���� = �� i-1 ���� + �� i-2 ����
		//��2������һ������ֵ���ͺ��β����Ͷ��� int �� fibonacci ����
		//��3���� n <= 2, ����һ����ڶ���ֵ������ 1��
		//��4���� n > 2������ n ��쳲���������ֵ = fibonacci(n-1) + fibonacci(n-2)
		//��5������һ��getFibonacciSum �ķ�������forѭ�����
		
		// Scanner myScanner = new Scanner(System.in);
		// MyTools tool = new MyTools();
		// System.out.print("����һ������n��");
		// int n = myScanner.nextInt();

		// int number = tool.fibonacci(n);
		// System.out.println("��" + n + "��쳲��������ǣ�" + number);

		// int sum = tool.getFibonacciSum(n);
		// System.out.println("ǰ" + n + "��쳲��������ĺ��ǣ�" + sum);

		//���ӳ��ң�ÿ�����һ����ٳ�һ����
		//�Ե���ʮ�죨��û�ԣ�ֻʣ��һ�������ʼ�м���
		//˼·��
		//��1��������n = 10 ʱ�����ӵ�����numbleֻʣ 1 ��
		//��2���� n-1 ������� = ���� n �� + 1��* 2
		
		Scanner myScanner = new Scanner(System.in);
		MyTools tool = new MyTools();
		System.out.print("�����ǵڼ��죺");
		int n = myScanner.nextInt();
		if(n >= 1){
			int number = tool.getPeachNumble(n);
			System.out.println("�ʼ������������" + number);
		} else{
			System.out.println("Ӧ������ڵ���1����");//ȱ�㣺��i������������޷���֪
		}
	}
}

class MyTools{

	public int fibonacci(int n){

		if(n > 2){//��ǰ��Ϊ������������������ʱ
			return fibonacci(n - 1) + fibonacci(n - 2);
		} else{//��ǰ���� ��һ������ڶ�����ʱ
			return 1;
		}

	}

	public int getFibonacciSum(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += fibonacci(i);
		}
		return sum;
	}

	public int getPeachNumble(int n){
		if(n == 1){
			return 1;
		} else{
			return (getPeachNumble(n-1) + 1) * 2;
		}
	}
}