from abc import ABC, abstractmethod

class Empleado(ABC):
    def __init__(self, nombre):
        self.nombre = nombre

    @abstractmethod
    def calcular_salario_mensual(self):
        pass

    def __str__(self):
        return f"Empleado: {self.nombre}"

class EmpleadoTiempoCompleto(Empleado):
    def __init__(self, nombre, salario_anual):
        super().__init__(nombre)
        self.salario_anual = salario_anual

    def calcular_salario_mensual(self):
        return self.salario_anual / 12

    def __str__(self):
        return f"{super().__str__()}, Salario Anual: {self.salario_anual}"

class EmpleadoTiempoHorario(Empleado):
    def __init__(self, nombre, horas_trabajadas, tarifa_por_hora):
        super().__init__(nombre)
        self.horas_trabajadas = horas_trabajadas
        self.tarifa_por_hora = tarifa_por_hora

    def calcular_salario_mensual(self):
        return self.horas_trabajadas * self.tarifa_por_hora

    def __str__(self):
        return f"{super().__str__()}, Horas: {self.horas_trabajadas}, Tarifa: {self.tarifa_por_hora}"

# Programa principal
empleados = [
    EmpleadoTiempoCompleto("Carlos", 48000),
    EmpleadoTiempoCompleto("Ana", 60000),
    EmpleadoTiempoCompleto("Luis", 72000),
    EmpleadoTiempoHorario("Marta", 160, 15),
    EmpleadoTiempoHorario("José", 180, 12)
]

for e in empleados:
    print(f"{e}, Salario Mensual: {e.calcular_salario_mensual()}")