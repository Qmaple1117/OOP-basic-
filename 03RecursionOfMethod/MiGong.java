import java.util.Scanner;

public class MiGong{

	//����һ�� main ����
	public static void main(String[] args){

		//�Թ�����
		//˼·��
		//1.��ʼ���Թ�
		//2.�����β� �Թ����飬��ǰλ�ã��յ�λ�� ��searchRoad��
		//3.searchRoad�У����¡��ҡ����ϵ�˳��Ѱ·������һ��λ��Ϊ0�������ǰ��������ǰ���󽫸�λ�ñ�Ϊ1
		//4.����һ��λ�����յ㣬���Ѱ·�ɹ����˳�����
		int[][] miGong = {{1, 1, 1, 1, 1, 1, 1},
						  {1, 0, 0, 0, 0, 0, 1},
						  {1, 0, 0, 0, 0, 0, 1},
						  {1, 1, 1, 0, 0, 0, 1},
						  {1, 0, 0, 0, 0, 0, 1},
						  {1, 0, 0, 0, 0, 0, 1},
						  {1, 0, 0, 0, 0, 0, 1},
						  {1, 1, 1, 1, 1, 1, 1}};
		int[] location = {2, 1};//���λ��
		int[] destination = {5, 1};//�յ�λ��

		// int[] location = {1, 1};//���λ��
		// int[] destination = {4, 3};//�յ�λ��
		// System.out.println("==�Թ�==");
		// for(int i = 0; i < miGong.length; i++){
		// 	for(int j = 0; j < miGong[i].length; j++){
		// 		System.out.print(miGong[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		// System.out.println("���������:2��2��");
		// System.out.println("�յ�������:5��4��");
		// MyTools tool = new MyTools();
		// tool.searchRoad(location, destination, miGong);
		// System.out.println("==�ҵ�·����Թ�==");
		// for(int i = 0; i < miGong.length; i++){
		// 	for(int j = 0; j < miGong[i].length; j++){
		// 		System.out.print(miGong[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		
		//��ӡ�Թ�
		System.out.println("==Ѱ·ǰ���Թ�==");
		for(int i = 0; i < miGong.length; i++){
			for(int j = 0; j < miGong[i].length; j++){
				System.out.print(miGong[i][j] + " ");
			}
			System.out.println();
		}
		MyTools tool = new MyTools();
		tool.findWay(location[0], location[1], miGong);
		//��ӡѰ·����Թ�
		System.out.println("==�ҵ�·����Թ�==");
		for(int i = 0; i < miGong.length; i++){
			for(int j = 0; j < miGong[i].length; j++){
				System.out.print(miGong[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class MyTools{

	/*
	�÷����������ص�ȱ�ݣ�������ͼ�д����л�·����·������·�ڻ�·��ʱ�����и��ʳ���Ѱ·ʧ�ܵ����
	����Ҫ���һ����̽·ʧ��ʱ������̽����·�����б�ǲ��ܻص� Ѱ·ԭ��ķ������õݹ�
	
	public void searchRoad(int[] location, int[] destination, int[][] miGong){
		
		//�����������˳�����Ѱ��
		//�жϵ�ǰλ���Ƿ�Ϊ�յ�
		
		if(location[0] == destination[0] && location[1] == destination[1]){//&& �� || ���ٸ���ˣ�
			System.out.println("�ѵ����յ㣬�˳�����");
		} else if(miGong[ location[0] + 1 ][ location[1] ] == 0){//������
			System.out.println("������");
			miGong[ location[0] + 1 ][ location[1] ] = 2;
			location[0]++;
			searchRoad(location, destination, miGong);
		} else if(miGong[ location[0] ][ location[1] + 1 ] == 0){//������
			System.out.println("������");
			miGong[ location[0] ][ location[1] + 1 ] = 2;
			location[1]++;
			searchRoad(location, destination, miGong);
		} else if(miGong[ location[0] - 1 ][ location[1] ] == 0){//������
			System.out.println("������");
			miGong[ location[0] - 1 ][ location[1] ] = 2;
			location[0]--;
			searchRoad(location, destination, miGong);
		} else if(miGong[ location[0] ][ location[1] - 1 ] == 0){//������
			System.out.println("������");
			miGong[ location[0] ][ location[1] - 1 ] = 2;
			location[1]--;
			searchRoad(location, destination, miGong);
		} else{
			System.out.println("û�п�ͨ���յ��·");
		}
		
	}*/

	/*
	û�߹��ĵط�Ϊ0��ǽ��Ϊ1������������ͨ��·Ϊ2����·Ϊ3
	1.��ÿһ�η�������ʱ����յ�λ���Ƿ��ѱ��Ϊͨ·,����ѵ��յ㣬
	2.��鵱ǰλ���Ƿ�Ϊ0���Ǿͽ�����һ����̽���������򷵻�false
	3.����ǰλ��Ϊ0������λ�ñ��Ϊ2��Ȼ�������һ��̽��
	4.ÿһ��̽����˳��������������ĳ��̽���Ľ��Ϊtrue�����ڸ�̽������½�����һ��̽��
	5.����Ĵ�̽����Ϊfalse�����Ǹõ�Ϊ��·������false
	6.���̽����ɵ�ͼ
	 */
	public boolean findWay(int i, int j, int[][] miGong){
		if(miGong[5][1] == 2){
			return true;//Ѱ���յ�������Ϸ���true
		} else if(miGong[i][j] == 0){
			miGong[i][j] = 2;
			if(findWay(i + 1, j, miGong)){//����̽��
				return true;
			} else if(findWay(i, j + 1, miGong)){//����̽��
				return true;
			} else if(findWay(i - 1, j, miGong)){//����̽��
				return true;
			} else if(findWay(i, j - 1, miGong)){//����̽��
				return true;
			} else{//���ĸ�������·
				miGong[i][j] = 3;
				return false;
			}
		} else{
			return false;
		}
	}
}