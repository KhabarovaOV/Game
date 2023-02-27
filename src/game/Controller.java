package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    int derection = 0;

    private int getDerection() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in
            ));
            derection = Integer.parseInt(br.readLine());
        } catch (Exception ex) {
            System.out.println("Ошибка ввода");
            getDerection();
        }
        return derection;
    }

    public void movePerson(Map map) {
        int move = getDerection();
        switch (move) {
            case (4): {
                map.goToLeft();
                map.showMap(map.map);
                break;
            }
            case (6): {
                map.goToRight();
                map.showMap(map.map);
                break;
            }
            case (8): {
                map.goToUp();
                map.showMap(map.map);
                break;
            }
            case (2): {
                map.goToDown();
                map.showMap(map.map);
                break;
            }
            default: {
                System.out.println("Вы нажали неверную клавишу");
            }
        }
    }
}
