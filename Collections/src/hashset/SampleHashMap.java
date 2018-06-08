package hashset;

import java.util.HashMap;
import java.util.Map;

public class SampleHashMap {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(null, "beta");
		m.put(null, "mahesh");
		m.put(1, "dbc");
		m.put(2, "vdjv");
		System.out.println(m);
		System.out.println(m.size());
		m.clear();
		System.out.println(m.isEmpty());
		System.out.println(m);

		System.out.println(m.get(null));

		System.out.println(m.replace(null, "mark"));
		System.out.println(m.remove(1));
		Map<Integer, String> m2 = new HashMap<Integer, String>();

	}

}
