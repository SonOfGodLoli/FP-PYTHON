import os
os.system("cls")

metros = int(input("metros : "))

centimetros = metros * 100.0
Pulgadas = centimetros / 2.54
Pies = Pulgadas / 12
Yardas = Pies / 3

print(f"Centimetros = {centimetros:.2f}")
print(f"Pulgadas = {Pulgadas:.2f}")
print(f"Pies = {Pies:.2f}")
print(f"Yardas = {Yardas:.2f}")
