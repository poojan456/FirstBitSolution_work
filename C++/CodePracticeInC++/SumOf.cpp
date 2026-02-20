#include<iostream>
using namespace std;

int main(){
	
	int sum=0;
	int n;
	cout<<"enter size of array";
	cin>>n;
	int a[n];
	cout<<"Enter array element ";
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	for(int i=0;i<n;i++){
		sum=sum+a[i];
		
		
	}
	cout<<"the avg is :"<<sum/n<<endl;
	return 0;
	
}
