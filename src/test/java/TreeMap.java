import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class TreeMap<K extends Comparable<K>,V> implements Map<K, V>{
	
	private Node<K,V> root;
	
	private int size;
	
	TreeMap() {
		
	}
	
	private class Node<K extends Comparable<K>,V> {
	
		private boolean isRed;
		
		private Node<K,V> leftNode;
		
		private Node<K,V> rightNode;
		
		private Node<K,V> parentNode;
		
		private K key;
		
		private V value;
		
		Node() {
			
		}
		
		Node(K k, V v, Node<K,V> parent) {
			this.key = k;
			this.value = v;
			this.parentNode = parent;
			this.isRed = false;
		}
		
		
		

		public Node<K, V> getParentNode() {
			return parentNode;
		}

		public void setParentNode(Node<K, V> parentNode) {
			this.parentNode = parentNode;
		}

		public boolean isRed() {
			return isRed;
		}

		public void setRed(boolean isRed) {
			this.isRed = isRed;
		}

		public Node<K, V> getLeftNode() {
			return leftNode;
		}

		public void setLeftNode(Node<K, V> leftNode) {
			this.leftNode = leftNode;
		}

		public Node<K, V> getRightNode() {
			return rightNode;
		}

		public void setRightNode(Node<K, V> rightNode) {
			this.rightNode = rightNode;
		}

		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public V setValue(V value) {
			V oldValue = this.value;
			this.value = value;
			return oldValue;
		}
		
		
	}

	@Override
	public int size() {
		return size;
	}

	  
	@Override
	public boolean isEmpty() {
		return size <= 0;
	}
	    
	@Override
	public boolean containsKey(Object key) {
		return get(key) != null;
	}

	  
	    /* (非 Javadoc)  
	    *   
	    *   
	    * @param value
	    * @return  
	    * @see java.util.Map#containsValue(java.lang.Object)  
	    */  
	    
	@Override
	public boolean containsValue(Object value) {
		return false;
	}

	  
	    /* (非 Javadoc)  
	    *   
	    *   
	    * @param key
	    * @return  
	    * @see java.util.Map#get(java.lang.Object)  
	    */  
	    
	@Override
	public V get(Object key) {
		if (key == null) {
			return null;
		}
		if (root == null) {
			return null;
		}
		Node<K,V> t = root;
		do {
			int compareTo = t.getKey().compareTo((K) key);
			if (compareTo == 1) {
				t = t.getLeftNode();
			} else if (compareTo == -1) {
				t = t.getRightNode();
			} else {
				return t.getValue();
			}
		}while (t != null);
		return null;
	}

	  
	@Override
	public V put(K key, V value) {
		if (root == null) {
			initRoot(key, value, false);
			size++;
			return null;
		}
		
		Node<K,V> n = root;
		Node<K,V> t;
		int compareTo;
		do {
			t = n;
			compareTo = n.getKey().compareTo(key);
			if (compareTo == 1) {
				n = n.getLeftNode();
			} else if (compareTo == -1) {
				n = n.getRightNode();
			} else {
				return n.setValue(value);
			}
		} while (n != null);
		Node<K,V> e = new Node<>(key, value, t);
		if (compareTo == 1) {
			t.setLeftNode(e);
		} else {
			t.setRightNode(e);
		}
		size++;
		
		return null;
	}

	private void initRoot(K key, V value, boolean color) {
		root = new Node<K,V>(key,value,null);
		root.setRed(false);
	}


	@Override
	public V remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		
	}
	    
	@Override
	public void clear() {
		root = null;
		size = 0;
	}
	    
	@Override
	public Set<K> keySet() {
		return null;
	}

	    
	@Override
	public Collection<V> values() {
		return null;
	}

	  
	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		return null;
	}
}
