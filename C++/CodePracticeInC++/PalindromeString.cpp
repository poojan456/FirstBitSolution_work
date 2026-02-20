#include <iostream>
#include <string>
using namespace std;
int main(){
	string s="madam";
	string temp=s;
	
	string rev="";
	for(int i=s.length()-1;i>=0;i--){
		rev=rev+s[i];
		
		
	}
	if(temp==rev){
		
		cout<<"palindrome";
	}
	else{
		cout<<"not";
	}
	
}
