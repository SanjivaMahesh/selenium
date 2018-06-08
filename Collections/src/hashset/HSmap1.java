package hashset;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HSmap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(125, "alpha");
		h.put(458, "beta");
		h.put(789, "lucky");

		Collection<String> values = h.values();
		Iterator<String> i = values.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		// foreach loop
		for (String t : values) {
			System.out.println(t);
		}
	}

}
