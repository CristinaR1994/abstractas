package mx.edu.utng.abstractas;

/**
 * Created by Juana Cristina Rodrìguez Vàzquez on 23/1/2016.
 */
public class Triangulo extends Figura {
private float base;
    private float altura;
    @Override
    public float calcularArea() {
        return (base * altura)/2;
    }
}
