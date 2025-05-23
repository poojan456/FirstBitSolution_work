//avg using func
#include<stdio.h>
void avg();//declaration
void main(){
    avg();
    //avg();

}
void avg(){
    int a,b,c,d,e;
    float avg;
  
    printf("enter 5 number");
    scanf("%d",&a,&b,&c,&d,&e);

     avg=(a+b+c+d+e)/5;
    printf("the average of 5 number is %f",avg);
}