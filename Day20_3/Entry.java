package Day20_3;

public class Entry<K, V> { // 관례상 k v 를 쓴다. (다른변수로 쓸 순 있음)
	private K key;
	private V value;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;

	}

	public V getValue() {
		return value;
	}

}
