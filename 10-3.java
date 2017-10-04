10-4 Peaks(88%) 

//https://codility.com/demo/results/training69VAVR-MEE/

class Solution {
    
    public int solution(int[] A) {
        int result;
        int max = searchPeak(0, A.length-1, A);
        for(int i=2; A.length/i >= 3 ; i++) {
            result = 0;
            if( A.length%i == 0 ) {
                result = 1;
                for(int j=0; j < A.length; j += A.length/i ) {
                    result *= searchPeak(j, j + A.length/i-1, A);
                }
            }
            if( result == 1 ) {
                max = i > max ? i : max;
            }
        }
        return max;
        
    }
    public static int searchPeak( int start, int last, int[] list ) {
        for( int i=start; i<=last-2; i++ ) {
            if( list[i] < list[i+1] && list[i+1] > list[i+2] ) {
                return 1;    
            }    
        }
        if( (last != list.length-1) && list[last-1] < list[last] && list[last] > list[last+1] ) {
            return 1;
        }
        return 0;
    }
    
}