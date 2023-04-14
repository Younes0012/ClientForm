import javax.swing.*;
import java.awt.*;

public class ClientForm extends JFrame {

    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JLabel idLabel;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel addressLabel;
    private JLabel address2Label;
    private JLabel ageLabel;
    private JLabel phoneLabel;
    private JTextField idTextField;
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField addressTextField;
    private JTextField address2TextField;
    private JTextField ageTextField;
    private JTextField phoneTextField;
    private JButton submitButton;

    public ClientForm() {
        // Créer la fenêtre principale
        super("Formulaire client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Créer le panel principal avec BorderLayout
        mainPanel = new JPanel(new BorderLayout());

        // Créer les deux panels pour les colonnes
        leftPanel = new JPanel();
        rightPanel = new JPanel();

        // Créer les composants du formulaire
        idLabel = new JLabel("ID :");
        firstNameLabel = new JLabel("Prénom :");
        lastNameLabel = new JLabel("Nom :");
        addressLabel = new JLabel("Adresse :");
        address2Label = new JLabel("Adresse 2 :");
        ageLabel = new JLabel("Âge :");
        phoneLabel = new JLabel("Téléphone :");
        idTextField = new JTextField(20);
        firstNameTextField = new JTextField(20);
        lastNameTextField = new JTextField(20);
        addressTextField = new JTextField(20);
        address2TextField = new JTextField(20);
        ageTextField = new JTextField(20);
        phoneTextField = new JTextField(20);
        submitButton = new JButton("Envoyer");

        // Ajouter les composants au panel de gauche
        GroupLayout leftLayout = new GroupLayout(leftPanel);
        leftPanel.setLayout(leftLayout);
        leftLayout.setAutoCreateGaps(true);
        leftLayout.setAutoCreateContainerGaps(true);
        leftLayout.setHorizontalGroup(leftLayout.createSequentialGroup()
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(idLabel)
                        .addComponent(firstNameLabel)
                        .addComponent(lastNameLabel)
                        .addComponent(addressLabel)
                        .addComponent(submitButton))
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(idTextField)
                        .addComponent(firstNameTextField)
                        .addComponent(lastNameTextField)
                        .addComponent(addressTextField)
                        .addComponent(submitButton)));

        leftLayout.setVerticalGroup(leftLayout.createSequentialGroup()
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(idLabel)
                        .addComponent(idTextField))
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(firstNameLabel)
                        .addComponent(firstNameTextField))
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lastNameLabel)
                        .addComponent(lastNameTextField))
                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(addressLabel)
                        .addComponent(addressTextField))
                .addComponent(submitButton));

        // Ajouter les composants au panel de droite
        GroupLayout rightLayout = new GroupLayout(rightPanel);
        rightPanel.setLayout(rightLayout);
        rightLayout.setAutoCreateGaps(true);
        rightLayout.setAutoCreateContainerGaps(true);
        rightLayout.setHorizontalGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(address2Label)
                        .addComponent(ageLabel)
                        .addComponent(phoneLabel))
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(address2TextField)
                        .addComponent(ageTextField)
                        .addComponent(phoneTextField)
                ));

        rightLayout.setVerticalGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(address2Label)
                        .addComponent(address2TextField))
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(ageLabel)
                        .addComponent(ageTextField))
                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneLabel)
                        .addComponent(phoneTextField)));

        // Ajouter les deux panels au panel principal avec BorderLayout
        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.EAST);

        // Ajouter le panel principal à la fenêtre
        getContentPane().add(mainPanel);

        // Afficher la fenêtre
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClientForm();
    }
}