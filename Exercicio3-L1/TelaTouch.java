
public class TelaTouch {
    private int resolucaoX, resolucaoY;

    public TelaTouch(int resolucaoX, int resolucaoY) {
        this.resolucaoX = resolucaoX;
        this.resolucaoY = resolucaoY;
    }

    public void toqueNaTela(int x, int y) {
        if (x >= 0 && x <= resolucaoX && y >= 0 && y <= resolucaoY) {
            System.out.println("Toque detectado na posição: (" + x + ", " + y + ")");
            calibrarTela();
        } else {
            System.out.println("Toque fora da área da tela.");
        }
    }

    private void calibrarTela() {
        System.out.println("Calibrando a tela para melhor precisão...");
    }
}

