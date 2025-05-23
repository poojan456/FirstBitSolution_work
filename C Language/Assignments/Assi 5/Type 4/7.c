// Calculating total salary based on basic. If basic <=5000 da, ta and hra will be 
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30% 
//respectively.

#include<stdio.h>
float TotalS(int);
void main(){
    int basic;
    printf("enter the basic ");
    scanf("%d",&basic);
    float v=TotalS(basic);
    printf("%f",v);

}
float TotalS(int basic){
    float da=0.10;
    float ta=0.20;
    float hr=0.25;
   
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
    return total;
}