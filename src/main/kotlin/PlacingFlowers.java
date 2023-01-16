public class PlacingFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length && n > 0; i++) {
            int prev = i - 1 >= 0 ? flowerbed[i - 1] : 0;
            int now = flowerbed[i];
            int next = i + 1 < flowerbed.length ? flowerbed[i + 1] : 0;

            if((prev | now | next) == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n == 0;
    }
}
