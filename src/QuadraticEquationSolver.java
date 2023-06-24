public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c) {
        double D = b * b - 4 * a * c;
        double[] arr;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            arr = new double[2];
            arr[0] = x1;
            arr[1] = x2;
        } else if (D == 0) {
            double x = -b / (2 * a);
            arr = new double[1];
            arr[0] = x;
        } else {
            arr = new double[0];
        }

        return arr;
    }
}
