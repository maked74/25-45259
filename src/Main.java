//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int iCount = 0;

    for (int j = 0; j < 1000; j++)
        {
            String str = "1235" + Integer.toString(j) + "8";
            int val = Integer.parseInt(str);
            if (val % 23 == 0)
            {
                IO.print(val);
                IO.print(" ");
                IO.println(val / 23);
                iCount++;
            }
        }
    for (int i = 0; i < 10; i++)
        for (int j = 0; j < 100; j++)
        {
            String str = "123" + Integer.toString(i) + "5" + Integer.toString(j) + "8";
            int val = Integer.parseInt(str);
            if (val % 23 == 0)
            {
                IO.print(val);
                IO.print(" ");
                IO.println(val / 23);
                iCount++;
            }
        }
    for (int i = 0; i < 100; i++)
        for (int j = 0; j < 10; j++)
        {
            String str = "123" + Integer.toString(i) + "5" + Integer.toString(j) + "8";
            int val = Integer.parseInt(str);
            if (val % 23 == 0)
            {
                IO.print(val);
                IO.print(" ");
                IO.println(val / 23);
                iCount++;
            }
        }
    for (int i = 0; i < 1000; i++)
        {
            String str = "123" + Integer.toString(i) + "58";
            int val = Integer.parseInt(str);
            if (val % 23 == 0)
            {
                IO.print(val);
                IO.print(" ");
                IO.println(val / 23);
                iCount++;
            }
        }
    IO.println(iCount);
}
