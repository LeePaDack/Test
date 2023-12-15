str = input()
result=''

for s in str:
    if s.isupper():
        result += s.lower()
    elif s.islower():
        result += s.upper()
    else:
        result += s
print(result)