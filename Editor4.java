import java.awt.Color;

/**
 * Morphs an image into its grayscaled version in n steps.
 * Usage: java Editor4 <image.ppm> <n>
 */
public class Editor4 {

    public static void main(String[] args) {

        String fileName = args[0];
        int n = Integer.parseInt(args[1]);

        Color[][] source = Runigram.read(fileName);
        Color[][] target = Runigram.grayScaled(source);

        Runigram.setCanvas(source);
        Runigram.morph(source, target, n);
    }
}
