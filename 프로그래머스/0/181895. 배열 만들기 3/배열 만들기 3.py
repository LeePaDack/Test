def solution(arr, intervals):
    # 첫 번째 구간과 두 번째 구간의 값을 가져와서 새로운 배열 생성
    result = arr[intervals[0][0]:intervals[0][1] + 1] + arr[intervals[1][0]:intervals[1][1] + 1]
    return result