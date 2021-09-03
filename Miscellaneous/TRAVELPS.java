import java.util.*; 
class CodeChef {
    public static void main(String[] args ){
        Scanner scn = new Scanner (System.in); 
        int t = scn.nextInt(); 
        while (t>0){
            int n = scn.nextInt(); 
             int a = scn.nextInt(); 
             int b = scn.nextInt(); 
             String s =scn.next(); 
             int count0 = 0; 
             int count1 = 0; 
             for (int i =0; i<n; i++){
                 if (s.charAt(i)=='0'){
                     count0++;
                 }
                 else if(s.charAt(i)=='1'){
                     count1++; 
                 }
             }
             int time = count0*a + count1*b; 
             System.out.println(time ); 
             t--;
             
        }
        scn.close();
    }
}