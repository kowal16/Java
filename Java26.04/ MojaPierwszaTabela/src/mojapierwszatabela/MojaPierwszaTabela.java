package mojapierwszatabela;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class MojaPierwszaTabela extends JPanel {

    public MojaPierwszaTabela() {
        super(new GridLayout(1, 0));
        String[] kolumny = {"imię", "nazwisko", "dyscyplina", "ilość medali", "płeć"};

        Object[][] dane = {{"Maria", "Kowalska", "Kolarstwo", 5, true},
        {"Daniel", "Motylek", "Plywanie", 3, false},
        {"Kasia", "Oszczepek", "Rzut zapalka", 2, true},
        {"Mol", "Ksiazkowy", "Czytanie na odleglosc", 20, false},
        {"Ryszard", "Maly", "Sumo", 10, false}};

        final JTable tabela = new JTable(dane, kolumny);
        tabela.getColumnModel().getColumn(2).setMaxWidth(200);
        for (int i = 0; i < 3; i++) {
            tabela.getColumnModel().getColumn(i).setMinWidth(200);
        }
        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        int wiersz =  tabela.getSelectedRow();
        System.out.println(wiersz);
        
           
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("MojaPierwszaTabela");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                MojaPierwszaTabela app = new MojaPierwszaTabela();
               
                app.setOpaque(true);
                frame.setContentPane(app);
                frame.pack();
                frame.setVisible(true);
            }
        }
        );

    }
}
