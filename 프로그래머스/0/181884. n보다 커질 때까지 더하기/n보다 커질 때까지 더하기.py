def solution(numbers, n):
    total_sum = 0
    for i, num in enumerate(numbers):
        total_sum += num
        if total_sum > n:
            return sum(numbers[:i+1])  # 현재까지의 원소들의 합을 반환
    return sum(numbers)