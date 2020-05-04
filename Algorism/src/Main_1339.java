import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_1339 {
		static StringBuilder sb=new StringBuilder();
		static String[] str;  //단어 저장
		static ArrayList<Character> list; //대문자 저장
		static int arr[]; //대문자에 대한 값 저장
		static boolean[] visited; //방문 여부 저장
		static int n;
		static int max=0;
		static int size=0;
		static void dfs(int index,int count,int len) 
		{
			if(count==size)
			{
				int sum=0;
				for(int i=1;i<=n;i++)
				{
					int num=0;
					for(int j=0;j<str[i].length();j++)
					{
						int idx=list.indexOf(str[i].charAt(j));
						//int idx=str[i].indexOf(str[i].charAt(j));
						num*=10;
						num+=arr[idx];
						//sb.append(str[i].charAt(j)+" "+arr[idx]+" ");
					}
					sum+=num;
					//sb.append(sum+"\n");				
				}
				if(max<sum)
					max=sum;
				//System.out.println(sum);
				return;
			}
			for(int i=9;i>=0;i--)
			{
				if(visited[i]==true)
					continue;
				visited[i]=true;
				arr[index]=i;
				dfs(index+1,count+1,len);
				arr[index]=0;
				visited[i]=false;
			}
		}
		
	public static void main(String[] args) throws Exception{
		  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		  n=Integer.parseInt(input.readLine());
		  str=new String[n+1];
		  list=new ArrayList<Character>();
		  visited=new boolean[10];
		  int count=9;
		  for(int i=1;i<=n;i++) //중복 제거된 리스트 만들기
		  {
			  str[i]=input.readLine();
			  for(int j=0;j<str[i].length();j++)
			  {
				 if(!list.contains(str[i].charAt(j)))
					 list.add(str[i].charAt(j));
			  }
		  }
		//  System.out.println(list.size());
		  size=list.size();
		  arr=new int[list.size()]; //해당 문자에대한 순열을 저장시키는 장소
		 // for(Character a:list)
			//  System.out.println(a);
		 // System.out.println(map.get('G'));
		 dfs(0,0,list.size());
		// System.out.println(sb);
		  System.out.println(max);
		// TODO Auto-generated method stub

	}

}
