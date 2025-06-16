#Dada una cantidad de dinero en soles, desarrolle el programa que descomponga dicha cantidad en billetes de 200, 100, 50, 20, 10 y monedas de 5, 2, 1 nuevos soles. 

import os
os.system("cls")

Dinero = int(input ("Ingrese una cantidad de dinero : "))

D200 = Dinero // 200
D100 = Dinero - ( D200 * 200 )

print(D200)
print(D100)