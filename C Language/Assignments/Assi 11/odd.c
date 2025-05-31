//WAP to Remove the Characters of Odd Index Values in a String
#include<stdio.h>
#include<string.h>
void main(){
    char s[50];
    printf("Enter any string");
    scanf("%s",s);
    int j=0;
    for(int i=0;i<strlen(s);i++){
        if(i%2==0){
            s[j]=s[i];
             j++;

        }
       
    }
     s[j]='\0'; 
    printf("%s",s);

}