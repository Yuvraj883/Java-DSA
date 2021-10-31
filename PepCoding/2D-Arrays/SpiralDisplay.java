import java.util.*; 
public class SpiralDisplay{
    public static void main(String[] argc){
        Scanner scn = new Scanner (System.in); 
        int r= scn.nextInt(); 
        int c= scn.nextInt(); 
        int [][] arr= new int[r][c]; 
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]= scn.nextInt();
            }
        }
        int maxr= arr.length-1; 
        int maxc = arr[0].length-1; 
        int minc = 0;
        int minr= 0; 
        int count=0;
        int tle= r*c;
        while (tle>count){
            //left wall 
            for(int i=minr; i<=maxr&&tle>count;i++ ){
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;

            //bottom wall
            for (int i=minc; i<=maxc & tle>count; i++){
                System.out.println(arr[maxr][i]);
                count++;
            }
            maxr--;            

            //right wall 
            for(int i=maxr; i>=minr&& tle>count;i--){
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;

            //top wall
            for (int i=maxc; i>=minc&& tle>count; i--){
                System.out.println(arr[minr][i]);
                count++;
            }
            minr++;

        }
        scn.close();

       }
}