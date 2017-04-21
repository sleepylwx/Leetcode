/**
 * Created by 36249 on 2016/11/25.
 */
public class IslandPerimeter {



    public int islandPerimeter(int[][] grid){


        int res = 0;

        for(int i = 0; i < grid.length; ++i){

            for(int j = 0; j < grid[0].length; ++j){

                if(grid[i][j] == 1){

                    res += triverseAroudn(grid,i,j);
                }
            }
        }
        return res;
    }

    public int triverseAroudn(int[][] grid, int x,int y){


        int sum = 4;
        int width = grid[0].length;
        int height = grid.length;

        if(x > 0&& grid[x-1][y] == 1){

            --sum;
        }
        if(x+1 < height&&grid[x+1][y] == 1){

            --sum;
        }
        if(y > 0 && grid[x][y-1] == 1){

            --sum;
        }
        if(y+1 < width && grid[x][y+1] == 1){

            --sum;
        }

        return sum;
    }


}