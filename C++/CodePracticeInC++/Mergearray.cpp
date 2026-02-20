#include<iostream>

using namespace std;

int main(){
	
	int a[]={1,2,3};
	int b[]={4,5,6};
	//int c[6];
	
	int temp[6];
	int x=0;
	for(int i=0;i<3;i++){
		temp[x]=a[i];
		x++;
		
	}
	
	for(int i=0;i<3;i++){
		temp[x++]=b[i];
	}
	
	for(int i=0;i<6;i++){
		cout<<temp[i]<<" ";
	}
	
	return 0;
	
}
