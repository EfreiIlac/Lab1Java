import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// import javax.swing.JFrame;

public class Main {
  // constructor
  public Main() {
    // create a window
    JFrame frame = new JFrame("Personal informations");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setVisible(true);

    JPanel mainPanel = new JPanel();
    frame.add(mainPanel);
    
     JLabel firstNameLegend = new JLabel("First Name");
     JTextField firstName = new JTextField(15);

     JLabel lastNameLegend = new JLabel("Last Name");
     JTextField lastName = new JTextField(15);

     JLabel emailLegend = new JLabel("Email");
     JTextField email = new JTextField(15);

     JLabel addressLegend = new JLabel("Address");
     JTextField address = new JTextField(15);

     JLabel cityLegend = new JLabel("City");
     JTextField city = new JTextField(15);

     JLabel provinceLegend = new JLabel("Province");
     JTextField province = new JTextField(15);

     ButtonGroup group = new ButtonGroup();
    JRadioButton premium = new JRadioButton("Premium membership", true);
    JRadioButton standard = new JRadioButton("Standard membership");
    JRadioButton basic = new JRadioButton("basic membership");
    group.add(premium);
    group.add(standard);
    group.add(basic);

    JButton submitButton = new JButton("submit");
    JButton resetButton = new JButton("reset");

    JLabel outputName = new JLabel("");
    JLabel outputEmail = new JLabel("");
    JLabel outputAddress = new JLabel("");
    JLabel outputMembership = new JLabel("");

    // add action to the submit button
    submitButton.addActionListener(e -> {
      // change the output
      outputName.setText("Name :" +firstName.getText() + " " + lastName.getText());
      outputEmail.setText("Email :" +email.getText());
      outputAddress.setText("Address :" +address.getText() + " " + city.getText() + " " + province.getText());
      if (premium.isSelected()) {
        outputMembership.setText("Membership :" +premium.getText());
      } else if (standard.isSelected()) {
        outputMembership.setText("Membership :" +standard.getText());
      } else if (basic.isSelected()) {
        outputMembership.setText("Membership :" +basic.getText());
      }
      frame.setVisible(true);
    });
    // add action to the reset button
    resetButton.addActionListener(e -> {
      // change the output
      firstName.setText("");
      lastName.setText("");
      email.setText("");
      address.setText("");
      city.setText("");
      province.setText("");
      outputName.setText("");
      outputEmail.setText("");
      outputAddress.setText("");
      outputMembership.setText("");
      frame.setVisible(true);
    });

    
    JLabel Titre = new JLabel("ILAC & EFREI Partnership JavaProgramming Main Lab-work - Timothée Vanuxem Adrien Tabourel Pierre-Marie Herrburger-Pietri Sasha Guillot"); 
    
    mainPanel.add(firstNameLegend);
    mainPanel.add(firstName);

    mainPanel.add(lastNameLegend);
    mainPanel.add(lastName);

    mainPanel.add(emailLegend);
    mainPanel.add(email);

    mainPanel.add(addressLegend);
    mainPanel.add(address);

    mainPanel.add(cityLegend);
    mainPanel.add(city);

    mainPanel.add(provinceLegend);
    mainPanel.add(province);

    mainPanel.add(submitButton);
    mainPanel.add(resetButton);
    mainPanel.add(premium);
    mainPanel.add(standard);
    mainPanel.add(basic);

    mainPanel.add(outputName);
    mainPanel.add(outputEmail);
    mainPanel.add(outputAddress);
    mainPanel.add(outputMembership);

    mainPanel.add(Titre);
    


  }
}




    
    