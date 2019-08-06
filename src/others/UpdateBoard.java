package others;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class UpdateBoard {


//    给定一个代表游戏板的二维字符矩阵。 'M' 代表一个未挖出的地雷，'E' 代表一个未挖出的空方块，'B' 代表没有相邻（上，下，左，右，和所有4个对角线）地雷的已挖出的空白方块，数字（'1' 到 '8'）表示有多少地雷与这块已挖出的方块相邻，'X' 则表示一个已挖出的地雷。
//
//    现在给出在所有未挖出的方块中（'M'或者'E'）的下一个点击位置（行和列索引），根据以下规则，返回相应位置被点击后对应的面板：
//
//    如果一个地雷（'M'）被挖出，游戏就结束了- 把它改为 'X'。
//    如果一个没有相邻地雷的空方块（'E'）被挖出，修改它为（'B'），并且所有和其相邻的方块都应该被递归地揭露。
//    如果一个至少与一个地雷相邻的空方块（'E'）被挖出，修改它为数字（'1'到'8'），表示相邻地雷的数量。
//    如果在此次点击中，若无更多方块可被揭露，则返回面板。


    public char[][] updateBoard(char[][] board, int[] click) {


        //duplicated data in queue
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(click);

        while(!queue.isEmpty()){

            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if(board[x][y] == 'B'){

                continue;
            }
            else if(board[x][y] == 'M'){

                board[x][y] = 'X';
                break;
            }
            else{

                int[] range = getTraversalRange(board,x,y);
                int nums = judgeBombNums(board,range);

                if(nums > 0){

                    board[x][y] = Character.forDigit(nums,10);
                    continue;
                }
                else{

                    board[x][y] = 'B';

                    for(int i = range[0]; i <= range[1]; ++i){

                        for(int j = range[2] ; j <= range[3] ; ++j){

                            if(board[i][j] == 'E'){

                                int[] temp = new int[2];
                                temp[0] = i;
                                temp[1] = j;
                                queue.offer(temp);

                            }


                        }

                    }

                    continue;

                }
            }

        }

        return board;
    }

    private int[] getTraversalRange(char[][] board,int x,int y){

        int[] res = new int[4];

        res[0] = x - 1 < 0 ? 0 : x-1;
        res[1] = x + 1 > board.length -1 ? x : x+1;
        res[2] = y - 1 < 0 ? 0 : y-1;
        res[3] = y + 1 > board[0].length - 1 ? y : y+1;

        return res;

    }


    private int judgeBombNums(char[][] board, int[] range){


        int xFirst = range[0];
        int xLast = range[1];
        int yFirst = range[2];
        int yLast = range[3];

        int res = 0;
        for(int i = xFirst; i <= xLast; ++i){


            for(int j = yFirst; j <= yLast; ++j){


                if(board[i][j] == 'M'){

                    ++res;
                }


            }


        }

        return res;

    }

    public char[][] updateBoard1(char[][] board, int[] click) {

        // use BFS and no dumplicated data in queue
        int[][] map = new int[51][51];


        Queue<int[]> queue = new LinkedList<>();
        queue.offer(click);

        while(!queue.isEmpty()){

            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];


            if(board[x][y] == 'M'){

                board[x][y] = 'X';
                //map[x][y] = 1;
                //map[x][y] = 1;
                break;
            }
            else{

                int[] range = getTraversalRange(board,x,y);
                int nums = judgeBombNums(board,range);

                if(nums > 0){

                    board[x][y] = Character.forDigit(nums,10);
                    //map[x][y] = 1;
                    //map[x][y] = 1;
                    continue;
                }
                else{

                    board[x][y] = 'B';
                    //map[x][y] = 1;
                    //map[x][y] = 1;
                    for(int i = range[0]; i <= range[1]; ++i){

                        for(int j = range[2] ; j <= range[3] ; ++j){

                            if(map[i][j] == 0 && board[i][j] == 'E'){

                                int[] temp = new int[2];
                                temp[0] = i;
                                temp[1] = j;
                                queue.offer(temp);
                                map[i][j] = 1;

                            }

//                            if(map[i][j] == 0 ){
//
//                                int[] temp = new int[2];
//                                temp[0] = i;
//                                temp[1] = j;
//                                queue.offer(temp);
//                                map[i][j] = 1;
//
//                            }

                        }

                    }

                    continue;

                }
            }

        }

        return board;
    }



    //private int[][] map;
    public char[][] updateBoard2(char[][] board, int[] click){

        //use recursive DFS
        //map = new int[51][51];

        int x = click[0];
        int y = click[1];

        if(board[x][y] == 'M'){

            board[x][y] = 'X';
            //map[x][y] = 1;
        }
        else{

            DFS(board,x,y);
        }

        return board;

    }

    private void DFS(char[][] board, int x,int y){

        int[] range = getTraversalRange(board,x,y);
        int nums = judgeBombNums(board,range);

        if(nums > 0){

            board[x][y] = Character.forDigit(nums,10);
            //map[x][y] = 1;
        }
        else{

            board[x][y] = 'B';
            //map[x][y] = 1;
            for(int i = range[0]; i <= range[1] ; ++i){

                for(int j = range[2]; j <= range[3]; ++j){

//                    if(map[i][j] == 0 && board[i][j] == 'E'){
//
//                        map[i][j] = 1;
//                        DFS(board,i,j);
//
//                    }

                    if(board[i][j] == 'E'){

                        DFS(board,i,j);

                    }

                }
            }

        }

    }


//    public char[][] updateBoard3(char[][] board, int[] click){
//
//        //use iterative DFS
//
//        int x = click[0];
//        int y = click[1];
//
//        if(board[x][y] == 'M'){
//
//            board[x][y] = 'X';
//            return board;
//        }
//
//        Stack<int[]> stack = new Stack<>();
//        stack.push(click);
//
//        while(!stack.empty()){
//
//            int[] current = stack.pop();
//
//            x = current[0];
//            y = current[1];
//
//            int[] range = getTraversalRange(board,x,y);
//            int nums = judgeBombNums(board,range);
//
//            if(nums > 0){
//
//                board[x][y] = Character.forDigit(nums,10);
//
//            }
//            else{
//
//                board[x][y] = 'B';
//
//                for(int i = range[0]; i <= range[1]; ++i){
//
//                    for(int j = range[2]; j <= range[3]; ++j){
//
//                        if(board[i][j] == 'E'){
//
//
//                        }
//
//                    }
//                }
//            }
//
//
//        }
//
//    }



}
