package algorithm.tree.TreeTraversal;

import algorithm.tree.AbstractionTreeNode;

public class TreeRecursiveTraversal<T> implements TreeTraversal<T>{

    @Override
    public void firstTraversal(AbstractionTreeNode<T> root, TraversalCondition<T> condition, TraversalOperation<T> operation) {


        if(condition.treeNodeValueCondition(root)){

            operation.operate(root);
        }
        if(root.isLeftEmpty() && condition.leftChildTreeCondition(root)){

            firstTraversal(root.getLeftChild(),condition,operation);
        }
        if(root.isRightEmpty() && condition.rightChildTreeCondition(root)){

            firstTraversal(root.getRightChild(),condition,operation);
        }


    }

    @Override
    public void medianTraversal(AbstractionTreeNode<T> root, TraversalCondition<T> condition, TraversalOperation<T> operation) {


        if(root.isLeftEmpty() && condition.leftChildTreeCondition(root)){

            medianTraversal(root.getLeftChild(),condition,operation);
        }
        if(condition.treeNodeValueCondition(root)){

            operation.operate(root);
        }
        if(root.isRightEmpty() && condition.rightChildTreeCondition(root)){

            medianTraversal(root.getRightChild(),condition,operation);
        }


    }

    @Override
    public void lastTraversal(AbstractionTreeNode<T> root, TraversalCondition<T> condition, TraversalOperation<T> operation) {


        if(root.isLeftEmpty() && condition.leftChildTreeCondition(root)){

            lastTraversal(root.getLeftChild(),condition,operation);
        }
        if(root.isRightEmpty() && condition.rightChildTreeCondition(root)){

            lastTraversal(root.getRightChild(),condition,operation);
        }
        if(condition.treeNodeValueCondition(root)){

            operation.operate(root);
        }


    }


}

