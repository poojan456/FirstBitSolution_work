#include<iostream>

using namespace std;

int main(){
	int a[]={1,0,3,0,2,0};
	int temp[6];
	int x=0;
	for(int i=0;i<6;i++){
		if(a[i]!=0){
			temp[x]=a[i];
			x++;
			
		}
		
		
	}
	
	for(int i=0;i<6;i++){
		if(a[i]==0){
			temp[x++]=a[i];
		}
	}
	
	for(int i=0;i<x;i++){
		cout<<temp[i];
		
	}
	
}
