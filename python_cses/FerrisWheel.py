n, x = map(int, input().split())
arr = list(map(int, input().split()))

arr.sort()

i = 0
j = n-1
count = 0

while(i < j):
    if arr[i] + arr[j] <= x:
        i += 1
    count += 1
    j -= 1

if i == j:
    count += 1
print(count)

