import java.util.Scanner;

public class HanoiTower{

	//����һ�� main ����
	public static void main(String[] args){

		//��ŵ������
		Scanner myScanner = new Scanner(System.in);
		System.out.print("�����뺺ŵ���Ĳ�����");
		int num = myScanner.nextInt();//ԲƬ������
		char a = 'A';//���
		char b = 'B';//��תվ
		char c = 'C';//�յ�

		Tower way = new Tower();
		way.move(num, a, b, c);
	}
}

class Tower{

	/*
	���һ���ܽ����ŵ���ķ��������ӷ�Ϊa��b��c ����
	˼·��
	1.ֻ��һ��ʱ��a -> c
	2.���ڵ�������ʱ�����ײ�ԲƬ��Ϊ �²㣬����ԲƬ��Ϊ �ϲ�
	3.�Ƚ��ϲ�ԲƬ����b���²�ԲƬ����c���ٽ������� b ���ϲ�ԭƬ���� c
	4.�����е��βΣ�Ϊ����ԲƬ����������㣬ת�˵㣬�յ�
	5.����ϲ�ԲƬ�������� 1�������ݹ����
	 */
	
	// a ����ǰ����㣬b ����ǰ�ƶ�ԲƬ��Ҫ����תվ��c ����ǰת�Ƶ��յ�
	public void move(int num, char a, char b, char c){
		if(num == 1){
			System.out.println(a + "->" + c);
		} else{
			move(num - 1, a, c, b);//���ϲ�ԲƬ����b
			System.out.println(a + "->" + c);//���ײ�ԲƬ����c
			//�ϲ�ԲƬĿǰ���� b����ʣ���ԲƬ��Ϊ��������ֱ�ת����c
			move(num - 1, b, a, c);
		}
	}
}