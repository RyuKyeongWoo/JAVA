package day0203;

/**
 * �迭�� ���.
 * @author SIST
 */
public class UseArray {
	
	public void max() {
		int[] temp = {87, 74, 99, 45, 69};
		int max = temp[0]; // �ְ� ���� ���ϱ� ���� ó�� ���� ���� ����
		
		for(int i =0; i < temp.length; i++) {
			System.out.printf("%-4d", temp[i]);
			if(max < temp[i]) {
				max = temp[i];
			}//end if
		}//end for
		System.out.println("\n �ְ����� "+ max);
	}
		
	public void min() {
		int[] temp = {87, 74, 99, 45, 69};
		int min = temp[0]; // �ּ� ���� ���ϱ� ���� ó�� ���� ���� ����
		
		for(int i =0; i < temp.length; i++) {
			System.out.printf("%-4d", temp[i]);
			if(min > temp[i]) {
				min = temp[i];
			}//end if
		}//end for
		System.out.println("\n �ּ����� "+ min);
	}
	
	public void sort() {
		int[] score = {87, 74, 99, 45, 69};
		
		int temp = 0;
		for(int i =0; i < score.length-1; i++) {//�չ��� ��
			for(int j =i+1; j < score.length; j++) {//�������� ��
			if(score[i] < score[j] ) {//�չ��� ���� �������� ������ �۴ٸ�
				temp = score[i]; //�չ氪�� �ӽú����� ����
				score[i] = score[j]; // �������� ���� �չ濡 ����
				score[j] = temp; // �ӽú����� ���� ���� �濡 ����
				} 
			}	
		}
		for(int i =0; i<score.length; i++) {
			System.out.println(score[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		UseArray ua = new UseArray();
		ua.max();
		System.out.println("-----------------------");
		ua.min();
		System.out.println("-----------------------");
		ua.sort();
		System.out.println("-----------------------");
	
	}

}