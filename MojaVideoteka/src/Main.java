import com.edisvrtagicipia.example.LoginF;

import javax.swing.*;
//Glavni Main gdje pozivam prvu formu koja se otvara (Login)
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginF l1 = new LoginF();
                l1.setVisible(true);
                l1.setLocationRelativeTo(null);
            }
        });
    }
}