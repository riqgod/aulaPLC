
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

		public void insert(int value) {

			if (this.value < value) {
				
				InsertRight(this.right, value);
				
			}

			else {

				this.InsertLeft(this.left, value);

			}

		}

	synchronized public void InsertLeft(Node node, int value) {

			if (node != null) {
				node.insert(value);
			} else {
			    this.left = new Node(value);
			}

		}
	
	synchronized public void InsertRight(Node node, int value) {
		
		
			if (node != null) {
				node.insert(value);
			} else {
				this.right = new Node(value);
			}
					
		}
	
	public String toString() {
		String s1 = "";
		String s2 = "";
		if(this.left != null) s1 = this.left.toString();
		if(this.right != null) s2 = this.right.toString();
		return s1 + "(" + value + ")" + s2;
		
	}

	}

	Node n;

	public tree() {
		this.n = null;
	}
	
	public String toString() {
		return n.toString();
		
	}

	public void insert(int v) {
		if (this.n == null) {
			this.n = new Node(v);
		} else {
			this.n.insert(v);
		}
	}
}
