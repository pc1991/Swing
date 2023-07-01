import javax.swing.*;

public class Swing {
    Swing() {
        JFrame f = new JFrame();

        JLabel Name = new JLabel("Name");
        Name.setBounds(20, 50, 80, 20);

        JLabel Age = new JLabel("Age");
        Age.setBounds(20, 80, 80, 20);

        JLabel Hometown = new JLabel("Hometown");
        Hometown.setBounds(20, 110, 110, 20);

        JTextField NameTF = new JTextField();
        NameTF.setBounds(120, 50, 100, 20);

        JTextField AgeTF = new JTextField();
        AgeTF.setBounds(120, 80, 100, 20);

        JTextField HometownTF = new JTextField();
        HometownTF.setBounds(120, 110, 100, 20);

        JButton sbmt = new JButton("Submit");
        sbmt.setBounds(20, 160, 100, 30);

        JButton reset = new JButton("Reset");
        reset.setBounds(120, 160, 100, 30);

        f.add(Name);
        f.add(Age);
        f.add(Hometown);
        f.add(NameTF);
        f.add(AgeTF);
        f.add(HometownTF);
        f.add(sbmt);
        f.add(reset);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Swing s = new Swing();
    }
}