import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.*;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 20;
    private final int COLS = 20;
    
    // constants for the location of the three cells initially alive
    private final int X1 = 0, Y1 = 2;
    private final int X2 = 1, Y2 = 0;
    private final int X3 = 2, Y3 = 1;
    private final int X4 = 2, Y4 = 2;
    private final int X5 = 1, Y5 = 2;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock5);

    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        int[] rowOnePreChange;
        int[] row2PreChange;
        int numOfCol ;
        numOfCol = getNumCols();
        
        rowOnePreChange = new int[numOfCol];
        row2PreChange = new int[numOfCol];
        
        for(int i = 0; i < getNumRows(); i++)
        { 
            for(int j = 0; j < getNumCols(); j++)
            {
                Rock rock = new Rock();
                boolean alive;
                int counter = 0;
                Location loc = new Location(i, j);
                int neighbors = grid.getNeighbors(loc).size();
                if(grid.get(loc) != null)
                {
                    if(neighbors > 3 || neighbors < 2)
                    {
                        //grid2.remove(loc);
                        row2PreChange[j] = 0;
                    }
                    else
                    {
                        //grid2.put(loc, rock);
                        row2PreChange[j] = 1;
                    }
                }
                
                else if (grid.get(loc) == null)
                {
                    if(neighbors == 3)
                    {
                        //grid2.put(loc, rock);
                        row2PreChange[j] = 1;
                    }
                    else
                    {
                        //grid2.remove(loc);
                        row2PreChange[j] = 0;
                    }
                }
            }
            
            for(int j = 0; j < getNumCols(); j++)
            {
               if (i !=0)
               {
                    Rock rock = new Rock();
                    Location loc = new Location(i-1, j);
                    if (rowOnePreChange[j] == 1)
                    {
                        grid.put(loc,rock);
                    }
                    else
                    {
                        grid.remove(loc);
                    }
                }
                    
                    rowOnePreChange[j] = row2PreChange[j];
             
            }
         }
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many generations would you like to simulate?");
        int generations = input.nextInt();
        
        GameOfLife gamea2= new GameOfLife();
        gamea2.world.show();
        
        for (int i = 0; i < generations; i++)
        {
            gamea2.createNextGeneration();
            gamea2.world.show();
            Thread.sleep(100);
            
        }
    }

}
