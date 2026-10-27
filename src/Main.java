//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    LibretaCalificaciones libreta = new LibretaCalificaciones("Sofía Ramírez");

    System.out.println("--- Notas válidas ---");
    libreta.agregarNota(8.0);
    libreta.agregarNota(6.5);
    libreta.agregarNota(9.0);

    System.out.println("\n--- Notas inválidas ---");
    libreta.agregarNota(11.0);
    libreta.agregarNota(-2.0);

    System.out.println("\nPromedio final de " + libreta.getNombreEstudiante() + ": " + libreta.obtenerPromedio());

}
