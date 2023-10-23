package task3kroliki.model;

public class Rabbit {
    private String nickName;
    private double weight;
    private EyeColor eyeColor;
    private WoolColor woolColor;

    public Rabbit() {
    }

    public Rabbit(String nickName, double weight, EyeColor eyeColor, WoolColor woolColor) {
        this.nickName = nickName;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    // конструктор  копирования
    public Rabbit(Rabbit rabbit) {
        this.nickName = rabbit.nickName;
        this.weight = rabbit.weight;
        this.eyeColor = rabbit.eyeColor;
        this.woolColor = rabbit.woolColor;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        nickName = nickName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static double getAvgWeight(Rabbit rabbit1, Rabbit rabbit2) {
        double sum = rabbit1.weight + rabbit2.weight;
        double avg = sum / 2;
        return avg;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Rabbit rabbit = (Rabbit) object;

        if (Double.compare(rabbit.weight, weight) != 0) return false;
        if (nickName != null ? !nickName.equals(rabbit.nickName) : rabbit.nickName != null)
            return false; // !name.equals(rabbit.name)
        if (eyeColor != rabbit.eyeColor) return false;
        return woolColor == rabbit.woolColor;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nickName != null ? nickName.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (eyeColor != null ? eyeColor.hashCode() : 0);
        result = 31 * result + (woolColor != null ? woolColor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "NickName='" + nickName + '\'' +
                ", weight=" + weight +
                ", eyeColor=" + eyeColor +
                ", woolColor=" + woolColor +
                '}';
    }

}