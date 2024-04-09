package tree;

public class bstimpln {
	void insert(Node root, int ele) {
		if (root.data > ele) {
			if (root.left == null) {
				root.left = new Node(ele);
				System.out.println(ele + "had been added towards left of" + root.data);
			} else {
				insert(root.left, ele);
			}
		} else {
			if (root.right == null) {
				root.right = new Node(ele);
				System.out.println(ele + "had been added towards left of" + root.data);
			} else {
				insert(root.right, ele);
			}
		}
	}

	void preorder(Node root) {
		if (root != null) {
			System.out.println(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.data + " ");
			inorder(root.right);
		}
	}

	void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data + "  ");
		}
	}
}
