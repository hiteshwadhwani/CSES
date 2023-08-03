n  = int(input())
time = []

for i in range(n):
    time.append(tuple(map(int, input().split())))

time.sort(key=lambda x: x[1])

start = time[0][0]
end = time[0][1]

count = 1
for i in range(1, n):
    if time[i][0] >= end:
        start = time[i][0]
        end = time[i][1]
        count += 1
    else:
        end = min(end, time[i][1])
print(count)
