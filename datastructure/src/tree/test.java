package tree;

public class test {
	public static void main(String[] args) {
		//50,30,10,40,80,70,90
		Node root=new Node(50);
		bstimpln b1=new bstimpln();
		b1.insert(root, 30);
		b1.insert(root, 10);
		b1.insert(root, 40);
		b1.insert(root, 80);
		b1.insert(root, 70);
		b1.insert(root, 90);
		System.out.println("============preorder===============");
		b1.preorder(root);
		System.out.println("============inorder================");
		b1.inorder(root);
		System.out.println("============postorder==============");
		b1.postorder(root);
		
	}
}
