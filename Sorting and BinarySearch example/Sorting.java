package cobacoba;

public class Sorting {

    void sort(double[] X) {
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X.length - 1; j++) {
                if (X[j] > X[j + 1]) {
                    double temp = X[j];
                    X[j] = X[j + 1];
                    X[j + 1] = temp;
                }
            }
        }
    }
}
