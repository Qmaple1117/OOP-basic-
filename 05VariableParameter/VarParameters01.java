
public class VarParameters01{

	//��дһ��main����
	public static void main(String[] args){

		//�� HspMethod ��дһ������sum  ���Լ����������ĺͣ��������ĺͣ��ĸ�������
		
		HspMethod method = new HspMethod();
		System.out.println(method.sum(25, 20));
		System.out.println(method.sum(25, 20, 10));
	}
}

class HspMethod{

	//1.   int...��ʾ���յ���int ���͵Ŀɱ������������0~n��
	//2.   ���Խ� nums ��Ϊ���飬�õ�ʱ�������һ���ü���
	public int sum(int... nums){
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			res += nums[i];
		}
		return res;
	}
}