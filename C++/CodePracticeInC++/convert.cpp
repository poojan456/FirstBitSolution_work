#include <iostream>
#include <string>
using namespace std;
int main(){
	string s="madam";
	
	for(int i=0;i<s.length();i++){
		if(s[i]=='a'){
			s[i]='0';
		}
	}
	
	
	cout<<s<<endl;
	
}
