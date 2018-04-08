import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot john = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
String color = JOptionPane.showInputDialog("What color would you like your robot to draw?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
if(color.equals("red")) {
	john.setPenColor(225,0,0);
	
}
else if(color.equals("blue")) {
	john.setPenColor(0, 0, 225);
}
else {
	john.setPenColor(0, 225, 0);
}
   	 // 2. set the pen width to 10
john.setPenWidth(10);
   	 // 1. make the Robot draw a shape
for (int i = 0; i < 5; i++) {
	john.penDown();
john.move(100);
   	 john.turn(90);
  
    }}

}
