# Desarrolle el programa que determine la cantidad de divisores de un número entero

import os
os.system("cls")

numero = int (input ("Ingrese un numero entero : "))

contador = 0
for i in range (numero):
    if numero%(i+1)== 0:
        contador += 1
    
print(f"El numero de divisores es {contador} .")