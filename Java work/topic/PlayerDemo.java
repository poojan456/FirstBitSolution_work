import java.util.*;

class Player implements Comparable<Player> {
	int jersey_no;
	String name;
	int score;

	Player() {

		this.jersey_no = 0;
		this.name = "Unknown";
		this.score = 0;
	}

	public Player(int jersey_no, String name, int score) {
		super();
		this.jersey_no = jersey_no;
		this.name = name;
		this.score = score;
	}

	int getJersey_no() {
		return jersey_no;
	}

	void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getScore() {
		return score;
	}

	void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "\nPlayerDemo [jersey_no=" + jersey_no + ", name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Player p2) {
		// TODO Auto-generated method stub
		System.out.println("Inside compareto");
		
		return this.jersey_no-p2.jersey_no;
	}
	public boolean equals(Object obj) {
		System.out.println("inside equal");
		Player e2=(Player)obj;
		if(this.jersey_no==e2.jersey_no) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
     public int hashCode() {
    	 System.out.println("inside hashcode");
    	 return  this.jersey_no;
     }
}

public class PlayerDemo {

	public static void main5(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Player> a2 = new <Player>ArrayList();
		Player p1 = new Player(45, "Pooja", 3456);
		Player p2 = new Player(18, "aboli", 5676868);
		Player p3 = new Player(10, "raj", 5678);
		a2.add(p1);
		a2.add(p2);
		a2.add(p3);
		System.out.println(a2);
		Player p4 = new Player(45, "Pooja", 3456);
		if (a2.contains(p4)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}// end

	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Player> a3 = new <Player>LinkedList();
		a3.add(new Player(18, "pooja", 18099));
		System.out.println(a3);

	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Player> t1 = new <Player>TreeSet();
		Player p1 = new Player(45, "Pooja", 3456);
		Player p2 = new Player(18, "aboli", 5676868);
		Player p3 = new Player(10, "raj", 5678);
		t1.add(p1);
		t1.add(p2);
		t1.add(p3);
		System.out.println(t1);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Player> h1 = new HashSet<Player>();
		Player p1 = new Player(45, "Pooja", 3456);
		Player p2 = new Player(18, "aboli", 5676868);
		Player p3 = new Player(10, "raj", 5678);
		Player p4=new Player(18, "aboli", 5676868);
		h1.add(p1);
		h1.add(p2);
		h1.add(p3);
		h1.add(p4);
		System.out.println("helllo");
		System.out.println(h1);
		if(h1.contains(new Player(45, "Pooja", 3456))) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}

	}

}
