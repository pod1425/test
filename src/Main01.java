public class Main01 {
    // Метод, который будет объединять массив цифр в одно число
    public static int concat(int[] arr) {
        // переменная куда будем записывать результат
        int res = 0;
        // делаем два счетчика - i чтобы брать значения из массива и j чтобы получить соответствующее количество нулей
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            // используем формулу, которую записывали в примере
            res += arr[i] * Math.pow(10, j);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 2, 1, 1, 1};
        System.out.println("Число из заданного массива: ");
        System.out.println(concat(arr));
    }
}
