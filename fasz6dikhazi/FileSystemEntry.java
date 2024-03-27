public abstract class FileSystemEntry {
	private Folder parent;
	private String name;
	
	public FileSystemEntry(Folder parent, String name) {
		if(this.parent != null) {
			this.parent = parent;
			this.name = name;
		}
	}
	
	public abstract long size();
	
	
}