
public class VarParameterExercise{

	//��дһ��main����
	public static void main(String[] args){

		//�������������ֱ�ʵ�ַ������������ſγɼ����ܷ֣����������������ſγɼ����ܷ֣���
		//�������������ſγɼ����ܷ֣�����װ��һ���ɱ�����ķ���
		
		MyMethod m = new MyMethod();
		System.out.println(m.showScore("Qmaple", 20, 30));
		System.out.println(m.showScore("Qmaple", 20, 30, 50));
		System.out.println(m.showScore("Qmaple", 20, 30, 50, 70));
	}
}

class MyMethod{

	public String showScore(String name, double... scores){
		double res = 0;
		for(int i = 0; i < scores.length; i++){
			res += scores[i];
		}
		//��ϰһ��֪ʶ�㣺 + ����Ϊ��ֵʱ�������������
		//                + ������һ��Ϊ�ַ���ʱ��ִ��ƴ�Ӳ���
		return name + " " + scores.length + "�ſε��ܷ�Ϊ��" + res;
	}
}