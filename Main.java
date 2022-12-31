import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new RockPaperScissor();
    }
}
class RockPaperScissor extends JFrame {
    JPanel txt_pan,rock_pan,paper_pan,scissor_pan,player_pan,computer_pan,playagain_pan;
    JLabel txt_label,player_label,computer_label,player_score,computer_score;
    private int player_count = 0;
    private int computer_count = 0;


    RockPaperScissor(){
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(520,430);
        this.getContentPane().setBackground(new Color(0xFFFBEB));
        this.setResizable(false);//turn off the maximize option
        this.setTitle("Rock Paper Scissor");
        this.setLocationRelativeTo(null);

//============================text_panel============================================
        txt_pan = new JPanel();
        txt_pan.setBounds(0,0,520,40);
        txt_pan.setBackground(new Color(0xF8EDE3));
        txt_pan.setLayout(new BorderLayout());
        this.add(txt_pan);
        txt_label = new JLabel("Rock Paper Scissor");
        txt_label.setHorizontalAlignment(JLabel.CENTER);
        txt_label.setOpaque(true);
        txt_label.setBackground(new Color(0xD0B8A8));
        txt_label.setFont(new Font("Roboto Slab", Font.BOLD, 30));
        txt_pan.add(txt_label);
//============================player_panel============================================

        player_pan = new JPanel();
        player_pan.setBounds(45,50,150,100);
        player_pan.setBackground(Color.GREEN);
        player_pan.setLayout(new BorderLayout());
        this.add(player_pan);
        player_label = new JLabel();
        player_label.setOpaque(true);
        player_label.setHorizontalAlignment(JLabel.CENTER);
        player_label.setBackground(new Color(0xDFD3C3));
        player_label.setFont(new Font("Roboto Slab", Font.BOLD, 35));
        player_pan.add(player_label);

//===========================computer_panel=============================================

        computer_pan = new JPanel();
        computer_pan.setBounds(315,50,150,100);
        computer_pan.setBackground(Color.CYAN);
        computer_pan.setLayout(new BorderLayout());
        this.add(computer_pan);
        computer_label = new JLabel();
        computer_label.setOpaque(true);
        computer_label.setHorizontalAlignment(JLabel.CENTER);
        computer_label.setBackground(new Color(0xDFD3C3));
        computer_label.setFont(new Font("Roboto Slab", Font.BOLD, 35));
        computer_pan.add(computer_label);

//====================player_score====================================================
        player_score = new JLabel("You : 0");
        player_score.setBounds(45,190,150,40);
        player_score.setOpaque(true);
        player_score.setHorizontalAlignment(JLabel.CENTER);
        player_score.setBackground(new Color(0xE1D7C6));
        player_score.setFont(new Font("Roboto Slab", Font.BOLD, 15));
        this.add(player_score);
//==================computer_score======================================================
        computer_score = new JLabel("Computer : 0");
        computer_score.setBounds(315,190,150,40);
        computer_score.setOpaque(true);
        computer_score.setHorizontalAlignment(JLabel.CENTER);
        computer_score.setBackground(new Color(0xE1D7C6));
        computer_score.setFont(new Font("Roboto Slab", Font.BOLD, 15));
        this.add(computer_score);
//================================rock_button========================================

        rock_pan = new JPanel();
        rock_pan.setBounds(45,280,120,80);
        rock_pan.setBackground(Color.BLUE);
        rock_pan.setLayout(new BorderLayout());
        this.add(rock_pan);
        JButton rock_btn = new JButton("Rock");
        rock_pan.add(rock_btn);
        rock_btn.setFocusable(false);
        rock_btn.setFont(new Font("Roboto Slab", Font.BOLD, 20));
        rock_btn.setBackground(new Color(0xDFD3C3));
        rock_btn.setForeground(Color.BLACK);
        rock_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==rock_btn){
                    String[] com = {"Rock", "Paper", "Scissor"};
                    Random rand = new Random();
                    int comp = rand.nextInt(com.length);
                    String computer = com[comp];

                    computer_label.setText(computer);
                    player_label.setText("Rock");
                }
                check();

            }
        });


//============================paper_button============================================

        paper_pan = new JPanel();
        paper_pan.setBounds(195,280,120,80);
        paper_pan.setBackground(Color.BLACK);
        paper_pan.setLayout(new BorderLayout());
        this.add(paper_pan);
        JButton paper_btn = new JButton("paper");
        paper_pan.add(paper_btn);
        paper_btn.setFocusable(false);
        paper_btn.setFont(new Font("Roboto Slab", Font.BOLD, 20));
        paper_btn.setBackground(new Color(0xDFD3C3));
        paper_btn.setForeground(Color.BLACK);
        paper_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==paper_btn){
                    String[] com = {"Rock", "Paper", "Scissor"};
                    Random rand = new Random();
                    int comp = rand.nextInt(com.length);
                    String computer = com[comp];

                    computer_label.setText(computer);
                    player_label.setText("Paper");
                }check();
            }
        });

//===============================scissor_button=========================================

        scissor_pan = new JPanel();
        scissor_pan.setBounds(345,280,120,80);
        scissor_pan.setBackground(Color.green);
        scissor_pan.setLayout(new BorderLayout());
        this.add(scissor_pan);
        JButton scissor_btn = new JButton("scissor");
        scissor_pan.add(scissor_btn);
        scissor_btn.setFocusable(false);
        scissor_btn.setFont(new Font("Roboto Slab", Font.BOLD, 20));
        scissor_btn.setBackground(new Color(0xDFD3C3));
        scissor_btn.setForeground(Color.BLACK);
        scissor_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==scissor_btn){
                    String[] com = {"Rock", "Paper", "Scissor"};
                    Random rand = new Random();
                    int comp = rand.nextInt(com.length);
                    String computer = com[comp];

                    computer_label.setText(computer);
                    player_label.setText("Scissor");
                }check();
            }
        });

//=============================play again button===========================================

        playagain_pan = new JPanel();
        playagain_pan.setBounds(205,190,100,40);
        playagain_pan.setBackground(Color.green);
        playagain_pan.setLayout(new BorderLayout());
        this.add(playagain_pan);
        JButton playagain_btn =new JButton("Play Again");
        playagain_btn.setFocusable(false);
        playagain_btn.setBackground(new Color(0xDFD3C3));
        playagain_pan.add(playagain_btn);
        playagain_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==playagain_btn){
                    player_label.setText("");
                    computer_label.setText("");
                    txt_label.setText("Rock Paper Scissor");
                    player_score.setText("You : 0");
                    computer_score.setText("Computer : 0");
                }
            }
        });
//===========================conditions=============================================

    }
    public void check(){
        if (player_label.getText().equals("Rock") && computer_label.getText().equals("Rock")){
            txt_label.setText("Oh no! It's Tie...");
        }
        if (player_label.getText().equals("Paper") && computer_label.getText().equals("Paper")){
            txt_label.setText("Oh no! It's Tie...");
        }
        if (player_label.getText().equals("Scissor") && computer_label.getText().equals("Scissor")){
            txt_label.setText("Oh no! It's Tie...");
        }
        if (player_label.getText().equals("Rock") && computer_label.getText().equals("Scissor")){
            txt_label.setText("Congratulation! You win...");
            player_count++;
            player_score.setText(String.valueOf("You : "+player_count));
        }
        if (player_label.getText().equals("Paper") && computer_label.getText().equals("Rock")){
            txt_label.setText("Congratulation! You win...");
            player_count++;
            player_score.setText(String.valueOf("You : "+player_count));
        }
        if (player_label.getText().equals("Scissor") && computer_label.getText().equals("Paper")){
            txt_label.setText("Congratulation! You win...");
            player_count++;
            player_score.setText(String.valueOf("You : "+player_count));
        }
        if (player_label.getText().equals("Scissor") && computer_label.getText().equals("Rock")){
            txt_label.setText("Sorry! You loose...");
            computer_count++;
            computer_score.setText(String.valueOf("Computer : "+computer_count));
        }
        if (player_label.getText().equals("Rock") && computer_label.getText().equals("Paper")) {
            txt_label.setText("Sorry! You loose...");
            computer_count++;
            computer_score.setText(String.valueOf("Computer : "+computer_count));
        }
        if (player_label.getText().equals("Paper") && computer_label.getText().equals("Scissor")) {
            txt_label.setText("Sorry! You loose...");
            computer_count++;
            computer_score.setText(String.valueOf("Computer : "+computer_count));
        }
    }


}
