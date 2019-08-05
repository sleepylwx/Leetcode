package algorithm.tree.TreeTraversal;

import algorithm.tree.AbstractionTreeNode;

public interface TreeTraversal<T> {

    void firstTraversal(AbstractionTreeNode<T> root, TraversalCondition<T> condition, TraversalOperation<T> operation);
    void medianTraversal(AbstractionTreeNode<T> root,TraversalCondition<T> condition,TraversalOperation<T> operation);
    void lastTraversal(AbstractionTreeNode<T> root,TraversalCondition<T> condition,TraversalOperation<T> operation);


}
