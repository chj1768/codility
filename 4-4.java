//https://codility.com/demo/results/trainingVHBC62-XBC/

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int i=1;
        int count = 0;
        while( i < Math.sqrt(N) ) {
            if( N%i == 0 ) {
                count += 2;
            }
            i++;
        }
        if( i*i == N ) 
            count++;
        return count;
    }
}