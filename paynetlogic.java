import java.util.Scanner;

import static java.lang.System.in;

public class paynetlogic {

   public static Scanner scanner=new Scanner(in);

    public static void addCard (String[]boneName, String[]boneCard,
                                int boneCount){
        System.out.print("User Name write: ");
        scanner = new Scanner(in);
        String nameUser = scanner.nextLine();
        System.out.print("Card number write: ");
        String cart = scanner.nextLine();
        if (nameUser.length() >= 4 && cart.length() >= 4) {

            for (int i = 0; i < boneCount; i++) {
                boneName[i] = nameUser;
                boneCard[i] = cart;
            }


            System.out.println("You have 700000 so'm !");
            System.out.println();


        } else {
            System.out.println("name or cart numbers less!!!! ");
        }

    }


    public static void main(String[] args) {



        String []boneName=new String[100];
        String [] boneCart=new String[100];
//        int [] cashBack=new int[100];
        int cashBack=0;
        int boneCount=0;



        while (true){
            System.out.println(cashBack+" "+"=cashback");
            System.out.println("Add card->1");
            System.out.println("Payment to another card->2");
            System.out.println("Payment to mobile phones->3");
            System.out.println("Communal payments->4");
            System.out.println("Cashback->5");
            System.out.println("Cards->6");
            System.out.print("Select a choice= ");
            int n = scanner.nextInt();


            switch (n) {
                case 1 -> {
                    addCard(boneName, boneCart, boneCount);
                    boneCount++;
                }
                case 2 -> {
                        System.out.println("Card or phone number");
                        int cardNum = scanner.nextInt();
                        scanner = new Scanner(in);
                        System.out.println("Owner's name");
                        String ownerName = scanner.nextLine();
                        scanner = new Scanner(in);
                        System.out.println("Pls,write amount of cash");
                        int cashAmount = scanner.nextInt();
                        if (cashAmount <= 700000) {
                            cashBack+=cashAmount*0.02;
                            System.out.println(cashAmount - (cashAmount * 0.02) + " " + "is transferred to" + " " + ownerName);
                        } else {
                            System.out.println("You don't have enough money");
                        }
                }
                case 3 -> {
                    System.out.print("Pls,write a number");
                    System.out.print("+998 ");
                    int b = scanner.nextInt();
                    String a = String.valueOf(b);
                    if (a.length() == 9) {
                        if (a.startsWith("94")) {
                            System.out.println("Ucell");
                        } else if (a.startsWith("91")) {
                            System.out.println("Beeline");
                        } else if (a.startsWith("90")) {
                            System.out.println("Beeline");
                        } else if (a.startsWith("99")) {
                            System.out.println("UzMobile");
                        } else if (a.startsWith("88")) {
                            System.out.println("MobiUz");
                        } else if (a.startsWith("93")) {
                            System.out.println("Ucell");
                        } else {
                            System.out.println("pls,write uzb number");
                        }
                    } else {
                        System.out.println("Enter 9 numbers!!!");
                    }
                    System.out.print("Write payment: ");
                    int payment = scanner.nextInt();
                    if (payment <= 700000) {
                        cashBack+=payment*0.05;
                        System.out.println((payment * 0.95) + " " + "is transferred to " + b);
                    }else {
                        System.out.println("There is not enough cash in your card");
                    }
                }
                case 4 -> {
                    System.out.println("Pls,Enter your passport ID: ");
                    int passportID = scanner.nextInt();
                    scanner = new Scanner(in);
                    System.out.println("Enter your name");
                    String name = scanner.next();



                        System.out.println("Power supply->1");
                        System.out.println("Gas supply->2");
                        System.out.println("Water supply->3");
                        int supply = scanner.nextInt();

                        switch (supply) {
                            case 1 -> {
                                String[] energy = {"Hisob turi: ", "O'lchov birligi: ", "Tarif: "};
                                energy[0] = "To Houses";
                                energy[1] = "kVt/s";
                                energy[2] = "250 so'm";
                                for (int i = 0; i < energy.length; i++) {
                                    System.out.println(energy[i]);
                                }
                                System.out.println("Enter the day of uses");
                                int minDay = scanner.nextInt();

                                int f = minDay * 250;

                                if (f <= 700000) {
                                    cashBack+=(minDay/6)*0.02;
                                    System.out.println(f + " " + "is transferred to Power supply");
                                } else {
                                    System.out.println("There is not enough cash in your card");
                                }
                            }
                            case 2 -> {
                                System.out.println("Hisoblagichsiz->1");
                                System.out.println("Hisoblagichli->2");
                                int hisob = scanner.nextInt();
                                if (hisob == 1) {
                                    String[] energy = {"Hisob turi: ", "O'lchov birligi: ", "Tarif: "};
                                    energy[0] = "Hisoblagichsiz";
                                    energy[1] = "aholi/joy";
                                    energy[2] = "6083 so'm";
                                    for (int i = 0; i < energy.length; i++) {
                                        System.out.println(energy[i]);
                                    }
                                    System.out.print("Enter the days of uses: ");
                                    int minDay = scanner.nextInt();

                                    int p = minDay * 6083;

                                    if (p <= 700000) {
                                        cashBack+=(minDay/6)*0.02;
                                        System.out.println(p + " " + "is transferred to Gas supply");
                                    } else {
                                        System.out.println("There is not enough cash in your card");
                                    }
                                } else if (hisob == 2) {
                                    String[] energy = {"Hisob turi: ", "O'lchov birligi: ", "Tarif: "};
                                    energy[0] = "Hisoblagichli";
                                    energy[1] = "m/kub";
                                    energy[2] = "320 so'm";
                                    for (int i = 0; i < energy.length; i++) {
                                        System.out.println(energy[i]);
                                    }
                                    System.out.print("Enter the days of uses: ");
                                    int minDay = scanner.nextInt();

                                    int p = minDay * 320;

                                    if (p <= 700000) {
                                        cashBack+=(minDay/6)*0.02;
                                        System.out.println(p + " " + "is transferred to Gas supply");
                                    } else {
                                        System.out.println("There is not enough cash in your card");
                                    }
                                }
                            }
                            case 3 -> {
                                System.out.println("Hisoblagichsiz->1");
                                System.out.println("Hisoblagichli->2");
                                int hisob = scanner.nextInt();
                                if (hisob == 1) {
                                    String[] energy = {"Hisob turi: ", "O'lchov birligi: ", "Tarif: "};
                                    energy[0] = "Hisoblagichsiz";
                                    energy[1] = "kishi/joy";
                                    energy[2] = "9937 so'm";
                                    for (int i = 0; i < energy.length; i++) {
                                        System.out.println(energy[i]);
                                    }
                                    System.out.print("Enter the days of uses: ");
                                    int minDay = scanner.nextInt();

                                    int p = minDay * 9937;

                                    if (p <= 700000) {
                                        cashBack+=(minDay/6)*0.02;
                                        System.out.println(p + " " + "is transferred to Water supply");
                                    } else {
                                        System.out.println("There is not enough cash in your card");
                                    }
                                } else if (hisob == 2) {
                                    String[] energy = {"Hisob turi: ", "O'lchov birligi: ", "Tarif: "};
                                    energy[0] = "Hisoblagichli";
                                    energy[1] = "m/kub";
                                    energy[2] = "850 so'm";
                                    for (int i = 0; i < energy.length; i++) {
                                        System.out.println(energy[i]);
                                    }
                                    System.out.print("Enter the days of uses: ");
                                    int minDay = scanner.nextInt();

                                    int p = minDay * 850;

                                    if (p <= 700000) {
                                        cashBack+=(minDay/6)*0.02;
                                        System.out.println(p + " " + "is transferred to Water supply");
                                    } else {
                                        System.out.println("There is not enough cash in your card");
                                    }
                                }
                            }
                        }
                    }case 5->{
                    System.out.println(cashBack);
                }
                case 6->{

                    card(boneName, boneCart, boneCount);

                }
            }


        }


    }
    private static void card(String[] boneName, String[] boneCard, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(boneName[i]);
            System.out.println(boneCard[i]);

        }



    }

}
