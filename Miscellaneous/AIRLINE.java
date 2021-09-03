import java.util.*; 
class CodeChef {
    public static void main(String[] args){ 
        Scanner scn = new Scanner (System.in); 
        int t = scn.nextInt(); 
        while (t>0){
            int a= scn.nextInt(); 
            int b = scn.nextInt(); 
            int c = scn.nextInt(); 
            int d = scn.nextInt(); 
            int e = scn.nextInt(); 
            if(a<=e && b+c<=d){
                System.out.println("Yes");
            }
            else if (b<=e && a+c <=d){
                  System.out.println("Yes");
            }
            else if(c<=e && b+c <= d){
                  System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
            
            t--; 
        }
        scn.close();
        
}
}