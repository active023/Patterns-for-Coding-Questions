import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack( results, new ArrayList<Integer>(), nums, 0);
        return results;
    }
    private void backtrack(List<List<Integer>> results, ArrayList<Integer> tmpList, int[] nums, int start) {
        if(tmpList.size()==nums.length){
            results.add(new ArrayList<>(tmpList));
        } else{
            for(int i=start; i<nums.length; i++){
                if(tmpList.contains(nums[i])) continue;
                tmpList.add(nums[i]);
                backtrack(results, tmpList, nums, i+1);
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
}
