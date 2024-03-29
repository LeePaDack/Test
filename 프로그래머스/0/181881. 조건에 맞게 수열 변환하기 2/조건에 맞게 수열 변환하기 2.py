def solution(arr):
    def transform(arr):
        new_arr = []
        for num in arr:
            if num >= 50 and num % 2 == 0:
                new_arr.append(num // 2)
            elif num < 50 and num % 2 == 1:
                new_arr.append(num * 2 + 1)
            else:
                new_arr.append(num)
        return new_arr
    
    seen = {}
    x = 0
    while True:
        if tuple(arr) in seen:  # 원래의 배열을 체크
            return seen[tuple(arr)]
        seen[tuple(arr)] = x
        arr = transform(arr)
        x += 1