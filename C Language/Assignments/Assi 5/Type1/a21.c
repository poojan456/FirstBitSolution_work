
#include<stdio.h>
void greatest();
void main(){
    greatest();

}

void greatest(){
    int a,b,c;
    printf("Enter three number:");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b){
        if(a>c){
            printf("a is greates",a);
        }
        else{
            printf("c is greatest",c);
        }
    }
    else{
        if(b>c){
            printf("b is greatest",b);
        }
        else{
            printf("c is greatest",c);
        }
    }
}