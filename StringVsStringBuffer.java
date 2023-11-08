public class StringVsStringBuffer {
    public static void main(String[] args) {
        int n = 10000;
        String s = "a";
        StringBuffer sb = new StringBuffer("a");

        // Using regular String
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken using String: " + (endTime - startTime) + " ms");

        // Using StringBuffer
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken using StringBuffer: " + (endTime - startTime) + " ms");
    }
}

