import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res, candidates, target, new ArrayList<>(), 0);
        return res;
    }

    private void backtracking(List<List<Integer>> res, int[] candidates, int target, ArrayList<Integer> current, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(current));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (candidates[i] > target) {
                    continue;
                }
                current.add(candidates[i]);
                backtracking(res, candidates, target - candidates[i], current, i);
                current.removeLast();
            }
        }
    }
}
