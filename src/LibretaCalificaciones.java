import java.util.ArrayList;
import java.util.List;

public class LibretaCalificaciones {

    private String nombreEstudiante;
    private List<Double> notas;

    public LibretaCalificaciones(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.notas = new ArrayList<>();
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public boolean agregarNota(double nota) {

        if (nota < 0.0 || nota > 10.0) {
            System.out.println("Nota rechazada: " + nota + " está fuera del rango (0.0 a 10.0).");
            return false;
        }

        notas.add(nota);
        System.out.println("Nota " + nota + " registrada.");
        return true;
    }

    public double obtenerPromedio() {

        if (notas.isEmpty()) {
            System.out.println("Aviso: todavía no hay notas registradas.");
            return 0;
        }

        double suma = 0;
        for (double n : notas) {
            suma = suma + n;
        }

        return suma / notas.size();
    }
}