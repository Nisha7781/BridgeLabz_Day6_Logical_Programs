import java.util.Scanner;

public class VMChange 
{
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the change in Rs: ");
        int change = sc.nextInt();

        if (change > 0) {
            calculateChange(change);
        } else {
            System.out.println("Enter a valid amount ");
        }
    }

    static void calculateChange(int remainingAmount) {
        System.out.println("minimum notes needed: " + getMinimumNotes(remainingAmount));
        System.out.println("List of Rs. notes in change:");

        for (int i=0; i<notes.length; i++) 
        {
            int note = notes[i];
            int noteCount = remainingAmount / note;
            remainingAmount= remainingAmount % note;

            if (noteCount > 0) {
                System.out.println(note + " Rs notes: " + noteCount);
            }
        }
    }

    static int getMinimumNotes(int remainingAmount) {
        int totalNotes = 0;

        for (int i=0; i<notes.length; i++) 
        {
            int note = notes[i];
            totalNotes = totalNotes + remainingAmount / note;
            remainingAmount = remainingAmount % note;
        }

        return totalNotes;
    }
}
