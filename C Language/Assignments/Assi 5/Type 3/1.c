// with parameter without returntype

//assignment 1
#include<stdio.h>
void isEven(int);
void main(){
    int a;
    printf("Enter the number");
    scanf("%d",&a);
    isEven(a);
    
}
void isEven(int a){
    if(a%2==0){
        printf("Even");
    }
    else{
        printf("odd");
    }

}

