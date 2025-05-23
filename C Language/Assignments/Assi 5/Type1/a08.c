// area of rectangle and perimeter using func
#include<stdio.h>
void area1();
void area2();
void main(){
    area1();
    area2();
}
int l, width;
void area1(){
    
    printf("Enter length: ");
    scanf("%d", &l);
    printf("Enter width: ");
    scanf("%d", &width);
    int area=l*width;
    
    printf("area of rectangle is %d\n",area);
    
}
void area2(){
    int perimeter = 2 * (l + width);
    printf("Perimeter of rectangle is %d\n", perimeter);
}