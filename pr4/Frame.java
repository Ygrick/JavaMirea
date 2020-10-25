package pr4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Frame extends JFrame {

    JButton milan_but = new JButton("AC Milan");
    JButton madrid_but = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");

    Frame(Score score) {
        super("Score");
        JPanel[] pnl = new JPanel[9];
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        milan_but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score.inc_milan();
                result.setText(score.get_score());
                last.setText(score.get_last());
                winner.setText(score.get_winer());

            }
        });
        madrid_but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score.inc_madrid();
                result.setText(score.get_score());
                last.setText(score.get_last());
                winner.setText(score.get_winer());
            }
        });

        setSize(500, 300);
        pnl[0].add(milan_but);
        pnl[2].add(madrid_but);
        pnl[1].add(result);
        pnl[4].add(last);
        pnl[7].add(winner);
        setVisible(true);
    }
}
