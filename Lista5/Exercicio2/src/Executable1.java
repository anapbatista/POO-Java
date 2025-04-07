public interface Executable1 {
    int LOAD = 10; // em interfaces, todos os campos são implicitamente public static final

    boolean initialize();
    int execute();
    void close();
}
