n, x = map(int, input().split())
arr = list(map(int, input().split()))

d = {}
d[0] = 1
res = 0

sum = 0

for i in arr:
    sum += i
    key = sum - x

    if key in d.keys():
        res += d[key]
    
    if sum in d.keys():
        d[sum] = d[sum]+1
    else:
        d[sum] = 1
print(res)

    


