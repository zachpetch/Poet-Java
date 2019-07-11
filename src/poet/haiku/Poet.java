package poet.haiku;

import poet.line.Line;

public class Poet
{
    public static void main(String[] args)
    {
        Line first = new Line(5);
        Line second = new Line(7);
        Line third = new Line(5);

        System.out.println(first.getLine());
        System.out.println(second.getLine());
        System.out.println(third.getLine());
    }
}
