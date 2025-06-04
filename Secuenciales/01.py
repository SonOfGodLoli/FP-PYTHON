#Desarrolle el programa q determine el porcentaje de varones y mujeres
import os
os.system("cls")

varones= int(input("ingrese el total de varones : ")) 
mujeres= int(input("ingrese el total de mujeres : "))
PVarones= (100*varones)/(varones+mujeres)
PMujeres= (100*mujeres)/(varones+mujeres)
print()
print(f"El Porcentaje de varones es de {PVarones:.2f} %")
print(f"El Porcentaje de mujeres es de {PMujeres:.2f} %")
