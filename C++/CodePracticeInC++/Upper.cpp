#include <iostream>
#include <string>
using namespace std;
int main(){
	string s="madam";
    for (int i = 0; i < s.length(); i++) {
        s[i] = toupper(s[i]); // convert each character
    }

    cout << s << endl; 
	
}
