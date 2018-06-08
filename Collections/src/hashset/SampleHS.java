package hashset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SampleHS {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(125, "alpha");
		h.put(458, "beta");
		h.put(789, "lucky");
		System.out.println(h);
		h.keySet();

		Set<Integer> s = h.keySet();
		System.out.println(s);

		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// using for each loop
		for (Integer i : s) {
			System.out.println(i);

		}

	}

}
