package corp.valhalla.window;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WindowApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(WindowApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		JFrame a = new JFrame("example");
		JLabel b = new JLabel("edureka");
		b.setBounds(50,100,200,30);
		b.setVisible(true);
		a.add(b);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//		a.setSize(300,300);
		a.setLayout(null);
		a.setVisible(true);
	}
}
