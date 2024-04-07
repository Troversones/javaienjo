import java.util.Arrays;

public class Folder extends FileSystemEntry{
	private FileSystemEntry[] children;
	
	public Folder(Folder parent, String name) {
		super(parent,name);
		this.children = null;
	}
	
	public void addChild(FileSystemEntry child) {
		if (children == null) {
	        children = new FileSystemEntry[] { child };
	    } else {
	        FileSystemEntry[] leugrokaTetorol = Arrays.copyOf(children, children.length + 1);
	        leugrokaTetorol[children.length] = child;
	        children = leugrokaTetorol;
	    }
	}
	
	@Override
	public long size() {
		if (children == null || children.length == 0) {
            return 0;
        } else {
            long meretxd = 0;
            for (FileSystemEntry child : children) {
            	meretxd += child.size();
            }
            return meretxd;
        }
	}
}