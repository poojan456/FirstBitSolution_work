//WAP to Count the Number of Vowels in a String 
#include<stdio.h>
#include<string.h>
void main(){
    char str[20];
    printf("Enter string");
    scanf("%s",str);
    int count=0;
    for(int i=0;i<strlen(str);i++){
        if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||
           str[i]=='i'||str[i]=='I'||str[i]=='o'||str[i]=='O'||
           str[i]=='u'||str[i]=='U') {
            count++;
        }

    }
    printf("%d",count);
}