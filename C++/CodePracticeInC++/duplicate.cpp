#include<iostream>

using namespace std;


int main(){
	
	int a[]={1,2,2,1,4,5};
	
		
	for(int i=0;i<6;i++){
		int count=0;
	
		for(int j=0;j<6;j++){
			if(a[i]==a[j]){
				count++;
				
				
			}
			
		}
		
		
		if (count > 1) {
            bool alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (a[k] == a[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (!alreadyPrinted) {
                cout << a[i] << " ";
            }
            
            
         }
		
		
		
	}
	
//	for(int i=0;i<6;i++){
//		if(count>1){
//				cout<<a[i]<<" ";
//				break;
//			}
//	}
}
