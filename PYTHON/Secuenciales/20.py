#Dada una cantidad de dinero en soles, desarrolle el programa que descomponga dicha cantidad en billetes de 200, 100, 50, 20, 10 y monedas de 5, 2, 1 nuevos soles. 

import os
os.system("cls")

Dinero = int(input ("Ingrese una cantidad de dinero : "))

D200 = Dinero // 200
Dinero = Dinero % 200

D100 = Dinero // 100
Dinero = Dinero % 100

D50 = Dinero // 50
Dinero = Dinero % 50

D20 = Dinero // 20
Dinero = Dinero % 20

D10 = Dinero // 10
Dinero = Dinero % 10

D5 = Dinero // 5
Dinero = Dinero % 5

D2 = Dinero // 2
Dinero = Dinero % 2

D1 = Dinero // 1
Dinero = Dinero % 1




print(D200)
print(D100)
print(D50)
print(D20)
print(D5)
print(D2)
print(D1)