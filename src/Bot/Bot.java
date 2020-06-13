
package Bot;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bot extends JFrame {
    private JTextArea chatArea =  new JTextArea();  
    private JTextField chatBox = new JTextField();
    
    
    public Bot() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setTitle("ChatBot");
        frame.add(chatArea);
        frame.add(chatBox);

        //Para TextArea
        chatArea.setSize(500, 400);
        chatArea.setLocation(2, 2);

        //Para TextField
        chatBox.setSize(540, 30);
        chatBox.setLocation(2, 500);

        chatBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String gtext = chatBox.getText().toLowerCase();
                chatArea.append("Você -->" + gtext + "\n");
                chatBox.setText("");

                if (gtext.contains("oi")) {
                    bot("Ola");
                } else {
                    int rand = (int) (Math.random() + 3 + 1);
                    if (rand == 1) {
                        bot("Eu não entendo você");
                    } else if (rand == 2) {
                        bot("Eu não entendo você");
                    } else if (rand == 1) {
                        bot("Por favor tente de novo");
                    }
                    }

                if (gtext.contains("como")) {
                    bot("Ola");
                } else {
                    int rand = (int) (Math.random() + 3 + 1);
                    if (rand == 1) {
                        bot("Eu não entendo você");
                    } else if (rand == 2) {
                        bot("Eu não entendo você");
                    } else if (rand == 1) {
                        bot("Por favor tente de novo");
                    }
                }
                }
        });
    }
    private void bot(String string){
        chatArea.append("BOT -->" +string+ "\n");
        }

    
    public static void main(String args[]){
        new Bot();
    }
    
}
