There are N (N > 0) beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to his faith and ability) to some K beggars sitting next to each other.

Given the amount donated by each devotee to the beggars ranging from i to j index, where 1 <= i <= j <= N, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.

Example:

Input:
N = 5, D = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

Return: [10, 55, 45, 25, 25]

Explanation:
=> First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]

=> Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]

=> Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]

×

  

public class Solution {
    public int[] solve(int a, int[][] b) {
        
        int[]arr=new int[a];
        
        for(int i=0;i<b.length;i++){
            
           int l=b[i][0];
           int r=b[i][1];
          
           int amount=b[i][2];
           
           arr[l-1]+=amount;
         if(r<arr.length){
               arr[r]+=-amount;
         }
            
        }
        
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
}
