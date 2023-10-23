package task5posuda.model;

public class Casserole extends Crockery {
    private static double crockeryDifficultFactor = 3;

    public Casserole() {
    }

    public Casserole(int article, double volume, Material material) {
        super(article, volume, material);
    }

    public Casserole(Crockery crockery) {
        super(crockery);
    }

    @Override
    public double getDifficultFactor() {
        return crockeryDifficultFactor;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Casserole{" +
                "article=" + getArticle() +
                ", volume=" + getVolume() +
                ", material=" + getMaterial() +
                ", calculationСost=" + calculationСost() +
                '}';
    }
}
