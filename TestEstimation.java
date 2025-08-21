public class TestEstimation {
    // 1. Ratio Based Estimation
    public static double ratioBasedEstimation(double devHours, double ratioPercent) {
        return devHours * (ratioPercent / 100);
    }

    // 2. Extrapolation
    public static double extrapolation(int testedStories, double hoursSpent, int totalStories) {
        double avgPerStory = hoursSpent / testedStories;
        return avgPerStory * totalStories;
    }

    // 3. Wideband Delphi (average after discussion)
    public static double widebandDelphi(int[] estimates) {
        int sum = 0;
        for (int e : estimates) {
            sum += e;
        }
        return (double) sum / estimates.length;
    }
    // 4. Three-Point Estimation
    public static double threePointEstimation(double O, double M, double P) {
        return (O + (4 * M) + P) / 6;
    }

    public static void main(String[] args) {
        // 1. Ratio Based Example
        double ratioEstimate = ratioBasedEstimation(100, 30);
        System.out.println("1️⃣ Ratio Based Estimation: " + ratioEstimate + " hours");

        // 2. Extrapolation Example
        double extrapolationEstimate = extrapolation(5, 20, 15);
        System.out.println("2️⃣ Extrapolation: " + extrapolationEstimate + " hours");

        // 3. Wideband Delphi Example
        int[] delphiEstimates = {20, 25, 22, 30, 24};
        double delphiResult = widebandDelphi(delphiEstimates);
        System.out.println("3️⃣ Wideband Delphi: " + delphiResult + " hours");

        // 4. Three-Point Estimation Example
        double threePointResult = threePointEstimation(10, 16, 28);
        System.out.println("4️⃣ Three-Point Estimation: " + threePointResult + " hours");
    }
}
