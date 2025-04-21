#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
char* solution(int num) {
    // 리턴할 값은 메모리를 동적 할당해주세요
    char* answer = (char*)malloc(sizeof(char));
    // return 할 answer를 동적할당, malloc과 sizeof로 크기 결정과 할당 실행.
    if(num%2==0){ // num이 짝수면 answer에 Even 입력, num이 0일때도 여기에 해당한다.
        answer = "Even";
    }else{ // 그외에는 Odd 입력
        answer = "Odd";
    }
    return answer;
}