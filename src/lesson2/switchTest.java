package lesson2;

public class switchTest {


    public static void main(String[] args) {
        convertSeasonBySwitch(3);
    }

    public static String convertSeasonBySwitch(int seasonNumber) {
        String season;

        switch (seasonNumber) {
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Summer";
                break;
            case 4:
                season = "Fall";
                break;
            default:
                season = "Unknown";
                //   break; можно везде убрать брейки, поставив везде ретурны
            }
        return season;
        }
        
    }




//}
// в новых версиях в кейсы можно ставить несколько аргументов через запятую




