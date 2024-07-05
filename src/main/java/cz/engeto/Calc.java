package cz.engeto;

public class Calc {

    public int scitani(int a, int b) {
        return a + b;
    }

    public int odcitani(int a, int b) {
        return a - b;
    }

    public int deleni(int a, int b) {
        return a/b;
    }

    public int nasobeni(int a, int b) {
        int result = 0;

        for (int i = 0; i < Math.abs(b); i++) {
            result += a;
        }

        if (b<0) {
            return -result;
        } else {
            return result;
        }

    }

}
