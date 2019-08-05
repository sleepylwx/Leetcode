package algorithm.tree;

public  interface AbstractionTreeNode <T> {

    T getValue();
    AbstractionTreeNode<T> getLeftChild();
    AbstractionTreeNode<T> getRightChild();
    AbstractionTreeNode<T> setLeftChild(AbstractionTreeNode<T> treeNode);
    AbstractionTreeNode<T> setRightChild(AbstractionTreeNode<T> treeNode);
    boolean isLeftEmpty();
    boolean isRightEmpty();
    boolean isLeaf();
}
