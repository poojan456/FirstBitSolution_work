#include<iostream>

using namespace std;


int main(){
	int a[]={3,2,1,5,6};  // 1,2,3,4,5,6
	for(int i=0;i<5;i++){
		
		for(int j=0;j<5;j++){
			
			if(a[i]<a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		
		
		
		
	}
	
	int n=sizeof(a)/sizeof(a[0]);
	
	
	for(int i=0;i<5;i++){
		cout<<a[i]<<" ";
		
	}
	cout<<"second largest elment is "<<a[n-2];
}
