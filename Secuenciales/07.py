#

import os
os.system("cls")

base = int ( input ( "Base = " ))
altura = int ( input ( "Altura = " ))

area = base * altura
perimetro = 2 * ( base + altura)

print ( f"Perimetro = {perimetro:.2f} " )
print ( f"Area = {area:.2f} " )
