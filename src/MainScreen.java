import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class MainScreen extends JFrame{
    public MainScreen(){
        Color mainColor = new Color(0x389043);
        // 헥스 코드 설정 0x + 원하는 헥스코드

        // jframe    
        setTitle("casTree");
        setBounds(0, 0, 1920, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 실질적 모든 컴포넌트 패널 위에 위치
        JPanel mainP = new JPanel();
        mainP.setLayout(new BorderLayout());
        getContentPane().add(mainP);

        // 상단 바
        JPanel topBar = new JPanel();
        topBar.setBounds(0, 0, 1920, 200);
        topBar.setBackground(mainColor);
        topBar.setLayout(new BorderLayout());

        // 버튼 패널
        JPanel BtnP = new JPanel();
        BtnP.setLayout(new FlowLayout(FlowLayout.RIGHT));
        BtnP.setOpaque(false);

        // 버튼 생성
        JButton signUpBtn = createStyledBtn("Sign Up");
        JButton signInBtn = createStyledBtn("Sign In");
        BtnP.add(signUpBtn);
        BtnP.add(signInBtn);

        // 로고 생성
        JPanel ImgP = new JPanel();
        ImageIcon LogoIcon = new ImageIcon(MainScreen.class.getResource("/img/image (1).png"));
        Image scaledImg = LogoIcon.getImage().getScaledInstance(591, 273, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);

        JLabel LogoL = new JLabel(scaledIcon);
        
        ImgP.add(LogoL);

        topBar.add(BtnP, BorderLayout.EAST);
        mainP.add(topBar, BorderLayout.NORTH);
        mainP.add(ImgP, BorderLayout.CENTER);

        setVisible(true);
    }
    // signin, signup 버튼 헬퍼 메서드
    private JButton createStyledBtn(String text) {
        JButton btn = new JButton(text);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Inter", Font.PLAIN, 35));
        btn.setContentAreaFilled(false);
        btn.setForeground(Color.WHITE);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return btn;
    }
    public static void main(String[] args) {
        new MainScreen();
    }
}
