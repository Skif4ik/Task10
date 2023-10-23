package task5posuda.model;

public class Plate extends Crockery {
    private static double plateDifficultFactor = 1;

    public Plate() {
    }

    public Plate(int article, double volume, Material material) {
        super(article, volume, material);
    }

    public Plate(Crockery crockery) {
        super(crockery);
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
    public double getDifficultFactor() {
        return plateDifficultFactor;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "article=" + getArticle() +
                ", volume=" + getVolume() +
                ", material=" + getMaterial() +
                ", calculationСost=" + calculationСost() +
                '}';
    }
}
