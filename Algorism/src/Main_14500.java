import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_14500 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int arr[][]=new int[n+1][m+1];
		int max=0;
		for(int i=1;i<=n;i++) //�迭�� �ֱ�
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j+3<=m&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3])>max) //�������� ������
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3];
					
				}
				if(i+3<=n&&(arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j])>max) //�������� �Ʒ���
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j];
					
				}
				if(j+1<=m&&i+1<=n&&(arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1])>max)// �׸�
				{
					max=arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1];
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+2][j+1])>max)// ����
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+2][j+1];
				}
				
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j])>max)// ���� ȸ��
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j];
					
				}
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1])>max)// ���� ȸ��
				{
					max=arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1];
					
				}
				if(j+2<=m&&i+1<=n&&(arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+2])>max)// ���� ȸ��
				{
					max=arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+2];
					
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i+2][j]+arr[i+2][j+1]+arr[i+1][j+1]+arr[i][j+1])>max)// ���� ��Ī
				{
					max=arr[i+2][j]+arr[i+2][j+1]+arr[i+1][j+1]+arr[i][j+1];
					
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2])>max)// ���� ��Īȸ��
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2];
					
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+2][j])>max)// ���� ��Ī ȸ��
				{
					max=arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+2][j];
					
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+2])>max)// ���� ��Īȸ��
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+2];
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+2][j+1])>max)// ������ 
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+2][j+1];
				}
				if(j+2<=m&&i+1<=n&&(arr[i+1][j]+arr[i+1][j+1]+arr[i][j+1]+arr[i][j+2])>max)// ������ ȸ��
				{
					max=arr[i+1][j]+arr[i+1][j+1]+arr[i][j+1]+arr[i][j+2];
				}
				if(j+1<=m&&i+2<=n&&(arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1]+arr[i][j+1])>max)// ������ ��Ī
				{
					max=arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1]+arr[i][j+1];
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2])>max)// ������ ��Īȸ��
				{
					max=arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2];
				}
				
				if(j+2<=m&&i+1<=n&&(arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+1])>max)// ���� 
				{
					max=arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+1];
				}
				if(j+1<=m&&i+2<=n&&(arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1])>max)// ���� ȸ��
				{
					max=arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1];
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1])>max)// ���� 
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1];
				}
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1])>max)// ���� ȸ��
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1];
				}
			}
		}
		//�۴��,�׸�,����,������, ����
		
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
