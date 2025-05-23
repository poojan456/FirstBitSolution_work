
#include<stdio.h>
void random();
void main(){
    random();

}
void random(){
    float da=0.10;
    float ta=0.20;
    float hr=0.25;
    float basic;
    printf("enter the basic ");
    scanf("%d",&basic);
    if(basic<=5000){
        da=0.1*basic;
        ta=0.2*basic;
        hr=0.25*basic;
        
    }
    else{
        da=0.15*basic;
        ta=0.25*basic;
        hr=0.3*basic;
    }
    float total=da+ta+hr+basic;
    printf("total salary is %f\n",total);
}