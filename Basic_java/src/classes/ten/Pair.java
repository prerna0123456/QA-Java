package classes.ten;

import java.util.Objects;

public class Pair<K, V> {

	K key;
	V val;
	
	@Override
	public int hashCode() {
		return Objects.hash(key, val);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		return Objects.equals(key, other.key) && Objects.equals(val, other.val);
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", val=" + val + "]";
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getVal() {
		return val;
	}

	public void setVal(V val) {
		this.val = val;
	}

	public Pair() {
		super();
	}

	public Pair(K key, V val) {
		super();
		this.key = key;
		this.val = val;
	}
}
