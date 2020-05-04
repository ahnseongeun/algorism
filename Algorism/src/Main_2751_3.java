import java.util.*;
import java.math.*;
import java.io.*;

public class Main_2751_3  {
	
	 	static int k,n;
		public static int partition(int[] array, int left, int right) {
		    int mid = (left + right) / 2; 
		    swap(array, left, mid); // �߾� ���� ù ��° ��ҷ� �̵�
		 
		    int pivot = array[left];
		    int i = left, j = right;
		 
		    while (i < j) {
		        while (pivot < array[j]) { // j�� �����ʿ��� �������� �Ǻ����� �۰ų� ���� ���� ã�´�.
		            j--;
		        }
		 
		        while (i < j && pivot >= array[i]) { // i�� ���ʿ��� ���������� �Ǻ����� ū ���� ã�´�.
		            i++;
		        }
		        swap(array, i, j); // ã�� i�� j�� ��ȯ
		    }
		    // �ݺ����� ��� ���� i�� j�� �������
		    // �Ǻ��� ��ȯ
		    array[left] = array[i];
		    array[i] = pivot;
		    return i;
		}
		 
		public static void swap(int[] array, int a, int b) {
		    int temp = array[b];
		    array[b] = array[a];
		    array[a] = temp;
		}
		 
		public static void quicksort(int[] array, int left, int right) {
		    if (left >= right) {
		        return;
		    }
		 
		    int pi = partition(array, left, right);
		    
		   // partition������ ���� ���� �������� +1�� ���� k�� ���Ͽ� �ش��ϴ� �κ����տ� ����
           // ���ȣ���� �ݺ��Ѵ�.
		 
		    	quicksort(array, pi + 1, right);
		    	quicksort(array, left, pi - 1);
		    
		}


		
		public static void main(String[] args) throws IOException {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			  BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
			 n =Integer.parseInt(br.readLine());
			 int arr[] = new int[n];
			 
			 for(int i=0;i<n;i++) {
				 arr[i] = Integer.parseInt(br.readLine());
				 
			 }
			 quicksort(arr,0,n-1);
		       
			 for(int i=0;i<n;i++)
				 output.write(String.valueOf(arr[i]+"\n"));
			 output.close();
		     
			
				
		       
		}
	
}