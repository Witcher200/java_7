package Jav_Level_1_4;

import java.util.Random;
import java.util.Scanner;

 class TicTacToe {
    Random random;
    Scanner scanner;
    char[][] table;

    TicTacToe(){
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[5][5];
    }

    public static void main(String[] args){
        new TicTacToe().game();
    }

    void game() {
        initTable();
        printTable();
        while(true){
            turnHuman();
            if(checkWin('x')){
                System.out.println("You WON!");
                break;
            }
            if(isTableFull()){
                System.out.println("Sorry, DRAW...");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('o')){
                System.out.println("AI WON!");
                break;
            }
            if(isTableFull()){
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        System.out.println("GAME OVER");
        printTable();
    }

    private void initTable() {
        //инициализацич ячеек
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                table[i][j] = '_';
            }
        }
    }

    private void printTable() {
        // Вывод ячеек таблицы
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println(); //перевод строки
        }
    }

    private void turnHuman() {
        // Ход пользователя
        int x, y;
        do {
            System.out.println("Enter x y, in [1 .. 5]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            if(!isCellValid(x, y)){
                System.out.println("Your input is not valid, try again");
            }
        }
        while(!isCellValid(x, y));
        table[x][y] = 'x';
    }

     private void turnAI() {
         // Ход компьютера
         int x, y;
         do {
             x = random.nextInt(5);
             y = random.nextInt(5);
         }
         while(!isCellValid(x, y));
         table[x][y] = 'o';
     }

    private boolean isTableFull() {
        //Проверка свободных ячеек на поле
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                if(table[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkWin_Old(char symbol) {
        // Проверка пюбедил или нет
        //rows
        if(table[0][0] == symbol && table[0][1] == symbol && table[0][2] == symbol) return true;
        if(table[1][0] == symbol && table[1][1] == symbol && table[1][2] == symbol) return true;
        if(table[2][0] == symbol && table[2][1] == symbol && table[2][2] == symbol) return true;
        //columns
        if(table[0][0] == symbol && table[1][0] == symbol && table[2][0] == symbol) return true;
        if(table[0][1] == symbol && table[1][1] == symbol && table[2][1] == symbol) return true;
        if(table[0][2] == symbol && table[1][2] == symbol && table[2][2] == symbol) return true;
        //diag
        if(table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol) return true;
        if(table[2][0] == symbol && table[1][1] == symbol && table[0][2] == symbol) return true;

        return false;
    }

     private boolean checkWin(char symbol) {
         // Проверка пюбедил или нет
         //rows
         for (int i = 0; i <= 4; i++) {
         if (table[i][0] == symbol && table[0][1] == symbol && table[i][2] == symbol && table[i][3] == symbol && table[i][4] == symbol) return true;
         if (table[0][i] == symbol && table[1][i] == symbol && table[2][i] == symbol && table[3][i] == symbol && table[4][i] == symbol) return true;
         }

         //diag
         if (table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol && table[3][3] == symbol && table[4][4] == symbol) return true;
         if (table[2][0] == symbol && table[1][1] == symbol && table[0][2] == symbol && table[0][3] == symbol && table[0][4] == symbol) return true;
         return false;
     }

    private boolean isCellValid(int x, int y) {
        // Проеряет, что ячейка задана правильно
        if(x < 0 || y < 0 || x > 5 || y > 5){
            return false;
        }
        return table[x][y] == '_';
    }
}