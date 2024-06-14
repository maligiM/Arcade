import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jeopardy extends Game implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int currentPlayer;
	JButton[] buttons;
	private JLabel display;
	JPanel playerPanel, boardPanel;
	QuestionList qs = new QuestionList();
	Player player1;
	Player player2;

	public Jeopardy(Player p1, Player p2) {
		super(2);
		player1 = p1;
		player2 = p2;
		currentPlayer = 1;
		playerPanel = new JPanel();
		boardPanel = new JPanel(new GridLayout(4, 5, 1, 1));
		boardPanel.setPreferredSize(new Dimension(700, 700));
		boardPanel.setBackground(Color.GREEN);
		boardPanel.setBounds(0, 50, 700, 800);

		buttons = new JButton[20];
		ImageIcon img = new ImageIcon(
				new ImageIcon("src/images/noimage5.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		for (int i = 0; i < buttons.length; i++) {
			String text = qs.questions[i].category + " :$" + qs.questions[i].points;
			JButton button = new JButton(text);
			button.setName(String.valueOf(i));
			button.setFont(new Font("Arial", Font.BOLD, 11));
			button.addActionListener(this);
			buttons[i] = button;
			boardPanel.add(button);
		}
		add(boardPanel, BorderLayout.NORTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(currentPlayer);
		ImageIcon img = new ImageIcon(
				new ImageIcon("src/images/noimage5.jpg").getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
		String name = ((Component) e.getSource()).getName();
		String input = JOptionPane
				.showInputDialog("Player: " + currentPlayer + " : " + qs.questions[Integer.parseInt(name)].question);
		System.out.println("Id: " + ((Component) e.getSource()).getName());

		// buttons[Integer.parseInt(name)].setIcon(img);
		if (input != null && input.equalsIgnoreCase(qs.questions[Integer.parseInt(name)].answer)) {
			if (currentPlayer == 1) {
				player1.addpoints(qs.questions[Integer.parseInt(name)].points);
				ArcadeMain.btnPlayer1.setText("Player 1: $" + String.valueOf(player1.getPoints()));
				currentPlayer = 2;
			} else if (currentPlayer == 2) {
				player2.addpoints(qs.questions[Integer.parseInt(name)].points);
				ArcadeMain.btnPlayer2.setText("Player 2: $" + String.valueOf(player2.getPoints()));
				currentPlayer = 1;
			}

		}
		buttons[Integer.parseInt(name)].setText(qs.questions[Integer.parseInt(name)].answer);
		buttons[Integer.parseInt(name)].setBackground(Color.BLACK);
		buttons[Integer.parseInt(name)].setEnabled(false);

		setVisible(false);
		setVisible(true);

	}

}
