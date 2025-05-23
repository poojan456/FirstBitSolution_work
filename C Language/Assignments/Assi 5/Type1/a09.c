
//area of triangle
#include<stdio.h>
void triangle();
void main(){
    triangle();

}
void triangle(){
    int b,h;
    printf("enter the base ");
    scanf("%d",&b);
    printf("enter the height");
    scanf("%d",&h);
    float area=0.5*b*h;
    printf("the area of triangle is %f", area);
}