package game;

import java.util.Random;

public class Map {


    public char[][] map;

    int x = 9;
    int y = 0;

    public void showMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addPlayer(int indexX, int indexY) {
        map[indexX][indexY] = '\u2764';
    }

    public void goToUp() {
        if (x - 1 < 0 || map[x - 1][y] == 'S') {
            System.out.println("Сюда ходить нельзя");
        } else {
            map[x - 1][y] = '\u2764';
            map[x][y] = '.';
            x--;
        }

    }

    public void goToDown() {
        if (x + 1 > 9 || map[x + 1][y] == 'S') {
            System.out.println("Сюда ходить нельзя");
        } else {
            map[x + 1][y] = '\u2764';
            map[x][y] = '.';
            x++;
        }

    }

    public void goToRight() {
        if (y + 1 > 9 || map[x][y + 1] == 'S') {
            System.out.println("Сюда ходить нельзя");
        } else {
            map[x][y + 1] = '\u2764';
            map[x][y] = '.';
            y++;
        }

    }

    public void goToLeft() {
        if (y - 1 < 0 || map[x][y - 1] == 'S') {
            System.out.println("Сюда ходить нельзя");
        } else {
            map[x][y - 1] = '\u2764';
            map[x][y] = '.';
            y--;
        }

    }


}
