package EmptyInterface;
public class TriangleMemento implements Memento {
    final private float a;
    final private float b;
    final private float c;

    public TriangleMemento(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float[] getState(){
        return new float[]{a,b,c};
    }
}
