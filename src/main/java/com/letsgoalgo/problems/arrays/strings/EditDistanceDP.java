package com.letsgoalgo.problems.arrays.strings;

public class EditDistanceDP {

    public static int findMinEditDistanceDP(String word1,String word2){
      int[][] dp = new int[word1.length() + 1][word2.length() + 1];
      for(int i = 0 ; i < word1.length() ; i++){
          dp[i][0] = i;
      }
        for(int j = 0 ; j < word2.length() ; j++){
            dp[0][j] = j;
        }

       for(int i = 0 ; i < word1.length() ; i++){
           char cw1 = word1.charAt(i);
           for(int j = 0 ; j < word2.length(); j++){
               char cw2 = word2.charAt(j);
               if(cw1 == cw2){
                   dp[i+1][j+1] = dp[i][j];
               } else{
                   int insert = dp[i][j + 1] + 1;
                   int delete = dp[i+1][j] + 1;
                   int replace = dp[i][j] + 1;
                   dp[i+1][j+1] = Math.min(Math.min(insert,delete),replace);
               }
           }
       }
      return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(findMinEditDistanceDP(word1,word2));
    }

}
