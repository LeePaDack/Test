def solution(myString, pat):
    # 대소문자를 구분하지 않기 위해 소문자로 통일
    myString = myString.lower()
    pat = pat.lower()

    # myString에서 pat이 존재하는지 확인
    if pat in myString:
        return 1
    else:
        return 0