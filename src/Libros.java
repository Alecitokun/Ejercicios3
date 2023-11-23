public class Libros {
    public static void main(String[] args) {
        // Ejemplo de uso
        Libro libro1 = new Libro("Clean Code", "Robert C. Martin");
        libro1.setPrecio(76.85);
        libro1.imprimirInfo();

        LibroTexto libroTexto1 = new LibroTexto("Piensa y Hazte Rico", "Napoleon Hill", "Economia");
        libroTexto1.setPrecio(65.19);
        libroTexto1.imprimirInfo();

        LibroUNI libroUN1 = new LibroUNI("Design Patterns", "Erich Gamma", "Programacion", "Facultad de Tecnologia");
        libroUN1.setPrecio(69.09);
        libroUN1.imprimirInfo();

        Novela novela1 = new Novela("Don Quijote de la Mancha", "Miguel de Cervantes", "Satira");
        novela1.setPrecio(39.90);
        novela1.imprimirInfo();
    }
}
