package algorithm.tree.TreeTraversal;


import java.util.Stack;

import algorithm.tree.AbstractionTreeNode;


public class TreeIterativeTraversal<T> implements TreeTraversal<T>{


    @Override
    public void firstTraversal(AbstractionTreeNode<T> root,TraversalCondition<T> condition,TraversalOperation<T> operation){

        Stack<AbstractionTreeNode<T>> stack = new Stack<>();
        stack.push(root);

        while(!stack.empty()){


            AbstractionTreeNode<T> current = stack.pop();

            if(condition.treeNodeValueCondition(current)){

                operation.operate(current);
            }

            if(!current.isRightEmpty() && condition.rightChildTreeCondition(current)){

                stack.push(current.getRightChild());
            }
            if(!current.isLeftEmpty() && condition.leftChildTreeCondition(current)){

                stack.push(current.getLeftChild());
            }

        }


    }


    @Override
    public void medianTraversal(AbstractionTreeNode<T> root,TraversalCondition<T> condition,TraversalOperation<T> operation){


        Stack<AbstractionTreeNode<T>> stack = new Stack<>();
        stack.push(root);
        AbstractionTreeNode<T> checkedMark = root;

        while(!stack.isEmpty()){

            AbstractionTreeNode<T> current = stack.peek();

            if(checkedMark  == current && !current.isLeftEmpty() && condition.leftChildTreeCondition(current)){

                stack.push(current.getLeftChild());
                checkedMark = current.getLeftChild();

            }
            else{

                if(condition.treeNodeValueCondition(current)){

                    operation.operate(current);
                }
                stack.pop();

                if(!current.isRightEmpty() && condition.rightChildTreeCondition(current)){

                    stack.push(current.getRightChild());
                    checkedMark = current.getRightChild();
                }

            }


        }


    }


    @Override
    public void lastTraversal(AbstractionTreeNode<T> root,TraversalCondition<T> condition,TraversalOperation<T> operation){

        Stack<AbstractionTreeNode<T>> stack = new Stack<>();

        stack.push(root);

        AbstractionTreeNode<T> leftMark = root;
        AbstractionTreeNode<T> rightMark = null;

        while(!stack.isEmpty()){


            AbstractionTreeNode<T> current = stack.peek();

            if(leftMark == current && !current.isLeftEmpty() && condition.leftChildTreeCondition(current)){

                stack.push(current.getLeftChild());
                leftMark = current.getLeftChild();


            }
            else{


                if(!current.isRightEmpty() && rightMark != current.getRightChild() && condition.rightChildTreeCondition(current)){


                    stack.push(current.getRightChild());
                    leftMark = current.getRightChild();
                    //rightMark = current.getRightChild();

                }
                else if(condition.treeNodeValueCondition(current)){

                    operation.operate(current);
                    stack.pop();
                    rightMark = current;
                }


            }


        }


    }


}
