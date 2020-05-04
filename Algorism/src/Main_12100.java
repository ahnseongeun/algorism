import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_12100 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static boolean flag=false;
		
		static int max=0;
		/*
		 * sb.append(level+"\n");
					for(int i1=1;i1<=n;i1++)
					{
						for(int j2=1;j2<=n;j2++)
							sb.append(arr[i1][j2]+" ");
						sb.append("\n");
					}
					sb.append("\n");
		 */
		static void search(int arr[][],int level)
		{
			int a[][]=new int[n+1][n+1]; //���� �迭 �ʱ�ȭ
			//�迭�� ������ ���� ���� �̷��� �־�����Ѵ�.
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					a[i][j]=arr[i][j];
			
			if(level==5||flag==true) //�ƹ��͵� ���� �ٲ��� �ʰų� 5�� ����������� return
			{
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=n;j++)
					{
						//.append(arr[i][j]+" ");
						if(max<arr[i][j])
							max=arr[i][j];
					}
					//sb.append("\n");
				}
				//sb.append("\n");
				return;
			}
			flag=true;
	
			for(int i=1;i<=n;i++) //�� x��
			{
				int count=n;
				int k=n;
				while(k>0)  //�ش� �������� ���� �����ų� �ø���
				{
					while(count>1&&a[count][i]!=0) //0�� �ƴѼ� ã��
						count--;
					if(count>=k&&a[count][i]==0&&a[k][i]!=0) {
							a[count][i]=a[k][i];
							a[k][i]=0;
					}
					k--;
				}
				for(int j=n;j>1;j--) //y�� //������� �ش�������� ���ϱ�
				{
					if(a[j][i]==a[j-1][i])
					{
						a[j][i]+=a[j-1][i];
						a[j-1][i]=0;
						flag=false;
						for(int t=j-1;t>1;t--)
						{
							a[t][i]=a[t-1][i];
							a[t-1][i]=0;
						}
					}
					
					if(a[j][i]==0&&a[j-1][i]!=0)
					{
						a[j][i]=a[j-1][i];
						a[j-1][i]=0;
					}
				}
			}
			
			
			search(a,level+1);
			
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					a[i][j]=arr[i][j];
			
			for(int i=1;i<=n;i++) //y�� ����
			{
				int count=1;
				int k=1;
				while(k<n+1)
				{
					while(count<n&&a[i][count]!=0)
						count++;
					if(count<=k&&a[i][count]==0&&a[i][k]!=0)
					{
						
						a[i][count]=a[i][k];
						a[i][k]=0;
					}
					k++;
				}
				for(int j=1;j<n;j++)
				{
					
						
					if(a[i][j]==a[i][j+1])
					{
						a[i][j]+=a[i][j+1];
						a[i][j+1]=0;
						flag=false;
						for(int t=j+1;t<n;t++)
						{
							a[i][t]=a[i][t+1];
							a[i][t+1]=0;
						}
					}
					if(a[i][j]==0&&a[i][j+1]!=0)
					{
						a[i][j]=a[i][j+1];
						a[i][j+1]=0;
					}
					
				}
			}
			search(a,level+1);
			
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					a[i][j]=arr[i][j];
				for(int i=1;i<=n;i++) //��
				{
					
					
					int count=n;
					int k=n;
					while(k>0)
					{
						while(count>1&&a[i][count]!=0)
							count--;
						if(count>=k&&a[i][count]==0&&a[i][k]!=0)
						{
							
							a[i][count]=a[i][k];
							a[i][k]=0;
						}
						k--;
					}
					
					for(int j=n;j>1;j--)
					{
						
						if(a[i][j]==a[i][j-1])
						{
							a[i][j]+=a[i][j-1];
							a[i][j-1]=0;
							flag=false;
							for(int t=j-1;t>1;t--)
							{
								a[i][t]=a[i][t-1];
								a[i][t-1]=0;
							}
						}
						if(a[i][j]==0&&a[i][j-1]!=0)
						{
							a[i][j]=a[i][j-1];
							a[i][j-1]=0;
						}
					}
					
				}	
				search(a,level+1);
			
				for(int i=1;i<=n;i++)
					for(int j=1;j<=n;j++)
						a[i][j]=arr[i][j];
			for(int i=1;i<=n;i++) //�� x��
			{
				int count=1;
				int k=1;
				while(k<n+1) 
				{
					while(count<n&&a[count][i]!=0)
						count++;
					if(count<=k&&a[count][i]==0&&a[k][i]!=0)
					{
						
						a[count][i]=a[k][i];
						a[k][i]=0;
					}
					k++;
				}
				
				for(int j=1;j<n;j++) //y��
				{
					if(a[j][i]==a[j+1][i])
					{
						a[j][i]+=a[j+1][i];
						a[j+1][i]=0;
						flag=false;
						for(int t=j+1;t<n;t++)
						{
							a[t][i]=a[t+1][i];
							a[t+1][i]=0;
						}
					}
					if(a[j][i]==0&&a[j+1][i]!=0) //�� ������ ������ �� �ð��� �� �پ���??
					{
						a[j][i]=a[j+1][i];
						a[j+1][i]=0;
					}
				}
			}
			
			search(a,level+1);
			

			
			
			
			
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(input.readLine());
		int arr[][]=new int[n+1][n+1];
		StringTokenizer st;
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=n;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		search(arr,0);
		//System.out.println(sb);
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
