from abc import ABC, abstractmethod
import math
import random
# Interfaz Coloreado
class Coloreado(ABC):
    @abstractmethod
    def como_colorear(self) -> str:
        pass
# Clase abstracta Figura
class Figura(ABC):
    def __init__(self, color="blanco", rellenado=False):
        self.color = color
        self.rellenado = rellenado

    @abstractmethod
    def area(self):
        pass

    @abstractmethod
    def perimetro(self):
        pass
# Clase Cuadrado
class Cuadrado(Figura, Coloreado):
    def __init__(self, color="blanco", rellenado=False, lado=1):
        super().__init__(color, rellenado)
        self.lado = lado

    def area(self):
        return self.lado * self.lado

    def perimetro(self):
        return 4 * self.lado

    def como_colorear(self) -> str:
        return "Colorear los cuatro lados"
# Clase Círculo
class Circulo(Figura):
    def __init__(self, color="blanco", rellenado=False, radio=1):
        super().__init__(color, rellenado)
        self.radio = radio

    def area(self):
        return math.pi * self.radio ** 2

    def perimetro(self):
        return 2 * math.pi * self.radio
# Programa principal
def main():
    figuras = []

    for _ in range(5):
        tipo = random.randint(0, 1)
        if tipo == 0:
            lado = random.randint(1, 10)
            figuras.append(Cuadrado(color="rojo", rellenado=True, lado=lado))
        else:
            radio = random.randint(1, 10)
            figuras.append(Circulo(color="azul", rellenado=False, radio=radio))

    # Mostrar resultados
    for f in figuras:
        print(f"Área: {f.area():.2f}, Perímetro: {f.perimetro():.2f}")
        if isinstance(f, Coloreado):
            print("Color:", f.como_colorear())
        print("------------------")

if __name__ == "__main__":
    main()
