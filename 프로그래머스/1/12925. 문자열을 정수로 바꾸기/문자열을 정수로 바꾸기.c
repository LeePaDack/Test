#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>//atoi함수 헤더

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char *s)
{
    int answer = 0;
    answer = atoi(s);//atoi함수는 문자열을 정수로 변환
    return answer;
}