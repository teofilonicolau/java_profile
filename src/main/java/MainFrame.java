import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {
    private Clip clip;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }

    public MainFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Perfil - Teófilo Nicolau");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel introLabel = new JLabel("Olá! Sou o Teófilo Nicolau e estou buscando uma oportunidade de estágio.");
        introLabel.setBounds(20, 30, 400, 30);
        add(introLabel);

        JLabel linkedinLabel = new JLabel("Conecte-se comigo no LinkedIn:");
        linkedinLabel.setBounds(20, 70, 200, 30);
        add(linkedinLabel);

        JButton linkedinButton = new JButton("Meu Perfil");
        linkedinButton.setBounds(220, 70, 100, 30);
        add(linkedinButton);

        linkedinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/teofilo-nicolau/"));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

    }
} 

