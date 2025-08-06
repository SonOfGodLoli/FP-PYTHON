# En  un  instituto  los  cursos  de  matemática,  física  y  química  se  evalúan  en  base  a  tres  prácticas calificadas, examen parcial y final. Cada práctica tiene un peso dado. Desarrolle el programa que determine el promedio final del curso y su condición de aprobado / desaprobado dado que la nota mínima es de 13.

import os
os.system("cls")

nota1 = int (input(" Ingrese su practica 1: "))
nota2 = int (input(" Ingrese su practica 2: "))
nota3 = int (input(" Ingrese su practica 3: "))
Parcial = int (input(" Ingrese la nota de su parcial: "))
Final = int (input(" Ingrese la nota de su Final: "))
curso = input (" Ingrese el curso al que pertencen estas notas (M / F / Q) : ")

if curso == "M" or curso == "m":
    promedio = (nota1*0.10) + (nota2*0.20) + (nota3*0.10) + (Parcial*0.30) + (Final*0.30)
elif curso == "F" or curso == "f":
    promedio = (nota1*0.20) + (nota2*0.20) + (nota3*0.20) + (Parcial*0.20) + (Final*0.20)
else:
    promedio = (nota1*0.10) + (nota2*0.30) + (nota3*0.10) + (Parcial*0.25) + (Final*0.25)


print (f"El promedio es {promedio:.2f} , esta { "Aprobado" if promedio>=13 else "Desaprobado"}")