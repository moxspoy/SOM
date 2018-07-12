import java.util.ArrayList;
import java.util.Random;

/**
 * Created by MNurilmanBaehaqi on 7/12/2018.
 */
public class Saraf {
    public double[] bobot;
    private int koordinatX;
    private int koordinatY;
    private int ukuranMap;
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

    private ArrayList<String> daftarLabel = new ArrayList<String>();
    private ArrayList<Double> daftarOutput = new ArrayList<Double>();

    public Map(int _dimensi, int _ukuranMap) {
        this.dimensi = _dimensi;
        this.ukuranMap = _ukuranMap;

        outputs = new Saraf[ukuranMap-1][ukuranMap-1];
        for (int i = 0; i < ukuranMap; i++) {
            for (int j = 0; j < ukuranMap; j++) {
                outputs[i][j] = new Saraf(i, j, ukuranMap);
                outputs[i][j].bobot = new double[dimensi];

                for (int k = 0; k < dimensi; k++) {
                    //outputs[i][j].bobot = Math.random() * 4;
                }
            }
        }

    }
}
