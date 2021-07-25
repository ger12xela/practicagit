package practicagitprogra.enums.PracticasDeEnums.src;

public class FiguraGeometrica {
    /*

    public static final int AMARILLO = 1;
    public static final int AZUL = 2;
    public static final int ROJO = 3;

    private int color;
    */
    private Color color;

    public FiguraGeometrica (Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;

    }
    public void setColor(Color color){
        this.color = color;
    }


    public void imprimirDatos() {
            System.out.println(color.getNombre());

        
    }

}
