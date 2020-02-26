import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Solution1282 {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        
        ArrayList[] arrays = new ArrayList[n+1];
        for(int i=1;i<=n;i++) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arrays[i]=arr;
        }
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for(int i=0;i<n;i++) {
            int nowSize = groupSizes[i];
            arrays[nowSize].add(i);
            if(arrays[nowSize].size() == nowSize) {
                res.add(arrays[nowSize]);
                arrays[nowSize] = new ArrayList<Integer>();
            }
        }
        return res;
    }
}

public class Solution1282Main {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }
    
    public static String int2dListToString(List<List<Integer>> nums) {
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list: nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {

            int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
            
            List<List<Integer>> ret = new Solution1282().groupThePeople(groupSizes);
            
            String out = int2dListToString(ret);
            
            System.out.print(out);
    
    }
}