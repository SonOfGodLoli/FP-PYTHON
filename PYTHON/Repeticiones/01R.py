# Un método para obtener el cociente y el resto de dos números es por restas sucesivas. El método consiste en restar sucesivamente el divisor del dividendo hasta obtener un resultado menor que el divisor, que será el resto de la división; el número de restas efectuadas será el cociente.


import os
os.system("cls")

n1 = int ( input ("Ingrese el dividendo : ")) #23
n2 = int ( input ("Ingrese el divisor : ")) #4

cociente = 0
resto = n1
while resto>=n2:
    cociente +=1
    resto -= n2
    
print(f"El cociente es {cociente}")
print(f"El resto es {resto}")