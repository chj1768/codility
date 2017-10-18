//https://codility.com/demo/results/trainingK5YTBK-2SW/
//더 개선의여지가있을거같지만..일단 기록

ArrayList<Integer> east = new ArrayList<Integer>();
        ArrayList<Integer> west = new ArrayList<Integer>();
        for(int i=0; i < A.length; i++) {
            if ( A[i] == 0 ) {
                east.add(i);
            }
            else {
                west.add(i);
            }
        }
        int count = 0;
        for(int i=0; i < east.size(); i++) {
            count += east.get(i) - i; 
        }
        int result = east.size() * west.size() - count;
        return Math.abs(result) > 1000000000 ? -1 : result;