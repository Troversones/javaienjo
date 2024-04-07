public class SequentialNamer implements Namer{
	private int index;

    public SequentialNamer() {
        this.index = 1;
    }

    @Override
    public void rename(FileSystemEntry bemenet) {
        String elozoNev = bemenet.getName();
        String ujNev = elozoNev + "_" + (index++);
        bemenet.setName(ujNev);
    }
}
