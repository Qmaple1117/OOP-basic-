//�������д�������ʲô


public class Homework08{

	int count = 9;
	public void count1(){
		count = 10;
		System.out.println("count1 = " + count);
	}

	public void count2(){
		System.out.println("count2 = " + count++);
	}

	public static void main(String args[]){
		
		//1.  new Homework08()����������ֻ����һ�Σ���Ϊû�б����������ĵ�ַ��
		//2.  new Homework08().count1();���������������������count1 ����
		new Homework08().count1();
		Homework08 t1 = new Homework08();
		t1.count2();
		t1.count2();
	}
}