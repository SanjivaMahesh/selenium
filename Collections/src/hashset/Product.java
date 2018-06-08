package hashset;

import java.util.TreeSet;

public class Product implements Comparable<Product> {
	public Product(int i, String string, int j) {
		super();
		this.price = price;
		this.proId = proId;
		this.proType = proType;
	}

	@Override
	public int compareTo(Product o) {
		if (this.proId > o.proId) {
			return 1;
		} else if (this.proId < o.proId) {
			return -1;

		} else
			return 0;

	}
	//String i=this.proType;
	//String j=o.proType;
	// return i.compareTo(j);

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proType=" + proType + ", price=" + price + "]";
	}

	int proId;
	String proType;
	double price;

	public static void main(String[] args) {
		TreeSet<Product> t = new TreeSet<Product>();
		t.add(new Product(123, "Electronic", 50000));
		t.add(new Product(123, "Furniture", 100000));
		t.add(new Product(123, "Kitchen items", 50000));
		t.add(new Product(123, "Tiles", 50000));
		System.out.println(t);
	}

}
