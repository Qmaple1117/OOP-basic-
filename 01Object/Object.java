import java.util.Scanner;

public class Object{

	public static void main(String[] args){

		//�����е�֪ʶ���
		//����̫������ֻèè:һֻ���ֽ�С��,���� 3 ��,��ɫ������һֻ��С��,���� 100 ��,��ɫ��
		//���дһ�����򣬵��û�����Сè������ʱ������ʾ��è�����֣����䣬��ɫ��
		//����û������Сè����������ʾ ����̫û����ֻèè
		Scanner myScanner = new Scanner(System.in);
		String bai = "С��", hua = "С��";
		System.out.print("������Сè�����֣�");
		String name = myScanner.next();
		if(name.equals(bai)){
			System.out.println("è��������С�ף�����Ϊ3�꣬��ɫΪ��ɫ");
		} else if(name.equals(hua)){
			System.out.println("è��������С��������Ϊ100�꣬��ɫΪ��ɫ");
		} else{
			System.out.println("����̫û����ֻèè");
		}
	}
}