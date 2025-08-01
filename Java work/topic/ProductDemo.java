import java.util.ArrayList;
import java.util.Collections;

class Product{
	int id;
	String name;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> a1=new ArrayList<Product> ();
		Product p1=new Product(105,"parle-g");
		Product p2=new Product(102,"happy");
		
		a1.add(p1);
		a1.add(p2);
		
		
		
		

		

	}

}
