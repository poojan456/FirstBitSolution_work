#include<iostream>
using namespace std;

int main(){
//	int a[]={1,2,3,4};
//	int n=sizeof(a)/sizeof(a[0]);
//	
//	for(int i=0;i<n;i++){
//		cout<<a[i]<<endl;
//	}

int n;
cout<<"enter size of array";
cin>>n;
int arr[n];
cout<<"enter element";

for(int i=0;i<n;i++){
	cin>>arr[i+1];
	
}
cout<<"array element are:";
for(int i=0;i<n;i++){
	cout<<arr[i+1]<<" ";
}
}
