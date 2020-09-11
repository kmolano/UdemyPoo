public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJO("Naranjo");

    private final String nombreColor;

    Color(String coolor) {
        this.nombreColor = coolor;
    }

    public String getColor() {
        return nombreColor;
    }

    @Override
    public String toString() {
        return this.nombreColor;
    }
}
