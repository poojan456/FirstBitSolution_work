class Player{
	String name;
	int jersey_no;
	String gender;
	int matched_played;
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getJersey_no() {
		return jersey_no;
	}
	void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}
	String getGender() {
		return gender;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	int getMatched_played() {
		return matched_played;
	}
	void setMatched_played(int matched_played) {
		this.matched_played = matched_played;
	}
	Player() {
		// TODO Auto-generated constructor stub
		//default class
    	this.name="not given";
    	this.jersey_no=0;
    	this.gender="not_mentioned";
    	this.matched_played=0;
    	
	}	
	 // parametarised constructor
	 Player(String p_name,int number, String p_gender,int n_matched_played){
		 this.name=p_name;
		 this.jersey_no=number;
		 this.gender=p_gender;
		 this.matched_played=n_matched_played;
	 }
	 void display() {
	    	System.out.println(this.name);
	    	System.out.println(this.jersey_no);
	    	System.out.println(this.gender);
	    	System.out.println(this.matched_played);
	    }
	 
}

//  super class end here 
// sub class start here
class CricketPlayer extends Player{
	int no_wicket;
	int no_LBW;
	int no_catches;
	int no_runs;
	int getNo_wicket() {
		return no_wicket;
	}
	void setNo_wicket(int no_wicket) {
		this.no_wicket = no_wicket;
	}
	int getNo_LBW() {
		return no_LBW;
	}
	void setNo_LBW(int no_LBW) {
		this.no_LBW = no_LBW;
	}
	int getNo_catches() {
		return no_catches;
	}
	void setNo_catches(int no_catches) {
		this.no_catches = no_catches;
	}
	int getNo_runs() {
		return no_runs;
	}
	void setNo_runs(int no_runs) {
		this.no_runs = no_runs;
	}
	CricketPlayer(){
		//default
		super();
		
		this.no_wicket=0;
		this.no_LBW=0;
		this.no_catches=0;
		this.no_runs=0;		
	}
	CricketPlayer(String name,int jersey_no,String gender,int matched_played,int wicket,int lbw, int catches, int runs){
		//parameterised
		
		super(name,jersey_no,gender,matched_played);
		
		
		this.no_wicket=wicket;
		this.no_LBW=lbw;
		this.no_catches=catches;
		this.no_runs=runs;
		
		
		
	}
	void display() {
		super.display();
		System.out.println(this.no_wicket);
		System.out.println(this.no_LBW);
		System.out.println(this.no_catches);
		System.out.println(this.no_runs);	
	}
	
	
}
// football player 
class FootballPlayer extends Player{
	int no_goal;
	int no_faul;
	int no_panelty;
	String position;
	

	int getNo_goal() {
		return no_goal;
	}
	void setNo_goal(int no_goal) {
		this.no_goal = no_goal;
	}
	int getNo_faul() {
		return no_faul;
	}
	void setNo_faul(int no_faul) {
		this.no_faul = no_faul;
	}
	int getNo_panelty() {
		return no_panelty;
	}
	void setNo_panelty(int no_panelty) {
		this.no_panelty = no_panelty;
	}
	String getPosition() {
		return position;
	}
	void setPosition(String position) {
		this.position = position;
	}
	FootballPlayer(){
		//default
		super();
		
		this.no_goal=0;
		this.no_faul=0;
		this.no_panelty=0;
		String position;	
	}
	FootballPlayer(String name,int jersey_no,String gender,int matched_played,int goal,int faull, int panelty, String pos){
		//parameterised
		
		super(name,jersey_no,gender,matched_played);
		
		
		this.no_goal=goal;
		this.no_faul=faull;
		this.no_panelty=panelty;
		this.position=pos;
			
	}
	void display() {
		super.display();
		System.out.println(this.no_goal);
		System.out.println(this.no_faul);
		System.out.println(this.no_panelty);
		System.out.println(this.position);	
	}
	
	
}




public class PlayerDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Player p1=new Player();
		Player p2=new Player();
		CricketPlayer cp1=new CricketPlayer("Pooja",25,"Female",900,50,3,12,5555);
		cp1.display();
		FootballPlayer fp1=new FootballPlayer("Sahil",31,"Male",500,5,1,1000,"backward");
		fp1.display();
		
		FootballPlayer fp2=new FootballPlayer();
		fp2.display();
		
		

	}

}
