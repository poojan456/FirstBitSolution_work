#include<iostream>
using namespace std;

int recPrb(int n){
	if(n==1)
	return 1;
	
return n*recPrb(n-1);
	
}
int main(){
	int n=5;
	cout<<recPrb(n);
	return 0;
	
}
