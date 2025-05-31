//write a program to scan string from user then scan a single character and search it 
//in a accepted string
#include<stdio.h>
#include<string.h>
void main(){
    char p;
    printf("Enter character\n");
    scanf("%c",&p);
    char s[20];
    printf("Enter any string\n");
        scanf("%s",s);
    int found=0;
    for(int i=0;i<strlen(s);i++){
        if(s[i]==p){
            found=1;
            break;
        } 
    }
    if(found){
        printf("Yes character found");
    }
    else{
        printf("No not found");
    }
    

}