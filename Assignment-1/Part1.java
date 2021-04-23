package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part1 {


	
public boolean isStringPermutation(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}
		
		char[] one = s1.toCharArray();
		Arrays.sort(one);
		char[] two = s2.toCharArray();
		Arrays.sort(two);
		
		return Arrays.equals(one, two);
		}


public static List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {
	
	List<List<Integer>> ans = new ArrayList<List<Integer>>();
	
	
	for (int i = 0; i < inputArray.size(); i++) {
		int remain = targetSum - inputArray.get(i);
		
		if (inputArray.contains(remain)) {
			List<Integer> one =Arrays.asList(remain, inputArray.get(i));
			List<Integer> two =Arrays.asList(inputArray.get(i), remain);
			
			if (!ans.contains(two) && !ans.contains(one)) {
				ans.add(one);
				//ans.add(new ArrayList<Integer>());
			} else {
				continue;
			}
		}
	}
	
	return ans;
	
}

}
