import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CalculatorGUI extends JFrame {
	
	public JTextField in1;
	public JTextField in2;
	public JLabel answer;
	
	public CalculatorGUI() {
        initGUI();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");
        setSize(200, 200);
        setResizable(true);
        setLocationRelativeTo(null);
        
        
        pack();
    }

	private void initGUI() {
		
		
		JLabel titleLabel = new JLabel("Calculator");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        Font titleFont = new Font(Font.SERIF, Font.PLAIN, 32);
        titleLabel.setFont(titleFont);
        add(titleLabel, BorderLayout.PAGE_START);
        
        
        //number panel set-up
        JPanel numberInPanel = new JPanel();
        numberInPanel.setLayout(new GridLayout(2, 2));
        numberInPanel.setPreferredSize(new Dimension(250, 75));
        numberInPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(numberInPanel, BorderLayout.LINE_START);
        
        JLabel num1 = new JLabel("First Number: ");
        numberInPanel.add(num1);
             
        in1 = new JTextField(10);
        numberInPanel.add(in1);
        
        JLabel num2 = new JLabel("Second Number: ");
        numberInPanel.add(num2);
        
        in2 = new JTextField(10);
        numberInPanel.add(in2);
        
    
        
        //set-up button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2));
        buttonPanel.setPreferredSize(new Dimension (300, 50));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(buttonPanel, BorderLayout.LINE_END);
        
        
        //average button set-up
        JButton averageBtn = new JButton("Average");
        averageBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  calcAvg();
            }
        });
        buttonPanel.add(averageBtn);
        
        
        //factorial button set-up
        JButton factorialBtn = new JButton("Factorial");
        factorialBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  calcFactorial();
            }
        });
        buttonPanel.add(factorialBtn);
        
        
        //higher number button set-up
        JButton higherBtn = new JButton("Higher");
        higherBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  calcHigher();
            }
        });
        buttonPanel.add(higherBtn);
        
        
        
      //percent change button set-up
        JButton perChangeBtn = new JButton("Percent Change");
        perChangeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  calcPerChange();
            }
        });
        buttonPanel.add(perChangeBtn);
        
        
        
        answer = new JLabel("Answer: ");
        answer.setPreferredSize(new Dimension (500, 100));
        Font answerFont = new Font(Font.SERIF, Font.PLAIN, 20);
        answer.setFont(answerFont);
        add(answer, BorderLayout.PAGE_END);
       
        
	}

	private void calcHigher() {
		// TODO Auto-generated method stub
		
	}

	private void calcPerChange() {
		// TODO Auto-generated method stub
		
	}

	private void calcFactorial() {
		String integer = in1.getText();
		int factInt = Integer.parseInt(integer);
		while(factInt != 1) {
			factInt = factInt*(factInt-1);
			factInt--;
		}
		answer.setText("The factorial is: " + factInt);
			
	}
		
	

	private void calcAvg() {
		double x = Double.parseDouble(in1.getText());
		double y = Double.parseDouble(in2.getText());
		
		double avg = (x + y)/2;
		
		answer.setText("Average is: " + avg);
		
		
		
	}

	public static void main(String[] args) {
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch (Exception e) {
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorGUI();
            }
        });

	}

}
