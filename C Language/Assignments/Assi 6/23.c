//Write a program to find greatest of three numbers using nested if-else. 
#include<stdio.h>
void greatest();
void main(){
    int a,b,c;
    printf("enter three positive sides :");
    scanf("%d %d %d",&a,&b,&c);

}
void greatest(int* a, int* b,int* c){
    if(*a>*b){
        if(*a>*c){
            printf("a is greates",a);
        }
        else{
            printf("c is greatest",c);
        }
    }
    else{
        if(*b>*c){
            printf("b is greatest",b);
        }
        else{
            printf("c is greatest",c);
        }
    }
}