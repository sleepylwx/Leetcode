import java.util.Stack;

/**
 * Created by 36249 on 2017/3/5.
 */
public class ImplementQueueUsingStacks {


    public static class MyQueue{

        private Stack<Integer> mStack;
        public MyQueue(){

            mStack = new Stack<>();

        }

        public void push(int x){

            Stack<Integer> temp = new Stack<>();
            while(!mStack.empty()){

                temp.push(mStack.pop());
            }
            mStack.push(x);
            while(!temp.empty()){

                mStack.push(temp.pop());
            }
        }

        public int pop(){

            return mStack.pop();
        }

        public int peek(){

            return mStack.peek();
        }
        public boolean empty(){

            return mStack.empty();
        }
    }

    public static class MyQueue1{

        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        public MyQueue1(){


        }

        public void push(int x){

            input.push(x);
        }

        public int pop(){

            if(output.empty()){

                while(!input.empty()){

                    output.push(input.pop());
                }

            }

            return output.pop();

        }

        public int peek(){

            if(output.empty()){

                while(!input.empty()){

                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty(){

            return input.empty()&&output.empty();
        }
    }
}
