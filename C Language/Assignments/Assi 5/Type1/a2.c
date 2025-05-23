
#include<stdio.h>
void leap();
void main(){
    leap();
}
void leap(){
    int year;
    printf("Enter year\n");
    scanf("%d",&year);
    if(year%4==0 ||year%400==0 && year%100!=0){
        printf("Leap year");
    }
    else{
        printf("not leap yr");
    }
}