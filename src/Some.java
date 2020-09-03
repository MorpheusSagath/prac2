import javax.xml.bind.SchemaOutputResolver;

public class Some {
    public static void main(String[] args)
    {
        Ball a = new Ball();
/*
        a.color = "green";
        a.radius = 34.4f;
        a.type = "football";
*/
        Ball b = new Ball();

        b.setType("волейбольный");
        b.setRadius(3.2f);
        b.setColor("yellow");

        System.out.println(b);
        System.out.println();
        System.out.println(a);
    }
}
