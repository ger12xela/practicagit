package practicagitprogra.enums.PracticasDeEnums.src;

public enum Color {
    AMARILLO (1, "amarillo"),
    AZUL(2, "Azul"),
    ROJO(3, "Rojo"),;
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int numero;
    private String nombre;

    private Color (int numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;
    }

    public static Color valueOf(int numero){
        switch (numero){
            case 1:
                return AMARILLO;
            case 2:
                return AZUL;
            case 3:
                return ROJO;
            default:
                throw new AssertionError();
        }
    }
}
