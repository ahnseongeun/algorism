import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1929 {
/*
 각 수에 대해 소수 판별을 하기 위해 2부터 그 수 전까지를 모조리 나누어 보면 당연히 시간 초과입니다.
 수의 범위가 100만까지인데, 이 중에 실제로 소수인 것은 78498개나 있고, 
 적어도 이들은 자신이 소수임을 판별하기 위해 자신의 크기만큼 루프를 돌아야 한다는 뜻이 됩니다. 
그러면 대충 계산해 봐도 수십 억 번의 루프를 돌아야 하겠죠? 2초 내에 돌 수 있는 횟수가 아닙니다.
소수를 빠르게 판정하는 방법에는 여러 가지가 있지만, 그 중 가장 간단하면서도 시간 복잡도를 크게 개선시킬 수 있는 것은 그 수의 제곱근까지만 나누어보는 것입니다. 
즉, i * i <= n일 때까지만 루프를 돌면서 하나라도 나누어 떨어지는 것이 있으면 소수가 아니고, 없으면 소수입니다.
 왜 그럴까요? 만일 어떤 자연수 x에 sqrt(x)보다 큰 소인수가 존재한다면, x를 sqrt(x)로 나눈 값은 sqrt(x)보다 작아야 하기 때문에, 
 2부터 순차적으로 i를 증가시키는 동안 이미 그 수로 나누어보았을 것이기 때문입니다.
*/
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(input.readLine());
		int start=Integer.parseInt(st.nextToken());
		int end=Integer.parseInt(st.nextToken());
		int bound=(int)Math.sqrt(end);
		if(start<=2)
		{
			sb.append("2\n3\n");
		}
		else if(start==3)
		{
			sb.append("3\n");
		}
			for(int i=start;i<=end;i++)
			{
				for(int j=2;j<=(int)Math.sqrt(i);j++)
				{
					if(i%j==0)
						break;
					if(j>=(int)Math.sqrt(i))
						sb.append(i+"\n");
				}
			}
		
		// TODO Auto-generated method stub
		System.out.println(sb);
	}

}
