package task5posuda.model;


    public class Pan extends Crockery {
        private static double panDifficultFactor = 4;

        public Pan() {
        }

        public Pan(int article, double volume, Material material) {
            super(article, volume, material);
        }

        // конструктор копия
        public Pan(Crockery crockery) {
            super(crockery);
        }

        @Override
        public double getDifficultFactor() {
            return panDifficultFactor;
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
            return "Pan{" +
                    "article=" + getArticle() +
                    ", volume=" + getVolume() +
                    ", material=" + getMaterial() +
                    ", calculationСost=" + calculationСost() +
                    '}';
        }
    }
