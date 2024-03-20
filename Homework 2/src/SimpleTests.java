import hw2.Handegg;
/**
 * A few simple test cases for the Handegg class.
 */
public class SimpleTests
{
    public static void main(String[] args){

        System.out.println("==========Initial State==========");
        Handegg game = new Handegg();
        System.out.println(game.getLocation());
        System.out.println("Expected 30");
        System.out.println(game.whoIsOffense());
        System.out.println("Expected 0");
        System.out.println(game.whichDown());
        System.out.println("Expected 1");
        System.out.println(game.getScore(0));
        System.out.println("Expected 0");

        System.out.println("==========After a punt==========");
        game.punt(50);
        System.out.println(game.whoIsOffense());
        System.out.println("Expected 1");
        System.out.println(game.getLocation());
        System.out.println("Expected 20");
        System.out.println("==========Successful attempt at a field goal==========");
        game = new Handegg();
        game.fieldGoal(true);
        System.out.println(game.getScore(0));
        System.out.println("Expected 3");
        System.out.println(game.whoIsOffense());
        System.out.println("Expected 1");
        System.out.println(game.getLocation());
        System.out.println("Expected 30");
        System.out.println("==========The expected output of Extra Point==========");
        game = new Handegg();
        game.extraPoint(true);
        System.out.println(game.getScore(0));
        System.out.println("Expected 1");
        System.out.println(game.whoIsOffense());
        System.out.println("Expected 1");
        System.out.println(game.getLocation());
        System.out.println("Expected 30");
        System.out.println("==========Run test==========");
        game = new Handegg();
        game.run(5); // advance the ball 5 yards
        System.out.println(game.getLocation());
        System.out.println("Expected 35");
        System.out.println("==========attempt at a field goal==========");
        game = new Handegg();
        game.run(25); // advance the ball 55 yards
        System.out.println(game.getLocation());
        System.out.println("Expected 55");
        game.fieldGoal(false);
        System.out.println(game.getScore(0));
        System.out.println("Expected 0");
        System.out.println(game.whoIsOffense());
        System.out.println("Expected 1");
        System.out.println(game.getLocation());
        System.out.println("Expected 45");
        System.out.println("==========Detect a touchdown after run==========");
        game = new Handegg();
        game.run(100); // advance the ball 100 yards
        System.out.println(game.getLocation());
        System.out.println("Expected 130");
        System.out.println(game.getScore(0));
        System.out.println("Expected 6");
        System.out.println("==========counting downs after run==========");
        game = new Handegg();
        System.out.println(game.whichDown());
        System.out.println("Expected 1");
        System.out.println(game.getYardsToFirstDown());
        System.out.println("Expected 10");
        game.run(-4);
        System.out.println(game.whichDown());
        System.out.println("Expected 2");
        System.out.println(game.getYardsToFirstDown());
        System.out.println("Expected 14");
        game.run(9);
        System.out.println(game.whichDown());
        System.out.println("Expected 3");
        System.out.println(game.getYardsToFirstDown());
        System.out.println("Expected 5");
        game.run(20);
        System.out.println(game.whichDown());
        System.out.println("Expected 1");
        System.out.println(game.getYardsToFirstDown());
        System.out.println("Expected 10");
        System.out.println("==========Counting downs with a turnover==========");
        game = new Handegg();
        System.out.println(game.whichDown());
        System.out.println("Expected 1");
        System.out.println(game.getYardsToFirstDown());
        System.out.println("Expected 10");
        game.run(1);
        game.run(1);
        game.run(1);
        game.run(1);
        System.out.println(game.whoIsOffense());
        System.out.println("Expected 1");
        System.out.println(game.whichDown());
        System.out.println("Expected 1");
        System.out.println(game.getLocation());
        System.out.println("Expected 66");
        System.out.println("==========Pass with & without interception==========");
        game = new Handegg();
        game.pass(4, false);
        System.out.println(game.whichDown());
        System.out.println("Expected 2");
        System.out.println(game.getYardsToFirstDown());
        System.out.println("Expected 6");
        game.pass(21, true);
        System.out.println(game.whoIsOffense());
        System.out.println("Expected 1");
        System.out.println(game.getLocation());
        System.out.println("Expected 45");

        game = new Handegg();
        game.run(-40);
        System.out.println(game.getLocation());
        System.out.println("Expected: 0");
    }
}
