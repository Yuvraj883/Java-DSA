class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
 
       

        for(int i=0; i<flowerbed.length; i++){

             if(n==0){
            return true;
        }
           
            if(flowerbed[i]==0 ){

                boolean emptyLeftPlot = (i==0) ||   (flowerbed[i-1]==0); 
                boolean emptyRightPlot =(i==flowerbed.length-1)|| (flowerbed[i+1] == 0) ;

                if(emptyLeftPlot && emptyRightPlot){
                    flowerbed[i]=1;
                    n--;
                }
        
            
            }
        }

        if(n==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}