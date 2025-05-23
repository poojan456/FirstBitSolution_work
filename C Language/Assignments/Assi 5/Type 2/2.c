
// type 2
#include<stdio.h>
int Leap();
void main(){
    //Leap();
    if(Leap()==1){
        printf("Leap year");
    }
    else{
        printf("Not Leap year");
    }
}
int Leap(){
    int year;
    printf("Enter year\n");
    scanf("%d",&year);
    if(year%4==0 ||year%400==0 && year%100!=0){
        return 1;
    }
    else{
        return 0;
    }
}