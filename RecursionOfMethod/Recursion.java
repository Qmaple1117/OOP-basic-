
public class Recursion{

	//��дһ�� main ����
	public static void main(String[] args){

		//��дһ���׳˷���
		MyTools tool = new MyTools();
		System.out.println(tool.factorial(5));
	}
}

class MyTools{

	public int factorial(int a){
		if(a > 1){
			return factorial(a - 1) * a;
		} else{
			return 1;
		}
	}
}