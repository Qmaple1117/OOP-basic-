
public class EightQueens02{

	//����һ�� main ����
	public static void main(String[] args){

		//��һά������8�ʺ�
		//����һ�����̲���ʼ��
		int[] chessBoard = new int[8];
		for(int i = 0; i < chessBoard.length; i++){
			chessBoard[i] = -1;
		}
		//����һ��һά���鱣�淽���������
		int[] sum = {0};
		//�������󲢵��÷���
		Queen02 queens = new Queen02();
		queens.notDie(chessBoard, 0, sum);

		//������ж����ְڷŷ���
		System.out.println("����" + sum[0] + "�ְڷŷ���");

	}
}

class Queen02{

	//���ȶ���һ������������ֵΪboolean����
	//������β�Ϊ�����������num������chessBoard����ǰ�ڷ�Ů��������
	/*
	˼·��
	1.��Ů��Ϊ-1������-1 С��8������ʾŮ��
	2.ÿһ�η���Ů��ǰ���row�Ƿ����7��������7����ʾ8��Ů���Ѿ��������
	  ��sum++��return true
	3.��С��7 ,��ǵ�ǰ��λΪŮ����
	  ��鵱ǰ�У���ǰб���Ƿ��еڶ���Ů��(chessBoard[��ǰ��] = ������λ���ڵ�����)��
	  �����ʼ����λֵ���������У�ȥ������һ��
	4.���޵ڶ���Ů��,ǰ����һ��
	5.����һ��ȫ���޷����ã�����һ�б��ΪŮ���ĵ�λ��ʼ��
	6.��Ϊÿһ����Ҫ���8��������forѭ��
	 */
	public boolean notDie(int[] chessBoard, int row, int[] sum){
		
		if(row > 7){
			sum[0]++;//�ڷ������һ
			return true;
		} else{
			//ѭ����������ÿһ�У������Ƿ��ܷ���Ů��
			for(int list = 0; list < chessBoard.length; list++){
				chessBoard[row] = list;
				int error = -1;
				//��鵱ǰ�����޵ڶ���Ů��
				for(int i = 0; i < chessBoard.length; i++){
					if(i == row){
						continue;
					} else if(chessBoard[i] == list){
						chessBoard[row] = -1;
						error = 1;
						break;
					}
				}
				if(error == 1){//����Ů������������ѭ��
					continue;
				}
				//��鵱ǰ��б���Ϸ����޵ڶ���Ů��
				for(int i = row, j = list; i >= 0 && j >= 0; i--, j--){
					if(i == row){
						continue;
					} else if(chessBoard[i] == j){
						chessBoard[row] = -1;
						error = 1;
						break;
					}
				}
				if(error == 1){//����Ů������������ѭ��
					continue;
				}
				//��鵱ǰ��б���·����޵ڶ���Ů��
				for(int i = row, j = list; i <= 7 && j <= 7; i++, j++){
					if(i == row){
						continue;
					} else if(chessBoard[i] == j){
						chessBoard[row] = -1;
						error = 1;
						break;
					}
				}
				if(error == 1){//����Ů������������ѭ��
					continue;
				}
				//��鵱ǰ��б���Ϸ����޵ڶ���Ů��
				for(int i = row, j = list; i >= 0 && j <= 7; i--, j++){
					if(i == row){
						continue;
					} else if(chessBoard[i] == j){
						chessBoard[row] = -1;
						error = 1;
						break;
					}
				}
				if(error == 1){//����Ů������������ѭ��
					continue;
				}
				//��鵱ǰ��б���·����޵ڶ���Ů��
				for(int i = row, j = list; i <= 7 && j >= 0; i++, j--){
					if(i == row){
						continue;
					} else if(chessBoard[i] == j){
						chessBoard[row] = -1;
						error = 1;
						break;
					}
				}
				if(error == 1){//����Ů������������ѭ��
					continue;
				}
				if(notDie(chessBoard, row + 1, sum)){//̽����һ��
					chessBoard[row] = -1;
					continue;
				} else{
					chessBoard[row] = -1;
				}
			}
			return false;
		}
	}
}