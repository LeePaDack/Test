def solution(my_string, s, e):
    if s < 0 or e >= len(my_string):
        return "Index out of range"
    
    reversed_substr = my_string[:s] + my_string[s:e+1][::-1] + my_string[e+1:]
    return reversed_substr