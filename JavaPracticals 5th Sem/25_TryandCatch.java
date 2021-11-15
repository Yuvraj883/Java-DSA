class TryCatch{
    public static void main(String[] args){
        int [] arr = {5,10}; 
        int b =5; 
        try{
            int n = arr[2]/b-arr[1]; 
        }
        catch (ArithmeticException e){
            System.out.println("Division by Zero"); 
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error"); 
        }
        catch (ArrayStoreException e){
            System.out.println("Wrong data type"); 
        }
        int y = arr[1]/arr[0]; 
        System.out.println("Y = "+y); 
    }
}