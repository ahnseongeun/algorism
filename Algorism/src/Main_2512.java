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
		if(sum<=m) //������ ���꺸�� ���� ���
			System.out.println(arr[arr.length-1]);
		else { //������ ���꺸�� Ŭ ���
			int bound=m/n; //��հ�
			int index=1; //��հ����� Ŭ��쿡 ���� index ����
			for(int i=1;i<=n;i++)
			{
				if(arr[i]<=bound) //���� ��츦 ������ ���꿡 ����.
				{
					m-=arr[i];
					index++;
				}
				else //ū��� �������� ������.
				{
					bound=m/(n-index+1); //���� ��쿡 ���ؼ� ���ο� ��հ��� ���Ѵ�.
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


