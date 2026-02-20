#include<iostream>
using namespace std;


class Student{
	public:
		string name;
		int age;
		void display(){
			cout<<name<<age<<endl;
		
			
		}
};

int main(){
	Student s;
//	s.name="pooja";
//	s.age=21;
	s.display();
	return 0;	
}
