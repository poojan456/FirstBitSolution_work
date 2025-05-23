//leap yr
#include<stdio.h>
void isLeap(int*);
void main(){
    int year;
    printf("Enter year\n");
    scanf("%d",&year);
    isLeap(&year);

}
void isLeap(int* year){
    
    if(*year%4==0 ||*year%400==0 && *year%100!=0){
        printf("Leap year");
    }
    else{
        printf("not leap yr");
    }


}