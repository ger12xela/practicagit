package practicagitprogra.enums.PracticasDeEnums.src;

public class FiguraGeometrica {

    public static final int AMARILLO = 1;
    public static final int AZUL = 2;
    public static final int ROJO = 3;

    private int color;

    public FiguraGeometrica (int color){
        this.color = color;
    }

    public int getColor() {
        return color;

    }
    public void setColor(int color){
        this.color = color;
    }
}
