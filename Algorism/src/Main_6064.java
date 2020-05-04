import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_6064 {
	static int n; //x의 한계
	static int m; //y의 한계
	static int x; //x 도달 목표
	static int y; //y 도달 목표
	static int num;
	static int count=0;

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int k=Integer.parseInt(input.readLine());
		for(int i=1;i<=k;i++) //상한선을 어떻게 정할까?
		{
			count=0;
			StringTokenizer st=new StringTokenizer(input.readLine());
			m=Integer.parseInt(st.nextToken());
			n=Integer.parseInt(st.nextToken());
			x=Integer.parseInt(st.nextToken());
			y=Integer.parseInt(st.nextToken());
			count+=x;// x값 먼저맞추기
			//y값 맞추기
			int yy=x;
			if(yy%n==0) //%을 이용해서 yy와 n의 대소관계 및 중복을 표현할수 있다.
						//n만큼의 중복을 빼주고 yy==n이라면  n출력 아니면 n보다 작은수 표현 할수 있다.
						//yy의 maxmum은 n이기 때문이다.
				yy=n;
			else
				yy%=n;
			
			//System.out.println(yy);
			while(yy!=y)
			{
				yy=(yy+m)%n;
				if(yy==0)
					yy=n;
				count+=m;
				//System.out.println(yy);
				if(count>n*m)
				{
					count=-1;
					break;
				}
				
			}
			sb.append(count+"\n");
		}
		System.out.println(sb);
			// TODO Auto-generated method stub

	}

}
