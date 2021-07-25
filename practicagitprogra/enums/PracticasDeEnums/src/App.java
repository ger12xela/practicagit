package practicagitprogra.enums.PracticasDeEnums.src;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("1, AMARILLO");
        System.out.println("2, AZUL");
        System.out.println("3, ROJO");
        
        int opcion = 1; //usuario lo ingreso

        FiguraGeometrica figura = new FiguraGeometrica(opcion);
        
    }
}
