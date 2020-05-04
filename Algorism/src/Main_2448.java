import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2448 {
	private static char[][] map;
	
	public static void main(String[] args)  {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//BufferedOutputStream
		   try {
		int n= Integer.parseInt(input.readLine()); //2
		map=new char[n][(2*n)-1];
	    
	    for(int i=0;i<n;i++)
		{
			for(int j=0;j<n*2-1;j++)
			{
				map[i][j]=' ';
			}
		}
	    
	   // Main_2448 main1=new Main_2448();
	    recur_star(n,0,n-1);
	    int i;
        for(i=0; i<n; i++) {
            bw.write(map[i]);
            bw.write('\n');
        }
	    bw.flush();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
		//System.out.println(mid);
		
	     //main1.Num(n,map);
	     //System.out.println(map[1][2]);
		//System.out.println(mid);
	    
		
		
	
	static void recur_star(int n,int x,int mid) { //map 이용하면 끝난다 ㅅㅂ
		
		if(n==3)
		{
			map[x][mid]='*';
			map[x+1][mid-1]='*';
			map[x+1][mid+1]='*';
			for(int i=-2;i<3;i++)
			  map[x+2][mid+i]='*';
			return;
		}
		 recur_star(n/2,x,mid); //왼쪽
		 recur_star(n/2,x+n/2,mid-n/2); //왼쪽
		 recur_star(n/2,x+n/2,mid+n/2); 
		// recur_star(n,x,mid+3,map); //오른쪽
		
		
	}
}
