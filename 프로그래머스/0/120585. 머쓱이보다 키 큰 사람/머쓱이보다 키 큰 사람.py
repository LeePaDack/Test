def solution(array, height):
    count = [i for i in array if i > height]
    return len(count)