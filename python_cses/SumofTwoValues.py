import sys
n , x = map(int, input().split())
arr = list(map(int, input().split()))

nums = []
for i in range(n):
    nums.append((arr[i], i))


nums.sort(key=lambda x:x[0])

i = 0
j = n-1

while(i < j):
    if(nums[i][0] + nums[j][0] > x):
        j -= 1
    elif nums[i][0] + nums[j][0] < x:
        i += 1
    else:
        print(nums[i][1]+1, nums[j][1]+1, sep=" ")
        sys.exit()

print('IMPOSSIBLE')
