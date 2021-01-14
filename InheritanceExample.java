package lab8_in;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20);

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        athlete sport = new athlete("Hin", 19,"male");
        sport.genre = "runner";
        sport.introduce();
        sport.sport();

        company work = new company("Prae", 18, "female");
        work.genre = "accountant";
        work.introduce();
        work.work();

        Docter doc = new Docter("Jame", 19, "male");
        doc.genre = "eye";
        doc.introduce();
        doc.doc();

        engineer about = new engineer("Lit", 19, "female");
        about.genre = "software";
        about.introduce();
        about.about();

        teacher teach = new teacher("Poom", 20, "male");
        teach.genre = "Math";
        teach.introduce();
        teach.teach();
    }
}
