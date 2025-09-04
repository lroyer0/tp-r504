def puissance(a, b):
    if not type(a) is int:
        raise TypeError("Seuls les entiers sont autorisés")
    if not type(b) is int:
        raise TypeError("Seuls les entiers sont autorisés")

    # Cas limite : 0^x avec x < 0 est indéfini
    if a == 0 and b < 0:
        raise ValueError("0 ne peut pas être élevé à une puissance négative")

    return a ** b
