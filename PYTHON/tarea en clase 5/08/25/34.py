# El índice de masa corporal (IMC) permite medir el grado de sobrepeso u obesidad de una persona, se  calcula  de  la  forma  IMC  =  peso  /  estatura2  Kg  /  m2,  el  resultado  se  muestra  en  la  tabla. Desarrolle el programa que calcule el IMC de una persona.

import os
import math
os.system("cls")

peso = float( input("ingrese su peso en kg : "))
estatura = float (input ("ingrese su altura en m :  "))

IMC = peso/(math.pow (estatura,2))
if  IMC<20 :
    Grado = "Delgado"
elif IMC<25:
    Grado = "Normal"
elif IMC<28:
    Grado = "Sobrepeso"
else:
    Grado = "Obesidad"

print (f" Su IMC es de {IMC:.2f} y su Grado de Obesidad es de {Grado}.")