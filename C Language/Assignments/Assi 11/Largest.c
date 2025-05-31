//WAP to Take in Two Strings and Display the Larger String without Using Built-in 
//Functions 
#include<stdio.h>
void main(){
    char s1[20];
    printf("Enter first string");
    scanf("%s",s1);
    char s2[20];
    printf("Enter second string");
    scanf("%s",s2);
    int i=0;
    while(s1[i]!='\0'){
        i++;
        
    }
    int j=0;
    while(s2[j]!='\0'){
        j++;
    }
    if(i>j){
        printf("larger string is %s",s1);
    }
    else{
        printf("larger string is %s",s2);
    }

}