import java.util.*;

public class MergeIntervals {
    // Given a list of intervals, merge all the overlapping intervals to produce a list that has only mutually exclusive intervals.

    public static void main(String[] args) {

        MergeIntervals sol = new MergeIntervals();
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : sol.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

    }


    public List<Interval> merge(List<Interval> intervals) {

        Collections.sort(intervals, (a, b) -> a.start - b.start);
        List<Interval> mergedIntervals = new LinkedList<Interval>();
        Iterator<Interval> iterator = intervals.iterator();
        Interval next = iterator.next();
        int start = next.start;
        int end = next.end;

        while (iterator.hasNext()) {
            next = iterator.next();
            if (next.start < end) {
                end = Math.max(end, next.end);
            } else {
                mergedIntervals.add(new Interval(start, end));
                start = next.start;
                end = next.end;
            }
        }

        mergedIntervals.add(new Interval(start, end));

        return mergedIntervals;
    }

    static class Interval {
        final int start;
        final int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
