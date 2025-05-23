

// 
#include<stdio.h>
void prime();
void main(){
    prime();
}
void prime(){
    for(int p=2;p<=100;p++){
        //int n;
        // printf("Enter any number");
        // scanf("%d",&n);
        int i=2;
        int flag=0;
        while(i<p){
            if(p%i==0){
                flag=1; 
                break;    
            }
            i++;
               
        }
        if(flag==0){
            printf("%d\n", p);
        }
        // else{
        //     printf("not prime");
        // }
    }
}