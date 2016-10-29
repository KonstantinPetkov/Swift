package Task2_FileStructure;

public class FolderObject extends FileSystemObject{

    private String _children;
    
    public FolderObject(String parent, String name, String children){
        super(parent, name);
        _children = children;
    }
    
}
