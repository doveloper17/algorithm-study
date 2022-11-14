// https://school.programmers.co.kr/learn/courses/30/lessons/17681?language=java
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            int orResult = arr1[i] | arr2[i];
            for (int j = 0; j < n; j++) {
                builder.append((orResult << j & 1 << (n - 1)) >= 1 ? '#' : ' ');
            }
            answer[i] = builder.toString();
        }
        return answer;
    }

    public String[] anotherSolution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < n; ++i) {
            String line = Integer.toBinaryString(arr1[i] | arr2[i]);
            line = " ".repeat(n - line.length()) + line;
            answer[i] = line.replace("1", "#")
                    .replace("0", " ");
        }

        return answer;
    }
}