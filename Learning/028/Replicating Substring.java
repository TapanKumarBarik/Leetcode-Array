Problem Description

Given a string B, find if it is possible to re-order the characters of the string B so that it can be represented as a concatenation of A similar strings.

Eg: B = aabb and A = 2, then it is possible to re-arrange the string as "abab" which is a concatenation of 2 similar strings "ab".

If it is possible, return 1, else return -1.



Problem Constraints
1 <= Length of string B <= 1000

1 <= A <= 1000

All the alphabets of S are lower case (a - z)



Input Format
First argument is an integer A.
Second argument is a string B.



Output Format
Your function should return 1 if it is possible to re-arrange the characters of the string B so that it can be represented as a concatenation of A similar strings. If it is not, return -1.



Example Input
Input 1:

 A = 2
 B = "bbaabb"
Input 2:

 A = 1
 B = "bc"


Example Output
Output 1:

 1
Output 2:

 1


Example Explanation
Explanation 1:

 We can re-order the given string into "abbabb".
Explanation 2:

 String "bc" is already arranged.
   
   
   
   
   
   public class Solution {
    public int solve(int B, String A) {
        
        if(A.length()%B!=0){
            return -1;
        }
        
        HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
        
        for(int i=0;i<A.length();i++){
            
            if(hm.containsKey(A.charAt(i))){
                int temp=hm.get(A.charAt(i));
                hm.put(A.charAt(i),temp+1);
            }
            else{
                hm.put(A.charAt(i),1);
            }
        }
        
        
        //
        
              // Using for-each loop
        for (Map.Entry mapElement : hm.entrySet()) {
            
  
            // Add some bonus marks
            // to all the students and print it
            int value = ((int)mapElement.getValue() );
  
           if(value%B!=0){
               return -1;
           }
        }
        return 1;
        
    }
}







public class Solution {
    public int solve(int A, String B) {
        
        int[]arr=new int[26];
        
        
        for(int i=0;i<B.length();i++){
            
            arr[B.charAt(i)-'a']++;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[i]%A!=0){
                return -1;
            }
        }
        return 1;
    }
}


