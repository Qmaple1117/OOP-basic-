
public class Homework04{

	//��дһ�� main ����
	public static void main(String[] args){

		//����copyArr,ʵ������ĸ��ƣ���������飬����������
		
		double[] arr = {1.1, 2.5, 1.0, 5.6, 5.4};
		Tool04 t = new Tool04();
		double[] newArr = t.copyArr(arr);
		newArr[0] = 0;

		System.out.println("==arr����==");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("==newArr����==");
		for(int i = 0; i < newArr.length; i++){
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
	}
}

class Tool04{

	public double[] copyArr(double[] d){
		
		double[] newArr = new double[d.length];
		for(int i = 0; i < d.length; i++){
			newArr[i] = d[i];
		}
		return newArr;
	}
}