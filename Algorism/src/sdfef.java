import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class sdfef {
 
    private static char[][] map;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int n = Integer.parseInt(br.readLine());
            map= new char[n][2*n-1];
            initMap(n);
            
            drawStar(0, n-1, n);
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
    
    // º° ±×¸®±â
    private static void drawStar(int x, int y, int n) {
        if(n == 3) {
            map[x][y] = '*';
            map[x+1][y-1] = map[x+1][y+1] = '*';
            map[x+2][y-2] = map[x+2][y-1] = map[x+2][y] = map[x+2][y+1] = map[x+2][y+2] = '*';
            return;
        }
        
        // À­ »ï°¢Çü
        drawStar(x, y, n/2);
        // ¾Æ·¡ ¿ÞÂÊ »ï°¢Çü
        drawStar(x + n/2, y - n/2, n/2);
        // ¾Æ·¡ ¿À¸¥ÂÊ »ï°¢Çü
        drawStar(x + n/2, y + n/2, n/2);
    }
    
    // ÃÊ±âÈ­
    private static void initMap(int n) {
        int i,j;
        for(i=0; i<n; i++) {
            for(j=0; j<2*n-1; j++) {
                map[i][j] = ' ';
            }    
        }
    }
    
}

