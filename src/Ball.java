public class Ball {
    public String type;
    public float radius;
    public String color;

    public String toString(){

        String f = "Тип мяча: " + type + "\n" + "Радиус мяча: " + radius + "\n" + "Цвет мяча: " + color;
        return f;
    }

    public String getType() {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public float getRadius(float radius)
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public String getColor(String color)
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
