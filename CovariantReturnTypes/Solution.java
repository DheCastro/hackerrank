//Complete the classes below
class Flower {
    public String whatsYourName(){
        return "I am a standard flower";
    }
}

class Jasmine extends Flower{
    @Override
    public String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    public String whatsYourName(){
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}