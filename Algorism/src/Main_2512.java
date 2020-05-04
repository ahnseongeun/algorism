import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2512 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		StringTokenizer st=new StringTokenizer(input.readLine());
		int m=Integer.parseInt(input.readLine());
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		if(sum<=m) //총합이 예산보다 작을 경우
			System.out.println(arr[arr.length-1]);
		else { //총합이 예산보다 클 경우
			int bound=m/n; //평균값
			int index=1; //평균값보다 클경우에 대한 index 시작
			for(int i=1;i<=n;i++)
			{
				if(arr[i]<=bound) //작은 경우를 제공된 예산에 뺀다.
				{
					m-=arr[i];
					index++;
				}
				else //큰경우 예산으로 나눈다.
				{
					bound=m/(n-index+1); //남은 경우에 대해서 새로운 평균값을 구한다.
					if(arr[i]>bound)
						break;
					i--;
				}
			}
			System.out.println(bound);
		}
			
	}
		
		
		// TODO Auto-generated method stub

	}


