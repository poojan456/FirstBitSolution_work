#include<iostream>

using namespace std;

class Employee{
	
	public : 
	int id;
	string name;
	
	
	void display(){
		cout<<id<<"\n"<<name;
		
	}
	
	
	
};

int main(){
	Employee e;
	e.id=101;
	e.name="siddhesh";
	e.display();
	
	
	return 0;
	
}
