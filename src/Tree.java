import java.io.Serializable;
import java.util.*;

public class Tree implements TreeTDA {
    private TreeTDA parent;
    private int item;
    private List<TreeTDA> children;

    public Tree(int item) {
        this.item = item;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeTDA tree) {
        this.children.add(tree);
        ((Tree) tree).parent = this;
    }

    public void addChild(int index, TreeTDA tree) {
        if (index >= 0 && index <= children.size()) {
            children.add(index, tree);
            ((Tree) tree).parent = this;
        }
    }

    public TreeTDA removeChild(int index) {
        if (index >= 0 && index < children.size()) {
            Tree removedChild = (Tree) children.remove(index);
            removedChild.parent = null;
            return removedChild;
        }
        return null;
    }

    public TreeTDA getChild(int index) {
        if (index >= 0 && index < children.size()) {
            return (TreeTDA) children.get(index);
        }
        return null;
    }

    public int childrenCount() {
        return children.size();
    }

    public int size() {
        int totalSize = 1;
        for (TreeTDA child : children) {
            totalSize += child.size();
        }
        return totalSize;
    }

    public int getItem(){
        return item;
    }

    public TreeTDA getParent(){
        return parent;
    }





}
