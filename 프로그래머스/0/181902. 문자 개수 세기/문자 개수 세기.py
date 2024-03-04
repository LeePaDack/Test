def solution(my_string):
    result = [0] * 52

    for char in my_string:
        if 'A' <= char <= 'Z':  
            result[ord(char) - ord('A')] += 1
        elif 'a' <= char <= 'z':  
            result[ord(char) - ord('a') + 26] += 1

    return result