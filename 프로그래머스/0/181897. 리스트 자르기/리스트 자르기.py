def solution(n, slicer, num_list):
    a, b, c = slicer
    result = []

    if n == 1:
        result = num_list[0:b + 1]
    elif n == 2:
        result = num_list[a:]
    elif n == 3:
        result = num_list[a:b + 1]
    elif n == 4:
        result = num_list[a:b + 1:c]

    return result