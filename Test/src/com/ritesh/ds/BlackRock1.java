package com.ritesh.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class BlackRock1 {

	public static void main(String[] args) {
		String[] votes = { "Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Marry", "Marry" };
		// Map<String, Integer> voters = findHighestVoter1(votes);
		// Iterator it = voters.entrySet().iterator();
		// while (it.hasNext()) {
		// Map.Entry pair = (Map.Entry) it.next();
		// System.out.println(pair.getKey() + " = " + pair.getValue());
		// it.remove();
		// }
		String voters = findHighestVoter1(votes);
		System.out.println(voters);
	}

	private static String findHighestVoter1(String[] votes) {
		Map<String, Integer> map = new HashMap<>();
		int max = 0;
		for (String vote : votes) {
			if (map.get(vote) == null)
				map.put(vote, 1);
			else {
				int count = map.get(vote) + 1;
				map.put(vote, count);
				max = Math.max(max, count);
			}
			// map.put(vote, map.getOrDefault(vote, 0)+1);
		}
		List<String> res = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max)
				res.add(entry.getKey());
		}
		Collections.sort(res);
		return res.get(res.size() - 1);
	}

	private static Map<String, Integer> findHighestVoter(String[] votes) {
		Map<String, Integer> voters = new HashMap<String, Integer>();
		String winner = "";
		int max = 0;
		TreeSet ts = new TreeSet();
		for (String vote : votes) {
			if (voters.containsKey(vote)) {
				voters.put(vote, voters.get(vote) + 1);
				int counter = voters.get(vote);
				if (counter > max) {
					max = counter;
					winner = vote;
				}
			}
			else {
				voters.put(vote, 1);

			}
			ts.add(vote);
		}
		Iterator it = voters.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			if (pair.getKey().equals(ts.last().toString())) {
				System.out.println("Last: " + ts.last().toString());
			}
			it.remove();
		}
		return voters;
	}
}
