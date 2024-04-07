import java.util.Random;

public class RandomNamer implements Namer{
	private int length;
    private Random rnd;
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";

    public RandomNamer(Random random, int hossz) {
        this.rnd = random;
        this.length = hossz;
    }

    @Override
    public void rename(FileSystemEntry entry) {
    	StringBuilder ujNev = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = this.rnd.nextInt(ALPHABET.length());
            ujNev.append(ALPHABET.charAt(index));
        }
        entry.setName(ujNev.toString());
    }
}
