import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Bank bank = new Bank(5);

        int pilihan;

        do {

            System.out.println();
            System.out.println("=== MENU BANK ===");
            System.out.println("1. Tambah Customer");
            System.out.println("2. Lihat Customer");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("Nama depan: ");
                    String firstName = input.nextLine();

                    System.out.print("Nama belakang: ");
                    String lastName = input.nextLine();

                    bank.addCustomer(firstName, lastName);

                    System.out.println(
                            "Customer berhasil ditambahkan!"
                    );

                    break;

                case 2:

                    System.out.println();
                    System.out.println("=== DAFTAR CUSTOMER ===");

                    if (bank.getNumOfCustomers() == 0) {

                        System.out.println(
                                "Belum ada customer."
                        );

                    } else {

                        for (int i = 0;
                             i < bank.getNumOfCustomers();
                             i++) {

                            Customer customer =
                                    bank.getCustomer(i);

                            System.out.println(
                                    "Customer " + (i + 1)
                                    + ": "
                                    + customer.getFirstName()
                                    + " "
                                    + customer.getLastName()
                            );
                        }
                    }

                    break;

                case 3:

                    System.out.println(
                            "Program selesai."
                    );

                    break;

                default:

                    System.out.println(
                            "Pilihan tidak tersedia."
                    );
            }

        } while (pilihan != 3);

        input.close();
    }
}