public class Folder extends FileSystemEntry{
	private FileSystemEntry[] children = null;
	
	public Folder(Folder parent, String name) {
		super(parent,name);
	}
	
	@Override
	public long size() {
		long sizexd = 0;
		for (int i = 0; i < this.children.length; i++) {
			if(this.children[i] == null) {
				return 0;
			}else {
				sizexd += this.children[i].size();
			}
		}
		return sizexd;
	}
	
	public void addChild(FileSystemEntry child) {
		if(this.children == null) {
			this.children = new FileSystemEntry[] {child};
		}else {
			FileSystemEntry[] xd = new FileSystemEntry[this.children.length + 1];
			for (int i = 0; i < xd.length; i++) {
				if(i == xd.length - 1) {					
					xd[i] = child;
				}
				xd[i] = this.children[i];
			}
			this.children = xd;
		}
	}
}