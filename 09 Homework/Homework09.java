
public class Homework09{

	//��дһ��main����
	public static void main(String[] args){

		//Music�࣬��������name������ʱ��times���ԣ�
		//���в���play���ܺͷ��ر���������Ϣ�Ĺ���getInfor
		Music m = new Music("���", 3);
		m.play();
		m.getInfor();


	}
}

class Music{
	String name;
	double times;

	public Music(String name, double times){
		this.name = name;
		this.times = times;
	}

	public void play(){
		System.out.println("���ڲ���" + this.name);
	}
	public void getInfor(){
		System.out.println("���ֵ������ǣ�" + this.name);
		System.out.println("���ֵ�ʱ��Ϊ��" + this.times + "����");
	}
}