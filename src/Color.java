public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJO("Naranjo");

    private final String nombreColor;

    Color(String coloor) {
        this.nombreColor = coloor;
    }

    public String getColor() {
        return nombreColor;
    }

    @Override
    public String toString() {
        return this.nombreColor;
    }
}
