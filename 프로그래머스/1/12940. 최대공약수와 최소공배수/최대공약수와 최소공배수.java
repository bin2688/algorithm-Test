class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0,0};
        for(int i=Math.min(n,m); i>0; i--){
            if ((n%i == 0) && (m%i == 0)){
                answer[0] = i;
                answer[1] = (n*m)/i;
                break;
            }
        }
        return answer;
    }
}