package task5posuda.model;

public enum Material {
    CERAMIC(15),
    ALUMINUM(5);

    private double pricePerVolume;    //цена от объема, за литр

    Material(double pricePerVolume) {
        this.pricePerVolume = pricePerVolume;
    }

    public double getPricePerVolume() {
        return pricePerVolume;
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name() + '\'' +
                ", pricePerVolume=" + pricePerVolume +
                '}';
    }

}
