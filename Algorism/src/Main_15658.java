import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15658 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static int max=-1000000001;
		static int min=1000000001;
		static int arr[]; //계산할 숫자가 들어있는 배열
		static int oper[]; //연사자 숫자가 들어있는 배열 
						   //+,-,*,% 숫서 대로 방향이 진행된다.
		static void search(int index,int sum,int a,int b,int c,int d) //oper에 대한 다음순열을 찾아야한다.
		{
			if(index==n+1)
			{
				if(max<sum)
					max=sum;
				if(min>sum)
					min=sum;
				return;
			}
			if(a<oper[1])
			{
				sum+=arr[index];
				search(index+1,sum,a+1,b,c,d);
				sum-=arr[index];
			}
			if(b<oper[2])
			{
				sum-=arr[index];
				search(index+1,sum,a,b+1,c,d);
				sum+=arr[index];
			}
			if(c<oper[3])
			{
				sum*=arr[index];
				search(index+1,sum,a,b,c+1,d);
				sum/=arr[index];
			}
			if(d<oper[4])
			{
				int s=sum;
				sum/=arr[index];
				search(index+1,sum,a,b,c,d+1);
				sum=s;
			}
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(input.readLine());
		StringTokenizer st=new StringTokenizer(input.readLine());
		arr=new int[n+1];
		oper=new int[5];
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(input.readLine());
		for(int i=1;i<=4;i++)
			oper[i]=Integer.parseInt(st.nextToken());
		int sum=arr[1];
		search(2,sum,0,0,0,0);
		sb.append(max+"\n"+min);
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
