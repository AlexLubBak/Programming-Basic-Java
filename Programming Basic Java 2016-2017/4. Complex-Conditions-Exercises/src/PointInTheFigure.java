
import java.util.Scanner;

/**
 * Created by Alex on 6.2.2017 г..
 */
public class PointInTheFigure {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int blockSize = Integer.parseInt(scanner.nextLine());
        int dotX = Integer.parseInt(scanner.nextLine());
        int dotY = Integer.parseInt(scanner.nextLine());

        int parametersBottom[] = FigurParameters(blockSize, dotX, dotY, true);
        int parametersTop[] = FigurParameters(blockSize, dotX, dotY, false);

        boolean isDotInBottomHalf = isDotInsideHalfFigure(parametersBottom);
        boolean isDotInTopHalf = isDotInsideHalfFigure(parametersTop);
        boolean isInFigure = isDotInBottomHalf || isDotInTopHalf;

        if (isInFigure) {
            boolean isDotOnBottomHalfBorder = isDotOnBorder(parametersBottom);
            boolean isDotOnTopHalfBorder = isDotOnBorder(parametersTop);
            boolean isDotOnBorder = isDotOnBottomHalfBorder || isDotOnTopHalfBorder;


            int commonLineX1 = blockSize;
            int commonLineX2 = blockSize * 2;
            int commonLineY = blockSize;
            boolean isDotOnCommonSide = dotY == commonLineY && (commonLineX1 < dotX && dotX < commonLineX2);

            if (isDotOnBorder && !isDotOnCommonSide) {
                System.out.println("Border");
            } else {
                System.out.println("inside");
            }


        } else {

            System.out.println("outside");
        }

       
    }

    static boolean isDotInsideHalfFigure(int figureAndDotCordinates[]) {

        int x1 = figureAndDotCordinates[0];
        int y1 = figureAndDotCordinates[1];
        int x2 = figureAndDotCordinates[2];
        int y2 = figureAndDotCordinates[3];
        int x = figureAndDotCordinates[4];
        int y = figureAndDotCordinates[5];

        boolean isInRectangle = (x1 <= x && x <= x2) && (y1 <= y && y <= y2);

        return isInRectangle;

    }

    static boolean isDotOnBorder(int figureAndDotCordinates[]) {

        int x1 = figureAndDotCordinates[0];
        int y1 = figureAndDotCordinates[1];
        int x2 = figureAndDotCordinates[2];
        int y2 = figureAndDotCordinates[3];
        int x = figureAndDotCordinates[4];
        int y = figureAndDotCordinates[5];

        boolean isOnLeftBorder = x == x1 && (y1 <= y && y <= y2);
        boolean isOnRightBorder = x == x2 && (y1 <= y && y <= y2);
        boolean isOnTopBorder = y == y1 && (x1 <= x && x <= x2);
        boolean isOnBottomBorder = y == y2 && (x1 <= x && x <= x2);

        boolean isOnAnyBorder = isOnLeftBorder || isOnRightBorder || isOnTopBorder || isOnBottomBorder;

        return isOnAnyBorder;


    }

    static int[] FigurParameters(int size, int dotX, int dotY, boolean isBottom){

        int[] parameters=new int[6];

                if(isBottom){

                    parameters[0]=0;
                    parameters[1]=0;
                    parameters[2]=size*3;
                    parameters[3]=size;

        }else {
                    parameters[0]=size;
                    parameters[1]=size;
                    parameters[2]=size*2;
                    parameters[3]=size*4;

                }
                parameters[4]=dotX;
                parameters[5]=dotY;

                return parameters;



    }

}

