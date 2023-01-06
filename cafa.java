import java.util.Scanner;

// public class chineese_Item{
//     void chineese_Item()
//     {

//     }
// }
public class cafa
    {
        public static void disp(String text , String txt){
            System.out.println("|________________________________________________________________________________________________|");
            System.out.println("|                                                                           |                    |");
            System.out.println("|                           "+txt+" ...   "+text+"                           |                    |");
            System.out.println("|___________________________________________________________________________|____________________|");
        }
        public static void main(String[] args) 
            {

                Scanner input = new Scanner(System.in);
                
                int FirstPayment = 0;
                int FirstPayment_itam[]={20 , 25 , 30 , 35 , 40 , 45 , 50 , 60 , 65 , 70 , 75 , 100 , 120 , 140 , 115 , 170 , 180 , 190 , 210 , 220 , 230 , 200 , 310 , 415 , 250 , 450 , 655 , 365 , 400 , 500 , 300 , 900 , 320 , 1000 , 360 , 525 , 545 , 570 , 333 , 299 , 350 , 280  };
                String menu = null; 
                int Discount; 
                int LastPayment;

                System.out.println("|________________________________________________________________________________________________|");
                System.out.println("|                                              MENU                                              |");
                System.out.println("|                                         BCA.S Cafe                                             |");
                System.out.println("|________________________________________________________________________________________________|");
                disp("CHINEESE ITEM" , "A");
                disp("PANNER ITEM  " , "B");
                disp("DRINKS       " , "C");
                disp("ICE - CREAM  " , "D");
                // for(String a = "Y" ; a . equals("Y")||a . equals("y"); )
                //     {
                //         System.out.println("\n");
                //         System.out.println("|________________________________________________________________________________________________|");
                //         System.out.println("|                                              MENU                                              |");
                //         System.out.println("|                                         Bhautik.S Cafe                                         |");
                //         System.out.println("|________________________________________________________________________________________________|");
                //         System.out.println("|                                                                           |                    |");
                //         System.out.println("|                           A ...   CHINEESE ITEM                           |                    |");
                //         System.out.println("|___________________________________________________________________________|____________________|");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                                    POTATO                                 |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  1.Chilii Potato                                                          |        170         |");
                //         System.out.println("|  2.Hot Garlic Potato                                                      |        180         |");
                //         System.out.println("|  3.Manchurian Potato                                                      |        180         |");
                //         System.out.println("|  4.Garlic Potato                                                          |        170         |");
                //         System.out.println("|  5.Szechuan Potato                                                        |        180         |");
                //         System.out.println("|  6.Hong Kong Potato                                                       |        180         |");
                //         System.out.println("|  7.Sweet&Sour Potato                                                      |        190         |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                                    PANEER                                 |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  8.Chilii Paneer                                                          |        210         |");
                //         System.out.println("|  9.Hot Garlic Paneer                                                      |        220         |");
                //         System.out.println("|  10.Manchurian Paneer                                                     |        220         |");
                //         System.out.println("|  11.Garlic Paneer                                                         |        210         |");
                //         System.out.println("|  12.Szechuan Paneer                                                       |        220         |");
                //         System.out.println("|  13.Hong Kong Paneer                                                      |        220         |");
                //         System.out.println("|  14.Sweet&Sour Paneer                                                     |        230         |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                                   BABY CORN                               |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  15.Chilii Baby Corn                                                      |        200         |");
                //         System.out.println("|  16.Hot Garlic Baby Corn                                                  |        210         |");
                //         System.out.println("|  17.Manchurian Baby Corn                                                  |        210         |");
                //         System.out.println("|  18.Garlic Baby Corn                                                      |        200         |");
                //         System.out.println("|  19.Szechuan Baby Corn                                                    |        210         |");
                //         System.out.println("|  20.Hong Kong Baby Corn                                                   |        210         |");
                //         System.out.println("|  21.Sweet&Sour Baby Corn                                                  |        220         |");
                //         System.out.println("|___________________________________________________________________________|____________________|");
                //         System.out.println("|                                                                           |                    |");
                //         System.out.println("|                           B ...      PIZZA                                |                    |");
                //         System.out.println("|___________________________________________________________________________|____________________|");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                             AMIRICAN VEG PIZZA                            |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  22.Maegherita Pizza                                                      |        365         |");
                //         System.out.println("|  23.Vage Tarian Bite                                                      |        500         |");
                //         System.out.println("|  24.Mushroom Riot                                                         |        545         |");
                //         System.out.println("|  25.Mexican Delight                                                       |        545         |");
                //         System.out.println("|  26.Amirican Heat                                                         |        545         |");
                //         System.out.println("|  27.Spicy Treat                                                           |        545         |");
                //         System.out.println("|  28.Hawallan Fantast                                                      |        570         |");
                //         System.out.println("|  29.Fresh Veggl Special                                                   |        570         |");
                //         System.out.println("|  30.Cheese Burst                                                          |        333         |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                               DESI VEG PIZZA                              |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  31.Tandoori Paneer                                                       |        525         |");
                //         System.out.println("|  32.Yum Dum                                                               |        545         |");
                //         System.out.println("|  33.Balle Balle                                                           |        545         |");
                //         System.out.println("|  34.Gujarati Treat                                                        |        570         |");
                //         System.out.println("|  35.Chatpatta Paneer                                                      |        570         |");
                //         System.out.println("|  36.Pav Bhaji                                                             |        299         |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                              IT ALIAN VEG PIZZA                           |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  37.Classic Maegherita                                                    |        250         |");
                //         System.out.println("|  38.Funghi De Bosco                                                       |        350         |");
                //         System.out.println("|  39.Glardinera                                                            |        280         |");
                //         System.out.println("|  40.Char Grilled                                                          |        280         |");
                //         System.out.println("|  41.Quattro Formaggle                                                     |        350         |"); 
                //         System.out.println("|___________________________________________________________________________|____________________|");
                //         System.out.println("|                                                                           |                    |");
                //         System.out.println("|                           C ...    DRINKS                                 |                    |");
                //         System.out.println("|___________________________________________________________________________|____________________|");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                                    BEERS                                  |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  42.Ale Beer                                                              |        210         |");
                //         System.out.println("|  43.leger Beer                                                            |        310         |");
                //         System.out.println("|  44.Porter Beer                                                           |        415         |");
                //         System.out.println("|  45.Stout Beer                                                            |        250         |");
                //         System.out.println("|  46.Lambic Beer                                                           |        450         |");
                //         System.out.println("|  47.Coronita                                                              |        655         |");
                //         System.out.println("|  48.Voll Damm                                                             |        365         |");
                //         System.out.println("|  49.Budweiser                                                             |        400         |");
                //         System.out.println("|  50.Guinness                                                              |        500         |");
                //         System.out.println("|  51.Heineken                                                              |        100         |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                                  SOFT DRINKS                              |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  52.Gaseosa                                                               |        100         |");
                //         System.out.println("|  53.Water                                                                 |        20          |");
                //         System.out.println("|  54.Orange Juice                                                          |        210         |");
                //         System.out.println("|  55.Limonade                                                              |        300         |");
                //         System.out.println("|  56.Red bull                                                              |        120         |");
                //         System.out.println("|  57.Aquarius                                                              |        190         |");
                //         System.out.println("|  58.Nestea                                                                |        140         |");
                //         System.out.println("|  59.Tea                                                                   |        50          |");
                //         System.out.println("|  60.Sevenup                                                               |        75          |");
                //         System.out.println("|  61.Cola                                                                  |        75          |");
                //         System.out.println("|  62.Mjito                                                                 |        115         |");
                //         System.out.println("|  63.Vodka                                                                 |        900         |");
                //         System.out.println("|  64.Cuba Libra                                                            |        450         |");
                //         System.out.println("|  65.Gin Tonic                                                             |        320         |");
                //         System.out.println("|  66.Ron Sprite                                                            |        450         |");
                //         System.out.println("|  67.Whts Cola                                                             |        100         |");
                //         System.out.println("|  68.Bloody Mary                                                           |        1000        |");
                //         System.out.println("|  69.Pina Colada                                                           |        250         |");
                //         System.out.println("|  70.Daiquiri                                                              |        360         |");
                //         System.out.println("|___________________________________________________________________________|____________________|");
                //         System.out.println("|                                                                           |                    |");
                //         System.out.println("|                           D ...    ICE - CREAM                            |                    |");
                //         System.out.println("|___________________________________________________________________________|____________________|");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                                    CONES                                  |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  71.Choco Nutty                                                           |        100         |");
                //         System.out.println("|  72.Choco Block                                                           |        70          |");
                //         System.out.println("|  73.Turbo (Chocolate Disc)                                                |        50          |");
                //         System.out.println("|  74.Dark Chocolate Cone                                                   |        50          |");
                //         System.out.println("|  75.Choco Brownie                                                         |        40          |");
                //         System.out.println("|  76.Kesar Pista                                                           |        40          |");
                //         System.out.println("|  77.Kulfi Cone                                                            |        35          |");
                //         System.out.println("|  78.Buttter Scotch                                                        |        30          |");
                //         System.out.println("|  79.Chocolate                                                             |        30          |");
                //         System.out.println("|  80.Yummy Strawberry                                                      |        30          |");
                //         System.out.println("|  81.Mango Cone                                                            |        30          |");
                //         System.out.println("|  82.Swlss Choco Brownle                                                   |        75          |");
                //         System.out.println("|  83.Double Belglan Chocolate                                              |        75          |");
                //         System.out.println("|  84.Nutty French Vanilla                                                  |        65          |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                                    CANDIES                                |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  85.Zulubar Hazeltella                                                    |        45          |");
                //         System.out.println("|  86.Zulubar                                                               |        45          |");
                //         System.out.println("|  87.Sugar Free Malai Kulfi                                                |        35          |");
                //         System.out.println("|  88.Chowpatty Kulfi                                                       |        35          |");
                //         System.out.println("|  89.Dryfruit Rabdi Kulfi                                                  |        35          |");
                //         System.out.println("|  90.Almond Candy                                                          |        30          |");
                //         System.out.println("|  91.Aam Candy                                                             |        25          |");
                //         System.out.println("|  92.Mava Tillewali                                                        |        25          |");
                //         System.out.println("|  93.Crunchy Chocobar                                                      |        25          |");
                //         System.out.println("|  94.Jumbo Mango Dolly                                                     |        20          |");
                //         System.out.println("|  95.Jumbo Raspberry Dolly                                                 |        20          |");
                //         System.out.println("|  96.Jumbo Classic Chocobar                                                |        20          |");
                //         System.out.println("|  97.Rochy Road                                                            |        20          |");
                //         System.out.println("|  98.Shahi Kulfi                                                           |        20          |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|                                 BLACK BUSTERS                             |                    |");
                //         System.out.println("|                 ===========================================               |                    |");
                //         System.out.println("|  99.Choco Truffle                                                         |        60          |");
                //         System.out.println("|  100.Triple Chocolate                                                     |        60          |");
                //         System.out.println("|  101.Cookie Cream                                                         |        60          |");
                //         System.out.println("|  102.Aimond Mocha                                                         |        50          |");
                //         System.out.println("|  103.Mango Magic                                                          |        50          |");
                //         System.out.println("|___________________________________________________________________________|____________________|");
                //         System.out.println("|________________________________________________________________________________________________|");
                //         System.out.println("|                                     I am Very Thank Full                                       |");
                //         System.out.println("|                                       That All Parson                                          |");
                //         System.out.println("|                           Thay Come In Bhautik Cafe tank you......                             |");
                //         System.out.println("|________________________________________________________________________________________________|");
                //         System.out.println("|________________________________________________________________________________________________|");

                        
            // }
    }
}    