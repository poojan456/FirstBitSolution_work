#include<iostream>

using namespace std;

class Stud{
	int roll;
	public:
		Stud(int r){
			roll=r;
			cout<<roll<<endl;
			
		}
};

int main(){
	Stud s(101);
//	s.roll=101;
	return 0;
}
