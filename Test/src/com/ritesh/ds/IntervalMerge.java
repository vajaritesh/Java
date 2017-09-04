package com.ritesh.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntervalMerge {
	int start, end;

	public IntervalMerge(int a, int b) {
		this.start = a;
		this.end = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<IntervalMerge> intervals = new ArrayList<IntervalMerge>();
		intervals.add(new IntervalMerge(1, 3));
		intervals.add(new IntervalMerge(8, 10));
		intervals.add(new IntervalMerge(15, 18));
		intervals.add(new IntervalMerge(2, 6));

		List<IntervalMerge> result = merge(intervals);
		for (IntervalMerge interval : result) {
			System.out.println(interval.start + "," + interval.end);
		}

		System.out.println("After inserting new Interval");
		IntervalMerge newInterval = new IntervalMerge(4, 9);
		List<IntervalMerge> result2 = insert(result, newInterval);
		for (IntervalMerge interval : result2) {
			System.out.println(interval.start + "," + interval.end);
		}
	}

	// Insert Interval
	public static ArrayList<IntervalMerge> insert(List<IntervalMerge> intervals, IntervalMerge newInterval) {

		ArrayList<IntervalMerge> result = new ArrayList<IntervalMerge>();

		for (IntervalMerge interval : intervals) {
			if (interval.end < newInterval.start) {
				result.add(interval);
			}
			else if (interval.start > newInterval.end) {
				result.add(newInterval);
				newInterval = interval;
			}
			else if (interval.end >= newInterval.start || interval.start <= newInterval.end) {
				newInterval =
				        new IntervalMerge(Math.min(interval.start, newInterval.start), Math.max(newInterval.end,
				                interval.end));
			}
		}

		result.add(newInterval);

		return result;
	}

	// Merge Interval
	public static List<IntervalMerge> merge(List<IntervalMerge> intervals) {
		List<IntervalMerge> result = new ArrayList<IntervalMerge>();

		if (intervals == null || intervals.size() == 0)
			return result;

		Collections.sort(intervals, new Comparator<IntervalMerge>() {
			public int compare(IntervalMerge i1, IntervalMerge i2) {
				if (i1.start != i2.start)
					return i1.start - i2.start;
				else
					return i1.end - i2.end;
			}
		});

		IntervalMerge pre = intervals.get(0);
		for (int i = 0; i < intervals.size(); i++) {
			IntervalMerge curr = intervals.get(i);
			if (curr.start > pre.end) {
				result.add(pre);
				pre = curr;
			}
			else {
				IntervalMerge merged = new IntervalMerge(pre.start, Math.max(pre.end, curr.end));
				pre = merged;
			}
		}
		result.add(pre);

		return result;
	}

}
