def solution(arr):
    result = []
    for num in arr:
        if num >= 50 and num % 2 == 0:  # 값이 50보다 크거나 같은 짝수
            result.append(num // 2)
        elif num < 50 and num % 2 != 0:  # 값이 50보다 작은 홀수
            result.append(num * 2)
        else:
            result.append(num)  # 나머지 경우는 그대로 유지
    return result