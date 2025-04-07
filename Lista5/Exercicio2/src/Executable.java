public abstract class Executable {
    public static final int LOAD = 10; // valor de exemplo

    public abstract boolean initialize();
    public abstract int execute();
    public abstract void close();
}
