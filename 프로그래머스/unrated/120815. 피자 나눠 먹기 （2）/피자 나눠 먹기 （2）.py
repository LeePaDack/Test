def solution(n):
    answer = 1
    p = 6
    while True:
        if (p*answer) % n == 0:
            break
        else:
            answer += 1
    return answer