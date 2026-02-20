#include<iostream>

using namespace std;
int main(){
	

int a[]={1,2,4,5,6};
int n=6;
int sum=0;


for(int i=0;i<n-1;i++){
	sum=sum+a[i];
	
}
int total=n*(n+1)/2;
int missing=total-sum;
cout<<missing;


}




