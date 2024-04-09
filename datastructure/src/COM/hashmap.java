package COM;

public class hashmap {
	static int[] hashmap;
	
	static void createMap(int size) {
		hashmap=new int[size];
		for(int i=0;i<hashmap.length;i++) {
			hashmap[i]=-1;
		}
		System.out.println("hash map had been created with size"+size);
	}
	
	static void put(int value) {
		int in=value%hashmap.length;
		if(hashmap[in]==-1) {
			hashmap[in]=value;
			System.out.println(value+"had been inserted...!!");
		}
		else {
			System.out.println("key is already occupied...!!");
		}
	}
		static void delete(int value) {
			int in=value%hashmap.length;
			if(hashmap[in]==value) {
				hashmap[in]=-1;
				System.out.println(value+"had been deleted....!!");
			}
			else {
				System.out.println("value not found...!!");
			}
		}
		
		static void display() {
			int c=0;
			System.out.println("====map elements are====");
			for(int ele:hashmap) {
				if(ele!=-1) {
					System.out.println(ele);
					c++;
				}
			}
			if(c==0) {
				System.out.println("map is empty..!!!");
			}
	}
	
	public static void main(String[] args) {
		createMap(5);
		put(77);put(99);put(74);put(98);put(79);
		delete(98);
		display();
		
		
	}
}
