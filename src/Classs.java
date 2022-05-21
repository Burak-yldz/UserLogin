import java.util.Scanner;

public class Classs {
    public static void main(String[] args) {

        String kullaniciAdi, parola, newPassword;

        Scanner input=new Scanner(System.in);
        System.out.print("Plese enter your username: ");
        kullaniciAdi= input.nextLine();
        System.out.print("Please enter your password : ");
        parola= input.nextLine();

        if (kullaniciAdi.equals("patika")  && parola.equals("java123")){
            System.out.println("Enter the system");
        }
        else{
            System.out.println("you don't enter succesfully");

            System.out.println("Do you want to change your password?" +
                    "\n yes '1' " +
                    "\n no '2' ");
            int secim=input.nextInt();
            input.nextLine();

            switch (secim){
                case 1:
                    System.out.print("Please enter your new password: ");
                    newPassword= input.nextLine();

                    if (newPassword.equals("java123")){
                        System.out.print("Sorry ,Your new password is same old password.  ");
                    }
                    else {
                        System.out.print("Congrulations , you password created" );
                        System.out.print("New password : " + newPassword );
                    }

                    break;
                case 2:
                    System.out.print("You did't want to change your password." );
                    break;
                default:
                    System.out.println("Please '1' or '2' enter the on of them.");
            }
        }
    }
}
