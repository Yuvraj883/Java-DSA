import java.util.*; 
public class exitPointOfAnMatrix{
    public static void main(String[] argc){
        Scanner scn = new Scanner (System.in); 
        int r= scn.nextInt();
        int c= scn.nextInt(); 
        int [][] arr = new int[r][c]; 
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int i=0; 
        int j=0; 
        int dir =0; 
        while (true){
            dir = (dir+ arr[i][j])%4; 
            //east
            if(dir==0){
                j++;
            }
            //south 
            else if(dir ==1){
                i++;
            }
            //west
            else if (dir==2){
                j--;
            }
            else if (dir ==3){
                i--;
            }

            if (i<0){
                i++;
                break;
            }
            else if (j<0){
                j++;
                break;
            }
            else if (j>arr[0].length-1){
                j--; 
                break; 
            }
            else if(i>arr.length-1){
                i--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);


    }
}