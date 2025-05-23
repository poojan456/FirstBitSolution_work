#include<stdio.h>
void disc();
void main(){
    disc();

}
void disc(){
    int a,b,c;
    printf("enter three positive sides :");
    scanf("%d %d %d",&a,&b,&c);
    if(a==b&&b==c&&c==a){
        printf("its equilateral triangle");

    }
    else if(a==b ||a==c || b==c){
        printf("its isoscalen triangle");
    }
    else{
        printf("its scalen triangle");
    }
 
}