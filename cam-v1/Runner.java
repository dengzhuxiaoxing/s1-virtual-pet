import javax.swing.JFrame;
import javax.swing.JOptionPane;

Maka


public class Runner {
    public static void main(String[] args) {
        VirtualPet v = new VirtualPet();
        new Runner();
  }


  enum activities {
    exercise,
    feed
  }


  public Runner() {
    // Main
    VirtualPet p = new VirtualPet();


    // Tasks
    p.exercise();
    wait(1000);
    p.feed();
    wait(1000);
    p.exercise();
    String ans = getResponse("How was your day?");
    System.out.println(ans);
  }


  public String getResponse(String prompt) {
    String res = (String)JOptionPane.showInputDialog(
      new JFrame(),
      prompt,
      "Response",
      JOptionPane.PLAIN_MESSAGE
    );
    return res;
  }


  public void wait(int millis) {
    try {
      Thread.sleep(millis);
    } catch (Exception e) {
      // TODO: handle exception
    }
  }


}
