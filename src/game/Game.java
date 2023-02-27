package game;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        Map map = new Map();
        Controller cont = new Controller();
        game.createMap(map);
        game.barrier(map);
        map.addPlayer(9, 0);
        map.showMap(map.map);

        while (map.x != 0 || map.y != 9) {
            cont.movePerson(map);
            if (map.x == 0 && map.y == 9) {
                System.out.println("Вы выиграли!!!");
            }
        }
    }


    public void createMap(Map map) {
        map.map = new char[10][10];
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = '_';
            }

        }
    }


    public void barrier(Map map) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = (char) (Math.random() * 100);
                if (map.map[i][j] >= 80 & map.map[i][j]!=map.map[9][9] & map.map[i][j]!=map.map[8][9]& map.map[i][j]!=map.map[9][8]) {
                    map.map[i][j] = 'S';
                } else {
                    map.map[i][j] = '_';
                }
            }
        }
    }
}
