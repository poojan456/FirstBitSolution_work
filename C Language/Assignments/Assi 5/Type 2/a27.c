#include<stdio.h>
int isTraingle();
void main(){
    int a=isTraingle();
    if(a==1)
    printf("its equilateral triangle");
    else if(a==2)
    printf("its isoscalen triangle");
    else
    printf("its scalen triangle");



}
int isTraingle(){
    int a,b,c;
    printf("enter three positive sides :");
    scanf("%d %d %d",&a,&b,&c);
    if(a==b&&b==c&&c==a){
        return 1;

    }
    else if(a==b ||a==c || b==c){
        return 2;
    }
    else{
        return 3; 
    }

}

