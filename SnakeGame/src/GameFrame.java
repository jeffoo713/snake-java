import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;

	GameFrame() {
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
