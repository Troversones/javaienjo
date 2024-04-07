public abstract class FileSystemEntry {
	private Folder parent;
	private String name;
	
	public FileSystemEntry(Folder parent, String name) {
		this.parent = parent;
		this.name = name;
		if(this.parent != null) {
			parent.addChild(this);
		}
	}
	
	public abstract long size();
	
	public String fullPath() {
        if (parent != null) {
            return parent.fullPath() + "/" + name;
        } else {
            return name;
        }
    }
	
	public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return name;
    }
}