import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
// import javax.swing.SwingUtilities;
import javax.swing.plaf.DimensionUIResource;

public class Excel {
  // Excel is a window 
  // constructor
  public Excel() {
    // create a window
    JFrame frame = new JFrame("Excel");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);

    JPanel mainPanel = new JPanel();
    

    // create a legend for the button
    JLabel legend = new JLabel("Type some numbers separated by spaces");
    // Add an input
    JTextField input = new JTextField("");
    input.setPreferredSize(new DimensionUIResource(100, 20));
    JTextField output = new JTextField();
    
    // Add 4 radios buttons with legends to switch between operations (Sum, average, max and min)
    JRadioButton sButton = new JRadioButton("Sum",true);
    JRadioButton aButton = new JRadioButton("Average");
    JRadioButton mButton = new JRadioButton("Max");
    JRadioButton miButton = new JRadioButton("Min");
    // create a button group
    ButtonGroup group = new ButtonGroup();
    group.add(sButton);
    group.add(aButton);
    group.add(mButton);
    group.add(miButton);
    
    // Add a button to calculate the result
    JButton calcButton = new JButton("Calculate");
    
    
    

    // add action to the button
    calcButton.addActionListener(e -> {
      // get the input
      String inputText = input.getText();
      // parse the input
      String[] numbers = inputText.split(" ");
      // in case of sum
      if (sButton.isSelected()) {
        int sum = 0;
        for (String number : numbers) {
          sum += Integer.parseInt(number);
        }
        output.setText(String.valueOf(sum));
      }
      // in case of average
      if (aButton.isSelected()) {
        int sum = 0;
        for (String number : numbers) {
          sum += Integer.parseInt(number);
        }
        output.setText(String.valueOf(sum / numbers.length));
      }
      // in case of max
      if (mButton.isSelected()) {
        int max = Integer.parseInt(numbers[0]);
        for (String number : numbers) {
          if (Integer.parseInt(number) > max) {
            max = Integer.parseInt(number);
          }
        }
        output.setText(String.valueOf(max));
      }
      // in case of min
      if (miButton.isSelected()) {
        int min = Integer.parseInt(numbers[0]);
        for (String number : numbers) {
          if (Integer.parseInt(number) < min) {
            min = Integer.parseInt(number);
          }
        }
        output.setText(String.valueOf(min));
      }
      // refresh the frame visibility
      frame.setVisible(true);

    });


    mainPanel.add(legend);
    mainPanel.add(input);
    mainPanel.add(calcButton);
    mainPanel.add(output);
    mainPanel.add(sButton);
    mainPanel.add(aButton);
    mainPanel.add(mButton);
    mainPanel.add(miButton);
    frame.add(mainPanel);
    frame.setVisible(true);
    // SwingUtilities.updateComponentTreeUI(frame);
  } 
}