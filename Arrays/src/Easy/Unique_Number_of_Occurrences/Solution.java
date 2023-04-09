package Easy.Unique_Number_of_Occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if (arr.length <= 1) return false;
        Map<Integer, Integer> dataStore = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (dataStore.containsKey(arr[i])) {
                dataStore.put(arr[i], dataStore.get(arr[i]) + 1);
            } else {
                dataStore.put(arr[i], 1);
            }
        }
        Set<Integer> uniqueVals = new HashSet<>(dataStore.values());
        if (dataStore.size() > uniqueVals.size()) return false;
        return true;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0,0};
        System.out.println(solution.uniqueOccurrences1(arr));
    }

    public boolean uniqueOccurrences1(int[] arr) {
        if(arr.length <=1) return true;
        Map<Integer,Integer> ocurrenceCount=new HashMap<>();
        int i=0;
        while(i<arr.length){
            if(ocurrenceCount.containsKey(arr[i]))
                ocurrenceCount.put(arr[i],ocurrenceCount.get(arr[i])+1);
            else
                ocurrenceCount.put(arr[i],1);
            i++;
        }
        Set<Integer> uniqueValue=new HashSet<>();
        ocurrenceCount.forEach((k,v)->uniqueValue.add(v));
        if(uniqueValue.size()!=ocurrenceCount.size()) return false;
        return true;
    }
}
