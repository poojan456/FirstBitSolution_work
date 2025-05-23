#include <stdio.h>
char*Student(int);  
void main(){
    int marks;
    printf("Enter marks: ");
    scanf("%d", &marks);
    char*result=Student(marks);  
    printf("Grade:%s\n",result);
}

char* Student(int marks) {
    if(marks>75)
        return "Distinction";
    else if(marks>65)
        return "First Class";
    else if(marks>55)
        return "Second Class";
    else if(marks>=40)
        return "Pass Class";
    else
        return "Fail";
}



