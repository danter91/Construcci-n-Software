loglist1 = int(input("¿Cuántos elementos tiene la lista A?: "))
A = []
for x in range(0, loglist1):
    elementA = int(input("¿Cuáles son los elementos de la lista A?: "))
    A.append(elementA)
print(A)

loglist2 = int(input("¿Cuántos elementos tiene la lista B?: "))
B = []
for x in range(0, loglist2):
    elementB = int(input("¿Cuáles son los elementos de la lista A?: "))
    B.append(elementB)
print(B)

C = []
for x in A:
    if x not in B:
        C.append(x)

for w in B:
    if w not in A:
        C.append(w)

print(C)
