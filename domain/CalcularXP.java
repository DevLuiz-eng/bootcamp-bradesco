package abstraindoBootcamp.domain;

public interface CalcularXP {

    default void calcularXP() {
        System.out.println("Calculando xp");
    }
}
