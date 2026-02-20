#include<iostream>
using namespace std;
int main(){
	int n;
	cout<<"enter the number";
	
	cin>>n;
	
	int a[]={1,2,3,41,5};
	int s=sizeof(a)/sizeof(a[0]);
	bool value=false;
	
	for(int i=0;i<s;i++){
		if(a[i]==n){
			value=true;
			break;
			
		}	
	}
	
	 if (value) {
        cout << "Element exists" << endl;
    } else {
        cout << "Element does not exist" << endl;
    }
	
	
}
