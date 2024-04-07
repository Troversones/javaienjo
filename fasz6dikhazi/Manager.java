public class Manager {
	private Namer namer;
    private Folder imagesFolder;
    private Folder etcFolder;

    public Manager(Namer Namer, Folder rootFolder) {
        this.namer = Namer;
        this.imagesFolder = new Folder(rootFolder, "images");
        this.etcFolder = new Folder(rootFolder, "etc");
    }

    public File upload(String fileName, long size) {
        File ujFile;
        if (fileName.endsWith(".jpg") || fileName.endsWith(".png") || fileName.endsWith(".gif")) {
        	ujFile = new File(this.imagesFolder, fileName, size);
        } else {
        	ujFile = new File(this.etcFolder, fileName, size);
        }
        
        namer.rename(ujFile);
        
        System.out.println("Stored " + fileName + " at " + ujFile.fullPath());
        System.out.println("Images size: " + this.imagesFolder.size() + " bytes");
        System.out.println("Etc size: " + this.etcFolder.size() + " bytes");
        
        return ujFile;
    }
}