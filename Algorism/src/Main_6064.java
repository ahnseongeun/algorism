import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_6064 {
	static int n; //x�� �Ѱ�
	static int m; //y�� �Ѱ�
	static int x; //x ���� ��ǥ
	static int y; //y ���� ��ǥ
	static int num;
	static int count=0;

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int k=Integer.parseInt(input.readLine());
		for(int i=1;i<=k;i++) //���Ѽ��� ��� ���ұ�?
		{
			count=0;
			StringTokenizer st=new StringTokenizer(input.readLine());
			m=Integer.parseInt(st.nextToken());
			n=Integer.parseInt(st.nextToken());
			x=Integer.parseInt(st.nextToken());
			y=Integer.parseInt(st.nextToken());
			count+=x;// x�� �������߱�
			//y�� ���߱�
			int yy=x;
			if(yy%n==0) //%�� �̿��ؼ� yy�� n�� ��Ұ��� �� �ߺ��� ǥ���Ҽ� �ִ�.
						//n��ŭ�� �ߺ��� ���ְ� yy==n�̶��  n��� �ƴϸ� n���� ������ ǥ�� �Ҽ� �ִ�.
						//yy�� maxmum�� n�̱� �����̴�.
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
