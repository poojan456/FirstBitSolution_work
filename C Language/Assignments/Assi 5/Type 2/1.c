//
// using type 2
#include<stdio.h>
int EvenOdd();
void main(){
    int x=EvenOdd();
    if(x==1){
        printf("Even");
    }
    else{
        printf("Odd");
    }

}
int EvenOdd(){
    int n=21;
    if(n%2==0){
        return 1;
    }
    else {
        return 0;
    }
    }

