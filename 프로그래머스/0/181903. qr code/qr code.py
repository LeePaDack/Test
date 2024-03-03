def solution(q, r, code):
    return ''.join([j for i, j in enumerate(code) if i % q == r])