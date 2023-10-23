package task5posuda.model;

public abstract class Crockery {
    private int article;
    private double volume;
    private Material material;

    public Crockery() {
    }

    public Crockery(int article, double volume, Material material) {
        this.article = article;
        this.volume = volume;
        this.material = material;
    }

    public Crockery(Crockery crockery) {
        this.article = crockery.article;
        this.volume = crockery.volume;
        this.material = crockery.material;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    //рассчет коэффициента сложности изготовления
    public abstract double getDifficultFactor();

    //расчет стоимости конкретного экземпляра посуды в зависимости от вида, материала и объёма.
    public double calculationСost() {
        double result = volume * material.getPricePerVolume() * getDifficultFactor();
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!(object instanceof Crockery)) return false;

        Crockery crockery = (Crockery) object;

        if (Double.compare(crockery.volume, volume) != 0) return false;
        final double EPS = 0.01;
        return Math.abs(calculationСost() - crockery.calculationСost()) < EPS;
        // return calculationСost()==crockery.calculationСost();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
