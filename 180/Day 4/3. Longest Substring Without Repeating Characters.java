Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
  
  
  
  
  
  class Solution {
    public int lengthOfLongestSubstring(String s) {
        
      int a_pointer=0;
        int b_pointer=0;
        
        int max=0;
        HashSet<Character> hs=new HashSet<Character>();
        
        
        while(b_pointer<s.length()){
            
            
            if(!hs.contains(s.charAt(b_pointer))){
                
                hs.add(s.charAt(b_pointer));
                b_pointer++;
                max=Math.max(hs.size(),max);
  
            }
            
            else{
                 hs.remove(s.charAt(a_pointer));
                
                a_pointer++;
            }
            
        }
        
        return max;
    }
}
