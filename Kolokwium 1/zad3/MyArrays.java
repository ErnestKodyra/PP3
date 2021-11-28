public class MyArrays
{
    static int max(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++){
            if(temp < array[i]){
                temp = array[i];
            }
        }
        return temp;
    }
    static int odd(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                count += 1;
            }
        }
        return count;
    }
}
