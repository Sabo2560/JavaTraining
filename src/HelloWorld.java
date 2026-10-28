import java.time.LocalDate;

public class HelloWorld {
    static void main(String[] args) {
        User user = new User("Saad","1998-05-22");

        Book saBo = new Book("The Fun way to code !","Saad Bouzaidi" , 156);

        AudioBook dracula = new AudioBook("Dracula","BamLock Heart",30000 );

        Ebook kamili = new Ebook("Dracula","BamLock Heart",192,"PDF");
        user.borrow(saBo);

        System.out.printf("%s was born in %s, He is now %s years old \n", user.getName(),user.getBirthDay(),user.age());
        System.out.printf("%s has borrowed these books : %s \n",user.getName(),user.borrowedBooks());
        System.out.println("Available Ebooks : " + kamili.toString());
    }
}
