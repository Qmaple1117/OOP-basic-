import java.util.Scanner;

public class Homework14{

	//��дһ��main����
	public static void main(String[] args){

		//�и���Tom������ĳ�Ա����.��Ա���������Ե��Բ�ȭ
		//����ÿ�ζ����������0��1��2
		//0 ��ʾʯͷ��1 ��ʾ������2 ��ʾ��
		//��Ҫ������ʾTom����Ӯ����
		
		//˼·��
		//1.��������������� random()���᷵��double��0~1�������
		//	(int)(Math.random()*100) + 1 ��������1~100�������
		//	(int)(Math.random()*100) *3 + 2 �������� 1 ~ 299�������
		//	���ԣ�����int var =  ((int)(Math.random()*100) *3 + 2)/100 �Ϳ��Եõ��������
		//	0��1��2���������
		//2.Ȼ��ÿ��ѯ���Ƿ������Ϸ
		
		Scanner myScanner = new Scanner(System.in);
		Tool14 t = new Tool14();

		t.guseeFist(myScanner);
	}
}

class Tool14{

	public void guseeFist(Scanner myScanner){

		int playerTimes = 0, comTimes = 0, noWin = 0;
		String choice = " ";
		do{
			System.out.println("��ѡ��0��ʯͷ��1�Ǽ�����2�ǲ�");
			int player = myScanner.nextInt();
			int computer = ((int)(Math.random()*100) * 3 + 2) / 100;
			System.out.println("���Ե�ѡ���ǣ�" + computer);
			if((player == 0 && computer == 1) || (player == 1 && computer == 2) 
				|| (player == 2 && computer == 0)){

				System.out.println("TomӮ");
				playerTimes++;//���Ӯ

			} else if((player == 1 && computer == 0) || (player == 2 && computer == 1) 
				|| (player == 0 && computer == 2)){

				System.out.println("����Ӯ");
				comTimes++;//����Ӯ

			} else{
				System.out.println("ƽ��");
				noWin++;//ƽ��
			}

			System.out.println("�Ƿ������y/n");
			choice = myScanner.next();
		} while("y".equals(choice));
		System.out.println("TomӮ�Ĵ���Ϊ��" + playerTimes + "\n" 
				 		   + "����Ӯ�Ĵ���Ϊ��" + comTimes + "\n" 
				 		   + "ƽ�ֵĴ���Ϊ��" + noWin);

	}
}