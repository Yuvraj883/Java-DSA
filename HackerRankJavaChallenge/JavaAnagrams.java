import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    if(a.length()!=b.length())return false; 
    a = a.toLowerCase();
    b = b.toLowerCase(); 
    int [] charFrequency = new int[26];
    for(int i=0; i<a.length(); i++){
        char currentChar = a.charAt(i);
        int index = currentChar-'a';
        charFrequency[index]++;
        
    }
    for(int i=0; i<b.length(); i++){
          char currentChar = b.charAt(i);
        int index = currentChar-'a';
        charFrequency[index]--;
    }
    for(int i=0; i<26; i++){
        if(charFrequency[i]!=0) return false;
    }
    return true;
    }
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}






// import java.util.*;

// public class Solution {

//     static boolean isAnagram(String a, String b) {
//         // Complete the function
//         if(a.length()!=b.length()){
//             return false;
//         }
        
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i=0; i<a.length(); i++){
//             if(map.containsKey(a.charAt(i))|| map.containsKey(Character.toUpperCase(a.charAt(i)))||  map.containsKey(Character.toLowerCase(a.charAt(i)))){
//                 map.put(a.charAt(i), map.get(a.charAt(i))+1); 
//             }
//             else{
//                 map.put(a.charAt(i),1); 
//             }
//         }
//         for(int i=0; i<b.length(); i++){
//             if(map.containsKey(b.charAt(i))|| map.containsKey(Character.toUpperCase(b.charAt(i)))||  map.containsKey(Character.toLowerCase(b.charAt(i)))){
//                 map.put(a.charAt(i), map.get(a.charAt(i))-1);
//             }
//             else {
//                 return false; 
//             }
//         }
//         // Set<Integer> keys = map.values();
//         // for(Integer key: keys){
//         //     if(map.get(key)!=0){
//         //         return false;
//         //     }
//         // }
//         //System.out.println(map.values());
//         ArrayList <Integer> values = new ArrayList<>();
//         for(Integer value: map.values()){
//             values.add(value);
//         }
//         for (Integer value : values){
//             if(value !=0){
//                 return false;
//             }
//         }
//         System.out.println(values);
//         return true;
//     }
    

//     public static void main(String[] args) {
    
//         Scanner scan = new Scanner(System.in);
//         String a = scan.next();
//         String b = scan.next();
//         scan.close();
//         boolean ret = isAnagram(a, b);
//         System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//     }
// }