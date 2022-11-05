public class Main {
    public static void main(String[] args) {
        Shelter shelter=new Shelter("Romashka","Zvezda 33");
        Shelter shelter2=new Shelter("Domik","Zvezda 55");
        Shelter shelter3=new Shelter("Home","Zvezda 67");

        Dog rex=new Dog();//1. по умолчанию
        rex.setName("Rex");
        rex.setAge(Pet.generateDefaultAge());
        rex.setColor(Color.GRAY);
        rex.setShelter(shelter2);
        System.out.println(rex.getInfo());
        rex.makeVoice();
        System.out.println("___________________________________");
        Dog karatai=new Dog("Karatai","Ovcharka",Color.BLACK,shelter3);//2. name, breed, color, shelter
        System.out.println(karatai.getInfo());
        karatai.makeVoice(2,"Gav gav");
        System.out.println("___________________________________");
        Dog masha=new Dog("Masha","Brodyaga",
                Color.WHITE,shelter,new String[]{"Sit","Lay"});//3. name, breed, color, shelter, commands
        System.out.println(masha.getInfo());
        masha.makeVoice("Gav gav gav",4);

    }

}