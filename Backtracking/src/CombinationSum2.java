import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(results, candidates, target, new ArrayList<>(), 0);
        return results;
    }

    private void backtracking(List<List<Integer>> results, int[] candidates, int target, ArrayList<Integer> current, int start) {
        if (target == 0) {
            results.add(new ArrayList<>(current));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                current.add(candidates[i]);
                backtracking(results, candidates, target - candidates[i], current, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }


}
