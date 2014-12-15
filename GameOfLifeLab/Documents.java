/*
 * Requirements:
 * Code simulates Conway's game of life from a starting shape. The user selects how 
 * many generations they want to simulate and it will run for that many generations. 
 * 
 * Design:
 * Start off with a grid of size 20 x 20 and start with a basic glider. Use a for loop to
 * iterate through each square in the first row to check if in the next generation if the square 
 * has an alive or a dead actor in it. 
 * Store these values in an array. Then, run another loop to run through the second row to check
 * if each square is supposed to have an alive or a dead actor in it and store it in a second array. 
 * However, do not implement the alive/dead actors in the first row on the grid yet.
 * After iterating through the second row, implement the alive/dead actors figured out by the first
 * row onto the grid. Then, store the values from the second array into the first array
 * Continue through the grid storing the values from the next row into the second array, implementing
 * the first array onto the grid, and storing the values from the second array into the first array.
 * The user decides how many generations are produced and it takes 100 ms between each generation.
 * 
 * Reflection:
 * I liked this lab but couldn't figure out how to do it until we had learned arrays. I probably
 * missed an easier way to do it but overall, I found it quite challenging and entertaining.
 * I was surprised at how difficult it was to figure out the logic because you needed to iterate 
 * through all of the squares before adding or removing any rocks. I would like to know how you do 
 * it without using arrays. 
 */