import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class MergeIntevals {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1)
            return intervals;

        Collections.sort(intervals, new Compare());

        List<Interval> res = new ArrayList<>();
        Interval former = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (current.start <= former.end)
                former.end = Math.max(former.end, current.end);
            else {
                res.add(former);
                former = current;
            }
        }
        res.add(former);
        return res;
    }

    private class Compare implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }

    public static void main(String[] args){
        MergeIntevals m = new MergeIntevals();
        List<Interval> intervals = new ArrayList<>();
        Interval i1 = new Interval(1,3);
        Interval i2 = new Interval(3,6);
        Interval i3 = new Interval(6,10);
        Interval i4 = new Interval(15,18);
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
        intervals.add(i4);

        List<Interval> res = m.merge(intervals);
        for(Interval i:res)
            System.out.println(i.start+" "+i.end);

    }
}

