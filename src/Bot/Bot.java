
package Bot;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bot extends JFrame {
    private JTextArea chatArea =  new JTextArea();  
    private JTextField chatBox = new JTextField();
    
    
    public Bot(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true); 
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.setTitle("ChatBot");
        frame.add(chatArea);
        frame.add(chatBox);

        //Para TextArea
        chatArea.setSize(500, 400);
        chatArea.setLocation(2,2);

        //Para TextField
        chatBox.setSize(540,30);
        chatBox.setLocation(2,500);

        chatBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


            }
        });

    }
    
    public static void main(String args[]){
        new Bot();
    }
    
}
