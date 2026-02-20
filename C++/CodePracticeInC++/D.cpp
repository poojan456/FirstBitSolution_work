#include <iostream>
using namespace std;

int main() {
	int a[]={1,2,2,3,4,1,5};
	for(int i=0;i<7;i++){
		for(int j=0;j<7;j++){
			if(a[i]==a[j]){
				cout<<a[i]<<" ";
				break;
				
			}
		}
	}
}
