
public class EightQueens{

	//����һ�� main ����
	public static void main(String[] args){

		//8�ʺ�����
		//8*8�������ڣ�����ڷ� 8 ���ʺ��䲻���໥������
		//�������������ʺ󶼲��ܴ���ͬһ�С�ͬһ�л�ͬһб����

		//����һ�����̲���ʼ��
		int[][] chessBoard = new int[8][8];
		for(int i = 0; i < chessBoard.length; i++){
			for(int j = 0; j < chessBoard[i].length; j++){
				chessBoard[i][j] = 0;
			}
		}
		//����һ��һά���鱣�淽���������
		int[] sum = {0};
		//�������󲢵��÷���
		Queen queens = new Queen();
		queens.notDie(chessBoard, 0, sum);

		//������ж����ְڷŷ���
		System.out.println("����" + sum[0] + "�ְڷŷ���");
	}
}

class Queen{

	//���ȶ���һ������������ֵΪboolean����
	//������β�Ϊ�����������num������chessBoard����ǰ�ڷ�Ů��������
	/*
	˼·��
	1.��Ů���� 0 ��ʾ����Ů���� 5 ��ʾ
	2.ÿһ�η���Ů��ǰ��鵱ǰ��������row > 7����ʾ8��Ů���Ѿ�������ϣ�sum++��return true
	3.��row <= 7,��ǵ�ǰ��λΪŮ������鵱ǰ�У���ǰб���Ƿ��еڶ���Ů����
	  �����ʼ����λֵ���������У�ȥ������һ��
	4.���޵ڶ���Ů��,ǰ����һ��
	5.����һ��ȫ���޷����ã�����һ�б��ΪŮ���ĵ�λ��ʼ��
	6.��Ϊÿһ����Ҫ���8��������forѭ��
	 */
	public boolean notDie(int[][] chessBoard, int row, int[] sum){
		
		if(row > 7){
			sum[0]++;//�ڷ������һ
			return true;
		} else{
			//ѭ����������ÿһ�У������Ƿ��ܷ���Ů��
			for(int list = 0; list < chessBoard[row].length; list++){
				chessBoard[row][list] = 5;
				int error = -1;
				//��鵱ǰ�����޵ڶ���Ů��
				for(int i = 0; i < chessBoard.length; i++){
					if(i == row){
						continue;
					} else if(chessBoard[i][list] == 5){
						chessBoard[row][list] = 0;
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
					} else if(chessBoard[i][j] == 5){
						chessBoard[row][list] = 0;
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
					} else if(chessBoard[i][j] == 5){
						chessBoard[row][list] = 0;
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
					} else if(chessBoard[i][j] == 5){
						chessBoard[row][list] = 0;
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
					} else if(chessBoard[i][j] == 5){
						chessBoard[row][list] = 0;
						error = 1;
						break;
					}
				}
				if(error == 1){//����Ů������������ѭ��
					continue;
				}
				if(notDie(chessBoard, row + 1, sum)){//̽����һ��
					chessBoard[row][list] = 0;
					//continue;
				} else{
					chessBoard[row][list] = 0;
				}
			}
			return false;
		}
	}
}