import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
		int last = numbers[numbers.length - 1];
		int last2 = numbers[numbers.length - 2];
		return last * last2;
    }
}