n, m = map(int, input().split())
price = list(map(int, input().split()))
customers = list(map(int, input().split()))

c = []

for i in range(m):
    c.append((customers[i], i))

price.sort(reverse=True)
c.sort(key=lambda x:x[0], reverse=True)

# print(price)
# print(c)

res = []

j = 0
for i in range(n):
    if c[j][0] >= price[i]:
        res.append((c[j][1], price[i]))
        j += 1

while(j < m):
    res.append((c[j][1], -1))
    j += 1


res.sort(key=lambda x:x[0])
for i in res:
    print(i[1])

