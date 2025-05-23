//using type 2
#include<stdio.h>
char isVowel();

void main(){
    char g=isVowel();
    if(g=='v')
    printf("its vowel");
    else
    printf("its consonant");
}
char isVowel(){
    char p;
    printf("Enter character");
    scanf(" %c",&p);
    if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u'||p=='A'||p=='E'||p=='I'||p=='O'||p=='U'){
        return 'v';
    }
    else{
        return 'c';
    }

}