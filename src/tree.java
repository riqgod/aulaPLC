
public class tree {
	class Node {
		int value;
		Node right;
		Node left;
	
		public Node(int value) {
	
			this.value = value;
			this.right = null;
			this.left = null;
	
		}
		
		
		
		
		
	
		public synchronized void insert(int value) {
	
			if (this.value < value) {
				if (this.right != null) {
					this.right.insert(value);
				} else {
					this.right = new Node(value);
				}
			}
	
			else {
	
				if (this.left != null) {
					this.left.insert(value);
				} else {
					this.left = new Node(value);
				}
	
			}
	
		}
	}
	
	Node n;
	
	public tree() {
		this.n = null;
	}
	
	public void insert(int v) {
		if(this.n == null) {
			this.n = new Node(v);
		} else {
			this.n.insert(v);
		}
	}
}
