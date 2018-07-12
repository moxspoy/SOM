import java.lang.reflect.Array;
import java.util.*;

class Saraf {
    public double[] bobot; //bobot saraf
    private int koordinatX; //kordinat sumbu x pada Map
    private int koordinatY; //kordinat sumbu y pada Map
    private int ukuranMap; //digunakan untuk menghitung radius kekuatan (Strength) terhadap saraf disekitar
    private double nf;

    public Saraf(int _koordinatX, int _koordinatY, int _ukuranMap) {
        this.koordinatX = _koordinatX;
        this.koordinatY = _koordinatY;
        this.ukuranMap = _ukuranMap;
        nf = 1000 / Math.log(ukuranMap);
    }
}

class Map {
    private Saraf[][] outputs;
    private int iterasi;
    private int ukuranMap;
    private int dimensi;

    private ArrayList<double[]> daftarInput = new ArrayList<double[]>();

    public Map(int _dimensi, int _ukuranMap){
        this.dimensi = _dimensi;
        this.ukuranMap = _ukuranMap;

        outputs = new Saraf[ukuranMap][ukuranMap];
        for (int i = 0; i < ukuranMap; i++) {
            for (int j = 0; j < ukuranMap; j++) {
                outputs[i][j] = new Saraf(i,j,ukuranMap);
                outputs[i][j].bobot = new double[dimensi];

                for (int k = 0; k < dimensi; k++) {
                    outputs[i][j].bobot[k] = Math.random() * 4 + 1;
                }
            }
        }
    }

    public void prosesPerhitungan(double[][] _data, double _batasKesalahanMinimal) {
        for (int i = 0; i < _data.length; i++) {
            daftarInput.add(_data[i]);
        }

        double total = 0;
        for (int i = 0; i < dimensi; i++) {
            for (int j = 0 ; j < daftarInput.size(); j++){
                total += daftarInput.get(i)[j];
            }
            double nilaiKesalahan = Double.MAX_VALUE;
            while (nilaiKesalahan > _batasKesalahanMinimal) {
                nilaiKesalahan = 0;
                ArrayList<double> daftarTrainingSet = ArrayList<~>;
                for (double[] input : daftarInput) {
                    daftarTrainingSet.add(input);
                }
            }
        }

    }
}

class Som {
    public static void main(String[] args) {
        double[][] data = {
                {50,60,70},
                {65,80,73},
                {72,70,65},
                {83,65,80},
                {40,82,73},
                {95,71,85},
                {60,74,96},
                {75,75,92},
                {83,55,70},
                {91,60,65},
                {92,91,55},
                {76,80,59},
                {75,65,74},
                {74,76,89},
                {63,79,69},
                {58,93,76},
                {82,50,80},
                {81,65,88},
                {76,74,70},
                {77,71,55}
        };

        int dimensi = 3;
        int ukuranMap = 10;
        double batasKesalahanMinimal = 0.00001;

        Map som = new Map(dimensi,ukuranMap);

    }
}