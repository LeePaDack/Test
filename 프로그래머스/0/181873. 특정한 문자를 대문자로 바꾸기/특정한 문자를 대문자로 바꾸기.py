def solution(my_string, alp):
    result = ""
    for char in my_string:
        if char == alp:
            result += char.upper()
        else:
            result += char
    return result