def solution(my_strings, parts):
    return ''.join([my_strings[i][s:e+1] for i, (s,e) in enumerate(parts)])