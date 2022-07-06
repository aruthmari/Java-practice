import java.util.HashMap;
import java.util.Map;
public class Picksum {
    
    public static void main(String args[]) {
        int[] numbers = new int[] {2,3,7,4,9};
        int target = 7;
        int[] result = process (numbers, target);
        System.out.print(result[0]+" "+result[1]);
    }
    public static int[] process (int[] numbers,int target)
    {
        Map <Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i =0; i<numbers.length;i++)
        {
            int num = target - numbers[i];
            if (visitedNumbers.containsKey(num)){
                return new int[] {i, visitedNumbers.get(num)};
            }
            visitedNumbers.put(numbers[i],i);
        }
        return new int[] {-1,-1};
    }
}
