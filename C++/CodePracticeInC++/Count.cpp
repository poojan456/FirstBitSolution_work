#include <iostream>
#include <string>
using namespace std;
int main(){
	
	string s="pooja";
	int vcount=0;
	int wcount=0;
	
	for(int i=0;i<s.length();i++){
		if(s[i]=='a' || s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
			vcount++;
		}
		else{
			wcount++;
		}
	}
	cout<<vcount<<endl;
	cout<<wcount<<endl;
	
	
	
}
