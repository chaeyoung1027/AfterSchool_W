package Test.score;

import java.util.Scanner;
public class DynamicArrayScore {

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      System.out.print("�л� ���� �Է����ּ��� : ");
      //�л� ��
      int stuNum = s.nextInt();
      String[] stuNames= new String[stuNum];
      
      int[][] scores = new int [stuNum][];
      int[] sum = new int[stuNames.length];
      //�����迭�� ��()
      
      for (int i = 0; i < scores.length; i++) {
    	 System.out.print("�̸� : ");
    	 stuNames[i] = s.next();
         System.out.print(stuNames[i] + "�� ���� ���� �Է����ּ��� : ");
         int subNum = s.nextInt();
         scores[i] = new int[subNum];
         for (int j = 0; j < scores[i].length; j++) {
            System.out.print(j+1+"���� : ");
            scores[i][j]= s.nextInt();
            sum[i] += scores[i][j];
         }//j
      }//i
      
      for(int i =0; i<scores.length; i++) {
         System.out.println();
         System.out.print(stuNames[i] +" : \t");
         for(int j=0; j<scores[i].length; j++) {
            System.out.print(scores[i][j] + " ");
         }
      
      double average = (double)sum[i] / scores[i].length;
      
      System.out.print("	�հ� : " + sum[i] +"\t");
      System.out.print("	��� : " + average);

      }
      s.close();
   }
}
