public class Main {
    public static void main(String[] args) {

        Sujeito s = new Sujeito();

        Observer o1 = new ObserverMaiusculas();
        Observer o2 = new ObserverAnoAtual();
        Observer o3 = new ObserverTamanhoString();

        s.adicionarObserver(o1);
        s.adicionarObserver(o2);
        s.adicionarObserver(o3);

        System.out.println("Enviando a string: 'OpenAI'");
        s.setNovaString("OpenAI");

        System.out.println("\nEnviando a string: 'ChatGPT'");
        s.setNovaString("ChatGPT");
    }
}
