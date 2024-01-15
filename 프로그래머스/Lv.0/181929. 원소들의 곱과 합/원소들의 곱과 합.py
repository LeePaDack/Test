def solution(num_list):
    Sum = sum(num_list) ** 2
    Mul = eval('*'.join([str(n) for n in num_list]))
    return 1 if Sum > Mul else 0