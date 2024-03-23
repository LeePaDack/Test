def solution(names):
    groups = []
    while names:
        groups.append(names[:5])
        names = names[5:]
    return [group[0] for group in groups]