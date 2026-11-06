using System;

class TitleToNumber
{
    static int Solve(string columnTitle)
    {
        int result = 0;

        foreach (char ch in columnTitle)
        {
            // shift previous letters one place left (base 26), add this letter's value A=1..Z=26
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }

    static void Main()
    {
        Console.WriteLine(Solve("A"));   // 1
        Console.WriteLine(Solve("AB"));  // 28
        Console.WriteLine(Solve("ZY"));  // 701
    }
}
