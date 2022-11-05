import java.util.Arrays;

public final class Dog extends Pet{
    private String name;
    private String breed;
    private String [] commands;

    public Dog() {
        super();//First constructor
    }


    public Dog( String name, String breed,Color color, Shelter shelter) {
        super(color, shelter);//Second constructor(Name, breed,color,shelter)
        this.name = name;
        this.breed = breed;
    }

    public Dog( String name,String breed,Color color, Shelter shelter,String[] commands) {
        super(color, shelter);//Third constructor (Name,breed,color,shelter,commands)
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    void makeVoice(String voice,int count){
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }

    }

    void makeVoice(int count,String voice){
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }

    }

    void makeVoice(){
        System.out.println("wof wof");
    }

    @Override
    public final String getInfo() {
        return super.getInfo()+"\nName: "+name+"\nBreed: "+breed+"\nCommands: "+ Arrays.toString(commands);
    }
}

