//Write a C program to input the length and width of a rectangle and find its perimeter. 
#include<stdio.h>
int main() {
    int l, width;
    printf("Enter length: ");
    scanf("%d", &l);
    printf("Enter width: ");
    scanf("%d", &width);
    int area=l*width;
    int perimeter = 2 * (l + width);
    printf("area of rectangle is %d\n",area);
    printf("Perimeter of rectangle is %d\n", perimeter);
    return 0;
}
