public interface TreeTDA<T> {
    void addChild(TreeTDA<T> tree);
    void addChild(int index, TreeTDA<T> tree);
    TreeTDA<T> removeChild(int index);
    TreeTDA<T> getChild(int index);
    int childrenCount();
    int size();
    int getItem();
    TreeTDA<T> getParent();
}
