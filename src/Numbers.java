
public class Numbers {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15, 16, 17, 18 };
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 3 == 0){
                System.out.println(numbers[i]);
            }
        }
    }


}
