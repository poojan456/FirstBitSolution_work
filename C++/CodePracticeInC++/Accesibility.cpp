#include<iostream>

using namespace std;


class Person{
	public : 
	int age;
	protected :
		string name;
	private :
		int salary;
		
};

class Student:public Person{
	public :
	 void setData(){
		age=20;
		name="pooja";
		//salary=5000;
		
	}
	void show(){
		
		cout << age << endl;
        cout << name << endl;
		
	}
};

int main(){
	Student s;
     s.setData();
      s.show(); 
//	s.name="A";
	return 0;
	
}
