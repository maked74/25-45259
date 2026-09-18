//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int N = 100; // Предполагаем, что это максимальное количество искомых чисел
    int[][] data = new int[N][2]; // в первой колнке число, во второй - результат деления на 23

    // Перебираем все возможные комбинации и если число делится на 23 без остатка записываем его и результат деления в массив data
    int k = 0;
    for (int i = 0; i < 10; i++)
        for (int j = 0; j < 10; j++)
        {
            String str = "12345" + i + "7" + j + "8";
            int val = Integer.parseInt(str);
            if (val % 23 == 0)
            {
                data[k][0] = val;
                data[k][1] = val / 23;
                k++;
            }
        }

    // в полученном массиве числа могут повторяться, поэтому отсортируем массив по возрастанию

    Arrays.sort(data, Comparator.comparingInt(a -> a[0]));

    // Выводим массив по возрастанию и только если предыдущее значение числа не равно текущему, значения 0 игнорируем
    int valBefore = data[0][0];

    for(int i = 0; i < N; i++)
    {
        if (data[i][0] != 0 && data[i][0] != valBefore)
        {
            IO.print(data[i][0]);
            IO.print(" ");
            IO.println(data[i][1]);
        }
        valBefore = data[i][0];
    }

}
