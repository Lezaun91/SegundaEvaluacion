package Poo.ejercicios.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        Robot robot2 = new Robot("Robocop","Ultimate",20);
        Robot robot3 = new Robot("ankawa", "correa");

        System.out.println(robot2.nombre + robot2.modelo );
        System.out.println(robot3.nombre + robot3.modelo + robot3.duracion);

    }
}
