public class class1 {
        static class NameAndNumber {
            String name;
            int number;

            public NameAndNumber(String name, int number) {
                this.name = name;
                this.number = number;
            }
        }
    static NameAndNumber[] nameAndNumbers = {
            new NameAndNumber("Kadir", 341),
            new NameAndNumber("Gökhan", 273),
            new NameAndNumber("Hakan", 278),
            new NameAndNumber("Suzan", 329),
            new NameAndNumber("Pınar", 445),
            new NameAndNumber("Mehmet", 402),
            new NameAndNumber("Ali", 388),
            new NameAndNumber("Emel", 270),
            new NameAndNumber("Fırat", 243),
            new NameAndNumber("James", 334),
            new NameAndNumber("Jale", 412),
            new NameAndNumber("Ersin", 393),
            new NameAndNumber("Deniz", 299),
            new NameAndNumber("Gözde", 343),
            new NameAndNumber("Anıl", 317),
            new NameAndNumber("Burak", 265)


    };

        public static void siralama(){
            for (int i = 0; i < nameAndNumbers.length - 1; i++) {
                for (int j = 0; j < nameAndNumbers.length - i - 1; j++) {
                    if (nameAndNumbers[j].number > nameAndNumbers[j + 1].number) {
                        NameAndNumber temp = nameAndNumbers[j];
                        nameAndNumbers[j] = nameAndNumbers[j + 1];
                        nameAndNumbers[j + 1] = temp;
                    }
                }
            }

            System.out.println("----------------------------------");


            for (int i = 0; i < Math.min(3, nameAndNumbers.length); i++) {
                String siralama = "";
                switch (i) {
                    case 0:
                        siralama = "Birinci : ";
                        break;
                    case 1:
                        siralama = "İkinci : ";
                        break;
                    case 2:
                        siralama = "Üçüncü : ";
                        break;
                }
                System.out.println(siralama + nameAndNumbers[i].name + " " + nameAndNumbers[i].number);
            }


        }

        public static void star(){
            int a = 0, b = 0, c = 0;

            for (NameAndNumber stars : nameAndNumbers) {
                if (stars.number >= 200 && stars.number < 300) {
                    a++;
                } else if (stars.number >= 300 && stars.number < 400) {
                    b++;
                } else {
                    c++;
                }
            }

            System.out.println("----------------------------------");

            System.out.print("200-299 arası -> ");
            Main.printStars(a);
            System.out.print("\n300-399 arası -> ");
            Main.printStars(b);
            System.out.print("\n400 ve üzeri -> ");
            Main.printStars(c);


        }

}
