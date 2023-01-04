/**
 * 다음에 올 숫자 (Lv.0)
 * <p>
 * 문제 설명
 * 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
 * <p>
 * 제한사항
 * 2 < common의 길이 < 1,000
 * -1,000 < common의 원소 < 2,000
 * 등차수열 혹은 등비수열이 아닌 경우는 없습니다.
 * 공비가 0인 경우는 없습니다.
 * 입출력 예
 * common	result
 * [1, 2, 3, 4]	5
 * [2, 4, 8]	16
 * 입출력 예 설명
 * 입출력 예 #1
 * <p>
 * [1, 2, 3, 4]는 공차가 1인 등차수열이므로 다음에 올 수는 5이다.
 * 입출력 예 #2
 * <p>
 * [2, 4, 8]은 공비가 2인 등비수열이므로 다음에 올 수는 16이다.
 */

class Algorithm_230104 {
    public int solution(int[] common) {
        int answer = 0;

        int subtract1 = common[1] - common[0];
        int subtract2 = common[2] - common[1];

        if (subtract1 == subtract2) { // 등차
            answer = common[common.length - 1] + subtract1;

        } else { // 등비
            int division1 = common[1] / common[0];
            answer = common[common.length - 1] * division1;
        }

        return answer;
    }
}
