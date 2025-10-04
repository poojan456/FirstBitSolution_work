package pack;

 public class Node {
	public int data;
	public Node left;
	public Node right;
	public Node() {
		super();	
	}
	public Node(int data) {
		super();
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
	
		Node root;
		
		public void insert(int data) {
			root=insertRec(root,data);
			
		}

		public Node insertRec(Node root, int data) {
			
			if(root==null) {
				root=new Node(data);
				
			}
			else if(data < root.data) {
				root.left=insertRec(root.left,data);
			}
			else if(data>root.data) {
				root.right=insertRec(root.right,data);
			}
			
			return root;
		}
		public void inorder() {
			System.out.print("using inorder "+" ");
			inorderRec(root);
			System.out.println();
			
		}
	
		public void preorder() {
			System.out.print(" using preorder" + " ");
			preorderRec(root);
			System.out.println();
			
		}
		public void postorder() {
			System.out.print(" using postorder" +" ");
			postorderRec(root);
			System.out.println();
			
		}
		public void postorderRec(Node root) {
	
		   if(root == null){
			        return; // base case
			    }
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.println(root.data);
				
		}
		
		public void preorderRec(Node root) {
		
			
			if(root!=null) {
				System.out.print(root.data + " ");
				preorderRec(root.left);
				preorderRec(root.right);
				
				
			}
			
		}
		public void inorderRec(Node root) {
			
			if(root!=null) {
				
				inorderRec(root.left);
				System.out.print(root.data + " ");
				inorderRec(root.right);
			}
			
		}
		
		
		
	
	
	
	
	
	

}
