package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Cadastro {
    private JButton btnCadastrar;
    private JTextField txtAnuncio;
    private JTextField txtCliente;
    private JTextField txtDataInicio;
    private JTextField txtDataTermino;
    private JTextField txtInvestimento;
    private JPanel painelCadastro;


    public Cadastro(){

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String anuncio = txtAnuncio.getText();
                String cliente = txtCliente.getText();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                ParsePosition pp1 = new ParsePosition(0);
                Date inicio = formato.parse(txtDataInicio.getText(), pp1);
                SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");
                ParsePosition pp2 = new ParsePosition(0);
                Date fim = formate.parse(txtDataTermino.getText(), pp2);
                double valor = Double.parseDouble(txtInvestimento.getText());

                NovoAnuncio cria = new NovoAnuncio(anuncio, cliente, inicio, fim, valor);

                JOptionPane.showMessageDialog(null, cria.getAnuncio());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro");
        frame.setContentPane(new Cadastro().painelCadastro);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


