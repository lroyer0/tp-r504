import fonctions as f

print("Hello, World! c'est léo")

while True:
    try:
        nombre = float(input("Entrez un nombre : "))
        carre = nombre ** 2
        print(f"Le carré de {nombre} est {carre}")
    except KeyboardInterrupt:
        print("\nArrêt du programme")
        break
    except ValueError:
        print("Veuillez entrer un nombre valide")
