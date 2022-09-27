import java.util.HashMap;
import java.util.Map;

public class highFrequencyMaximumRepeated {
    public static void main(String[] args) {
        int arr[]={1,5,2,1,4,4,4,3,3,3,5,5};
        System.out.println("Max occuring element : " + maxOccurence(arr));

    }
    public static int maxOccurence(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxCount = 0;
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxCount <= entry.getValue()) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }
       return result;
    }
}
