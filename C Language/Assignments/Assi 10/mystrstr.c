#include<stdio.h>
#include<string.h>
void mystrstr(char*, char*);
void main(){
    char str1[]="firstBitSolution";
    char str2[]="Bit";
    mystrstr(str1,str2);
}
void mystrstr(char*str1, char*str2) {
    int i=0;
    int found=0;
    while(str1[i]!='\0'){
        if (str1[i]==str2[0]) {
            int j=0;
            int k=i;
            while(str2[j]!='\0'&&str1[k]==str2[j]) {
                j++;
                k++;
            }

            if (str2[j]=='\0') {
                found=1;
                break;
            }
        }
        i++;
    }

    if(found)
        printf("found\n");
    else
        printf("not found\n");
}



