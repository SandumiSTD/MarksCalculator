import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @auther : R.P.Sandumi Tharika Dilransamie
 * @since : 5/4/2023
 **/
public class Calculator {
    private JTextField txtName;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JButton calculateButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Calculator() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int n1, n2, n3;
                int total;
                double average;

                n1 = Integer.parseInt(txtMarks1.getText());
                n2 = Integer.parseInt(txtMarks2.getText());
                n3 = Integer.parseInt(txtMarks3.getText());

                total = n1 + n2 + n3;
                txtTotal.setText(String.valueOf(total));

                average = (double) total/3;
                txtAvg.setText(String.valueOf(average));

                if(average > 50){
                    txtGrade.setText("Pass");
                }
                else{
                    txtGrade.setText("Fail");
                }


            }
        });
    }
}
