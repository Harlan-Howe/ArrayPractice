public class ArrayPracticeRunner
{

    public static void main(String[] args)
    {

        int [] myNums = new int[75];

        // variables you'll need to calculate. I've given them (wrong) initial numbers so that the program compiles
        //     and runs.
        int total = 0;
        int max = 0;
        int min = 99999;
        double mean = -1;
        double variance = -1;
        double stdDev = -1;
        boolean inOrder = true;
        int median = -1;


        // I've taken the liberty of initializing and filling the array for you.
        for (int i = 0; i<75; i++)
        {
            myNums[i] = (int)(26*Math.random())+(int)(26*Math.random());

        }

        // TODO: Print out the list of numbers all on the same row, with tabs ("\t") between them. If you have an extra
        //   tab at the end, that's ok.


        // TODO: Calculate the following.
        System.out.println("Max:\t"+max);
        System.out.println("Min:\t"+min);
        System.out.println("Total:\t"+total);
        System.out.println("Mean:\t"+mean);

        // TODO: Calculate the following. You'll need to find the sum of the squares of the differences from the mean.
        System.out.println("Variance:\t"+variance);
        System.out.println("std dev:\t"+stdDev);

        // TODO: Use BubbleSort to sort the array, then find the following.
        System.out.println("In order:\t"+inOrder);
        System.out.println("Median:\t"+median);

        //Optional Extras:
        // 1) Find the index of the first time you see 25 in the original list. (You'll need to do this before you sort
        //     it.) If you don't find 25 at all, say it's index -1.
        // 2) Find the mode of the list. (Hint: use the sorted list for this one.) Note: there might be more than one
        //     correct answer for this - you only need to find one, but it might not match the spreadsheet. (That's ok.)
        // 3) In the original list, find the largest change between two consecutive numbers.
    }

}
