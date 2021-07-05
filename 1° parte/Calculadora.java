import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        double invest;
        /*
            Scanner read = new Scanner(System.in);
            invest = read.nextDouble();
         */
    invest = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor a ser investido: ",
            "Calculadora",JOptionPane.INFORMATION_MESSAGE));

        int [] data = {30, 100, 12, 20, 3, 40, 4};
        int [] view = {0, 0, 0, 0};
        int [] click = {0, 0, 0, 0};
        int [] share = {0, 0, 0, 0};

        int i;
        view[0] = (int)(data[0] * invest);
        for (i = 0; i < 3; i++){
            click[i] = (view[i] * data[2])/data[1];
            share[i] = (click[i] *data[4])/data[3];
            view[i+1] = share[i] * data[5];
        }
        click[i] = (view[i] * data[2])/data[1];
        int tview = 0, tclick = 0, tshare = 0;
        for (i = 0; i < data[6]; i++){
            tview += view[i];
            tclick += click[i];
            tshare += share[i];
        }

        JOptionPane.showMessageDialog(null, "Total de visualizações: " + tview + " pessoas.","Calculadora",
                JOptionPane.INFORMATION_MESSAGE);
        /*System.out.println("Total de visualizações: " + tview);
        System.out.println("Total de cliques: " + tclick);
        System.out.println("Total de compartilhamentos: " + tshare);*/
    }
}
