def solution(num_list):
    total_operations = 0
    
    for num in num_list:
        while num != 1:
            if num % 2 == 0:
                num //= 2
            else:
                num -= 1
                num //= 2
            total_operations += 1
    
    return total_operations