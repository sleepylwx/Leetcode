package algorithm.tree.TreeTraversal;

import algorithm.tree.AbstractionTreeNode;

public interface TraversalOperation<T> {

    void operate(AbstractionTreeNode<T> treeNode);

}
