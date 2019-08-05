package algorithm.tree.TreeTraversal;

import algorithm.tree.AbstractionTreeNode;


public interface TraversalCondition<T> {

    boolean leftChildTreeCondition(AbstractionTreeNode<T> treeNode);

    boolean rightChildTreeCondition(AbstractionTreeNode<T> treeNode);

    boolean treeNodeValueCondition(AbstractionTreeNode<T> treeNode);

}
