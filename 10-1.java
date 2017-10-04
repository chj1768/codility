10-1 MinPerimeterRectangle


class Solution {
    public int solution(int N) {
        int i = 1;
        int min = ( 1 + N )*2;
        while( i*i <= N ) {
            if ( N%i == 0 ) {
                min = min > ( N/i + i )*2 ? ( N/i + i )*2 : min;
            }
            i++;
        }
        return min;
    }
}