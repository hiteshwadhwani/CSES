n, target = map(int, input().split())
arr = list(map(int, input().split()))

sorted_arr = []
for i in range(len(arr)):
    sorted_arr.append((arr[i], i))

sorted_arr.sort(key=lambda x:x[0])


def solve(i, j, x):
    while(i < j):
        if sorted_arr[i][0] + sorted_arr[j][0] > x:
            j -= 1
        elif sorted_arr[i][0] + sorted_arr[j][0] < x:
            i += 1
        else:
            return (sorted_arr[i][1], sorted_arr[j][1])
    return (-1, -1)

ans = []
for k in range(len(arr)):
    res = solve(k+1, len(arr)-1, target-sorted_arr[k][0])
    if res != (-1, -1):
        ans = [res[0]+1, res[1]+1, sorted_arr[k][1]+1]
        break

if len(ans) > 0:
    ans.sort()
    for i in ans:
        print(i, end=" ")
else:
    print("IMPOSSIBLE")








