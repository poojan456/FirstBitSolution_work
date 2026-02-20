#include<iostream>

using namespace std;
int main(){

	int a[]={2,3,4,51,6,3,1};
		//int min=a[0];
	
	int evenCount=0;
	int oddCount=0;
	
   for(int i=0;i<7;i++){
   	if(a[i]%2==0){
   		evenCount++;
   		
   		
	   }
	   else{
	   	oddCount++;
	   	
	   	
	   }
   }
   
   cout<<"event count is :"<<evenCount;
   cout<<"odd count is :"<<oddCount;
   
	
}
