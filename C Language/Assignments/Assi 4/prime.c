
//Print prime number in the given range 1 to n? 
#include<stdio.h>
void main(){
    for(int p=2;p<=100;p++){
   
    int i=2;
    int flag=0;
    while(i<p){
        if(p%i==0){
            flag=1; //not prime
            break;    
        }
        i++;
           
    }
    if(flag==0){
        printf("%d\n", p);
    }
    
   
   }
}