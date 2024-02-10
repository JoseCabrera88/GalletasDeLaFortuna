import javax.swing.*;
import java.awt.*;
import java.util.Random;

class GalletaDeLaFortuna {
    private static String[] mensajes = {
            "Hoy será un tu día de suerte",
            "No temas a lo desconocido",
            "El éxito te espera",
            "Nunca es tarde para empezar",
            "Tu sonrisa iluminará el día de alguien"
    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("Galleta de la Fortuna");
        JButton button = new JButton("Obten tu Mensaje");
        JLabel label = new JLabel("Dale al botón para obtener tu mensaje", SwingConstants.CENTER);
        button.addActionListener(e -> {
            Random random = new Random();
            int indice = random.nextInt(mensajes.length);
            label.setText(mensajes[indice]);
        });

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(button, constraints);
        constraints.gridy = 1;
        panel.add(label, constraints);
        frame.setSize(400, 200);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
