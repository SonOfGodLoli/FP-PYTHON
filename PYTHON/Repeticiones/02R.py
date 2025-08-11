# Desarrolle el programa que permita multiplicar dos números enteros, no utilizar el operador *.

n1 = int( input ("ingrese el numeroa multiplicar : "))
n2 = int( input ("ingrese el numero multiplicador : "))

resultado = 0
for i in range(n2):
    resultado += n1
    
print (f"El resultado es : {resultado}")