public class Coke {
        public int solution(int a, int b, int n) {
            if (n < a) {
                return 0;
            }

            int coke = (n / a) * b;
            int bottle = coke + (n % a);
            return coke + solution(a, b, bottle);
        }
    }
}
