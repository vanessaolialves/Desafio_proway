package forms;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NovoAnuncio {
    String nomeAnuncio;
    String cliente;
    Date dataInicio;
    Date dataFim;
    double invest;
    long tempo;
    double investTotal;
    int view;
    int click;
    int share;

    public NovoAnuncio(String name, String cliente, Date start, Date end, double invest){
        this.nomeAnuncio = name;
        this.cliente = cliente;
        this.dataInicio = start;
        this.dataFim = end;
        this.invest = invest;
        this.tempo = (end.getTime() - start.getTime())/(1000*60*60*24);
        this.investTotal = tempo * invest;
        this.view = 0;
        this.click = 0;
        this.share = 0;

        int [] data = {30, 100, 12, 20, 3, 40, 4};
        int [] tview = {0, 0, 0, 0};
        int [] tclick = {0, 0, 0, 0};
        int [] tshare = {0, 0, 0, 0};

        int i;
        tview[0] = (int)(data[0] * investTotal);
        for (i = 0; i < 3; i++){
            tclick[i] = (tview[i] * data[2])/data[1];
            tshare[i] = (tclick[i] *data[4])/data[3];
            tview[i+1] = tshare[i] * data[5];
        }
        tclick[i] = (tview[i] * data[2])/data[1];
        for (i = 0; i < data[6]; i++){
            view += tview[i];
            click += tclick[i];
            share += tshare[i];
        }
    }

    public String getAnuncio(){
        String answer = "";
        answer += "Nome do anuncio: " + nomeAnuncio;
        answer += "\nCliente: " + cliente;
        answer += "\nData de início: " + dataInicio;
        answer += "\nData de fim: " + dataFim;
        answer += "\nInvestimento por dia: R$" + invest;
        answer += "\nTempo: " + tempo;
        answer += "\nValor investido: " + investTotal;
        answer += "\nTotal de visualizações: " + view;
        answer += "\nTotal de cliques: " + click;
        answer += "\nTotal de compartilhamentos: " + share;
        answer += "\n";

        return answer;
    }
}
