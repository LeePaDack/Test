def solution(num_list):
    answer = num_list.copy()
    a = num_list[-1]
    b = num_list[-2]
    
    if a > b:
        answer.append(a - b)
    else:
        answer.append(a * 2)
    return answer