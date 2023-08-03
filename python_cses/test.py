n, x = map(int, input().split())
arr = list(map(int, input().split()))

j = 0
sum = 0
count = 0
for i in range(len(arr)):
    sum += arr[i]
    if(sum == x):
        count += 1
    elif sum > x:
        while(sum > x):
            sum -= arr[j]
            j += 1
        if(sum == x):
            count += 1
print(count)
