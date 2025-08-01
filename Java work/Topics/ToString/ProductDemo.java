
class Prod{
	int id;
	String name;
	int quantity;
	int price;
	Prod(){
		this.id=0;
		this.name="null";
		this.quantity=0;
		this.price=0;
		
	}
	
	public Prod(int id, String name, int quantity, int price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
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
	int getQuantity() {
		return quantity;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
//	void display() {
//		System.out.println(this.id);
//		System.out.println(this.name);
//		System.out.println(this.quantity);
//		System.out.println(this.price);
//		
//	}
	public String toString() {
		return this.id+" "+this.name+" "+this.quantity+" "+this.price;
	}
}
public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prod p=new Prod(2,"Maja",500,80);
		System.out.println(p.toString());
//		p.setId(12);
//		p.setName("Sprite");
//		p.setQuantity(500);
//		p.setPrice(80);
//		p.display();
		

	}

}
