#include<iostream>

using namespace std;
class Animal{
	public : void sound(){
		cout<<"animal makes sound"<<endl;
	}
};

class Dog:public Animal{
	public : void sound(){
		cout<<"dog bark"<<endl;
		
	}
};

int main(){
	Animal a;
//	Dog d;
	
	a.sound();
//	a.bark();
	
}
