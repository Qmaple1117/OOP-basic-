
public class Homework01{

	//��дһ�� main ����
	public static void main(String[] args){

		//����max��ʵ����double�������ֵ
		// double[] arr = {1.1, 2.5, 1.0, 5.6, 5.4};
		// Tool01 t = new Tool01();
		// System.out.println("double�����е����ֵ�ǣ�" + t.max(arr));

		//������ȱ�ݣ�ȱ�ٽ�׳�ԣ�
		//����
		//����Ϊnullʱ������Ϊ��ʱ ��û�����ֵ
		
		//�޸ĺ�Ĵ���
		double[] arr = {1.1, 2.5, 1.0, 5.6, 5.4};
		Tool01 t = new Tool01();
		Double res = t.max(arr);
		if(res != null){
			System.out.println("double�����е����ֵ�ǣ�" + res);
		} else{
			System.out.println("�����������󣬲���Ϊnull�� �� ");
		}
		
	}
}

/*class Tool01{

	public double max(double[] d){
		
		double max = d[0];
		for(int i = 0; i < d.length; i++){
			max = d[i] > max ? d[i] : max;
		}
		return max;
	}
}*/

//�޸ĺ�Ĵ������£�
class Tool01{

	public Double max(double[] d){ //Double�ǰ�װ��������ڻ�û����
		                           //���ȿ��Խ���double���͵�����Ҳ���Խ���null
		
		if(d != null && d.length > 0){
			double max = d[0];
			for(int i = 1; i < d.length; i++){
				max = d[i] > max ? d[i] : max;
			}
			return max;
		} else{
			return null;
		}
	}
}