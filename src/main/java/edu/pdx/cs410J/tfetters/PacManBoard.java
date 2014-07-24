package edu.pdx.cs410J.tfetters;

/**
 * This class is represents a <code>fizzBuzz</code>.
 */
public class PacManBoard {
    private int boardSize;
    private PacManPixel[] pixelarray;

    public PacManBoard() {

    }

    public void setBoardSize(int size){
        boardSize = size;
        pixelarray=new PacManPixel[size*size];
        //row=(int) pixelindex/rowsize
        //column=pixelindex%rowsize
        for(int i=0; i<size*size; i++){
            pixelarray[i] = new PacManPixel();
        }
    }

    public pixeltype getpixeltype(int index){
        return pixelarray[index].gettype();
    }

    public pixeltype getpixeltype(int column, int row) {
        return pixelarray[row*boardSize+column].gettype();
    }

    public int calculatePosition(int x, int y){
       return y*boardSize+x;
    }

    public void setPixelOnBoard(int position, pixeltype pixel){
        pixelarray[position].setpixeltype(pixel);
    }

    public int getBoardSize(){
        return boardSize;
    }

    public pixeltype queryGivenDirection(direction requestedDirection, int x, int y){
        switch (requestedDirection){
            case left:
                
            case right:
            case down:
            case up:
            default:

        }
        System.exit(1);
    }

}