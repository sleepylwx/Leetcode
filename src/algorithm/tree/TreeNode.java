package algorithm.tree;


public class TreeNode<T> implements AbstractionTreeNode<T> {

    private T value;
    private AbstractionTreeNode<T> leftNode;
    private AbstractionTreeNode<T> rightNode;

    public TreeNode() {

    }

    public TreeNode(T value) {
        this.value = value;
    }



    public TreeNode(T value, AbstractionTreeNode<T> leftNode, AbstractionTreeNode<T> rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }


    @Override
    public T getValue() {

        return this.value;
    }

    @Override
    public AbstractionTreeNode<T> getLeftChild() {

        return this.leftNode;
    }

    @Override
    public AbstractionTreeNode<T> getRightChild() {

        return this.rightNode;
    }

    @Override
    public AbstractionTreeNode<T> setLeftChild(AbstractionTreeNode<T> treeNode) {

        this.leftNode = treeNode;
        return treeNode;
    }

    @Override
    public AbstractionTreeNode<T> setRightChild(AbstractionTreeNode<T> treeNode) {

        this.rightNode = treeNode;
        return treeNode;
    }

    @Override
    public boolean isLeftEmpty() {

        if(this.leftNode == null){

            return true;
        }

        return false;

    }

    @Override
    public boolean isRightEmpty() {

        if(this.rightNode == null){

            return true;
        }

        return false;

    }

    @Override
    public boolean isLeaf() {

        if(isLeftEmpty() && isRightEmpty()){

            return true;
        }

        return false;

    }
}
